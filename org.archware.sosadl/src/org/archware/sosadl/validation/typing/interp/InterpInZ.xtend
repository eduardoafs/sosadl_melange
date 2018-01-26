package org.archware.sosadl.validation.typing.interp

import org.archware.sosadl.sosADL.IntegerValue
import java.math.BigInteger
import org.archware.sosadl.sosADL.UnaryExpression
import org.archware.sosadl.sosADL.BinaryExpression
import org.archware.sosadl.sosADL.Expression

class InterpInZ {
	static def dispatch BigInteger eval(IntegerValue e) { return BigInteger.valueOf(e.absInt) }
	static def dispatch BigInteger eval(UnaryExpression e) {
		switch(e.op) {
			case '+': return e.right.eval
			case '-': return e.right.eval.negate
		}
	}
	static def dispatch BigInteger eval(BinaryExpression e) {
		switch(e.op) {
			case '+': return e.left.eval.add(e.right.eval)
			case '-': return e.left.eval.subtract(e.right.eval)
			case '*': return e.left.eval.multiply(e.right.eval)
			case '/': return e.left.eval.divide(e.right.eval)
			case 'mod': return e.left.eval.remainder(e.right.eval)
		}
	}
	
	static def le(Expression l, Expression r) {
		return l.eval.compareTo(r.eval) <= 0
	}
	
	static def eq(Expression l, Expression r) {
		return l.eval.compareTo(r.eval) == 0
	}
	
	static def gt(Expression l, Expression r) {
		return l.eval.compareTo(r.eval) > 0
	}
}