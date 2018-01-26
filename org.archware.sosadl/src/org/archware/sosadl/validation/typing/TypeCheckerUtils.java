package org.archware.sosadl.validation.typing;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.archware.sosadl.sosADL.BinaryExpression;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.IntegerValue;
import org.archware.sosadl.sosADL.UnaryExpression;
import org.archware.sosadl.validation.typing.interp.InterpInZ;
import org.archware.utils.Pair;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

public class TypeCheckerUtils extends TypeCheckerConstructors {

	protected static Expression min(Expression l, Expression r) {
		if(InterpInZ.le(l, r)) {
			return l;
		} else {
			return r;
		}
	}

	protected static Expression max(Expression l, Expression r) {
		if(InterpInZ.le(r, l)) {
			return l;
		} else {
			return r;
		}
	}

	protected static <T> EList<T> cdr(List<T> l) {
		Iterator<T> i = l.iterator();
		EList<T> ret;
		if(i.hasNext()) {
			i.next();
			ret = ECollections.toEList(i);
		} else {
			ret = ECollections.emptyEList();
		}
		return ECollections.unmodifiableEList(ret);
	}

	protected boolean isLe(Expression l, Expression r) {
		return isConstExprOrError(l) && isConstExprOrError(r) && InterpInZ.le(l, r);
	}

	protected boolean isConstExprOrError(Expression e) {
		return isConstExpr(e);
	}

	private boolean isConstExpr(Expression e) {
		// constexpr_IntegerValue:
		if(e instanceof IntegerValue) {
			return true;
		}
		// constexpr_Opposite:
		else if(e instanceof UnaryExpression && ((UnaryExpression)e).getOp() != null && ((UnaryExpression)e).getOp().equals("-") && ((UnaryExpression)e).getRight() != null) {
			return isConstExpr(((UnaryExpression)e).getRight());
		}
		// constexpr_Same:
		else if(e instanceof UnaryExpression && ((UnaryExpression)e).getOp() != null && ((UnaryExpression)e).getOp().equals("+") && ((UnaryExpression)e).getRight() != null) {
			return isConstExpr(((UnaryExpression)e).getRight());
		}
		// constexpr_Add:
		else if(e instanceof BinaryExpression && ((BinaryExpression)e).getOp() != null && ((BinaryExpression)e).getOp().equals("+") && ((BinaryExpression)e).getLeft() != null && ((BinaryExpression)e).getRight() != null) {
			return isConstExpr(((BinaryExpression)e).getLeft()) & isConstExpr(((BinaryExpression)e).getRight());
		}
		// constexpr_Sub:
		else if(e instanceof BinaryExpression && ((BinaryExpression)e).getOp() != null && ((BinaryExpression)e).getOp().equals("-") && ((BinaryExpression)e).getLeft() != null && ((BinaryExpression)e).getRight() != null) {
			return isConstExpr(((BinaryExpression)e).getLeft()) & isConstExpr(((BinaryExpression)e).getRight());
		}
		// constexpr_Mul:
		else if(e instanceof BinaryExpression && ((BinaryExpression)e).getOp() != null && ((BinaryExpression)e).getOp().equals("*") && ((BinaryExpression)e).getLeft() != null && ((BinaryExpression)e).getRight() != null) {
			return isConstExpr(((BinaryExpression)e).getLeft()) & isConstExpr(((BinaryExpression)e).getRight());
		}
		// constexpr_Div:
		else if(e instanceof BinaryExpression && ((BinaryExpression)e).getOp() != null && ((BinaryExpression)e).getOp().equals("/") && ((BinaryExpression)e).getLeft() != null && ((BinaryExpression)e).getRight() != null) {
			return isConstExpr(((BinaryExpression)e).getLeft()) & isConstExpr(((BinaryExpression)e).getRight());
		}
		// constexpr_Mod:
		else if(e instanceof BinaryExpression && ((BinaryExpression)e).getOp() != null && ((BinaryExpression)e).getOp().equals("mod") && ((BinaryExpression)e).getLeft() != null && ((BinaryExpression)e).getRight() != null) {
			return isConstExpr(((BinaryExpression)e).getLeft()) & isConstExpr(((BinaryExpression)e).getRight());
		} else {
			return false;
		}
	}

	protected boolean isConstExprNoError(Expression e) {
		return new TypeChecker().isConstExprOrError(e);
	}

	protected static <T> EList<T> cons(T v, List<T> l) {
		List<T> lv = new LinkedList<>();
		lv.add(v);
		EList<T> ret = ECollections.asEList(lv);
		ret.addAll(l);
		return ECollections.unmodifiableEList(ret);
	}

	protected static <T> EList<T> nil() {
		return ECollections.unmodifiableEList(ECollections.emptyEList());
	}

	@SuppressWarnings("unused")
	private static <A, B> A fold_left(BiFunction<A,B,A> f, List<B> l, A i) {
		/*
		if(l.isEmpty()) {
			return i;
		} else {
			return fold_left(f, cdr(l), f.apply(i, l.get(0)));
		}
		*/
		A r = i;
		for(B x:l) {
			r = f.apply(r, x);
		}
		return r;
	}

	protected static <A, B> A fold_right(BiFunction<B,A,A> f, A i, List<B> l) {
		/*
		if(l.isEmpty()) {
			return i;
		} else {
			return f.apply(l.get(0), fold_right(f, i, cdr(l)));
		}
		*/
		A r = i;
		for(int j = l.size();j > 0;) {
			--j;
			B x = l.get(j);
			r = f.apply(x, r);
		}
		return r;
	}

	@SuppressWarnings("unused")
	private static <A, B> B assoc(List<Pair<A,B>> l, A a) {
		for(Pair<A,B> i: l) {
			if(i.getA() == a) {
				return i.getB();
			}
		}
		return null;
	}

	protected static <A, B> A rassoc(List<Pair<A,B>> l, B b) {
		for(Pair<A,B> i: l) {
			if(i.getB() == b) {
				return i.getA();
			}
		}
		return null;
	}

	protected static <T> boolean noDuplicate(Stream<T> s) {
		List<T> list = s.filter((p) -> p != null).collect(Collectors.toList());
		Set<T> set = new TreeSet<>(list);
		return list.size() == set.size();
	}

	public TypeCheckerUtils() {
		super();
	}

}