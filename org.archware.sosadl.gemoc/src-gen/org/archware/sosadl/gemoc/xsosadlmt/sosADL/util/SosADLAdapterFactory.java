/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL.util;

import org.archware.sosadl.gemoc.xsosadlmt.sosADL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage
 * @generated
 */
public class SosADLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SosADLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosADLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SosADLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SosADLSwitch<Adapter> modelSwitch =
		new SosADLSwitch<Adapter>() {
			@Override
			public Adapter caseSosADL(SosADL object) {
				return createSosADLAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseEntityBlock(EntityBlock object) {
				return createEntityBlockAdapter();
			}
			@Override
			public Adapter caseSystemDecl(SystemDecl object) {
				return createSystemDeclAdapter();
			}
			@Override
			public Adapter caseArchitectureDecl(ArchitectureDecl object) {
				return createArchitectureDeclAdapter();
			}
			@Override
			public Adapter caseMediatorDecl(MediatorDecl object) {
				return createMediatorDeclAdapter();
			}
			@Override
			public Adapter caseGateDecl(GateDecl object) {
				return createGateDeclAdapter();
			}
			@Override
			public Adapter caseDutyDecl(DutyDecl object) {
				return createDutyDeclAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseAssertionDecl(AssertionDecl object) {
				return createAssertionDeclAdapter();
			}
			@Override
			public Adapter caseProtocolDecl(ProtocolDecl object) {
				return createProtocolDeclAdapter();
			}
			@Override
			public Adapter caseProtocol(Protocol object) {
				return createProtocolAdapter();
			}
			@Override
			public Adapter caseProtocolStatement(ProtocolStatement object) {
				return createProtocolStatementAdapter();
			}
			@Override
			public Adapter caseProtocolAction(ProtocolAction object) {
				return createProtocolActionAdapter();
			}
			@Override
			public Adapter caseProtocolActionSuite(ProtocolActionSuite object) {
				return createProtocolActionSuiteAdapter();
			}
			@Override
			public Adapter caseBehaviorDecl(BehaviorDecl object) {
				return createBehaviorDeclAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseBehaviorStatement(BehaviorStatement object) {
				return createBehaviorStatementAdapter();
			}
			@Override
			public Adapter caseAssert(Assert object) {
				return createAssertAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseActionSuite(ActionSuite object) {
				return createActionSuiteAdapter();
			}
			@Override
			public Adapter caseArchBehaviorDecl(ArchBehaviorDecl object) {
				return createArchBehaviorDeclAdapter();
			}
			@Override
			public Adapter caseConstituent(Constituent object) {
				return createConstituentAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseElementInConstituent(ElementInConstituent object) {
				return createElementInConstituentAdapter();
			}
			@Override
			public Adapter caseDataTypeDecl(DataTypeDecl object) {
				return createDataTypeDeclAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseFunctionDecl(FunctionDecl object) {
				return createFunctionDeclAdapter();
			}
			@Override
			public Adapter caseFormalParameter(FormalParameter object) {
				return createFormalParameterAdapter();
			}
			@Override
			public Adapter caseFieldDecl(FieldDecl object) {
				return createFieldDeclAdapter();
			}
			@Override
			public Adapter caseComplexName(ComplexName object) {
				return createComplexNameAdapter();
			}
			@Override
			public Adapter caseValuing(Valuing object) {
				return createValuingAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
			}
			@Override
			public Adapter caseTupleElement(TupleElement object) {
				return createTupleElementAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseSoS(SoS object) {
				return createSoSAdapter();
			}
			@Override
			public Adapter caseValuingProtocol(ValuingProtocol object) {
				return createValuingProtocolAdapter();
			}
			@Override
			public Adapter caseAssertProtocol(AssertProtocol object) {
				return createAssertProtocolAdapter();
			}
			@Override
			public Adapter caseAnyAction(AnyAction object) {
				return createAnyActionAdapter();
			}
			@Override
			public Adapter caseRepeatProtocol(RepeatProtocol object) {
				return createRepeatProtocolAdapter();
			}
			@Override
			public Adapter caseIfThenElseProtocol(IfThenElseProtocol object) {
				return createIfThenElseProtocolAdapter();
			}
			@Override
			public Adapter caseChooseProtocol(ChooseProtocol object) {
				return createChooseProtocolAdapter();
			}
			@Override
			public Adapter caseForEachProtocol(ForEachProtocol object) {
				return createForEachProtocolAdapter();
			}
			@Override
			public Adapter caseDoExprProtocol(DoExprProtocol object) {
				return createDoExprProtocolAdapter();
			}
			@Override
			public Adapter caseDoneProtocol(DoneProtocol object) {
				return createDoneProtocolAdapter();
			}
			@Override
			public Adapter caseSendProtocolAction(SendProtocolAction object) {
				return createSendProtocolActionAdapter();
			}
			@Override
			public Adapter caseReceiveAnyProtocolAction(ReceiveAnyProtocolAction object) {
				return createReceiveAnyProtocolActionAdapter();
			}
			@Override
			public Adapter caseReceiveProtocolAction(ReceiveProtocolAction object) {
				return createReceiveProtocolActionAdapter();
			}
			@Override
			public Adapter caseValuingBehavior(ValuingBehavior object) {
				return createValuingBehaviorAdapter();
			}
			@Override
			public Adapter caseAssertBehavior(AssertBehavior object) {
				return createAssertBehaviorAdapter();
			}
			@Override
			public Adapter caseRepeatBehavior(RepeatBehavior object) {
				return createRepeatBehaviorAdapter();
			}
			@Override
			public Adapter caseIfThenElseBehavior(IfThenElseBehavior object) {
				return createIfThenElseBehaviorAdapter();
			}
			@Override
			public Adapter caseChooseBehavior(ChooseBehavior object) {
				return createChooseBehaviorAdapter();
			}
			@Override
			public Adapter caseForEachBehavior(ForEachBehavior object) {
				return createForEachBehaviorAdapter();
			}
			@Override
			public Adapter caseDoExprBehavior(DoExprBehavior object) {
				return createDoExprBehaviorAdapter();
			}
			@Override
			public Adapter caseDoneBehavior(DoneBehavior object) {
				return createDoneBehaviorAdapter();
			}
			@Override
			public Adapter caseRecursiveCall(RecursiveCall object) {
				return createRecursiveCallAdapter();
			}
			@Override
			public Adapter caseUnobservableBehavior(UnobservableBehavior object) {
				return createUnobservableBehaviorAdapter();
			}
			@Override
			public Adapter caseTellAssertion(TellAssertion object) {
				return createTellAssertionAdapter();
			}
			@Override
			public Adapter caseUntellAssertion(UntellAssertion object) {
				return createUntellAssertionAdapter();
			}
			@Override
			public Adapter caseAskAssertion(AskAssertion object) {
				return createAskAssertionAdapter();
			}
			@Override
			public Adapter caseSendAction(SendAction object) {
				return createSendActionAdapter();
			}
			@Override
			public Adapter caseReceiveAction(ReceiveAction object) {
				return createReceiveActionAdapter();
			}
			@Override
			public Adapter caseRelay(Relay object) {
				return createRelayAdapter();
			}
			@Override
			public Adapter caseUnify(Unify object) {
				return createUnifyAdapter();
			}
			@Override
			public Adapter caseQuantify(Quantify object) {
				return createQuantifyAdapter();
			}
			@Override
			public Adapter caseNamedType(NamedType object) {
				return createNamedTypeAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter caseTupleType(TupleType object) {
				return createTupleTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			@Override
			public Adapter caseConnectionType(ConnectionType object) {
				return createConnectionTypeAdapter();
			}
			@Override
			public Adapter caseAny(Any object) {
				return createAnyAdapter();
			}
			@Override
			public Adapter caseTuple(Tuple object) {
				return createTupleAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseIdentExpression(IdentExpression object) {
				return createIdentExpressionAdapter();
			}
			@Override
			public Adapter caseCallExpression(CallExpression object) {
				return createCallExpressionAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseSelect(Select object) {
				return createSelectAdapter();
			}
			@Override
			public Adapter caseMap(Map object) {
				return createMapAdapter();
			}
			@Override
			public Adapter caseMethodCall(MethodCall object) {
				return createMethodCallAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADL <em>Sos ADL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADL
	 * @generated
	 */
	public Adapter createSosADLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock <em>Entity Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock
	 * @generated
	 */
	public Adapter createEntityBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl <em>System Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl
	 * @generated
	 */
	public Adapter createSystemDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl <em>Architecture Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl
	 * @generated
	 */
	public Adapter createArchitectureDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl <em>Mediator Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl
	 * @generated
	 */
	public Adapter createMediatorDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl <em>Gate Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl
	 * @generated
	 */
	public Adapter createGateDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl <em>Duty Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl
	 * @generated
	 */
	public Adapter createDutyDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl <em>Assertion Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl
	 * @generated
	 */
	public Adapter createAssertionDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl <em>Protocol Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl
	 * @generated
	 */
	public Adapter createProtocolDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolStatement <em>Protocol Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolStatement
	 * @generated
	 */
	public Adapter createProtocolStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction <em>Protocol Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction
	 * @generated
	 */
	public Adapter createProtocolActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolActionSuite <em>Protocol Action Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolActionSuite
	 * @generated
	 */
	public Adapter createProtocolActionSuiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorDecl <em>Behavior Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorDecl
	 * @generated
	 */
	public Adapter createBehaviorDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorStatement <em>Behavior Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorStatement
	 * @generated
	 */
	public Adapter createBehaviorStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Assert <em>Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Assert
	 * @generated
	 */
	public Adapter createAssertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ActionSuite <em>Action Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ActionSuite
	 * @generated
	 */
	public Adapter createActionSuiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl <em>Arch Behavior Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl
	 * @generated
	 */
	public Adapter createArchBehaviorDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent <em>Constituent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent
	 * @generated
	 */
	public Adapter createConstituentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent <em>Element In Constituent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent
	 * @generated
	 */
	public Adapter createElementInConstituentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl <em>Data Type Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl
	 * @generated
	 */
	public Adapter createDataTypeDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl <em>Function Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl
	 * @generated
	 */
	public Adapter createFunctionDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter
	 * @generated
	 */
	public Adapter createFormalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FieldDecl <em>Field Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FieldDecl
	 * @generated
	 */
	public Adapter createFieldDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ComplexName <em>Complex Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ComplexName
	 * @generated
	 */
	public Adapter createComplexNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing <em>Valuing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing
	 * @generated
	 */
	public Adapter createValuingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleElement <em>Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleElement
	 * @generated
	 */
	public Adapter createTupleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SoS <em>So S</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SoS
	 * @generated
	 */
	public Adapter createSoSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingProtocol <em>Valuing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingProtocol
	 * @generated
	 */
	public Adapter createValuingProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertProtocol <em>Assert Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertProtocol
	 * @generated
	 */
	public Adapter createAssertProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AnyAction <em>Any Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AnyAction
	 * @generated
	 */
	public Adapter createAnyActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatProtocol <em>Repeat Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatProtocol
	 * @generated
	 */
	public Adapter createRepeatProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol <em>If Then Else Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol
	 * @generated
	 */
	public Adapter createIfThenElseProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseProtocol <em>Choose Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseProtocol
	 * @generated
	 */
	public Adapter createChooseProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol <em>For Each Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol
	 * @generated
	 */
	public Adapter createForEachProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprProtocol <em>Do Expr Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprProtocol
	 * @generated
	 */
	public Adapter createDoExprProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneProtocol <em>Done Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneProtocol
	 * @generated
	 */
	public Adapter createDoneProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendProtocolAction <em>Send Protocol Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendProtocolAction
	 * @generated
	 */
	public Adapter createSendProtocolActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAnyProtocolAction <em>Receive Any Protocol Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAnyProtocolAction
	 * @generated
	 */
	public Adapter createReceiveAnyProtocolActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveProtocolAction <em>Receive Protocol Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveProtocolAction
	 * @generated
	 */
	public Adapter createReceiveProtocolActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingBehavior <em>Valuing Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingBehavior
	 * @generated
	 */
	public Adapter createValuingBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertBehavior <em>Assert Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertBehavior
	 * @generated
	 */
	public Adapter createAssertBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatBehavior <em>Repeat Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatBehavior
	 * @generated
	 */
	public Adapter createRepeatBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior <em>If Then Else Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior
	 * @generated
	 */
	public Adapter createIfThenElseBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseBehavior <em>Choose Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseBehavior
	 * @generated
	 */
	public Adapter createChooseBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior <em>For Each Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior
	 * @generated
	 */
	public Adapter createForEachBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprBehavior <em>Do Expr Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprBehavior
	 * @generated
	 */
	public Adapter createDoExprBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneBehavior <em>Done Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneBehavior
	 * @generated
	 */
	public Adapter createDoneBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RecursiveCall <em>Recursive Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RecursiveCall
	 * @generated
	 */
	public Adapter createRecursiveCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnobservableBehavior <em>Unobservable Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnobservableBehavior
	 * @generated
	 */
	public Adapter createUnobservableBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TellAssertion <em>Tell Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.TellAssertion
	 * @generated
	 */
	public Adapter createTellAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.UntellAssertion <em>Untell Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.UntellAssertion
	 * @generated
	 */
	public Adapter createUntellAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AskAssertion <em>Ask Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AskAssertion
	 * @generated
	 */
	public Adapter createAskAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendAction <em>Send Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendAction
	 * @generated
	 */
	public Adapter createSendActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAction <em>Receive Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAction
	 * @generated
	 */
	public Adapter createReceiveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay <em>Relay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay
	 * @generated
	 */
	public Adapter createRelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify <em>Unify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify
	 * @generated
	 */
	public Adapter createUnifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify <em>Quantify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify
	 * @generated
	 */
	public Adapter createQuantifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.NamedType
	 * @generated
	 */
	public Adapter createNamedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleType
	 * @generated
	 */
	public Adapter createTupleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType
	 * @generated
	 */
	public Adapter createConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Any
	 * @generated
	 */
	public Adapter createAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Tuple
	 * @generated
	 */
	public Adapter createTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IdentExpression <em>Ident Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IdentExpression
	 * @generated
	 */
	public Adapter createIdentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.CallExpression <em>Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.CallExpression
	 * @generated
	 */
	public Adapter createCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select
	 * @generated
	 */
	public Adapter createSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map
	 * @generated
	 */
	public Adapter createMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall
	 * @generated
	 */
	public Adapter createMethodCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SosADLAdapterFactory
