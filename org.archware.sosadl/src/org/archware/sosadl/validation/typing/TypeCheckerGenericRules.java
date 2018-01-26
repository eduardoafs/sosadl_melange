package org.archware.sosadl.validation.typing;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.archware.sosadl.validation.typing.proof.And;
import org.archware.sosadl.validation.typing.proof.Equality;
import org.archware.sosadl.validation.typing.proof.Forall;
import org.archware.sosadl.validation.typing.proof.Forall2;
import org.archware.sosadl.validation.typing.proof.Incrementally;
import org.archware.sosadl.validation.typing.proof.Mutually;
import org.archware.sosadl.validation.typing.proof.Mutually_translate;
import org.archware.sosadl.validation.typing.proof.Optionally;
import org.archware.sosadl.validation.typing.proof.ProofTerm;
import org.archware.sosadl.validation.typing.proof.Simple_increment;
import org.archware.utils.Pair;
import org.archware.utils.PentaFunction;
import org.archware.utils.TriFunction;
import org.eclipse.emf.ecore.EObject;

public abstract class TypeCheckerGenericRules extends TypeCheckerProofConstructor {

	protected <S, T, P extends ProofTerm> Forall<T, P> proveForall(List<S> l, Function<S, T> f,
			Function<S, P> prover) {
		if (l.isEmpty()) {
			return createForall_nil();
		} else {
			return createForall_cons(f.apply(l.get(0)), prover.apply(l.get(0)), proveForall(cdr(l), f, prover));
		}
	}

	protected <T extends EObject, P extends ProofTerm> Forall<T, P> proveForall(List<T> l, Function<T, P> prover) {
		return proveForall(l, (x) -> x, prover);
	}

	protected <T1 extends EObject, T2 extends EObject, P extends ProofTerm> Forall2<T1, T2, P> proveForall2(
			List<? extends T1> l, List<? extends T2> m, BiFunction<T1, T2, ? extends P> prover) {
		if (l.isEmpty() && m.isEmpty()) {
			return createForall2_nil();
		} else {
			return createForall2_cons(l.get(0), m.get(0), prover.apply(l.get(0), m.get(0)),
					proveForall2(cdr(l), cdr(m), prover));
		}
	}

	protected <T, T1 extends EObject, T2 extends EObject, P extends ProofTerm> Forall2<T1, T2, P> proveForall2(
			List<T> zipped, Function<T, T1> left, Function<T, T2> right, Function<T, P> prover) {
		if (zipped.isEmpty()) {
			return createForall2_nil();
		} else {
			return createForall2_cons(left.apply(zipped.get(0)), right.apply(zipped.get(0)),
					prover.apply(zipped.get(0)), proveForall2(cdr(zipped), left, right, prover));
		}
	}

	@SuppressWarnings("unchecked")
	protected <T extends EObject, P extends ProofTerm> Pair<Incrementally<T, P>, Environment> proveIncrementally(
			Environment gamma, List<T> l, BiFunction<Environment, T, Pair<P, Environment>> prover) {
		if (l.isEmpty()) {
			return new Pair<>(p(Incrementally.class, gamma, (gamma_) -> createIncrementally_nil(gamma_)), gamma);
		} else {
			Pair<P, Environment> pi = prover.apply(gamma, l.get(0));
			Environment gammai = pi.getB();
			Pair<Incrementally<T, P>, Environment> pn = proveIncrementally(gammai, cdr(l), prover);
			Environment gamma1 = pn.getB();
			return new Pair<>(
					p(Incrementally.class,
							gamma, (
									gamma_) -> p(Incrementally.class,
											gammai, (
													gammai_) -> p(Incrementally.class, gamma1,
															(gamma1_) -> createIncrementally_cons(gamma_, l.get(0),
																	gammai_, cdr(l), gamma1_, pi.getA(), pn.getA())))),
					gamma1);
		}
	}

	@SuppressWarnings("unchecked")
	protected <T extends EObject, P extends ProofTerm> Pair<Simple_increment<T, P>, Environment> proveSimpleIncrement(
			Environment gamma, T x, BiFunction<Environment, T, P> prover, String n, Function<T, ? extends String> name,
			String c, Function<T, ? extends EnvContent> content) {
		Environment gamma1 = augment_env(gamma, name.apply(x), content.apply(x));
		P p = prover.apply(gamma, x);
		return new Pair<>(
				p(Simple_increment.class, gamma, (gamma_) -> p(Simple_increment.class, gamma1,
						(gamma1_) -> createSimple_increment_step(n, c, gamma_, x, gamma1_, createReflexivity(), p))),
				gamma1);
	}

	private static Environment augment_env(Environment gamma, String name, EnvContent content) {
		if (name == null) {
			return gamma;
		} else if (content == null) {
			return gamma;
		} else {
			return gamma.put(name, content);
		}
	}

	@SuppressWarnings("unchecked")
	protected <T extends EObject, P extends ProofTerm> Pair<Mutually<T, P>, Environment> proveMutually(
			Environment gamma, List<T> l, TriFunction<Environment, T, Environment, P> prover, String n,
			Function<T, ? extends String> name, String c, Function<T, ? extends EnvContent> content) {
		if (noDuplicate(l.stream().map(name))) {
			Environment gamma1 = fold_right((x, g) -> augment_env(g, name.apply(x), content.apply(x)), gamma, l);
			Forall<T, P> forall = proveForall(l, (x) -> prover.apply(gamma, x, gamma1));
			return new Pair<>(p(Mutually.class, gamma,
					(gamma_) -> p(Mutually.class, gamma1, (gamma1_) -> createMutually_all_explicit(n, c, gamma_, l,
							gamma1_, createReflexivity(), createReflexivity(), forall))),
					gamma1);
		} else {
			l.stream().filter((p) -> l.stream().map(name).filter((x) -> x.equals(name.apply(p))).count() >= 2)
					.forEach((f) -> error("Multiple definitions of `" + name.apply(f) + "'", f, null));
			return new Pair<>(null, gamma);
		}
	}

	@SuppressWarnings("unchecked")
	protected <T extends EObject, P extends ProofTerm, Q> Pair<Pair<List<T>, Environment>, Mutually_translate<T, P>> proveMutuallyTranslate(
			Environment gamma, List<T> l, BiFunction<Environment, T, Pair<T, Q>> translator,
			PentaFunction<Environment, T, T, Environment, Q, P> prover, String n, Function<T, ? extends String> name,
			String c, BiFunction<T, T, ? extends EnvContent> content) {
		if (noDuplicate(l.stream().map(name))) {
			List<Pair<T, Pair<T, Q>>> pl = l.stream().map((x) -> new Pair<>(x, translator.apply(gamma, x)))
					.collect(Collectors.toList());
			if (pl.stream().allMatch((p) -> p.getB() != null && p.getB().getA() != null)) {
				if (pl.stream().allMatch((p) -> name.apply(p.getA()).equals(name.apply(p.getB().getA())))) {
					List<T> l1 = pl.stream().map(Pair::getB).map(Pair::getA).collect(Collectors.toList());
					Environment gamma1 = fold_right((x, g) -> augment_env(g, name.apply(x.getB().getA()),
							content.apply(x.getA(), x.getB().getA())), gamma, pl);
					Forall2<T, T, And<Equality, P>> forall = proveForall2(pl, Pair::getA, (p) -> p.getB().getA(),
							(p) -> createConj(createReflexivity(),
									prover.apply(gamma, p.getA(), p.getB().getA(), gamma1, p.getB().getB())));
					Mutually_translate<T, P> r = p(Mutually_translate.class, gamma,
							(gamma_) -> p(Mutually_translate.class, gamma1,
									(gamma1_) -> createMutually_translate_all_explicit(n, c, gamma_, l, l1, gamma1_,
											createReflexivity(), createReflexivity(), forall)));
					return new Pair<>(new Pair<>(l1, gamma1), r);
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				return new Pair<>(new Pair<>(l, gamma), null);
			}
		} else {
			l.stream().filter((p) -> l.stream().map(name).filter((x) -> x.equals(name.apply(p))).count() >= 2)
					.forEach((f) -> error("Multiple definitions of `" + name.apply(f) + "'", f, null));
			return new Pair<>(new Pair<>(l, gamma), null);
		}
	}

	@SuppressWarnings("unchecked")
	protected <T extends EObject, P extends ProofTerm> Optionally<T, P> proveOptionally(Environment gamma, T x,
			BiFunction<Environment, T, P> prover) {
		if (x == null) {
			return p(Optionally.class, gamma, (gamma_) -> createOptionally_None(gamma_));
		} else {
			P p = prover.apply(gamma, x);
			return p(Optionally.class, gamma, (gamma_) -> createOptionally_Some(gamma_, x, p));
		}
	}

	public TypeCheckerGenericRules() {
		super();
	}

}