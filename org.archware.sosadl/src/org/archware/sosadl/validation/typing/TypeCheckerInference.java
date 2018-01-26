package org.archware.sosadl.validation.typing;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.FieldDecl;
import org.archware.sosadl.sosADL.SosADL;
import org.archware.sosadl.tv.typeCheckerHelper.TypeVariable;
import org.archware.sosadl.validation.typing.impl.VariableEnvContent;
import org.archware.sosadl.validation.typing.proof.ProofTerm;
import org.archware.sosadl.validation.typing.proof.ProofTermPlaceHolder;
import org.archware.sosadl.validation.typing.proof.Type_sosADL;
import org.archware.utils.OptionalUtils;
import org.archware.utils.Pair;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class TypeCheckerInference extends TypeCheckerUtils {

	protected TypeInferenceSolver inference = new TypeInferenceSolver(this);
	private Collection<Runnable> delayedTasks = new ConcurrentLinkedDeque<>();
	private boolean delayedTasksExecuting = false;

	/**
	 * Performs the whole type-checking of a SoSADL specification.
	 * 
	 * @param file
	 *            the SoSADL model.
	 */
	public void typecheck(SosADL file) {
		try {
			System.gc();
			long t0 = System.nanoTime();
			type_sosADL(file);
			solveConstraints();
			long t1 = System.nanoTime();
			System.out.println("typecheck " + file.eResource().getURI().trimFileExtension().lastSegment() + " "
					+ (t1 - t0) + "ns");
			saveInference(file, inference);
		} catch (Throwable t) {
			t.printStackTrace();
			error("Bug in the type checker", file, null);
			throw t;
		}
	}

	protected abstract Type_sosADL type_sosADL(SosADL file);

	/**
	 * Solves the constraints for all the accumulated type variables.
	 * 
	 * <p>
	 * This method calls the type inference solver. If successful, it then
	 * invokes the delayed task recorded for each type variable.
	 */
	protected void solveConstraints() {
		inference.solve();
		if (inference.isSolved()) {
			delayedTasksExecuting = true;
			while (!delayedTasks.isEmpty()) {
				Collection<Runnable> batch = delayedTasks;
				delayedTasks = new ConcurrentLinkedQueue<>();
				batch.forEach((t) -> t.run());
			}
		}
	}

	protected TypeVariable createFreshTypeVariable(EObject co, EStructuralFeature csf,
			BinaryOperator<Optional<DataType>> solver) {
		if (delayedTasksExecuting) {
			throw new IllegalArgumentException();
		}
		return inference.createFreshTypeVariable(solver, co, csf);
	}

	private static Stream<DataType> streamTypes(Environment gamma) {
		return gamma.stream().filter((x) -> x instanceof VariableEnvContent).map((x) -> (VariableEnvContent) x)
				.map(VariableEnvContent::getType);
	}

	private static boolean containsVariable(DataType t) {
		return TypeInferenceSolver.containsVariable(t);
	}

	private static boolean containsVariable(Environment e) {
		return streamTypes(e).anyMatch(TypeCheckerInference::containsVariable);
	}

	private static <A, B> boolean containsVariable(List<Pair<A, Pair<B, DataType>>> l) {
		return l.stream().map(Pair::getB).map(Pair::getB).anyMatch(TypeCheckerInference::containsVariable);
	}

	protected static Optional<DataType> chooseBetweenOrElse(Optional<DataType> lb, Optional<DataType> ub,
			Optional<DataType> other) {
		return OptionalUtils.orElse(lb, OptionalUtils.orElse(ub, other));
	}

	protected <T extends ProofTerm> T p(Class<T> itf, DataType t, Function<DataType, T> f) {
		if (containsVariable(t)) {
			if (delayedTasksExecuting) {
				return f.apply(getSubstitute(t));
			} else {
				return proofTerm(itf, () -> f.apply(getSubstitute(t)));
			}
		} else {
			return f.apply(t);
		}
	}

	protected <T extends ProofTerm> T p(Class<T> itf, Environment e, Function<Environment, T> f) {
		if (containsVariable(e)) {
			if (delayedTasksExecuting) {
				return f.apply(getSubstitute(e));
			} else {
				return proofTerm(itf, () -> f.apply(getSubstitute(e)));
			}
		} else {
			return f.apply(e);
		}
	}

	protected <T extends ProofTerm> T p(Class<T> itf, FieldDecl e, Function<FieldDecl, T> f) {
		if (containsVariable(e.getType())) {
			if (delayedTasksExecuting) {
				return f.apply(getSubstitute(e));
			} else {
				return proofTerm(itf, () -> f.apply(getSubstitute(e)));
			}
		} else {
			return f.apply(e);
		}
	}

	protected <T extends ProofTerm, A, B> T p(Class<T> itf, List<Pair<A, Pair<B, DataType>>> l,
			Function<List<Pair<A, Pair<B, DataType>>>, T> f) {
		if (containsVariable(l)) {
			if (delayedTasksExecuting) {
				return f.apply(getSubstitute(l));
			} else {
				return proofTerm(itf, () -> f.apply(getSubstitute(l)));
			}
		} else {
			return f.apply(l);
		}
	}

	private <A, B> List<Pair<A, Pair<B, DataType>>> getSubstitute(List<Pair<A, Pair<B, DataType>>> l) {
		return l.stream().map((p) -> new Pair<>(p.getA(), new Pair<>(p.getB().getA(), getSubstitute(p.getB().getB()))))
				.collect(Collectors.toList());
	}

	private <T extends ProofTerm> T proofTerm(Class<T> itf, Supplier<T> factory) {
		ProofTermPlaceHolder<T> ptph = ProofTermPlaceHolder.create(itf);
		delayedTasks.add(() -> {
			ptph.fillWith(factory.get());
		});
		return ptph.cast();
	}

	protected Environment getSubstitute(Environment gamma) {
		return gamma.deepClone(this::getSubstitute);
	}

	private EnvContent getSubstitute(EnvContent c) {
		if (c instanceof VariableEnvContent) {
			return new VariableEnvContent(((VariableEnvContent) c).getBinder(),
					getSubstitute(((VariableEnvContent) c).getType()));
		} else {
			return c;
		}
	}

	protected DataType getSubstitute(DataType t) {
		return inference.deepSubstitute(t);
	}

	protected FieldDecl getSubstitute(FieldDecl f) {
		return createFieldDecl(f.getName(), getSubstitute(f.getType()));
	}

	protected DataType deepSubstitute(DataType t) {
		return getSubstitute(t);
	}

	protected FieldDecl deepSubstitute(FieldDecl f) {
		return getSubstitute(f);
	}

}