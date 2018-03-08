/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL.util;

import org.archware.sosadl.gemoc.xsosadlmt.sosADL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage
 * @generated
 */
public class SosADLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SosADLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosADLSwitch() {
		if (modelPackage == null) {
			modelPackage = SosADLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SosADLPackage.SOS_ADL: {
				SosADL sosADL = (SosADL)theEObject;
				T result = caseSosADL(sosADL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ENTITY_BLOCK: {
				EntityBlock entityBlock = (EntityBlock)theEObject;
				T result = caseEntityBlock(entityBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.SYSTEM_DECL: {
				SystemDecl systemDecl = (SystemDecl)theEObject;
				T result = caseSystemDecl(systemDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ARCHITECTURE_DECL: {
				ArchitectureDecl architectureDecl = (ArchitectureDecl)theEObject;
				T result = caseArchitectureDecl(architectureDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.MEDIATOR_DECL: {
				MediatorDecl mediatorDecl = (MediatorDecl)theEObject;
				T result = caseMediatorDecl(mediatorDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.GATE_DECL: {
				GateDecl gateDecl = (GateDecl)theEObject;
				T result = caseGateDecl(gateDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.DUTY_DECL: {
				DutyDecl dutyDecl = (DutyDecl)theEObject;
				T result = caseDutyDecl(dutyDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ASSERTION_DECL: {
				AssertionDecl assertionDecl = (AssertionDecl)theEObject;
				T result = caseAssertionDecl(assertionDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.PROTOCOL_DECL: {
				ProtocolDecl protocolDecl = (ProtocolDecl)theEObject;
				T result = caseProtocolDecl(protocolDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.PROTOCOL: {
				Protocol protocol = (Protocol)theEObject;
				T result = caseProtocol(protocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.PROTOCOL_STATEMENT: {
				ProtocolStatement protocolStatement = (ProtocolStatement)theEObject;
				T result = caseProtocolStatement(protocolStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.PROTOCOL_ACTION: {
				ProtocolAction protocolAction = (ProtocolAction)theEObject;
				T result = caseProtocolAction(protocolAction);
				if (result == null) result = caseProtocolStatement(protocolAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.PROTOCOL_ACTION_SUITE: {
				ProtocolActionSuite protocolActionSuite = (ProtocolActionSuite)theEObject;
				T result = caseProtocolActionSuite(protocolActionSuite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.BEHAVIOR_DECL: {
				BehaviorDecl behaviorDecl = (BehaviorDecl)theEObject;
				T result = caseBehaviorDecl(behaviorDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.BEHAVIOR_STATEMENT: {
				BehaviorStatement behaviorStatement = (BehaviorStatement)theEObject;
				T result = caseBehaviorStatement(behaviorStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ASSERT: {
				Assert assert_ = (Assert)theEObject;
				T result = caseAssert(assert_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseBehaviorStatement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ACTION_SUITE: {
				ActionSuite actionSuite = (ActionSuite)theEObject;
				T result = caseActionSuite(actionSuite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ARCH_BEHAVIOR_DECL: {
				ArchBehaviorDecl archBehaviorDecl = (ArchBehaviorDecl)theEObject;
				T result = caseArchBehaviorDecl(archBehaviorDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.CONSTITUENT: {
				Constituent constituent = (Constituent)theEObject;
				T result = caseConstituent(constituent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ELEMENT_IN_CONSTITUENT: {
				ElementInConstituent elementInConstituent = (ElementInConstituent)theEObject;
				T result = caseElementInConstituent(elementInConstituent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.DATA_TYPE_DECL: {
				DataTypeDecl dataTypeDecl = (DataTypeDecl)theEObject;
				T result = caseDataTypeDecl(dataTypeDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.FUNCTION_DECL: {
				FunctionDecl functionDecl = (FunctionDecl)theEObject;
				T result = caseFunctionDecl(functionDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.FORMAL_PARAMETER: {
				FormalParameter formalParameter = (FormalParameter)theEObject;
				T result = caseFormalParameter(formalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.FIELD_DECL: {
				FieldDecl fieldDecl = (FieldDecl)theEObject;
				T result = caseFieldDecl(fieldDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.COMPLEX_NAME: {
				ComplexName complexName = (ComplexName)theEObject;
				T result = caseComplexName(complexName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.VALUING: {
				Valuing valuing = (Valuing)theEObject;
				T result = caseValuing(valuing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				T result = caseIntegerValue(integerValue);
				if (result == null) result = caseExpression(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.TUPLE_ELEMENT: {
				TupleElement tupleElement = (TupleElement)theEObject;
				T result = caseTupleElement(tupleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseUnit(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.SO_S: {
				SoS soS = (SoS)theEObject;
				T result = caseSoS(soS);
				if (result == null) result = caseUnit(soS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.VALUING_PROTOCOL: {
				ValuingProtocol valuingProtocol = (ValuingProtocol)theEObject;
				T result = caseValuingProtocol(valuingProtocol);
				if (result == null) result = caseProtocolStatement(valuingProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ASSERT_PROTOCOL: {
				AssertProtocol assertProtocol = (AssertProtocol)theEObject;
				T result = caseAssertProtocol(assertProtocol);
				if (result == null) result = caseProtocolStatement(assertProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ANY_ACTION: {
				AnyAction anyAction = (AnyAction)theEObject;
				T result = caseAnyAction(anyAction);
				if (result == null) result = caseProtocolStatement(anyAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.REPEAT_PROTOCOL: {
				RepeatProtocol repeatProtocol = (RepeatProtocol)theEObject;
				T result = caseRepeatProtocol(repeatProtocol);
				if (result == null) result = caseProtocolStatement(repeatProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.IF_THEN_ELSE_PROTOCOL: {
				IfThenElseProtocol ifThenElseProtocol = (IfThenElseProtocol)theEObject;
				T result = caseIfThenElseProtocol(ifThenElseProtocol);
				if (result == null) result = caseProtocolStatement(ifThenElseProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.CHOOSE_PROTOCOL: {
				ChooseProtocol chooseProtocol = (ChooseProtocol)theEObject;
				T result = caseChooseProtocol(chooseProtocol);
				if (result == null) result = caseProtocolStatement(chooseProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.FOR_EACH_PROTOCOL: {
				ForEachProtocol forEachProtocol = (ForEachProtocol)theEObject;
				T result = caseForEachProtocol(forEachProtocol);
				if (result == null) result = caseProtocolStatement(forEachProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.DO_EXPR_PROTOCOL: {
				DoExprProtocol doExprProtocol = (DoExprProtocol)theEObject;
				T result = caseDoExprProtocol(doExprProtocol);
				if (result == null) result = caseProtocolStatement(doExprProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.DONE_PROTOCOL: {
				DoneProtocol doneProtocol = (DoneProtocol)theEObject;
				T result = caseDoneProtocol(doneProtocol);
				if (result == null) result = caseProtocolStatement(doneProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.SEND_PROTOCOL_ACTION: {
				SendProtocolAction sendProtocolAction = (SendProtocolAction)theEObject;
				T result = caseSendProtocolAction(sendProtocolAction);
				if (result == null) result = caseProtocolActionSuite(sendProtocolAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.RECEIVE_ANY_PROTOCOL_ACTION: {
				ReceiveAnyProtocolAction receiveAnyProtocolAction = (ReceiveAnyProtocolAction)theEObject;
				T result = caseReceiveAnyProtocolAction(receiveAnyProtocolAction);
				if (result == null) result = caseProtocolActionSuite(receiveAnyProtocolAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.RECEIVE_PROTOCOL_ACTION: {
				ReceiveProtocolAction receiveProtocolAction = (ReceiveProtocolAction)theEObject;
				T result = caseReceiveProtocolAction(receiveProtocolAction);
				if (result == null) result = caseProtocolActionSuite(receiveProtocolAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.VALUING_BEHAVIOR: {
				ValuingBehavior valuingBehavior = (ValuingBehavior)theEObject;
				T result = caseValuingBehavior(valuingBehavior);
				if (result == null) result = caseBehaviorStatement(valuingBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ASSERT_BEHAVIOR: {
				AssertBehavior assertBehavior = (AssertBehavior)theEObject;
				T result = caseAssertBehavior(assertBehavior);
				if (result == null) result = caseBehaviorStatement(assertBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.REPEAT_BEHAVIOR: {
				RepeatBehavior repeatBehavior = (RepeatBehavior)theEObject;
				T result = caseRepeatBehavior(repeatBehavior);
				if (result == null) result = caseBehaviorStatement(repeatBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.IF_THEN_ELSE_BEHAVIOR: {
				IfThenElseBehavior ifThenElseBehavior = (IfThenElseBehavior)theEObject;
				T result = caseIfThenElseBehavior(ifThenElseBehavior);
				if (result == null) result = caseBehaviorStatement(ifThenElseBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.CHOOSE_BEHAVIOR: {
				ChooseBehavior chooseBehavior = (ChooseBehavior)theEObject;
				T result = caseChooseBehavior(chooseBehavior);
				if (result == null) result = caseBehaviorStatement(chooseBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.FOR_EACH_BEHAVIOR: {
				ForEachBehavior forEachBehavior = (ForEachBehavior)theEObject;
				T result = caseForEachBehavior(forEachBehavior);
				if (result == null) result = caseBehaviorStatement(forEachBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.DO_EXPR_BEHAVIOR: {
				DoExprBehavior doExprBehavior = (DoExprBehavior)theEObject;
				T result = caseDoExprBehavior(doExprBehavior);
				if (result == null) result = caseBehaviorStatement(doExprBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.DONE_BEHAVIOR: {
				DoneBehavior doneBehavior = (DoneBehavior)theEObject;
				T result = caseDoneBehavior(doneBehavior);
				if (result == null) result = caseBehaviorStatement(doneBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.RECURSIVE_CALL: {
				RecursiveCall recursiveCall = (RecursiveCall)theEObject;
				T result = caseRecursiveCall(recursiveCall);
				if (result == null) result = caseBehaviorStatement(recursiveCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.UNOBSERVABLE_BEHAVIOR: {
				UnobservableBehavior unobservableBehavior = (UnobservableBehavior)theEObject;
				T result = caseUnobservableBehavior(unobservableBehavior);
				if (result == null) result = caseBehaviorStatement(unobservableBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.TELL_ASSERTION: {
				TellAssertion tellAssertion = (TellAssertion)theEObject;
				T result = caseTellAssertion(tellAssertion);
				if (result == null) result = caseAssert(tellAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.UNTELL_ASSERTION: {
				UntellAssertion untellAssertion = (UntellAssertion)theEObject;
				T result = caseUntellAssertion(untellAssertion);
				if (result == null) result = caseAssert(untellAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ASK_ASSERTION: {
				AskAssertion askAssertion = (AskAssertion)theEObject;
				T result = caseAskAssertion(askAssertion);
				if (result == null) result = caseAssert(askAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.SEND_ACTION: {
				SendAction sendAction = (SendAction)theEObject;
				T result = caseSendAction(sendAction);
				if (result == null) result = caseActionSuite(sendAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.RECEIVE_ACTION: {
				ReceiveAction receiveAction = (ReceiveAction)theEObject;
				T result = caseReceiveAction(receiveAction);
				if (result == null) result = caseActionSuite(receiveAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.RELAY: {
				Relay relay = (Relay)theEObject;
				T result = caseRelay(relay);
				if (result == null) result = caseExpression(relay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.UNIFY: {
				Unify unify = (Unify)theEObject;
				T result = caseUnify(unify);
				if (result == null) result = caseExpression(unify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.QUANTIFY: {
				Quantify quantify = (Quantify)theEObject;
				T result = caseQuantify(quantify);
				if (result == null) result = caseExpression(quantify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.NAMED_TYPE: {
				NamedType namedType = (NamedType)theEObject;
				T result = caseNamedType(namedType);
				if (result == null) result = caseDataType(namedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.INTEGER_TYPE: {
				IntegerType integerType = (IntegerType)theEObject;
				T result = caseIntegerType(integerType);
				if (result == null) result = caseDataType(integerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.TUPLE_TYPE: {
				TupleType tupleType = (TupleType)theEObject;
				T result = caseTupleType(tupleType);
				if (result == null) result = caseDataType(tupleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = caseDataType(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				T result = caseRangeType(rangeType);
				if (result == null) result = caseDataType(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.CONNECTION_TYPE: {
				ConnectionType connectionType = (ConnectionType)theEObject;
				T result = caseConnectionType(connectionType);
				if (result == null) result = caseDataType(connectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.ANY: {
				Any any = (Any)theEObject;
				T result = caseAny(any);
				if (result == null) result = caseExpression(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.TUPLE: {
				Tuple tuple = (Tuple)theEObject;
				T result = caseTuple(tuple);
				if (result == null) result = caseExpression(tuple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseExpression(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.IDENT_EXPRESSION: {
				IdentExpression identExpression = (IdentExpression)theEObject;
				T result = caseIdentExpression(identExpression);
				if (result == null) result = caseExpression(identExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.CALL_EXPRESSION: {
				CallExpression callExpression = (CallExpression)theEObject;
				T result = caseCallExpression(callExpression);
				if (result == null) result = caseExpression(callExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseExpression(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.SELECT: {
				Select select = (Select)theEObject;
				T result = caseSelect(select);
				if (result == null) result = caseExpression(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.MAP: {
				Map map = (Map)theEObject;
				T result = caseMap(map);
				if (result == null) result = caseExpression(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.METHOD_CALL: {
				MethodCall methodCall = (MethodCall)theEObject;
				T result = caseMethodCall(methodCall);
				if (result == null) result = caseExpression(methodCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SosADLPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = caseDataType(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sos ADL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sos ADL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSosADL(SosADL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityBlock(EntityBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDecl(SystemDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitectureDecl(ArchitectureDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mediator Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mediator Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediatorDecl(MediatorDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateDecl(GateDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duty Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duty Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDutyDecl(DutyDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertionDecl(AssertionDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolDecl(ProtocolDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocol(Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolStatement(ProtocolStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolAction(ProtocolAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Action Suite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Action Suite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolActionSuite(ProtocolActionSuite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorDecl(BehaviorDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorStatement(BehaviorStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssert(Assert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Suite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Suite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSuite(ActionSuite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arch Behavior Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arch Behavior Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchBehaviorDecl(ArchBehaviorDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constituent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constituent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstituent(Constituent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element In Constituent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element In Constituent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementInConstituent(ElementInConstituent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeDecl(DataTypeDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDecl(FunctionDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameter(FormalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDecl(FieldDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexName(ComplexName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valuing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valuing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuing(Valuing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleElement(TupleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So S</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So S</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoS(SoS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valuing Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valuing Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuingProtocol(ValuingProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertProtocol(AssertProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyAction(AnyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatProtocol(RepeatProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Then Else Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Then Else Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfThenElseProtocol(IfThenElseProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choose Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choose Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChooseProtocol(ChooseProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEachProtocol(ForEachProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Expr Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Expr Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoExprProtocol(DoExprProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Done Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Done Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoneProtocol(DoneProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Protocol Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Protocol Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendProtocolAction(SendProtocolAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Any Protocol Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Any Protocol Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveAnyProtocolAction(ReceiveAnyProtocolAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Protocol Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Protocol Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveProtocolAction(ReceiveProtocolAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valuing Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valuing Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuingBehavior(ValuingBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertBehavior(AssertBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatBehavior(RepeatBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Then Else Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Then Else Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfThenElseBehavior(IfThenElseBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choose Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choose Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChooseBehavior(ChooseBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEachBehavior(ForEachBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Expr Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Expr Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoExprBehavior(DoExprBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Done Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Done Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoneBehavior(DoneBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recursive Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recursive Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecursiveCall(RecursiveCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unobservable Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unobservable Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnobservableBehavior(UnobservableBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tell Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tell Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTellAssertion(TellAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Untell Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Untell Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntellAssertion(UntellAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ask Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ask Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAskAssertion(AskAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendAction(SendAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveAction(ReceiveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelay(Relay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnify(Unify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantify(Quantify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedType(NamedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerType(IntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleType(TupleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType(RangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionType(ConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAny(Any object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuple(Tuple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ident Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ident Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentExpression(IdentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallExpression(CallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelect(Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCall(MethodCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanType(BooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SosADLSwitch
