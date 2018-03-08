/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl;

import org.archware.sosadl.gemoc.xsosadlmt.sosADL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SosADLFactoryImpl extends EFactoryImpl implements SosADLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SosADLFactory init() {
		try {
			SosADLFactory theSosADLFactory = (SosADLFactory)EPackage.Registry.INSTANCE.getEFactory(SosADLPackage.eNS_URI);
			if (theSosADLFactory != null) {
				return theSosADLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SosADLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosADLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SosADLPackage.SOS_ADL: return createSosADL();
			case SosADLPackage.IMPORT: return createImport();
			case SosADLPackage.UNIT: return createUnit();
			case SosADLPackage.ENTITY_BLOCK: return createEntityBlock();
			case SosADLPackage.SYSTEM_DECL: return createSystemDecl();
			case SosADLPackage.ARCHITECTURE_DECL: return createArchitectureDecl();
			case SosADLPackage.MEDIATOR_DECL: return createMediatorDecl();
			case SosADLPackage.GATE_DECL: return createGateDecl();
			case SosADLPackage.DUTY_DECL: return createDutyDecl();
			case SosADLPackage.CONNECTION: return createConnection();
			case SosADLPackage.ASSERTION_DECL: return createAssertionDecl();
			case SosADLPackage.PROTOCOL_DECL: return createProtocolDecl();
			case SosADLPackage.PROTOCOL: return createProtocol();
			case SosADLPackage.PROTOCOL_STATEMENT: return createProtocolStatement();
			case SosADLPackage.PROTOCOL_ACTION: return createProtocolAction();
			case SosADLPackage.PROTOCOL_ACTION_SUITE: return createProtocolActionSuite();
			case SosADLPackage.BEHAVIOR_DECL: return createBehaviorDecl();
			case SosADLPackage.BEHAVIOR: return createBehavior();
			case SosADLPackage.BEHAVIOR_STATEMENT: return createBehaviorStatement();
			case SosADLPackage.ASSERT: return createAssert();
			case SosADLPackage.ACTION: return createAction();
			case SosADLPackage.ACTION_SUITE: return createActionSuite();
			case SosADLPackage.ARCH_BEHAVIOR_DECL: return createArchBehaviorDecl();
			case SosADLPackage.CONSTITUENT: return createConstituent();
			case SosADLPackage.EXPRESSION: return createExpression();
			case SosADLPackage.ELEMENT_IN_CONSTITUENT: return createElementInConstituent();
			case SosADLPackage.DATA_TYPE_DECL: return createDataTypeDecl();
			case SosADLPackage.DATA_TYPE: return createDataType();
			case SosADLPackage.FUNCTION_DECL: return createFunctionDecl();
			case SosADLPackage.FORMAL_PARAMETER: return createFormalParameter();
			case SosADLPackage.FIELD_DECL: return createFieldDecl();
			case SosADLPackage.COMPLEX_NAME: return createComplexName();
			case SosADLPackage.VALUING: return createValuing();
			case SosADLPackage.INTEGER_VALUE: return createIntegerValue();
			case SosADLPackage.TUPLE_ELEMENT: return createTupleElement();
			case SosADLPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case SosADLPackage.LIBRARY: return createLibrary();
			case SosADLPackage.SO_S: return createSoS();
			case SosADLPackage.VALUING_PROTOCOL: return createValuingProtocol();
			case SosADLPackage.ASSERT_PROTOCOL: return createAssertProtocol();
			case SosADLPackage.ANY_ACTION: return createAnyAction();
			case SosADLPackage.REPEAT_PROTOCOL: return createRepeatProtocol();
			case SosADLPackage.IF_THEN_ELSE_PROTOCOL: return createIfThenElseProtocol();
			case SosADLPackage.CHOOSE_PROTOCOL: return createChooseProtocol();
			case SosADLPackage.FOR_EACH_PROTOCOL: return createForEachProtocol();
			case SosADLPackage.DO_EXPR_PROTOCOL: return createDoExprProtocol();
			case SosADLPackage.DONE_PROTOCOL: return createDoneProtocol();
			case SosADLPackage.SEND_PROTOCOL_ACTION: return createSendProtocolAction();
			case SosADLPackage.RECEIVE_ANY_PROTOCOL_ACTION: return createReceiveAnyProtocolAction();
			case SosADLPackage.RECEIVE_PROTOCOL_ACTION: return createReceiveProtocolAction();
			case SosADLPackage.VALUING_BEHAVIOR: return createValuingBehavior();
			case SosADLPackage.ASSERT_BEHAVIOR: return createAssertBehavior();
			case SosADLPackage.REPEAT_BEHAVIOR: return createRepeatBehavior();
			case SosADLPackage.IF_THEN_ELSE_BEHAVIOR: return createIfThenElseBehavior();
			case SosADLPackage.CHOOSE_BEHAVIOR: return createChooseBehavior();
			case SosADLPackage.FOR_EACH_BEHAVIOR: return createForEachBehavior();
			case SosADLPackage.DO_EXPR_BEHAVIOR: return createDoExprBehavior();
			case SosADLPackage.DONE_BEHAVIOR: return createDoneBehavior();
			case SosADLPackage.RECURSIVE_CALL: return createRecursiveCall();
			case SosADLPackage.UNOBSERVABLE_BEHAVIOR: return createUnobservableBehavior();
			case SosADLPackage.TELL_ASSERTION: return createTellAssertion();
			case SosADLPackage.UNTELL_ASSERTION: return createUntellAssertion();
			case SosADLPackage.ASK_ASSERTION: return createAskAssertion();
			case SosADLPackage.SEND_ACTION: return createSendAction();
			case SosADLPackage.RECEIVE_ACTION: return createReceiveAction();
			case SosADLPackage.RELAY: return createRelay();
			case SosADLPackage.UNIFY: return createUnify();
			case SosADLPackage.QUANTIFY: return createQuantify();
			case SosADLPackage.NAMED_TYPE: return createNamedType();
			case SosADLPackage.INTEGER_TYPE: return createIntegerType();
			case SosADLPackage.TUPLE_TYPE: return createTupleType();
			case SosADLPackage.SEQUENCE_TYPE: return createSequenceType();
			case SosADLPackage.RANGE_TYPE: return createRangeType();
			case SosADLPackage.CONNECTION_TYPE: return createConnectionType();
			case SosADLPackage.ANY: return createAny();
			case SosADLPackage.TUPLE: return createTuple();
			case SosADLPackage.SEQUENCE: return createSequence();
			case SosADLPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case SosADLPackage.IDENT_EXPRESSION: return createIdentExpression();
			case SosADLPackage.CALL_EXPRESSION: return createCallExpression();
			case SosADLPackage.FIELD: return createField();
			case SosADLPackage.SELECT: return createSelect();
			case SosADLPackage.MAP: return createMap();
			case SosADLPackage.METHOD_CALL: return createMethodCall();
			case SosADLPackage.BOOLEAN_TYPE: return createBooleanType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SosADLPackage.QUANTIFIER:
				return createQuantifierFromString(eDataType, initialValue);
			case SosADLPackage.MULTIPLICITY:
				return createMultiplicityFromString(eDataType, initialValue);
			case SosADLPackage.MODE_TYPE:
				return createModeTypeFromString(eDataType, initialValue);
			case SosADLPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SosADLPackage.QUANTIFIER:
				return convertQuantifierToString(eDataType, instanceValue);
			case SosADLPackage.MULTIPLICITY:
				return convertMultiplicityToString(eDataType, instanceValue);
			case SosADLPackage.MODE_TYPE:
				return convertModeTypeToString(eDataType, instanceValue);
			case SosADLPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosADL createSosADL() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityBlock createEntityBlock() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDecl createSystemDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureDecl createArchitectureDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediatorDecl createMediatorDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateDecl createGateDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DutyDecl createDutyDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDecl createAssertionDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolDecl createProtocolDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocol() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStatement createProtocolStatement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolAction createProtocolAction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolActionSuite createProtocolActionSuite() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorDecl createBehaviorDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createBehavior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorStatement createBehaviorStatement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assert createAssert() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSuite createActionSuite() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchBehaviorDecl createArchBehaviorDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constituent createConstituent() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementInConstituent createElementInConstituent() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDecl createDataTypeDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDecl createFunctionDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParameter createFormalParameter() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDecl createFieldDecl() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexName createComplexName() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valuing createValuing() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleElement createTupleElement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoS createSoS() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuingProtocol createValuingProtocol() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertProtocol createAssertProtocol() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyAction createAnyAction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatProtocol createRepeatProtocol() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfThenElseProtocol createIfThenElseProtocol() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChooseProtocol createChooseProtocol() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEachProtocol createForEachProtocol() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoExprProtocol createDoExprProtocol() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoneProtocol createDoneProtocol() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendProtocolAction createSendProtocolAction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveAnyProtocolAction createReceiveAnyProtocolAction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveProtocolAction createReceiveProtocolAction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuingBehavior createValuingBehavior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertBehavior createAssertBehavior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatBehavior createRepeatBehavior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfThenElseBehavior createIfThenElseBehavior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChooseBehavior createChooseBehavior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEachBehavior createForEachBehavior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoExprBehavior createDoExprBehavior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoneBehavior createDoneBehavior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecursiveCall createRecursiveCall() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnobservableBehavior createUnobservableBehavior() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TellAssertion createTellAssertion() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UntellAssertion createUntellAssertion() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AskAssertion createAskAssertion() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendAction createSendAction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveAction createReceiveAction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relay createRelay() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unify createUnify() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantify createQuantify() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedType createNamedType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleType createTupleType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType createRangeType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any createAny() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple createTuple() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentExpression createIdentExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallExpression createCallExpression() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select createSelect() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall createMethodCall() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier createQuantifierFromString(EDataType eDataType, String initialValue) {
		Quantifier result = Quantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
		Multiplicity result = Multiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeFromString(EDataType eDataType, String initialValue) {
		ModeType result = ModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosADLPackage getSosADLPackage() {
		return (SosADLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SosADLPackage getPackage() {
		return SosADLPackage.eINSTANCE;
	}

} //SosADLFactoryImpl
