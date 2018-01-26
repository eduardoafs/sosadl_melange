// Automatically generated
package org.archware.sosadl.sosADL.generator

import java.util.List
import javax.annotation.Generated
import org.eclipse.xtext.xbase.lib.Functions.Function1

import org.archware.sosadl.sosADL.Quantifier
import org.archware.sosadl.sosADL.Multiplicity
import org.archware.sosadl.sosADL.ModeType

import org.archware.sosadl.sosADL.ReceiveAction
import org.archware.sosadl.sosADL.SendAction
import org.archware.sosadl.sosADL.ArchBehaviorDecl
import org.archware.sosadl.sosADL.ArchitectureDecl
import org.archware.sosadl.sosADL.AskAssertion
import org.archware.sosadl.sosADL.TellAssertion
import org.archware.sosadl.sosADL.UntellAssertion
import org.archware.sosadl.sosADL.AssertionDecl
import org.archware.sosadl.sosADL.Behavior
import org.archware.sosadl.sosADL.BehaviorDecl
import org.archware.sosadl.sosADL.Action
import org.archware.sosadl.sosADL.AssertBehavior
import org.archware.sosadl.sosADL.ChooseBehavior
import org.archware.sosadl.sosADL.DoExprBehavior
import org.archware.sosadl.sosADL.DoneBehavior
import org.archware.sosadl.sosADL.ForEachBehavior
import org.archware.sosadl.sosADL.IfThenElseBehavior
import org.archware.sosadl.sosADL.RecursiveCall
import org.archware.sosadl.sosADL.RepeatBehavior
import org.archware.sosadl.sosADL.UnobservableBehavior
import org.archware.sosadl.sosADL.ValuingBehavior
import org.archware.sosadl.sosADL.ComplexName
import org.archware.sosadl.sosADL.Connection
import org.archware.sosadl.sosADL.Constituent
import org.archware.sosadl.sosADL.BooleanType
import org.archware.sosadl.sosADL.ConnectionType
import org.archware.sosadl.sosADL.IntegerType
import org.archware.sosadl.sosADL.NamedType
import org.archware.sosadl.sosADL.RangeType
import org.archware.sosadl.sosADL.SequenceType
import org.archware.sosadl.sosADL.TupleType
import org.archware.sosadl.sosADL.DataTypeDecl
import org.archware.sosadl.sosADL.DutyDecl
import org.archware.sosadl.sosADL.ElementInConstituent
import org.archware.sosadl.sosADL.EntityBlock
import org.archware.sosadl.sosADL.Any
import org.archware.sosadl.sosADL.BinaryExpression
import org.archware.sosadl.sosADL.CallExpression
import org.archware.sosadl.sosADL.Field
import org.archware.sosadl.sosADL.IdentExpression
import org.archware.sosadl.sosADL.IntegerValue
import org.archware.sosadl.sosADL.Map
import org.archware.sosadl.sosADL.MethodCall
import org.archware.sosadl.sosADL.Quantify
import org.archware.sosadl.sosADL.Relay
import org.archware.sosadl.sosADL.Select
import org.archware.sosadl.sosADL.Sequence
import org.archware.sosadl.sosADL.Tuple
import org.archware.sosadl.sosADL.UnaryExpression
import org.archware.sosadl.sosADL.Unify
import org.archware.sosadl.sosADL.FieldDecl
import org.archware.sosadl.sosADL.FormalParameter
import org.archware.sosadl.sosADL.FunctionDecl
import org.archware.sosadl.sosADL.GateDecl
import org.archware.sosadl.sosADL.Import
import org.archware.sosadl.sosADL.MediatorDecl
import org.archware.sosadl.sosADL.Protocol
import org.archware.sosadl.sosADL.ReceiveAnyProtocolAction
import org.archware.sosadl.sosADL.ReceiveProtocolAction
import org.archware.sosadl.sosADL.SendProtocolAction
import org.archware.sosadl.sosADL.ProtocolDecl
import org.archware.sosadl.sosADL.AnyAction
import org.archware.sosadl.sosADL.AssertProtocol
import org.archware.sosadl.sosADL.ChooseProtocol
import org.archware.sosadl.sosADL.DoExprProtocol
import org.archware.sosadl.sosADL.DoneProtocol
import org.archware.sosadl.sosADL.ForEachProtocol
import org.archware.sosadl.sosADL.IfThenElseProtocol
import org.archware.sosadl.sosADL.ProtocolAction
import org.archware.sosadl.sosADL.RepeatProtocol
import org.archware.sosadl.sosADL.ValuingProtocol
import org.archware.sosadl.sosADL.SosADL
import org.archware.sosadl.sosADL.SystemDecl
import org.archware.sosadl.sosADL.TupleElement
import org.archware.sosadl.sosADL.Library
import org.archware.sosadl.sosADL.SoS
import org.archware.sosadl.sosADL.Valuing

@Generated(value = "sosADL")
class SosADLCoqGenerator {

	def _hook(CharSequence x) { return x; }

	def <T> _generateO(T t, Function1<? super T, ? extends CharSequence> gen) {
		if (t == null) {
			return "None"
		} else {
			return _hook('''(Some «gen.apply(t)»)''')
		}
	}

	def <T> _generateL(List<T> l, Function1<? super T, ? extends CharSequence> gen) {
		if (l.empty) {
			return "[]"
		} else {
			return _hook('''[«l.map(gen).join("; ")»]''')
		}
	}

	def generatebool(boolean b) {
		if (b) {
			return "true"
		} else {
			return "false"
		}
	}

	def generateZ(int i) {
		if (i >= 0) {
			return Integer.toString(i);
		} else {
			return '''(«Integer.toString(i)»)'''
		}
	}

	def generatestring(String i) { return _hook('''"«i»"'''); }

	def generateQuantifier(Quantifier n) {
		switch (n) {
			case QUANTIFIER_FORALL: {
				return '''QuantifierForall'''
			}
			
			case QUANTIFIER_EXISTS: {
				return '''QuantifierExists'''
			}
		}
	}
	
	def generateMultiplicity(Multiplicity n) {
		switch (n) {
			case MULTIPLICITY_ONE: {
				return '''MultiplicityOne'''
			}
			
			case MULTIPLICITY_NONE: {
				return '''MultiplicityNone'''
			}
			
			case MULTIPLICITY_LONE: {
				return '''MultiplicityLone'''
			}
			
			case MULTIPLICITY_ANY: {
				return '''MultiplicityAny'''
			}
			
			case MULTIPLICITY_SOME: {
				return '''MultiplicitySome'''
			}
			
			case MULTIPLICITY_ALL: {
				return '''MultiplicityAll'''
			}
		}
	}
	
	def generateModeType(ModeType n) {
		switch (n) {
			case MODE_TYPE_IN: {
				return '''ModeTypeIn'''
			}
			
			case MODE_TYPE_OUT: {
				return '''ModeTypeOut'''
			}
			
			case MODE_TYPE_INOUT: {
				return '''ModeTypeInout'''
			}
		}
	}

	def dispatch CharSequence generatet_ActionSuite(ReceiveAction n) { return _hook('''(ReceiveAction «_generateO(n.getVariable(), [generatestring])»)'''); }
	
	def dispatch CharSequence generatet_ActionSuite(SendAction n) { return _hook('''(SendAction «_generateO(n.getExpression(), [generatet_Expression])»)'''); }
	
	def CharSequence generatet_ArchBehaviorDecl(ArchBehaviorDecl n) { return _hook('''(ArchBehaviorDecl «_generateO(n.getName(), [generatestring])» «_generateL(n.getConstituents(), [generatet_Constituent])» «_generateO(n.getBindings(), [generatet_Expression])»)'''); }
	
	def CharSequence generatet_ArchitectureDecl(ArchitectureDecl n) { return _hook('''(ArchitectureDecl «_generateO(n.getName(), [generatestring])» «_generateL(n.getParameters(), [generatet_FormalParameter])» «_generateL(n.getDatatypes(), [generatet_DataTypeDecl])» «_generateL(n.getGates(), [generatet_GateDecl])» «_generateO(n.getBehavior(), [generatet_ArchBehaviorDecl])» «_generateL(n.getAssertions(), [generatet_AssertionDecl])»)'''); }
	
	def dispatch CharSequence generatet_Assert(AskAssertion n) { return _hook('''(AskAssertion «_generateO(n.getName(), [generatestring])» «_generateO(n.getExpression(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Assert(TellAssertion n) { return _hook('''(TellAssertion «_generateO(n.getName(), [generatestring])» «_generateO(n.getExpression(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Assert(UntellAssertion n) { return _hook('''(UntellAssertion «_generateO(n.getName(), [generatestring])»)'''); }
	
	def CharSequence generatet_AssertionDecl(AssertionDecl n) { return _hook('''(AssertionDecl «_generateO(n.getName(), [generatestring])» «_generateO(n.getBody(), [generatet_Protocol])»)'''); }
	
	def CharSequence generatet_Behavior(Behavior n) { return _hook('''(Behavior «_generateL(n.getStatements(), [generatet_BehaviorStatement])»)'''); }
	
	def CharSequence generatet_BehaviorDecl(BehaviorDecl n) { return _hook('''(BehaviorDecl «_generateO(n.getName(), [generatestring])» «_generateO(n.getBody(), [generatet_Behavior])»)'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(Action n) { return _hook('''(Action «_generateO(n.getComplexName(), [generatet_ComplexName])» «_generateO(n.getSuite(), [generatet_ActionSuite])»)'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(AssertBehavior n) { return _hook('''(AssertBehavior «_generateO(n.getAssertion(), [generatet_Assert])»)'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(ChooseBehavior n) { return _hook('''(ChooseBehavior «_generateL(n.getBranches(), [generatet_Behavior])»)'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(DoExprBehavior n) { return _hook('''(DoExprBehavior «_generateO(n.getExpression(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(DoneBehavior n) { return _hook('''DoneBehavior'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(ForEachBehavior n) { return _hook('''(ForEachBehavior «_generateO(n.getVariable(), [generatestring])» «_generateO(n.getSetOfValues(), [generatet_Expression])» «_generateO(n.getRepeated(), [generatet_Behavior])»)'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(IfThenElseBehavior n) { return _hook('''(IfThenElseBehavior «_generateO(n.getCondition(), [generatet_Expression])» «_generateO(n.getIfTrue(), [generatet_Behavior])» «_generateO(n.getIfFalse(), [generatet_Behavior])»)'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(RecursiveCall n) { return _hook('''(RecursiveCall «_generateL(n.getParameters(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(RepeatBehavior n) { return _hook('''(RepeatBehavior «_generateO(n.getRepeated(), [generatet_Behavior])»)'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(UnobservableBehavior n) { return _hook('''UnobservableBehavior'''); }
	
	def dispatch CharSequence generatet_BehaviorStatement(ValuingBehavior n) { return _hook('''(ValuingBehavior «_generateO(n.getValuing(), [generatet_Valuing])»)'''); }
	
	def CharSequence generatet_ComplexName(ComplexName n) { return _hook('''(ComplexName «_generateL(n.getName(), [generatestring])»)'''); }
	
	def CharSequence generatet_Connection(Connection n) { return _hook('''(Connection «_generateO(n.isEnvironment(), [generatebool])» «_generateO(n.getName(), [generatestring])» «_generateO(n.getMode(), [generateModeType])» «_generateO(n.getValueType(), [generatet_DataType])»)'''); }
	
	def CharSequence generatet_Constituent(Constituent n) { return _hook('''(Constituent «_generateO(n.getName(), [generatestring])» «_generateO(n.getValue(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_DataType(BooleanType n) { return _hook('''BooleanType'''); }
	
	def dispatch CharSequence generatet_DataType(ConnectionType n) { return _hook('''(ConnectionType «_generateO(n.getMode(), [generateModeType])» «_generateO(n.getType(), [generatet_DataType])»)'''); }
	
	def dispatch CharSequence generatet_DataType(IntegerType n) { return _hook('''IntegerType'''); }
	
	def dispatch CharSequence generatet_DataType(NamedType n) { return _hook('''(NamedType «_generateO(n.getName(), [generatestring])»)'''); }
	
	def dispatch CharSequence generatet_DataType(RangeType n) { return _hook('''(RangeType «_generateO(n.getVmin(), [generatet_Expression])» «_generateO(n.getVmax(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_DataType(SequenceType n) { return _hook('''(SequenceType «_generateO(n.getType(), [generatet_DataType])»)'''); }
	
	def dispatch CharSequence generatet_DataType(TupleType n) { return _hook('''(TupleType «_generateL(n.getFields(), [generatet_FieldDecl])»)'''); }
	
	def CharSequence generatet_DataTypeDecl(DataTypeDecl n) { return _hook('''(DataTypeDecl «_generateO(n.getName(), [generatestring])» «_generateO(n.getDatatype(), [generatet_DataType])» «_generateL(n.getFunctions(), [generatet_FunctionDecl])»)'''); }
	
	def CharSequence generatet_DutyDecl(DutyDecl n) { return _hook('''(DutyDecl «_generateO(n.getName(), [generatestring])» «_generateL(n.getConnections(), [generatet_Connection])» «_generateL(n.getAssertions(), [generatet_AssertionDecl])» «_generateL(n.getProtocols(), [generatet_ProtocolDecl])»)'''); }
	
	def CharSequence generatet_ElementInConstituent(ElementInConstituent n) { return _hook('''(ElementInConstituent «_generateO(n.getVariable(), [generatestring])» «_generateO(n.getConstituent(), [generatestring])»)'''); }
	
	def CharSequence generatet_EntityBlock(EntityBlock n) { return _hook('''(EntityBlock «_generateL(n.getDatatypes(), [generatet_DataTypeDecl])» «_generateL(n.getFunctions(), [generatet_FunctionDecl])» «_generateL(n.getSystems(), [generatet_SystemDecl])» «_generateL(n.getMediators(), [generatet_MediatorDecl])» «_generateL(n.getArchitectures(), [generatet_ArchitectureDecl])»)'''); }
	
	def dispatch CharSequence generatet_Expression(Any n) { return _hook('''Any'''); }
	
	def dispatch CharSequence generatet_Expression(BinaryExpression n) { return _hook('''(BinaryExpression «_generateO(n.getLeft(), [generatet_Expression])» «_generateO(n.getOp(), [generatestring])» «_generateO(n.getRight(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Expression(CallExpression n) { return _hook('''(CallExpression «_generateO(n.getFunction(), [generatestring])» «_generateL(n.getParameters(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Expression(Field n) { return _hook('''(Field «_generateO(n.getObject(), [generatet_Expression])» «_generateO(n.getField(), [generatestring])»)'''); }
	
	def dispatch CharSequence generatet_Expression(IdentExpression n) { return _hook('''(IdentExpression «_generateO(n.getIdent(), [generatestring])»)'''); }
	
	def dispatch CharSequence generatet_Expression(IntegerValue n) { return _hook('''(IntegerValue «_generateO(n.getAbsInt(), [generateZ])»)'''); }
	
	def dispatch CharSequence generatet_Expression(Map n) { return _hook('''(Map «_generateO(n.getObject(), [generatet_Expression])» «_generateO(n.getVariable(), [generatestring])» «_generateO(n.getExpression(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Expression(MethodCall n) { return _hook('''(MethodCall «_generateO(n.getObject(), [generatet_Expression])» «_generateO(n.getMethod(), [generatestring])» «_generateL(n.getParameters(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Expression(Quantify n) { return _hook('''(Quantify «_generateO(n.getQuantifier(), [generateQuantifier])» «_generateL(n.getElements(), [generatet_ElementInConstituent])» «_generateO(n.getBindings(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Expression(Relay n) { return _hook('''(Relay «_generateO(n.getConnLeft(), [generatet_ComplexName])» «_generateO(n.getConnRight(), [generatet_ComplexName])»)'''); }
	
	def dispatch CharSequence generatet_Expression(Select n) { return _hook('''(Select «_generateO(n.getObject(), [generatet_Expression])» «_generateO(n.getVariable(), [generatestring])» «_generateO(n.getCondition(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Expression(Sequence n) { return _hook('''(Sequence «_generateL(n.getElements(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Expression(Tuple n) { return _hook('''(Tuple «_generateL(n.getElements(), [generatet_TupleElement])»)'''); }
	
	def dispatch CharSequence generatet_Expression(UnaryExpression n) { return _hook('''(UnaryExpression «_generateO(n.getOp(), [generatestring])» «_generateO(n.getRight(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Expression(Unify n) { return _hook('''(Unify «_generateO(n.getMultLeft(), [generateMultiplicity])» «_generateO(n.getConnLeft(), [generatet_ComplexName])» «_generateO(n.getMultRight(), [generateMultiplicity])» «_generateO(n.getConnRight(), [generatet_ComplexName])»)'''); }
	
	def CharSequence generatet_FieldDecl(FieldDecl n) { return _hook('''(FieldDecl «_generateO(n.getName(), [generatestring])» «_generateO(n.getType(), [generatet_DataType])»)'''); }
	
	def CharSequence generatet_FormalParameter(FormalParameter n) { return _hook('''(FormalParameter «_generateO(n.getName(), [generatestring])» «_generateO(n.getType(), [generatet_DataType])»)'''); }
	
	def CharSequence generatet_FunctionDecl(FunctionDecl n) { return _hook('''(FunctionDecl «_generateO(n.getData(), [generatet_FormalParameter])» «_generateO(n.getName(), [generatestring])» «_generateL(n.getParameters(), [generatet_FormalParameter])» «_generateO(n.getType(), [generatet_DataType])» «_generateL(n.getValuing(), [generatet_Valuing])» «_generateO(n.getExpression(), [generatet_Expression])»)'''); }
	
	def CharSequence generatet_GateDecl(GateDecl n) { return _hook('''(GateDecl «_generateO(n.getName(), [generatestring])» «_generateL(n.getConnections(), [generatet_Connection])» «_generateL(n.getProtocols(), [generatet_ProtocolDecl])»)'''); }
	
	def CharSequence generatet_Import(Import n) { return _hook('''(Import «_generateO(n.getImportedLibrary(), [generatestring])»)'''); }
	
	def CharSequence generatet_MediatorDecl(MediatorDecl n) { return _hook('''(MediatorDecl «_generateO(n.getName(), [generatestring])» «_generateL(n.getParameters(), [generatet_FormalParameter])» «_generateL(n.getDatatypes(), [generatet_DataTypeDecl])» «_generateL(n.getDuties(), [generatet_DutyDecl])» «_generateO(n.getBehavior(), [generatet_BehaviorDecl])» «_generateL(n.getAssumptions(), [generatet_AssertionDecl])» «_generateL(n.getAssertions(), [generatet_AssertionDecl])»)'''); }
	
	def CharSequence generatet_Protocol(Protocol n) { return _hook('''(Protocol «_generateL(n.getStatements(), [generatet_ProtocolStatement])»)'''); }
	
	def dispatch CharSequence generatet_ProtocolActionSuite(ReceiveAnyProtocolAction n) { return _hook('''ReceiveAnyProtocolAction'''); }
	
	def dispatch CharSequence generatet_ProtocolActionSuite(ReceiveProtocolAction n) { return _hook('''(ReceiveProtocolAction «_generateO(n.getVariable(), [generatestring])»)'''); }
	
	def dispatch CharSequence generatet_ProtocolActionSuite(SendProtocolAction n) { return _hook('''(SendProtocolAction «_generateO(n.getExpression(), [generatet_Expression])»)'''); }
	
	def CharSequence generatet_ProtocolDecl(ProtocolDecl n) { return _hook('''(ProtocolDecl «_generateO(n.getName(), [generatestring])» «_generateO(n.getBody(), [generatet_Protocol])»)'''); }
	
	def dispatch CharSequence generatet_ProtocolStatement(AnyAction n) { return _hook('''AnyAction'''); }
	
	def dispatch CharSequence generatet_ProtocolStatement(AssertProtocol n) { return _hook('''(AssertProtocol «_generateO(n.getAssertion(), [generatet_Assert])»)'''); }
	
	def dispatch CharSequence generatet_ProtocolStatement(ChooseProtocol n) { return _hook('''(ChooseProtocol «_generateL(n.getBranches(), [generatet_Protocol])»)'''); }
	
	def dispatch CharSequence generatet_ProtocolStatement(DoExprProtocol n) { return _hook('''(DoExprProtocol «_generateO(n.getExpression(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_ProtocolStatement(DoneProtocol n) { return _hook('''DoneProtocol'''); }
	
	def dispatch CharSequence generatet_ProtocolStatement(ForEachProtocol n) { return _hook('''(ForEachProtocol «_generateO(n.getVariable(), [generatestring])» «_generateO(n.getSetOfValues(), [generatet_Expression])» «_generateO(n.getRepeated(), [generatet_Protocol])»)'''); }
	
	def dispatch CharSequence generatet_ProtocolStatement(IfThenElseProtocol n) { return _hook('''(IfThenElseProtocol «_generateO(n.getCondition(), [generatet_Expression])» «_generateO(n.getIfTrue(), [generatet_Protocol])» «_generateO(n.getIfFalse(), [generatet_Protocol])»)'''); }
	
	def dispatch CharSequence generatet_ProtocolStatement(ProtocolAction n) { return _hook('''(ProtocolAction «_generateO(n.getComplexName(), [generatet_ComplexName])» «_generateO(n.getSuite(), [generatet_ProtocolActionSuite])»)'''); }
	
	def dispatch CharSequence generatet_ProtocolStatement(RepeatProtocol n) { return _hook('''(RepeatProtocol «_generateO(n.getRepeated(), [generatet_Protocol])»)'''); }
	
	def dispatch CharSequence generatet_ProtocolStatement(ValuingProtocol n) { return _hook('''(ValuingProtocol «_generateO(n.getValuing(), [generatet_Valuing])»)'''); }
	
	def CharSequence generatet_SosADL(SosADL n) { return _hook('''(SosADL «_generateL(n.getImports(), [generatet_Import])» «_generateO(n.getContent(), [generatet_Unit])»)'''); }
	
	def CharSequence generatet_SystemDecl(SystemDecl n) { return _hook('''(SystemDecl «_generateO(n.getName(), [generatestring])» «_generateL(n.getParameters(), [generatet_FormalParameter])» «_generateL(n.getDatatypes(), [generatet_DataTypeDecl])» «_generateL(n.getGates(), [generatet_GateDecl])» «_generateO(n.getBehavior(), [generatet_BehaviorDecl])» «_generateL(n.getAssertions(), [generatet_AssertionDecl])»)'''); }
	
	def CharSequence generatet_TupleElement(TupleElement n) { return _hook('''(TupleElement «_generateO(n.getLabel(), [generatestring])» «_generateO(n.getValue(), [generatet_Expression])»)'''); }
	
	def dispatch CharSequence generatet_Unit(Library n) { return _hook('''(Library «_generateO(n.getName(), [generatestring])» «_generateO(n.getDecls(), [generatet_EntityBlock])»)'''); }
	
	def dispatch CharSequence generatet_Unit(SoS n) { return _hook('''(SoS «_generateO(n.getName(), [generatestring])» «_generateO(n.getDecls(), [generatet_EntityBlock])»)'''); }
	
	def CharSequence generatet_Valuing(Valuing n) { return _hook('''(Valuing «_generateO(n.getName(), [generatestring])» «_generateO(n.getType(), [generatet_DataType])» «_generateO(n.getExpression(), [generatet_Expression])»)'''); }
}
