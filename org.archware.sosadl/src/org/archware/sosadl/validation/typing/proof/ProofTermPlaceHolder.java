package org.archware.sosadl.validation.typing.proof;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Optional;

import org.archware.sosadl.validation.typing.proof.fields.FieldDescriptor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/**
 * A generic place holder in a proof term.
 * 
 * <p>
 * The place holder can be used as a node in a proof term that is going to be
 * filled later on.
 * 
 * <p>
 * A typical use in the type checker is when the type of a subexpression cannot
 * be computed directly. Instead, a type variable is created to be later
 * inferred once all the constraints are generated. But most of the proof
 * subterms must contain the type of the subexpression. The creation of the
 * subterm must therefore be delayed until the type variable is substituted by
 * the type inference algorithm. The place holder is thus used as a proof
 * subterm that will be filled in after the completion of type inference.
 * 
 * <p>
 * To instantiate a place holder, the {@link #create(Class)} method must be
 * invoked with the wanted proof term interface. The class is then specialized
 * on-demand in order to implement the given interface.
 * 
 * @author Jeremy Buisson
 * @param <T>
 *            a proof term (empty) interface
 */
public class ProofTermPlaceHolder<T extends ProofTerm> implements ProofTerm {
	/**
	 * Proof term interface for this place holder.
	 */
	private final Class<T> clazz;

	/**
	 * Proof term the place holder is filled with.
	 */
	private Optional<T> proxy;

	/**
	 * Builds an empty place holder for the given interface.
	 * 
	 * @param clazz
	 *            proof term interface
	 */
	protected ProofTermPlaceHolder(Class<T> clazz) {
		this.clazz = clazz;
		this.proxy = Optional.empty();
	}

	/**
	 * Fills the place holder with a given proof term.
	 * 
	 * @param p
	 *            a proof term
	 */
	public void fillWith(T p) {
		if (clazz.isInstance(p)) {
			this.proxy = Optional.of(p);
		} else {
			throw new IllegalArgumentException("Not an instance of " + clazz.toString() + " (" + p + ")");
		}
	}

	/**
	 * Casts the place holder to its corresponding proof term interface.
	 * 
	 * @return the casted place holder
	 */
	public T cast() {
		return clazz.cast(this);
	}

	/**
	 * Returns the name of the Coq constructor.
	 * 
	 * <p>
	 * The place holder implementation delegates this method to the wrapped
	 * proof term.
	 */
	@Override
	public String getConstructorName() {
		return this.proxy.get().getConstructorName();
	}

	/**
	 * Returns the array of fields.
	 * 
	 * <p>
	 * The place holder implementation delegates this method to the wrapped
	 * proof term.
	 */
	@Override
	public FieldDescriptor[] getDeclaredFields() {
		return this.proxy.get().getDeclaredFields();
	}

	/**
	 * Returns a specific field descriptor.
	 * 
	 * <p>
	 * The place holder implementation delegates this method to the wrapped
	 * proof term.
	 */
	@Override
	public FieldDescriptor describeField(Field f) {
		return this.proxy.get().describeField(f);
	}

	/**
	 * A cache of the dynamically generated constructors for the place holders.
	 */
	private static HashMap<Class<? extends ProofTerm>, Constructor<ProofTermPlaceHolder<?>>> classes = new HashMap<>();

	/**
	 * Instantiates a new place holder for a given proof term interface.
	 * 
	 * <p>
	 * Unless such a class is cached, this method dynamically generates a
	 * specific class for the new place holder. The generated class inherits
	 * from {@link ProofTermPlaceHolder} and implements the given interface. It
	 * contains solely a constructor that initializes the
	 * {@link ProofTermPlaceHolder#clazz} field with the given interface.
	 * 
	 * @param itf
	 *            a proof term interface
	 * @return the newly created place holder
	 */
	public static <T extends ProofTerm> ProofTermPlaceHolder<T> create(Class<T> itf) {
		synchronized (classes) {
			while (classes.get(itf) == null) {
				try {
					classes.put(itf, generateFor(itf));
				} catch (NoSuchMethodException | SecurityException e) {
					throw new IllegalArgumentException(e);
				}
			}
			Constructor<ProofTermPlaceHolder<?>> c = (Constructor<ProofTermPlaceHolder<?>>) classes.get(itf);
			try {
				@SuppressWarnings("unchecked")
				ProofTermPlaceHolder<T> instance = (ProofTermPlaceHolder<T>) c.newInstance();
				return instance;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				throw new IllegalArgumentException(e);
			}
		}
	}

	/**
	 * Creates a place holder class for a given interface and returns its
	 * reified constructor.
	 * 
	 * @param itf
	 *            a proof term interface
	 * @return the constructor of the generated class
	 * @throws NoSuchMethodException
	 *             when the {@link #ProofTermPlaceHolder(Class)} is not found,
	 *             this exception should not be thrown
	 * @throws SecurityException
	 *             when the security manager prevents the use of reflection
	 */
	private static <T extends ProofTerm> Constructor<ProofTermPlaceHolder<?>> generateFor(Class<T> itf)
			throws NoSuchMethodException, SecurityException {
		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
		String ptphName = Type.getInternalName(ProofTermPlaceHolder.class);
		String name = generateNameFor(itf);
		cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, name, null, ptphName, new String[] { Type.getInternalName(itf) });
		String ctorName = "<init>";
		String ctorDesc = Type.getConstructorDescriptor(ProofTermPlaceHolder.class.getDeclaredConstructor(Class.class));
		MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, ctorName, "()V", null, null);
		mv.visitParameter("c", 0);
		mv.visitCode();
		mv.visitIntInsn(Opcodes.ALOAD, 0);
		mv.visitLdcInsn(Type.getType(itf));
		mv.visitMethodInsn(Opcodes.INVOKESPECIAL, ptphName, ctorName, ctorDesc, false);
		mv.visitInsn(Opcodes.RETURN);
		mv.visitMaxs(0, 0);
		mv.visitEnd();
		cw.visitEnd();
		MyClassLoader mcl = new MyClassLoader(itf.getClassLoader());
		Class<?> clazz = mcl.defineClass(name, cw.toByteArray());
		assert itf.isAssignableFrom(clazz);
		@SuppressWarnings("unchecked")
		Class<ProofTermPlaceHolder<?>> cl = (Class<ProofTermPlaceHolder<?>>) clazz
				.asSubclass(ProofTermPlaceHolder.class);
		return cl.getConstructor();
	}

	/**
	 * Generate a suitable class name, given a proof term interface.
	 * 
	 * <p>
	 * The generated name results from replacing special characters in the name
	 * of the given interface.
	 * 
	 * @param itf
	 *            a proof term interface
	 * @return the generated name
	 */
	private static String generateNameFor(Class<?> itf) {
		StringBuilder sb = new StringBuilder("Generated_");
		for (char x : itf.getName().toCharArray()) {
			if (x >= 'A' && x <= 'Z') {
				sb.append(x);
			} else if (x >= 'a' && x <= 'z') {
				sb.append(x);
			} else if (x >= '0' && x <= '9') {
				sb.append(x);
			} else if (x == '.') {
				sb.append("__");
			} else {
				sb.append('_');
				sb.append(Integer.toHexString(x));
				sb.append('_');
			}
		}
		return sb.toString();
	}

	/**
	 * A class loader for dynamically generated classes.
	 * 
	 * @author Jeremy Buisson
	 */
	private static class MyClassLoader extends ClassLoader {
		/**
		 * Builds a class loader with the given parent.
		 * 
		 * @param loader
		 *            a parent class loader.
		 */
		public MyClassLoader(ClassLoader loader) {
			super(loader);
		}

		/**
		 * Loads a class given its bytecode.
		 * 
		 * @param name
		 *            name of the class
		 * @param bc
		 *            array of bytecode
		 * @return the loaded class
		 */
		public Class<?> defineClass(String name, byte[] bc) {
			return super.defineClass(name, bc, 0, bc.length);
		}
	}
	
	@Override
	public boolean isStandaloneCapable() {
		return this.proxy.map(ProofTerm::isStandaloneCapable).orElse(false);
	}
}
