package org.archware.sosadl.validation.typing.proof;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.archware.sosadl.validation.typing.proof.fields.EludedField;
import org.archware.sosadl.validation.typing.proof.fields.FieldDescriptor;
import org.archware.sosadl.validation.typing.proof.fields.ListField;
import org.archware.sosadl.validation.typing.proof.fields.MandatoryField;
import org.archware.sosadl.validation.typing.proof.fields.OptionalField;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * A Coq term reified as a Java object.
 * 
 * The default implementation uses Java reflexivity in order to generate the
 * proper formatting. The {@link ProofTerm#getConstructorName()} method is used
 * to generate the name of the Coq constructor. The
 * {@link ProofTerm#getDeclaredFields()} method retrieves the fields of the
 * object, i.e., the parameters of the Coq constructor. The
 * {@link ProofTerm#describeField(Field)} method can be overridden in order to
 * customized how each field is handled.
 * 
 * A typical usage scenario is:
 * 
 * {@code
 * out = "(" + p.getConstructorName() + " "
 *     + Stream.of(p.getDeclaredFiles())
 *       .map(this::processField)
 *       .collect(Collectors.joining(" "))
 *     + ")";
 * }
 * 
 * @author Jeremy Buisson
 */
public interface ProofTerm {
	/**
	 * Returns the name of the Coq constructor for this object.
	 * 
	 * Whenever the class is annotated with {@link CoqConstructor}, the returned
	 * name is the one in the {@link CoqConstructor#value()} field of the
	 * annotation. Otherwise, the returned name is the name of the class, of
	 * which the first letter is turned to lower case.
	 * 
	 * @return name of the Coq constructor.
	 */
	default String getConstructorName() {
		Class<?> c = this.getClass();
		return constructorName(c);
	}

	public static String constructorName(Class<?> c) {
		CoqConstructor cc = c.getAnnotation(CoqConstructor.class);
		if (cc != null) {
			return cc.value();
		} else {
			String n = c.getSimpleName();
			if (EObject.class.isAssignableFrom(c)) {
				return n;
			} else {
				return StringExtensions.toFirstLower(n);
			}
		}
	}

	static Pattern fieldNamePattern = Pattern.compile("\\A[a-zA-Z_]\\w*\\z");

	/**
	 * Returns an array containing the fields for this object.
	 * 
	 * Each field, which encodes one parameter in the corresponding Coq term,
	 * implements any of {@link Inferable}, {@link ListField},
	 * {@link MandatoryField} or {@link OptionalField}, depending on the
	 * characteristics of the field. The actual choice of what type is returned
	 * is delegated to the {@link #describeField(Field)} method, such that it
	 * can be customized by any implementing class.
	 * 
	 * The returned array is built from the one returned by
	 * {@link Class#getDeclaredFields()}.
	 * 
	 * @return array of the fields to be used as parameters in the Coq term.
	 */
	default FieldDescriptor[] getDeclaredFields() {
		Class<?> c = this.getClass();
		FieldDescriptor[] f = Stream.of(c.getDeclaredFields())
				.filter((x) -> fieldNamePattern.matcher(x.getName()).matches())
				.filter((x) -> !x.isAnnotationPresent(CoqTransient.class)).map(this::describeField)
				.toArray((s) -> new FieldDescriptor[s]);
		return f;
	}

	/**
	 * Returns the value and description of a field to be used as a parameter in
	 * a Coq term.
	 * 
	 * Depending on the annotation and type of the field:
	 * <ul>
	 * <li>If the field is annotated with {@link Inferable}, then an
	 * {@link EludedField} is returned.</li>
	 * <li>If the field has type {@link java.util.List} (or any subtype), then a
	 * {@link ListField} is returned.</li>
	 * <li>If the field is annotated with {@link Mandatory}, then a
	 * {@link MandatoryField} is returned.</li>
	 * <li>Otherwise, a {@link OptionalField} is returned.</li>
	 * </ul>
	 * 
	 * In the {@link ListField}, {@link MandatoryField} and
	 * {@link OptionalField} cases, if the field is is annotated with
	 * {@link CoqLiteral}, then the field is assumed to hold an instance of
	 * {@link CharSequence}. This {@link CharSequence} is returned as it is,
	 * without any additional operation, by the {@link ListField#get(Function)},
	 * {@link MandatoryField#get(Function)} and
	 * {@link OptionalField#get(Function)} methods, respectively.
	 * 
	 * @param f
	 *            the field to process
	 * 
	 * @return the field value and description as expected in order to format
	 *         the Coq code.
	 */
	default FieldDescriptor describeField(Field f) {
		if (f.isAnnotationPresent(Inferable.class)) {
			return new EludedField() {
				@Override
				public Field getField() {
					return f;
				}
			};
		} else {
			try {
				Method getter = getGetterMethod(f);
				Object content = getter.invoke(this);
				if ((content != null && content instanceof List) || List.class.isAssignableFrom(f.getType())) {
					if (f.isAnnotationPresent(CoqLiteral.class)) {
						return new ListField() {
							@Override
							public List<Optional<CharSequence>> get(Function<Object, CharSequence> process) {
								return ListExtensions.map((List<?>) content,
										(x) -> Optional.ofNullable((CharSequence) x));
							}

							@Override
							public Field getField() {
								return f;
							}
						};
					} else {
						return new ListField() {
							@Override
							public List<Optional<CharSequence>> get(Function<Object, CharSequence> process) {
								return ListExtensions.map((List<?>) content,
										(x) -> Optional.ofNullable(x).map(process));
							}

							@Override
							public Field getField() {
								return f;
							}
						};
					}
				} else {
					if (f.isAnnotationPresent(CoqLiteral.class)) {
						Optional<CharSequence> c = Optional.ofNullable(content).map((x) -> {
							if (x instanceof Class) {
								return constructorName((Class<?>) x);
							} else {
								return (CharSequence) x;
							}
						});
						if (f.isAnnotationPresent(Mandatory.class)) {
							return new MandatoryField() {
								@Override
								public Optional<CharSequence> get(Function<Object, CharSequence> process) {
									return c;
								}

								@Override
								public Field getField() {
									return f;
								}
							};
						} else {
							return new OptionalField() {
								@Override
								public Optional<CharSequence> get(Function<Object, CharSequence> process) {
									return c;
								}

								@Override
								public Field getField() {
									return f;
								}
							};
						}
					} else {
						Optional<?> c = Optional.ofNullable(content);
						if (f.isAnnotationPresent(Mandatory.class)) {
							return new MandatoryField() {
								@Override
								public Optional<CharSequence> get(Function<Object, CharSequence> process) {
									return c.map(process);
								}

								@Override
								public Field getField() {
									return f;
								}
							};
						} else {
							return new OptionalField() {
								@Override
								public Optional<CharSequence> get(Function<Object, CharSequence> process) {
									return c.map(process);
								}

								@Override
								public Field getField() {
									return f;
								}
							};
						}
					}
				}
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				String msg = "field: " + f.toGenericString();
				throw new IllegalArgumentException(msg, e);
			}
		}
	}

	default Method getGetterMethod(Field f) throws NoSuchMethodException {
		if (boolean.class.equals(f.getType())) {
			try {
				return f.getDeclaringClass().getMethod("is" + StringExtensions.toFirstUpper(f.getName()));
			} catch (NoSuchMethodException e) {
				return f.getDeclaringClass().getMethod(f.getName());
			}
		} else {
			return f.getDeclaringClass().getMethod("get" + StringExtensions.toFirstUpper(f.getName()));
		}
	}

	default boolean isStandaloneCapable() {
		Class<? extends ProofTerm> cl = this.getClass();
		boolean r = !cl.isAnnotationPresent(CoqNoStandalone.class);
		if (r && Stream.of(cl.getDeclaredFields())
				.anyMatch((f) -> f.isAnnotationPresent(Inferable.class))) {
			System.err.println(
					"WARNING: " + cl + " is not @CoqNotStandalone, but it contains some @Inferable field");
		}
		return r;
	}
}
