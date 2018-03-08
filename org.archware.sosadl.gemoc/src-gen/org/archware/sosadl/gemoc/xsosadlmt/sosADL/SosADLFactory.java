/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage
 * @generated
 */
public interface SosADLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SosADLFactory eINSTANCE = org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sos ADL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sos ADL</em>'.
	 * @generated
	 */
	SosADL createSosADL();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Entity Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Block</em>'.
	 * @generated
	 */
	EntityBlock createEntityBlock();

	/**
	 * Returns a new object of class '<em>System Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Decl</em>'.
	 * @generated
	 */
	SystemDecl createSystemDecl();

	/**
	 * Returns a new object of class '<em>Architecture Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Decl</em>'.
	 * @generated
	 */
	ArchitectureDecl createArchitectureDecl();

	/**
	 * Returns a new object of class '<em>Mediator Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mediator Decl</em>'.
	 * @generated
	 */
	MediatorDecl createMediatorDecl();

	/**
	 * Returns a new object of class '<em>Gate Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate Decl</em>'.
	 * @generated
	 */
	GateDecl createGateDecl();

	/**
	 * Returns a new object of class '<em>Duty Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duty Decl</em>'.
	 * @generated
	 */
	DutyDecl createDutyDecl();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Assertion Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion Decl</em>'.
	 * @generated
	 */
	AssertionDecl createAssertionDecl();

	/**
	 * Returns a new object of class '<em>Protocol Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Decl</em>'.
	 * @generated
	 */
	ProtocolDecl createProtocolDecl();

	/**
	 * Returns a new object of class '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol</em>'.
	 * @generated
	 */
	Protocol createProtocol();

	/**
	 * Returns a new object of class '<em>Protocol Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Statement</em>'.
	 * @generated
	 */
	ProtocolStatement createProtocolStatement();

	/**
	 * Returns a new object of class '<em>Protocol Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Action</em>'.
	 * @generated
	 */
	ProtocolAction createProtocolAction();

	/**
	 * Returns a new object of class '<em>Protocol Action Suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Action Suite</em>'.
	 * @generated
	 */
	ProtocolActionSuite createProtocolActionSuite();

	/**
	 * Returns a new object of class '<em>Behavior Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Decl</em>'.
	 * @generated
	 */
	BehaviorDecl createBehaviorDecl();

	/**
	 * Returns a new object of class '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior</em>'.
	 * @generated
	 */
	Behavior createBehavior();

	/**
	 * Returns a new object of class '<em>Behavior Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Statement</em>'.
	 * @generated
	 */
	BehaviorStatement createBehaviorStatement();

	/**
	 * Returns a new object of class '<em>Assert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert</em>'.
	 * @generated
	 */
	Assert createAssert();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Action Suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Suite</em>'.
	 * @generated
	 */
	ActionSuite createActionSuite();

	/**
	 * Returns a new object of class '<em>Arch Behavior Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arch Behavior Decl</em>'.
	 * @generated
	 */
	ArchBehaviorDecl createArchBehaviorDecl();

	/**
	 * Returns a new object of class '<em>Constituent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constituent</em>'.
	 * @generated
	 */
	Constituent createConstituent();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Element In Constituent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element In Constituent</em>'.
	 * @generated
	 */
	ElementInConstituent createElementInConstituent();

	/**
	 * Returns a new object of class '<em>Data Type Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Decl</em>'.
	 * @generated
	 */
	DataTypeDecl createDataTypeDecl();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Function Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Decl</em>'.
	 * @generated
	 */
	FunctionDecl createFunctionDecl();

	/**
	 * Returns a new object of class '<em>Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Parameter</em>'.
	 * @generated
	 */
	FormalParameter createFormalParameter();

	/**
	 * Returns a new object of class '<em>Field Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Decl</em>'.
	 * @generated
	 */
	FieldDecl createFieldDecl();

	/**
	 * Returns a new object of class '<em>Complex Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Name</em>'.
	 * @generated
	 */
	ComplexName createComplexName();

	/**
	 * Returns a new object of class '<em>Valuing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valuing</em>'.
	 * @generated
	 */
	Valuing createValuing();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>Tuple Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuple Element</em>'.
	 * @generated
	 */
	TupleElement createTupleElement();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>So S</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So S</em>'.
	 * @generated
	 */
	SoS createSoS();

	/**
	 * Returns a new object of class '<em>Valuing Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valuing Protocol</em>'.
	 * @generated
	 */
	ValuingProtocol createValuingProtocol();

	/**
	 * Returns a new object of class '<em>Assert Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Protocol</em>'.
	 * @generated
	 */
	AssertProtocol createAssertProtocol();

	/**
	 * Returns a new object of class '<em>Any Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Action</em>'.
	 * @generated
	 */
	AnyAction createAnyAction();

	/**
	 * Returns a new object of class '<em>Repeat Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Protocol</em>'.
	 * @generated
	 */
	RepeatProtocol createRepeatProtocol();

	/**
	 * Returns a new object of class '<em>If Then Else Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Then Else Protocol</em>'.
	 * @generated
	 */
	IfThenElseProtocol createIfThenElseProtocol();

	/**
	 * Returns a new object of class '<em>Choose Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choose Protocol</em>'.
	 * @generated
	 */
	ChooseProtocol createChooseProtocol();

	/**
	 * Returns a new object of class '<em>For Each Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Each Protocol</em>'.
	 * @generated
	 */
	ForEachProtocol createForEachProtocol();

	/**
	 * Returns a new object of class '<em>Do Expr Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do Expr Protocol</em>'.
	 * @generated
	 */
	DoExprProtocol createDoExprProtocol();

	/**
	 * Returns a new object of class '<em>Done Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Done Protocol</em>'.
	 * @generated
	 */
	DoneProtocol createDoneProtocol();

	/**
	 * Returns a new object of class '<em>Send Protocol Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Protocol Action</em>'.
	 * @generated
	 */
	SendProtocolAction createSendProtocolAction();

	/**
	 * Returns a new object of class '<em>Receive Any Protocol Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Any Protocol Action</em>'.
	 * @generated
	 */
	ReceiveAnyProtocolAction createReceiveAnyProtocolAction();

	/**
	 * Returns a new object of class '<em>Receive Protocol Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Protocol Action</em>'.
	 * @generated
	 */
	ReceiveProtocolAction createReceiveProtocolAction();

	/**
	 * Returns a new object of class '<em>Valuing Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valuing Behavior</em>'.
	 * @generated
	 */
	ValuingBehavior createValuingBehavior();

	/**
	 * Returns a new object of class '<em>Assert Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Behavior</em>'.
	 * @generated
	 */
	AssertBehavior createAssertBehavior();

	/**
	 * Returns a new object of class '<em>Repeat Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Behavior</em>'.
	 * @generated
	 */
	RepeatBehavior createRepeatBehavior();

	/**
	 * Returns a new object of class '<em>If Then Else Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Then Else Behavior</em>'.
	 * @generated
	 */
	IfThenElseBehavior createIfThenElseBehavior();

	/**
	 * Returns a new object of class '<em>Choose Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choose Behavior</em>'.
	 * @generated
	 */
	ChooseBehavior createChooseBehavior();

	/**
	 * Returns a new object of class '<em>For Each Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Each Behavior</em>'.
	 * @generated
	 */
	ForEachBehavior createForEachBehavior();

	/**
	 * Returns a new object of class '<em>Do Expr Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do Expr Behavior</em>'.
	 * @generated
	 */
	DoExprBehavior createDoExprBehavior();

	/**
	 * Returns a new object of class '<em>Done Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Done Behavior</em>'.
	 * @generated
	 */
	DoneBehavior createDoneBehavior();

	/**
	 * Returns a new object of class '<em>Recursive Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recursive Call</em>'.
	 * @generated
	 */
	RecursiveCall createRecursiveCall();

	/**
	 * Returns a new object of class '<em>Unobservable Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unobservable Behavior</em>'.
	 * @generated
	 */
	UnobservableBehavior createUnobservableBehavior();

	/**
	 * Returns a new object of class '<em>Tell Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tell Assertion</em>'.
	 * @generated
	 */
	TellAssertion createTellAssertion();

	/**
	 * Returns a new object of class '<em>Untell Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Untell Assertion</em>'.
	 * @generated
	 */
	UntellAssertion createUntellAssertion();

	/**
	 * Returns a new object of class '<em>Ask Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ask Assertion</em>'.
	 * @generated
	 */
	AskAssertion createAskAssertion();

	/**
	 * Returns a new object of class '<em>Send Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Action</em>'.
	 * @generated
	 */
	SendAction createSendAction();

	/**
	 * Returns a new object of class '<em>Receive Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Action</em>'.
	 * @generated
	 */
	ReceiveAction createReceiveAction();

	/**
	 * Returns a new object of class '<em>Relay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relay</em>'.
	 * @generated
	 */
	Relay createRelay();

	/**
	 * Returns a new object of class '<em>Unify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unify</em>'.
	 * @generated
	 */
	Unify createUnify();

	/**
	 * Returns a new object of class '<em>Quantify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantify</em>'.
	 * @generated
	 */
	Quantify createQuantify();

	/**
	 * Returns a new object of class '<em>Named Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Type</em>'.
	 * @generated
	 */
	NamedType createNamedType();

	/**
	 * Returns a new object of class '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Type</em>'.
	 * @generated
	 */
	IntegerType createIntegerType();

	/**
	 * Returns a new object of class '<em>Tuple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuple Type</em>'.
	 * @generated
	 */
	TupleType createTupleType();

	/**
	 * Returns a new object of class '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Type</em>'.
	 * @generated
	 */
	SequenceType createSequenceType();

	/**
	 * Returns a new object of class '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Type</em>'.
	 * @generated
	 */
	RangeType createRangeType();

	/**
	 * Returns a new object of class '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Type</em>'.
	 * @generated
	 */
	ConnectionType createConnectionType();

	/**
	 * Returns a new object of class '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any</em>'.
	 * @generated
	 */
	Any createAny();

	/**
	 * Returns a new object of class '<em>Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuple</em>'.
	 * @generated
	 */
	Tuple createTuple();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Ident Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ident Expression</em>'.
	 * @generated
	 */
	IdentExpression createIdentExpression();

	/**
	 * Returns a new object of class '<em>Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Expression</em>'.
	 * @generated
	 */
	CallExpression createCallExpression();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select</em>'.
	 * @generated
	 */
	Select createSelect();

	/**
	 * Returns a new object of class '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map</em>'.
	 * @generated
	 */
	Map createMap();

	/**
	 * Returns a new object of class '<em>Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Call</em>'.
	 * @generated
	 */
	MethodCall createMethodCall();

	/**
	 * Returns a new object of class '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type</em>'.
	 * @generated
	 */
	BooleanType createBooleanType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SosADLPackage getSosADLPackage();

} //SosADLFactory
