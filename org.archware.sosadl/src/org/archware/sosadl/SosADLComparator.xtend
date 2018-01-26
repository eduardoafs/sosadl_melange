package org.archware.sosadl

import com.google.common.collect.AbstractIterator
import java.util.Iterator
import java.util.List
import org.archware.sosadl.sosADL.ArchitectureDecl
import org.archware.sosadl.sosADL.DataType
import org.archware.sosadl.sosADL.DataTypeDecl
import org.archware.sosadl.sosADL.EntityBlock
import org.archware.sosadl.sosADL.FunctionDecl
import org.archware.sosadl.sosADL.Import
import org.archware.sosadl.sosADL.IntegerType
import org.archware.sosadl.sosADL.RangeType
import org.archware.sosadl.sosADL.Library
import org.archware.sosadl.sosADL.MediatorDecl
import org.archware.sosadl.sosADL.SequenceType
import org.archware.sosadl.sosADL.SoS
import org.archware.sosadl.sosADL.SosADL
import org.archware.sosadl.sosADL.SystemDecl
import org.archware.sosadl.sosADL.NamedType
import org.archware.sosadl.sosADL.Unit
import org.eclipse.xtext.xbase.lib.Functions
import org.eclipse.xtext.xbase.lib.Pair
import org.archware.sosadl.sosADL.TupleType
import org.archware.sosadl.sosADL.Expression
import org.archware.sosadl.sosADL.FormalParameter
import org.archware.sosadl.sosADL.FieldDecl
import org.archware.sosadl.sosADL.Valuing
import org.archware.sosadl.sosADL.GateDecl
import org.archware.sosadl.sosADL.BehaviorDecl
import org.archware.sosadl.sosADL.AssertionDecl
import org.archware.sosadl.sosADL.DutyDecl
import org.archware.sosadl.sosADL.ArchBehaviorDecl
import org.archware.sosadl.sosADL.Connection
import org.archware.sosadl.sosADL.ProtocolDecl
import org.archware.sosadl.sosADL.Protocol
import org.archware.sosadl.sosADL.Behavior
//import org.archware.sosadl.sosADL.Assertion
import org.archware.sosadl.sosADL.ProtocolStatement
import org.archware.sosadl.sosADL.BehaviorStatement
import org.archware.sosadl.sosADL.Constituent
import org.archware.sosadl.sosADL.Any
import org.archware.sosadl.sosADL.BinaryExpression
import org.archware.sosadl.sosADL.Quantify
import org.archware.sosadl.sosADL.Relay
import org.archware.sosadl.sosADL.Unify
import org.archware.sosadl.sosADL.CallExpression
import org.archware.sosadl.sosADL.Tuple
import org.archware.sosadl.sosADL.IdentExpression
import org.archware.sosadl.sosADL.IntegerValue
import org.archware.sosadl.sosADL.Map
import org.archware.sosadl.sosADL.MethodCall
import org.archware.sosadl.sosADL.Select
import org.archware.sosadl.sosADL.UnaryExpression
import org.archware.sosadl.sosADL.ElementInConstituent
import org.archware.sosadl.sosADL.ComplexName
import org.archware.sosadl.sosADL.Sequence
import org.archware.sosadl.sosADL.Field
import org.archware.sosadl.sosADL.TupleElement
import org.archware.sosadl.sosADL.Action
//import org.archware.sosadl.sosADL.Always
//import org.archware.sosadl.sosADL.Anynext
//import org.archware.sosadl.sosADL.BinaryAssertion
//import org.archware.sosadl.sosADL.UnaryAssertion
import org.archware.sosadl.sosADL.ActionSuite
import org.archware.sosadl.sosADL.ReceiveAction
import org.archware.sosadl.sosADL.SendAction
import org.archware.sosadl.sosADL.AnyAction
import org.archware.sosadl.sosADL.AskAssertion
import org.archware.sosadl.sosADL.UntellAssertion
import org.archware.sosadl.sosADL.TellAssertion
import org.archware.sosadl.sosADL.ChooseProtocol
import org.archware.sosadl.sosADL.ForEachBehavior
import org.archware.sosadl.sosADL.ForEachProtocol
import org.archware.sosadl.sosADL.IfThenElseProtocol
import org.archware.sosadl.sosADL.ProtocolAction
import org.archware.sosadl.sosADL.RepeatProtocol
import org.archware.sosadl.sosADL.ProtocolActionSuite
import org.archware.sosadl.sosADL.ReceiveAnyProtocolAction
import org.archware.sosadl.sosADL.ReceiveProtocolAction
import org.archware.sosadl.sosADL.SendProtocolAction
import org.archware.sosadl.sosADL.ChooseBehavior
import org.archware.sosadl.sosADL.IfThenElseBehavior
import org.archware.sosadl.sosADL.RecursiveCall
import org.archware.sosadl.sosADL.RepeatBehavior
import org.archware.sosadl.sosADL.DoExprProtocol
import org.archware.sosadl.sosADL.DoneProtocol
import org.archware.sosadl.sosADL.ValuingProtocol
import org.archware.sosadl.sosADL.AssertProtocol
import org.archware.sosadl.sosADL.DoExprBehavior
import org.archware.sosadl.sosADL.DoneBehavior
import org.archware.sosadl.sosADL.AssertBehavior
import org.archware.sosadl.sosADL.ValuingBehavior
import org.archware.sosadl.sosADL.UnobservableBehavior


class SosADLComparator {
	def static compare(SosADL l, SosADL r) {
		sameElements(l.imports, r.imports, [p, q | compare(p, q)]) && compareUnit(l.content, r.content)
	}
	
	def static <T,U> zip(Iterator<T> l, Iterator<U> r) {
		val AbstractIterator<Pair<T,U>> i = [|
			if (l.hasNext && r.hasNext) Pair.of(l.next, r.next) else self.endOfData
		]
		i
	}
	
	def static <T,U> sameElements(List<T> l, List<U> r, Functions.Function2<T,U,Boolean> f) {
		l.size == r.size && zip(l.iterator, r.iterator).forall[p | f.apply(p.key, p.value)]
	}
	
	def static <T> compareOpt(T l, T r, Functions.Function2<T,T,Boolean> f) {
		if(l == null) { r == null }
		else { r != null && f.apply(l, r) }
	}
	
	def static compare(Import l, Import r) { l.importedLibrary.equals(r.importedLibrary) }
	
	def static dispatch compareUnit(Library l, Library r)	{ l.name.equals(r.name) && compare(l.decls, r.decls) }
	def static dispatch compareUnit(SoS l, SoS r)			{ l.name.equals(r.name) && compare(l.decls, r.decls) }
	def static dispatch compareUnit(Unit l, Unit r)			{ false }
	
	def static compare(EntityBlock l, EntityBlock r) {
		sameElements(l.datatypes, r.datatypes, [p, q | compare(p, q)]) && sameElements(l.functions, r.functions, [p, q | compare(p, q)])
		&& sameElements(l.systems, r.systems, [p, q | compare(p, q)]) && sameElements(l.mediators, r.mediators, [p, q | compare(p, q)])
		&& sameElements(l.architectures, r.architectures, [p, q | compare(p, q)])
	}
	
	def static compare(DataTypeDecl l, DataTypeDecl r) {
		l.name.equals(r.name) && compareOpt(l.datatype, r.datatype, [p, q | compareDataType(p, q)]) && sameElements(l.functions, r.functions, [p, q | compare(p, q)])
	}
	
	def static dispatch boolean compareDataType(NamedType l, NamedType r)			{ l.name.equals(r.name) }
	def static dispatch boolean compareDataType(IntegerType l, IntegerType r)	{ true }
	def static dispatch boolean compareDataType(RangeType l, RangeType r)		{ compareExpression(l.vmin, r.vmin) && compareExpression(l.vmax, r.vmax) }
	def static dispatch boolean compareDataType(SequenceType l, SequenceType r)	{ compareDataType(l.type, r.type) }
	def static dispatch boolean compareDataType(TupleType l, TupleType r)		{ sameElements(l.fields, r.fields, [p, q | compare(p, q)]) }
	def static dispatch boolean compareDataType(DataType l, DataType r)			{ false }
	
	def static compare(FunctionDecl l, FunctionDecl r) {
		//l.data.equals(r.data) && l.dataTypeName.equals(r.dataTypeName) && l.name.equals(r.name)
		compare(l.data, r.data)
		&& sameElements(l.parameters, r.parameters, [p, q | compare(p, q)]) && compareDataType(l.type, r.type)
		&& sameElements(l.valuing, r.valuing, [p, q | compare(p, q)]) && compareExpression(l.expression, r.expression)
	}
	
	def static compare(FormalParameter l, FormalParameter r) { l.name.equals(r.name) && compareDataType(l.type, r.type) }

	def static compare(FieldDecl l, FieldDecl r) { l.name.equals(r.name) && compareDataType(l.type, r.type) }
	
	def static compare(Valuing l, Valuing r) { l.name.equals(r.name) && compareOpt(l.type, r.type, [p, q | compareDataType(p, q)]) && compareExpression(l.expression, r.expression) }
	
	def static compare(SystemDecl l, SystemDecl r) {
		l.name.equals(r.name) && sameElements(l.parameters, r.parameters, [p, q | compare(p, q)])
		&& sameElements(l.datatypes, r.datatypes, [p, q | compare(p, q)])
		&& sameElements(l.gates, r.gates, [p, q | compare(p, q)])
		&& compare(l.behavior, r.behavior)
		&& sameElements(l.assertions, r.assertions, [p, q | compare(p, q)])
	}
	
	def static compare(MediatorDecl l, MediatorDecl r) {
        l.name.equals(r.name) && sameElements(l.parameters, r.parameters, [p, q | compare(p, q)])
        && sameElements(l.datatypes, r.datatypes, [p, q | compare(p, q)])
        && sameElements(l.duties, r.duties, [p, q | compare(p, q)])
        && compare(l.behavior, r.behavior)
        && sameElements(l.assumptions, r.assumptions, [p, q | compare(p, q)])
        && sameElements(l.assertions, r.assertions, [p, q | compare(p, q)])
    }
	/* WAS:
	def static compare(MediatorDecl l, MediatorDecl r) {
		l.name.equals(r.name) && sameElements(l.parameters, r.parameters, [p, q | compare(p, q)])
		&& sameElements(l.datatypes, r.datatypes, [p, q | compare(p, q)])
		&& sameElements(l.duties, r.duties, [p, q | compare(p, q)])
		&& compare(l.behavior, r.behavior)
	}
	*/
	
	def static compare(ArchitectureDecl l, ArchitectureDecl r) {
		l.name.equals(r.name) && sameElements(l.parameters, r.parameters, [p, q | compare(p, q)])
		&& sameElements(l.datatypes, r.datatypes, [p, q | compare(p, q)])
		&& sameElements(l.gates, r.gates, [p, q | compare(p, q)])
		&& compare(l.behavior, r.behavior)
		&& sameElements(l.assertions, r.assertions, [p, q | compare(p, q)])
	}
	
	def static compare(GateDecl l, GateDecl r) {
		l.name.equals(r.name)
		&& sameElements(l.connections, r.connections, [p, q | compare(p, q)])
		&& sameElements(l.protocols, r.protocols, [p, q | compare(p, q)])
	}

	def static compare(DutyDecl l, DutyDecl r) {
		l.name.equals(r.name)
		&& sameElements(l.connections, r.connections, [p, q | compare(p, q)])
		&& sameElements(l.assertions, r.assertions, [p, q | compare(p, q)])
		&& sameElements(l.protocols, r.protocols, [p, q | compare(p, q)])
	}
	
	def static compare(Connection l, Connection r) {
		l.environment == r.environment
		&& l.name.equals(r.name)
		&& l.mode == r.mode
		&& compareDataType(l.valueType, r.valueType)
	}
	
	def static compare(ProtocolDecl l, ProtocolDecl r) {
		l.name.equals(r.name) && compare(l.body, r.body)
	}
	
	def static compare(BehaviorDecl l, BehaviorDecl r) {
		l.name.equals(r.name)
		&& compare(l.body, r.body)
	}
	/* WAS:
	def static compare(BehaviorDecl l, BehaviorDecl r) {
        l.name.equals(r.name)
        && sameElements(l.parameters, r.parameters, [p, q | compare(p, q)])
        && compare(l.body, r.body)
    }
	*/

	def static compare(ArchBehaviorDecl l, ArchBehaviorDecl r) {
		l.name.equals(r.name)
		&& sameElements(l.constituents, r.constituents, [p, q | compare(p, q)])
		&& compareExpression(l.bindings, r.bindings)
	}
	/* WAS:
	def static compare(ArchBehaviorDecl l, ArchBehaviorDecl r) {
        l.name.equals(r.name)
        && sameElements(l.parameters, r.parameters, [p, q | compareExpression(p, q)])
        && sameElements(l.constituents, r.constituents, [p, q | compare(p, q)])
        && compareExpression(l.bindings, r.bindings)
    }
	*/
	
	def static compare(AssertionDecl l, AssertionDecl r) {
		l.name.equals(r.name) && compare(l.body, r.body)
	}
	/* WAS:
	def static compare(AssertionDecl l, AssertionDecl r) {
        l.name.equals(r.name)
        && sameElements(l.valuing, r.valuing, [p, q | compare(p, q)])
        && compareAssertion(l.assertion, r.assertion)
    }
	*/
	
	def static compare(Protocol l, Protocol r) { sameElements(l.statements, r.statements, [p, q | compareProtocolStatement(p, q)]) }
	
	def static compare(Behavior l, Behavior r) { sameElements(l.statements, r.statements, [p, q | compareBehaviorStatement(p, q)]) }
	
	def static compare(Constituent l, Constituent r) { l.name.equals(r.name) && compareExpression(l.value, r.value) }
	
	def static dispatch boolean compareExpression(Any l, Any r)								{ true }
	def static dispatch boolean compareExpression(BinaryExpression l, BinaryExpression r)	{ compareExpression(l.left, r.left) && l.op.equals(r.op) && compareExpression(l.right, r.right) }
	def static dispatch boolean compareExpression(Quantify l, Quantify r)					{ l.quantifier.equals(r.quantifier) && sameElements(l.elements, r.elements, [p, q | compare(p, q)]) && compareExpression(l.bindings, r.bindings) }
	def static dispatch boolean compareExpression(Relay l, Relay r)							{ compare(l.connLeft, r.connLeft) && compare(l.connRight, r.connRight) }
	def static dispatch boolean compareExpression(Unify l, Unify r)							{ l.multLeft.equals(r.multLeft) && compare(l.connLeft, r.connLeft) && l.multRight.equals(r.multRight) && compare(l.connRight, r.connRight) }
	def static dispatch boolean compareExpression(CallExpression l, CallExpression r)		{ l.function.equals(r.function) && sameElements(l.parameters, r.parameters, [p, q | compareExpression(p, q)]) }
	def static dispatch boolean compareExpression(Sequence l, Sequence r)					{ sameElements(l.elements, r.elements, [p, q | compareExpression(p, q)]) }
	def static dispatch boolean compareExpression(Tuple l, Tuple r)							{ sameElements(l.elements, r.elements, [p, q | compare(p, q)]) }
	def static dispatch boolean compareExpression(Field l, Field r)							{ compareExpression(l.object, r.object) && l.field.equals(r.field) }
	def static dispatch boolean compareExpression(IdentExpression l, IdentExpression r)		{ l.ident.equals(r.ident) }
	def static dispatch boolean compareExpression(IntegerValue l, IntegerValue r)			{ l.absInt == r.absInt }
	def static dispatch boolean compareExpression(Map l, Map r)								{ compareExpression(l.object, r.object) && l.variable.equals(r.variable) && compareExpression(l.expression, r.expression) }
	def static dispatch boolean compareExpression(MethodCall l, MethodCall r)				{ compareExpression(l.object, r.object) && l.method.equals(r.method) && sameElements(l.parameters, r.parameters, [p, q | compareExpression(p, q)]) }
	def static dispatch boolean compareExpression(Select l, Select r)						{ compareExpression(l.object, r.object) && l.variable.equals(r.variable) && compareExpression(l.condition, r.condition) }
	def static dispatch boolean compareExpression(UnaryExpression l, UnaryExpression r)		{ l.op.equals(r.op) && compareExpression(l.right, r.right) }
	//def static dispatch boolean compareExpression(UnobservableValue l, UnobservableValue r)	{ true }
	def static dispatch boolean compareExpression(Expression l, Expression r)				{ false }
	
	def static compare(ElementInConstituent l, ElementInConstituent r) {
		l.variable.equals(r.variable) && l.constituent.equals(r.constituent)
	}
	
	def static compare(ComplexName l, ComplexName r) {
		sameElements(l.name, r.name, [p, q | p.equals(q)])
	}
	
	def static compare(TupleElement l, TupleElement r) { l.label.equals(r.label) && compareExpression(l.value, r.value) }

	//def static dispatch boolean compareAssertion(Action l, Action r)					{ compare(l.complexName, r.complexName) && compareActionSuite(l.suite, r.suite) }
	//def static dispatch boolean compareAssertion(Always l, Always r)					{ compareAssertion(l.expression, r.expression) }
	//def static dispatch boolean compareAssertion(Anynext l, Anynext r)					{ compareAssertion(l.expression, r.expression) }
	//def static dispatch boolean compareAssertion(BinaryAssertion l, BinaryAssertion r)	{ compareAssertion(l.left, r.left) && l.op.equals(r.op) && compareAssertion(l.right, r.right) }
	//def static dispatch boolean compareAssertion(Expression l, Expression r)			{ compareExpression(l, r) }
	//def static dispatch boolean compareAssertion(UnaryAssertion l, UnaryAssertion r)	{ l.op.equals(r.op) && compareAssertion(l.right, r.right) }
	//def static dispatch boolean compareAssertion(Assertion l, Assertion r)				{ false }

	def static dispatch boolean compareActionSuite(ReceiveAction l, ReceiveAction r)	{ l.variable.equals(r.variable) }
	def static dispatch boolean compareActionSuite(SendAction l, SendAction r)			{ compareExpression(l.expression, r.expression) }
	def static dispatch boolean compareActionSuite(ActionSuite l, ActionSuite r)		{ false }
	
	def static dispatch boolean compareAssert(AskAssertion l, AskAssertion r)				{ l.name.equals(r.name) && compareExpression(l.expression, r.expression) }
	def static dispatch boolean compareAssert(TellAssertion l, TellAssertion r)				{ l.name.equals(r.name) && compareExpression(l.expression, r.expression) }
	def static dispatch boolean compareAssert(UntellAssertion l, UntellAssertion r)			{ l.name.equals(r.name) }
	
	
	def static dispatch boolean compareProtocolStatement(AnyAction l, AnyAction r)						{ true }
	def static dispatch boolean compareProtocolStatement(AssertProtocol l, AssertProtocol r)				{ compareAssert(l.assertion, r.assertion) }
	def static dispatch boolean compareProtocolStatement(ChooseProtocol l, ChooseProtocol r)			{ sameElements(l.branches, r.branches, [p, q | compare(p, q)]) }
	def static dispatch boolean compareProtocolStatement(DoExprProtocol l, DoExprProtocol r)							{ compareExpression(l.expression, r.expression) }
	def static dispatch boolean compareProtocolStatement(DoneProtocol l, DoneProtocol r)								{ true }
	def static dispatch boolean compareProtocolStatement(ForEachProtocol l, ForEachProtocol r)			{ l.variable.equals(r.variable) && compareExpression(l.setOfValues, r.setOfValues) && compare(l.repeated, r.repeated) }
	def static dispatch boolean compareProtocolStatement(IfThenElseProtocol l, IfThenElseProtocol r)	{ compareExpression(l.condition, r.condition) && compare(l.ifTrue, r.ifTrue) && compareOpt(l.ifFalse, r.ifFalse, [p, q | compare(p, q)]) }
	def static dispatch boolean compareProtocolStatement(ProtocolAction l, ProtocolAction r)			{ compare(l.complexName, r.complexName) && compareProtocolActionSuite(l.suite, r.suite) }
	def static dispatch boolean compareProtocolStatement(RepeatProtocol l, RepeatProtocol r)			{ compare(l.repeated, r.repeated) }
	def static dispatch boolean compareProtocolStatement(ValuingProtocol l, ValuingProtocol r)							{ compare(l.valuing, r.valuing) }
	def static dispatch boolean compareProtocolStatement(ProtocolStatement l, ProtocolStatement r)		{ false }
	
	def static dispatch boolean compareProtocolActionSuite(ReceiveAnyProtocolAction l, ReceiveAnyProtocolAction r)	{ true }
	def static dispatch boolean compareProtocolActionSuite(ReceiveProtocolAction l, ReceiveProtocolAction r)		{ l.variable.equals(r.variable) }
	def static dispatch boolean compareProtocolActionSuite(SendProtocolAction l, SendProtocolAction r)				{ compareExpression(l.expression, r.expression) }
	def static dispatch boolean compareProtocolActionSuite(ProtocolActionSuite l, ProtocolActionSuite r)			{ false }

	def static dispatch boolean compareBehaviorStatement(Action l, Action r)							{ compare(l.complexName, r.complexName) && compareActionSuite(l.suite, r.suite) }
	def static dispatch boolean compareBehaviorStatement(AssertBehavior l, AssertBehavior r)				{ compareAssert(l.assertion, r.assertion) }
	def static dispatch boolean compareBehaviorStatement(ChooseBehavior l, ChooseBehavior r)			{ sameElements(l.branches, r.branches, [p, q | compare(p, q)]) }
	def static dispatch boolean compareBehaviorStatement(DoExprBehavior l, DoExprBehavior r)							{ compareExpression(l.expression, r.expression) }
	def static dispatch boolean compareBehaviorStatement(DoneBehavior l, DoneBehavior r)								{ true }
	def static dispatch boolean compareBehaviorStatement(ForEachBehavior l, ForEachBehavior r)			{ l.variable.equals(r.variable) && compareExpression(l.setOfValues, r.setOfValues) && compare(l.repeated, r.repeated) }
	def static dispatch boolean compareBehaviorStatement(IfThenElseBehavior l, IfThenElseBehavior r)	{ compareExpression(l.condition, r.condition) && compare(l.ifTrue, r.ifTrue) && compareOpt(l.ifFalse, r.ifFalse, [p, q | compare(p, q)]) }
	def static dispatch boolean compareBehaviorStatement(RecursiveCall l, RecursiveCall r)				{ sameElements(l.parameters, r.parameters, [p, q | compareExpression(p, q)]) }
	def static dispatch boolean compareBehaviorStatement(RepeatBehavior l, RepeatBehavior r)			{ compare(l.repeated, r.repeated) }
	def static dispatch boolean compareBehaviorStatement(ValuingBehavior l, ValuingBehavior r)							{ compare(l.valuing, r.valuing) }
	def static dispatch boolean compareBehaviorStatement(UnobservableBehavior l, UnobservableBehavior r)			{ true }
	def static dispatch boolean compareBehaviorStatement(BehaviorStatement l, BehaviorStatement r)		{ false }	
}
