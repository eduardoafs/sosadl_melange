/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl;

import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ActionSuite;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Any;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.AnyAction;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.AskAssertion;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Assert;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertProtocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorStatement;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.BooleanType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.CallExpression;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseProtocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ComplexName;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprProtocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneProtocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Field;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.FieldDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.IdentExpression;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Import;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerValue;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Library;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.NamedType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolActionSuite;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolStatement;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantifier;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAction;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAnyProtocolAction;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveProtocolAction;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.RecursiveCall;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatProtocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendAction;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendProtocolAction;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Sequence;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.SequenceType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.SoS;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADL;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLFactory;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.TellAssertion;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Tuple;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleElement;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnaryExpression;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unit;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnobservableBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.UntellAssertion;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingProtocol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SosADLPackageImpl extends EPackageImpl implements SosADLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sosADLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediatorDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dutyDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolActionSuiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSuiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archBehaviorDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constituentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementInConstituentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuingProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifThenElseProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chooseProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doExprProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doneProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendProtocolActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveAnyProtocolActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveProtocolActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuingBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifThenElseBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chooseBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doExprBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doneBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recursiveCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unobservableBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tellAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untellAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass askAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SosADLPackageImpl() {
		super(eNS_URI, SosADLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SosADLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SosADLPackage init() {
		if (isInited) return (SosADLPackage)EPackage.Registry.INSTANCE.getEPackage(SosADLPackage.eNS_URI);

		// Obtain or create and register package
		SosADLPackageImpl theSosADLPackage = (SosADLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SosADLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SosADLPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSosADLPackage.createPackageContents();

		// Initialize created meta-data
		theSosADLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSosADLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SosADLPackage.eNS_URI, theSosADLPackage);
		return theSosADLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSosADL() {
		return sosADLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSosADL_Imports() {
		return (EReference)sosADLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSosADL_Content() {
		return (EReference)sosADLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportedLibrary() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Name() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Decls() {
		return (EReference)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityBlock() {
		return entityBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBlock_Datatypes() {
		return (EReference)entityBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBlock_Functions() {
		return (EReference)entityBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBlock_Systems() {
		return (EReference)entityBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBlock_Mediators() {
		return (EReference)entityBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityBlock_Architectures() {
		return (EReference)entityBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemDecl() {
		return systemDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemDecl_Name() {
		return (EAttribute)systemDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDecl_Parameters() {
		return (EReference)systemDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDecl_Datatypes() {
		return (EReference)systemDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDecl_Gates() {
		return (EReference)systemDeclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDecl_Behavior() {
		return (EReference)systemDeclEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDecl_Assertions() {
		return (EReference)systemDeclEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitectureDecl() {
		return architectureDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitectureDecl_Name() {
		return (EAttribute)architectureDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureDecl_Parameters() {
		return (EReference)architectureDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureDecl_Datatypes() {
		return (EReference)architectureDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureDecl_Gates() {
		return (EReference)architectureDeclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureDecl_Behavior() {
		return (EReference)architectureDeclEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureDecl_Assertions() {
		return (EReference)architectureDeclEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediatorDecl() {
		return mediatorDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediatorDecl_Name() {
		return (EAttribute)mediatorDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorDecl_Parameters() {
		return (EReference)mediatorDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorDecl_Datatypes() {
		return (EReference)mediatorDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorDecl_Duties() {
		return (EReference)mediatorDeclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorDecl_Behavior() {
		return (EReference)mediatorDeclEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorDecl_Assumptions() {
		return (EReference)mediatorDeclEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediatorDecl_Assertions() {
		return (EReference)mediatorDeclEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateDecl() {
		return gateDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGateDecl_Name() {
		return (EAttribute)gateDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateDecl_Connections() {
		return (EReference)gateDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateDecl_Protocols() {
		return (EReference)gateDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDutyDecl() {
		return dutyDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDutyDecl_Name() {
		return (EAttribute)dutyDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDutyDecl_Connections() {
		return (EReference)dutyDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDutyDecl_Assertions() {
		return (EReference)dutyDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDutyDecl_Protocols() {
		return (EReference)dutyDeclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Environment() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Name() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Mode() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_ValueType() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertionDecl() {
		return assertionDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertionDecl_Name() {
		return (EAttribute)assertionDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertionDecl_Body() {
		return (EReference)assertionDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolDecl() {
		return protocolDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolDecl_Name() {
		return (EAttribute)protocolDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolDecl_Body() {
		return (EReference)protocolDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocol() {
		return protocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocol_Statements() {
		return (EReference)protocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolStatement() {
		return protocolStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolAction() {
		return protocolActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolAction_ComplexName() {
		return (EReference)protocolActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolAction_Suite() {
		return (EReference)protocolActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolActionSuite() {
		return protocolActionSuiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorDecl() {
		return behaviorDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorDecl_Name() {
		return (EAttribute)behaviorDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorDecl_Body() {
		return (EReference)behaviorDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Statements() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorStatement() {
		return behaviorStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssert() {
		return assertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssert_Name() {
		return (EAttribute)assertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_ComplexName() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Suite() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionSuite() {
		return actionSuiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchBehaviorDecl() {
		return archBehaviorDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchBehaviorDecl_Name() {
		return (EAttribute)archBehaviorDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchBehaviorDecl_Constituents() {
		return (EReference)archBehaviorDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchBehaviorDecl_Bindings() {
		return (EReference)archBehaviorDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstituent() {
		return constituentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstituent_Name() {
		return (EAttribute)constituentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstituent_Value() {
		return (EReference)constituentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementInConstituent() {
		return elementInConstituentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInConstituent_Variable() {
		return (EAttribute)elementInConstituentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInConstituent_Constituent() {
		return (EAttribute)elementInConstituentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeDecl() {
		return dataTypeDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeDecl_Name() {
		return (EAttribute)dataTypeDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeDecl_Datatype() {
		return (EReference)dataTypeDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeDecl_Functions() {
		return (EReference)dataTypeDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDecl() {
		return functionDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDecl_Data() {
		return (EReference)functionDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionDecl_Name() {
		return (EAttribute)functionDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDecl_Parameters() {
		return (EReference)functionDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDecl_Type() {
		return (EReference)functionDeclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDecl_Valuing() {
		return (EReference)functionDeclEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDecl_Expression() {
		return (EReference)functionDeclEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalParameter() {
		return formalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalParameter_Name() {
		return (EAttribute)formalParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalParameter_Type() {
		return (EReference)formalParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDecl() {
		return fieldDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDecl_Name() {
		return (EAttribute)fieldDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldDecl_Type() {
		return (EReference)fieldDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexName() {
		return complexNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexName_Name() {
		return (EAttribute)complexNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuing() {
		return valuingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuing_Name() {
		return (EAttribute)valuingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuing_Type() {
		return (EReference)valuingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuing_Expression() {
		return (EReference)valuingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_AbsInt() {
		return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleElement() {
		return tupleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTupleElement_Label() {
		return (EAttribute)tupleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleElement_Value() {
		return (EReference)tupleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Op() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Right() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoS() {
		return soSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuingProtocol() {
		return valuingProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuingProtocol_Valuing() {
		return (EReference)valuingProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertProtocol() {
		return assertProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertProtocol_Assertion() {
		return (EReference)assertProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyAction() {
		return anyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatProtocol() {
		return repeatProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatProtocol_Repeated() {
		return (EReference)repeatProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfThenElseProtocol() {
		return ifThenElseProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElseProtocol_Condition() {
		return (EReference)ifThenElseProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElseProtocol_IfTrue() {
		return (EReference)ifThenElseProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElseProtocol_IfFalse() {
		return (EReference)ifThenElseProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChooseProtocol() {
		return chooseProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChooseProtocol_Branches() {
		return (EReference)chooseProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEachProtocol() {
		return forEachProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachProtocol_Variable() {
		return (EAttribute)forEachProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachProtocol_SetOfValues() {
		return (EReference)forEachProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachProtocol_Repeated() {
		return (EReference)forEachProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoExprProtocol() {
		return doExprProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoExprProtocol_Expression() {
		return (EReference)doExprProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoneProtocol() {
		return doneProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendProtocolAction() {
		return sendProtocolActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendProtocolAction_Expression() {
		return (EReference)sendProtocolActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveAnyProtocolAction() {
		return receiveAnyProtocolActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveProtocolAction() {
		return receiveProtocolActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveProtocolAction_Variable() {
		return (EAttribute)receiveProtocolActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuingBehavior() {
		return valuingBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuingBehavior_Valuing() {
		return (EReference)valuingBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertBehavior() {
		return assertBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertBehavior_Assertion() {
		return (EReference)assertBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatBehavior() {
		return repeatBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatBehavior_Repeated() {
		return (EReference)repeatBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfThenElseBehavior() {
		return ifThenElseBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElseBehavior_Condition() {
		return (EReference)ifThenElseBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElseBehavior_IfTrue() {
		return (EReference)ifThenElseBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfThenElseBehavior_IfFalse() {
		return (EReference)ifThenElseBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChooseBehavior() {
		return chooseBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChooseBehavior_Branches() {
		return (EReference)chooseBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEachBehavior() {
		return forEachBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForEachBehavior_Variable() {
		return (EAttribute)forEachBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachBehavior_SetOfValues() {
		return (EReference)forEachBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEachBehavior_Repeated() {
		return (EReference)forEachBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoExprBehavior() {
		return doExprBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoExprBehavior_Expression() {
		return (EReference)doExprBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoneBehavior() {
		return doneBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecursiveCall() {
		return recursiveCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecursiveCall_Parameters() {
		return (EReference)recursiveCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnobservableBehavior() {
		return unobservableBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTellAssertion() {
		return tellAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTellAssertion_Expression() {
		return (EReference)tellAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUntellAssertion() {
		return untellAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAskAssertion() {
		return askAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAskAssertion_Expression() {
		return (EReference)askAssertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendAction() {
		return sendActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendAction_Expression() {
		return (EReference)sendActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveAction() {
		return receiveActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveAction_Variable() {
		return (EAttribute)receiveActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelay() {
		return relayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelay_ConnLeft() {
		return (EReference)relayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelay_ConnRight() {
		return (EReference)relayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnify() {
		return unifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnify_MultLeft() {
		return (EAttribute)unifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnify_ConnLeft() {
		return (EReference)unifyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnify_MultRight() {
		return (EAttribute)unifyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnify_ConnRight() {
		return (EReference)unifyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantify() {
		return quantifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantify_Quantifier() {
		return (EAttribute)quantifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantify_Elements() {
		return (EReference)quantifyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantify_Bindings() {
		return (EReference)quantifyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedType() {
		return namedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedType_Name() {
		return (EAttribute)namedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType() {
		return integerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleType() {
		return tupleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleType_Fields() {
		return (EReference)tupleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceType() {
		return sequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceType_Type() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeType() {
		return rangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeType_Vmin() {
		return (EReference)rangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeType_Vmax() {
		return (EReference)rangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionType() {
		return connectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionType_Mode() {
		return (EAttribute)connectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionType_Type() {
		return (EReference)connectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAny() {
		return anyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuple() {
		return tupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuple_Elements() {
		return (EReference)tupleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Elements() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Left() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Op() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Right() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentExpression() {
		return identExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentExpression_Ident() {
		return (EAttribute)identExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallExpression() {
		return callExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallExpression_Function() {
		return (EAttribute)callExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallExpression_Parameters() {
		return (EReference)callExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Object() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Field() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelect() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Object() {
		return (EReference)selectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelect_Variable() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Condition() {
		return (EReference)selectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Object() {
		return (EReference)mapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMap_Variable() {
		return (EAttribute)mapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Expression() {
		return (EReference)mapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodCall() {
		return methodCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCall_Object() {
		return (EReference)methodCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodCall_Method() {
		return (EAttribute)methodCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCall_Parameters() {
		return (EReference)methodCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantifier() {
		return quantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicity() {
		return multiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModeType() {
		return modeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SosADLFactory getSosADLFactory() {
		return (SosADLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sosADLEClass = createEClass(SOS_ADL);
		createEReference(sosADLEClass, SOS_ADL__IMPORTS);
		createEReference(sosADLEClass, SOS_ADL__CONTENT);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_LIBRARY);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__NAME);
		createEReference(unitEClass, UNIT__DECLS);

		entityBlockEClass = createEClass(ENTITY_BLOCK);
		createEReference(entityBlockEClass, ENTITY_BLOCK__DATATYPES);
		createEReference(entityBlockEClass, ENTITY_BLOCK__FUNCTIONS);
		createEReference(entityBlockEClass, ENTITY_BLOCK__SYSTEMS);
		createEReference(entityBlockEClass, ENTITY_BLOCK__MEDIATORS);
		createEReference(entityBlockEClass, ENTITY_BLOCK__ARCHITECTURES);

		systemDeclEClass = createEClass(SYSTEM_DECL);
		createEAttribute(systemDeclEClass, SYSTEM_DECL__NAME);
		createEReference(systemDeclEClass, SYSTEM_DECL__PARAMETERS);
		createEReference(systemDeclEClass, SYSTEM_DECL__DATATYPES);
		createEReference(systemDeclEClass, SYSTEM_DECL__GATES);
		createEReference(systemDeclEClass, SYSTEM_DECL__BEHAVIOR);
		createEReference(systemDeclEClass, SYSTEM_DECL__ASSERTIONS);

		architectureDeclEClass = createEClass(ARCHITECTURE_DECL);
		createEAttribute(architectureDeclEClass, ARCHITECTURE_DECL__NAME);
		createEReference(architectureDeclEClass, ARCHITECTURE_DECL__PARAMETERS);
		createEReference(architectureDeclEClass, ARCHITECTURE_DECL__DATATYPES);
		createEReference(architectureDeclEClass, ARCHITECTURE_DECL__GATES);
		createEReference(architectureDeclEClass, ARCHITECTURE_DECL__BEHAVIOR);
		createEReference(architectureDeclEClass, ARCHITECTURE_DECL__ASSERTIONS);

		mediatorDeclEClass = createEClass(MEDIATOR_DECL);
		createEAttribute(mediatorDeclEClass, MEDIATOR_DECL__NAME);
		createEReference(mediatorDeclEClass, MEDIATOR_DECL__PARAMETERS);
		createEReference(mediatorDeclEClass, MEDIATOR_DECL__DATATYPES);
		createEReference(mediatorDeclEClass, MEDIATOR_DECL__DUTIES);
		createEReference(mediatorDeclEClass, MEDIATOR_DECL__BEHAVIOR);
		createEReference(mediatorDeclEClass, MEDIATOR_DECL__ASSUMPTIONS);
		createEReference(mediatorDeclEClass, MEDIATOR_DECL__ASSERTIONS);

		gateDeclEClass = createEClass(GATE_DECL);
		createEAttribute(gateDeclEClass, GATE_DECL__NAME);
		createEReference(gateDeclEClass, GATE_DECL__CONNECTIONS);
		createEReference(gateDeclEClass, GATE_DECL__PROTOCOLS);

		dutyDeclEClass = createEClass(DUTY_DECL);
		createEAttribute(dutyDeclEClass, DUTY_DECL__NAME);
		createEReference(dutyDeclEClass, DUTY_DECL__CONNECTIONS);
		createEReference(dutyDeclEClass, DUTY_DECL__ASSERTIONS);
		createEReference(dutyDeclEClass, DUTY_DECL__PROTOCOLS);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__ENVIRONMENT);
		createEAttribute(connectionEClass, CONNECTION__NAME);
		createEAttribute(connectionEClass, CONNECTION__MODE);
		createEReference(connectionEClass, CONNECTION__VALUE_TYPE);

		assertionDeclEClass = createEClass(ASSERTION_DECL);
		createEAttribute(assertionDeclEClass, ASSERTION_DECL__NAME);
		createEReference(assertionDeclEClass, ASSERTION_DECL__BODY);

		protocolDeclEClass = createEClass(PROTOCOL_DECL);
		createEAttribute(protocolDeclEClass, PROTOCOL_DECL__NAME);
		createEReference(protocolDeclEClass, PROTOCOL_DECL__BODY);

		protocolEClass = createEClass(PROTOCOL);
		createEReference(protocolEClass, PROTOCOL__STATEMENTS);

		protocolStatementEClass = createEClass(PROTOCOL_STATEMENT);

		protocolActionEClass = createEClass(PROTOCOL_ACTION);
		createEReference(protocolActionEClass, PROTOCOL_ACTION__COMPLEX_NAME);
		createEReference(protocolActionEClass, PROTOCOL_ACTION__SUITE);

		protocolActionSuiteEClass = createEClass(PROTOCOL_ACTION_SUITE);

		behaviorDeclEClass = createEClass(BEHAVIOR_DECL);
		createEAttribute(behaviorDeclEClass, BEHAVIOR_DECL__NAME);
		createEReference(behaviorDeclEClass, BEHAVIOR_DECL__BODY);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__STATEMENTS);

		behaviorStatementEClass = createEClass(BEHAVIOR_STATEMENT);

		assertEClass = createEClass(ASSERT);
		createEAttribute(assertEClass, ASSERT__NAME);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__COMPLEX_NAME);
		createEReference(actionEClass, ACTION__SUITE);

		actionSuiteEClass = createEClass(ACTION_SUITE);

		archBehaviorDeclEClass = createEClass(ARCH_BEHAVIOR_DECL);
		createEAttribute(archBehaviorDeclEClass, ARCH_BEHAVIOR_DECL__NAME);
		createEReference(archBehaviorDeclEClass, ARCH_BEHAVIOR_DECL__CONSTITUENTS);
		createEReference(archBehaviorDeclEClass, ARCH_BEHAVIOR_DECL__BINDINGS);

		constituentEClass = createEClass(CONSTITUENT);
		createEAttribute(constituentEClass, CONSTITUENT__NAME);
		createEReference(constituentEClass, CONSTITUENT__VALUE);

		expressionEClass = createEClass(EXPRESSION);

		elementInConstituentEClass = createEClass(ELEMENT_IN_CONSTITUENT);
		createEAttribute(elementInConstituentEClass, ELEMENT_IN_CONSTITUENT__VARIABLE);
		createEAttribute(elementInConstituentEClass, ELEMENT_IN_CONSTITUENT__CONSTITUENT);

		dataTypeDeclEClass = createEClass(DATA_TYPE_DECL);
		createEAttribute(dataTypeDeclEClass, DATA_TYPE_DECL__NAME);
		createEReference(dataTypeDeclEClass, DATA_TYPE_DECL__DATATYPE);
		createEReference(dataTypeDeclEClass, DATA_TYPE_DECL__FUNCTIONS);

		dataTypeEClass = createEClass(DATA_TYPE);

		functionDeclEClass = createEClass(FUNCTION_DECL);
		createEReference(functionDeclEClass, FUNCTION_DECL__DATA);
		createEAttribute(functionDeclEClass, FUNCTION_DECL__NAME);
		createEReference(functionDeclEClass, FUNCTION_DECL__PARAMETERS);
		createEReference(functionDeclEClass, FUNCTION_DECL__TYPE);
		createEReference(functionDeclEClass, FUNCTION_DECL__VALUING);
		createEReference(functionDeclEClass, FUNCTION_DECL__EXPRESSION);

		formalParameterEClass = createEClass(FORMAL_PARAMETER);
		createEAttribute(formalParameterEClass, FORMAL_PARAMETER__NAME);
		createEReference(formalParameterEClass, FORMAL_PARAMETER__TYPE);

		fieldDeclEClass = createEClass(FIELD_DECL);
		createEAttribute(fieldDeclEClass, FIELD_DECL__NAME);
		createEReference(fieldDeclEClass, FIELD_DECL__TYPE);

		complexNameEClass = createEClass(COMPLEX_NAME);
		createEAttribute(complexNameEClass, COMPLEX_NAME__NAME);

		valuingEClass = createEClass(VALUING);
		createEAttribute(valuingEClass, VALUING__NAME);
		createEReference(valuingEClass, VALUING__TYPE);
		createEReference(valuingEClass, VALUING__EXPRESSION);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__ABS_INT);

		tupleElementEClass = createEClass(TUPLE_ELEMENT);
		createEAttribute(tupleElementEClass, TUPLE_ELEMENT__LABEL);
		createEReference(tupleElementEClass, TUPLE_ELEMENT__VALUE);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OP);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__RIGHT);

		libraryEClass = createEClass(LIBRARY);

		soSEClass = createEClass(SO_S);

		valuingProtocolEClass = createEClass(VALUING_PROTOCOL);
		createEReference(valuingProtocolEClass, VALUING_PROTOCOL__VALUING);

		assertProtocolEClass = createEClass(ASSERT_PROTOCOL);
		createEReference(assertProtocolEClass, ASSERT_PROTOCOL__ASSERTION);

		anyActionEClass = createEClass(ANY_ACTION);

		repeatProtocolEClass = createEClass(REPEAT_PROTOCOL);
		createEReference(repeatProtocolEClass, REPEAT_PROTOCOL__REPEATED);

		ifThenElseProtocolEClass = createEClass(IF_THEN_ELSE_PROTOCOL);
		createEReference(ifThenElseProtocolEClass, IF_THEN_ELSE_PROTOCOL__CONDITION);
		createEReference(ifThenElseProtocolEClass, IF_THEN_ELSE_PROTOCOL__IF_TRUE);
		createEReference(ifThenElseProtocolEClass, IF_THEN_ELSE_PROTOCOL__IF_FALSE);

		chooseProtocolEClass = createEClass(CHOOSE_PROTOCOL);
		createEReference(chooseProtocolEClass, CHOOSE_PROTOCOL__BRANCHES);

		forEachProtocolEClass = createEClass(FOR_EACH_PROTOCOL);
		createEAttribute(forEachProtocolEClass, FOR_EACH_PROTOCOL__VARIABLE);
		createEReference(forEachProtocolEClass, FOR_EACH_PROTOCOL__SET_OF_VALUES);
		createEReference(forEachProtocolEClass, FOR_EACH_PROTOCOL__REPEATED);

		doExprProtocolEClass = createEClass(DO_EXPR_PROTOCOL);
		createEReference(doExprProtocolEClass, DO_EXPR_PROTOCOL__EXPRESSION);

		doneProtocolEClass = createEClass(DONE_PROTOCOL);

		sendProtocolActionEClass = createEClass(SEND_PROTOCOL_ACTION);
		createEReference(sendProtocolActionEClass, SEND_PROTOCOL_ACTION__EXPRESSION);

		receiveAnyProtocolActionEClass = createEClass(RECEIVE_ANY_PROTOCOL_ACTION);

		receiveProtocolActionEClass = createEClass(RECEIVE_PROTOCOL_ACTION);
		createEAttribute(receiveProtocolActionEClass, RECEIVE_PROTOCOL_ACTION__VARIABLE);

		valuingBehaviorEClass = createEClass(VALUING_BEHAVIOR);
		createEReference(valuingBehaviorEClass, VALUING_BEHAVIOR__VALUING);

		assertBehaviorEClass = createEClass(ASSERT_BEHAVIOR);
		createEReference(assertBehaviorEClass, ASSERT_BEHAVIOR__ASSERTION);

		repeatBehaviorEClass = createEClass(REPEAT_BEHAVIOR);
		createEReference(repeatBehaviorEClass, REPEAT_BEHAVIOR__REPEATED);

		ifThenElseBehaviorEClass = createEClass(IF_THEN_ELSE_BEHAVIOR);
		createEReference(ifThenElseBehaviorEClass, IF_THEN_ELSE_BEHAVIOR__CONDITION);
		createEReference(ifThenElseBehaviorEClass, IF_THEN_ELSE_BEHAVIOR__IF_TRUE);
		createEReference(ifThenElseBehaviorEClass, IF_THEN_ELSE_BEHAVIOR__IF_FALSE);

		chooseBehaviorEClass = createEClass(CHOOSE_BEHAVIOR);
		createEReference(chooseBehaviorEClass, CHOOSE_BEHAVIOR__BRANCHES);

		forEachBehaviorEClass = createEClass(FOR_EACH_BEHAVIOR);
		createEAttribute(forEachBehaviorEClass, FOR_EACH_BEHAVIOR__VARIABLE);
		createEReference(forEachBehaviorEClass, FOR_EACH_BEHAVIOR__SET_OF_VALUES);
		createEReference(forEachBehaviorEClass, FOR_EACH_BEHAVIOR__REPEATED);

		doExprBehaviorEClass = createEClass(DO_EXPR_BEHAVIOR);
		createEReference(doExprBehaviorEClass, DO_EXPR_BEHAVIOR__EXPRESSION);

		doneBehaviorEClass = createEClass(DONE_BEHAVIOR);

		recursiveCallEClass = createEClass(RECURSIVE_CALL);
		createEReference(recursiveCallEClass, RECURSIVE_CALL__PARAMETERS);

		unobservableBehaviorEClass = createEClass(UNOBSERVABLE_BEHAVIOR);

		tellAssertionEClass = createEClass(TELL_ASSERTION);
		createEReference(tellAssertionEClass, TELL_ASSERTION__EXPRESSION);

		untellAssertionEClass = createEClass(UNTELL_ASSERTION);

		askAssertionEClass = createEClass(ASK_ASSERTION);
		createEReference(askAssertionEClass, ASK_ASSERTION__EXPRESSION);

		sendActionEClass = createEClass(SEND_ACTION);
		createEReference(sendActionEClass, SEND_ACTION__EXPRESSION);

		receiveActionEClass = createEClass(RECEIVE_ACTION);
		createEAttribute(receiveActionEClass, RECEIVE_ACTION__VARIABLE);

		relayEClass = createEClass(RELAY);
		createEReference(relayEClass, RELAY__CONN_LEFT);
		createEReference(relayEClass, RELAY__CONN_RIGHT);

		unifyEClass = createEClass(UNIFY);
		createEAttribute(unifyEClass, UNIFY__MULT_LEFT);
		createEReference(unifyEClass, UNIFY__CONN_LEFT);
		createEAttribute(unifyEClass, UNIFY__MULT_RIGHT);
		createEReference(unifyEClass, UNIFY__CONN_RIGHT);

		quantifyEClass = createEClass(QUANTIFY);
		createEAttribute(quantifyEClass, QUANTIFY__QUANTIFIER);
		createEReference(quantifyEClass, QUANTIFY__ELEMENTS);
		createEReference(quantifyEClass, QUANTIFY__BINDINGS);

		namedTypeEClass = createEClass(NAMED_TYPE);
		createEAttribute(namedTypeEClass, NAMED_TYPE__NAME);

		integerTypeEClass = createEClass(INTEGER_TYPE);

		tupleTypeEClass = createEClass(TUPLE_TYPE);
		createEReference(tupleTypeEClass, TUPLE_TYPE__FIELDS);

		sequenceTypeEClass = createEClass(SEQUENCE_TYPE);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__TYPE);

		rangeTypeEClass = createEClass(RANGE_TYPE);
		createEReference(rangeTypeEClass, RANGE_TYPE__VMIN);
		createEReference(rangeTypeEClass, RANGE_TYPE__VMAX);

		connectionTypeEClass = createEClass(CONNECTION_TYPE);
		createEAttribute(connectionTypeEClass, CONNECTION_TYPE__MODE);
		createEReference(connectionTypeEClass, CONNECTION_TYPE__TYPE);

		anyEClass = createEClass(ANY);

		tupleEClass = createEClass(TUPLE);
		createEReference(tupleEClass, TUPLE__ELEMENTS);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__ELEMENTS);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OP);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);

		identExpressionEClass = createEClass(IDENT_EXPRESSION);
		createEAttribute(identExpressionEClass, IDENT_EXPRESSION__IDENT);

		callExpressionEClass = createEClass(CALL_EXPRESSION);
		createEAttribute(callExpressionEClass, CALL_EXPRESSION__FUNCTION);
		createEReference(callExpressionEClass, CALL_EXPRESSION__PARAMETERS);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__OBJECT);
		createEAttribute(fieldEClass, FIELD__FIELD);

		selectEClass = createEClass(SELECT);
		createEReference(selectEClass, SELECT__OBJECT);
		createEAttribute(selectEClass, SELECT__VARIABLE);
		createEReference(selectEClass, SELECT__CONDITION);

		mapEClass = createEClass(MAP);
		createEReference(mapEClass, MAP__OBJECT);
		createEAttribute(mapEClass, MAP__VARIABLE);
		createEReference(mapEClass, MAP__EXPRESSION);

		methodCallEClass = createEClass(METHOD_CALL);
		createEReference(methodCallEClass, METHOD_CALL__OBJECT);
		createEAttribute(methodCallEClass, METHOD_CALL__METHOD);
		createEReference(methodCallEClass, METHOD_CALL__PARAMETERS);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);

		// Create enums
		quantifierEEnum = createEEnum(QUANTIFIER);
		multiplicityEEnum = createEEnum(MULTIPLICITY);
		modeTypeEEnum = createEEnum(MODE_TYPE);

		// Create data types
		objectEDataType = createEDataType(OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		protocolActionEClass.getESuperTypes().add(this.getProtocolStatement());
		actionEClass.getESuperTypes().add(this.getBehaviorStatement());
		integerValueEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		libraryEClass.getESuperTypes().add(this.getUnit());
		soSEClass.getESuperTypes().add(this.getUnit());
		valuingProtocolEClass.getESuperTypes().add(this.getProtocolStatement());
		assertProtocolEClass.getESuperTypes().add(this.getProtocolStatement());
		anyActionEClass.getESuperTypes().add(this.getProtocolStatement());
		repeatProtocolEClass.getESuperTypes().add(this.getProtocolStatement());
		ifThenElseProtocolEClass.getESuperTypes().add(this.getProtocolStatement());
		chooseProtocolEClass.getESuperTypes().add(this.getProtocolStatement());
		forEachProtocolEClass.getESuperTypes().add(this.getProtocolStatement());
		doExprProtocolEClass.getESuperTypes().add(this.getProtocolStatement());
		doneProtocolEClass.getESuperTypes().add(this.getProtocolStatement());
		sendProtocolActionEClass.getESuperTypes().add(this.getProtocolActionSuite());
		receiveAnyProtocolActionEClass.getESuperTypes().add(this.getProtocolActionSuite());
		receiveProtocolActionEClass.getESuperTypes().add(this.getProtocolActionSuite());
		valuingBehaviorEClass.getESuperTypes().add(this.getBehaviorStatement());
		assertBehaviorEClass.getESuperTypes().add(this.getBehaviorStatement());
		repeatBehaviorEClass.getESuperTypes().add(this.getBehaviorStatement());
		ifThenElseBehaviorEClass.getESuperTypes().add(this.getBehaviorStatement());
		chooseBehaviorEClass.getESuperTypes().add(this.getBehaviorStatement());
		forEachBehaviorEClass.getESuperTypes().add(this.getBehaviorStatement());
		doExprBehaviorEClass.getESuperTypes().add(this.getBehaviorStatement());
		doneBehaviorEClass.getESuperTypes().add(this.getBehaviorStatement());
		recursiveCallEClass.getESuperTypes().add(this.getBehaviorStatement());
		unobservableBehaviorEClass.getESuperTypes().add(this.getBehaviorStatement());
		tellAssertionEClass.getESuperTypes().add(this.getAssert());
		untellAssertionEClass.getESuperTypes().add(this.getAssert());
		askAssertionEClass.getESuperTypes().add(this.getAssert());
		sendActionEClass.getESuperTypes().add(this.getActionSuite());
		receiveActionEClass.getESuperTypes().add(this.getActionSuite());
		relayEClass.getESuperTypes().add(this.getExpression());
		unifyEClass.getESuperTypes().add(this.getExpression());
		quantifyEClass.getESuperTypes().add(this.getExpression());
		namedTypeEClass.getESuperTypes().add(this.getDataType());
		integerTypeEClass.getESuperTypes().add(this.getDataType());
		tupleTypeEClass.getESuperTypes().add(this.getDataType());
		sequenceTypeEClass.getESuperTypes().add(this.getDataType());
		rangeTypeEClass.getESuperTypes().add(this.getDataType());
		connectionTypeEClass.getESuperTypes().add(this.getDataType());
		anyEClass.getESuperTypes().add(this.getExpression());
		tupleEClass.getESuperTypes().add(this.getExpression());
		sequenceEClass.getESuperTypes().add(this.getExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		identExpressionEClass.getESuperTypes().add(this.getExpression());
		callExpressionEClass.getESuperTypes().add(this.getExpression());
		fieldEClass.getESuperTypes().add(this.getExpression());
		selectEClass.getESuperTypes().add(this.getExpression());
		mapEClass.getESuperTypes().add(this.getExpression());
		methodCallEClass.getESuperTypes().add(this.getExpression());
		booleanTypeEClass.getESuperTypes().add(this.getDataType());

		// Initialize classes and features; add operations and parameters
		initEClass(sosADLEClass, SosADL.class, "SosADL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSosADL_Imports(), this.getImport(), null, "imports", null, 0, -1, SosADL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSosADL_Content(), this.getUnit(), null, "content", null, 0, 1, SosADL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedLibrary(), ecorePackage.getEString(), "importedLibrary", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Decls(), this.getEntityBlock(), null, "decls", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityBlockEClass, EntityBlock.class, "EntityBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityBlock_Datatypes(), this.getDataTypeDecl(), null, "datatypes", null, 0, -1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityBlock_Functions(), this.getFunctionDecl(), null, "functions", null, 0, -1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityBlock_Systems(), this.getSystemDecl(), null, "systems", null, 0, -1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityBlock_Mediators(), this.getMediatorDecl(), null, "mediators", null, 0, -1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityBlock_Architectures(), this.getArchitectureDecl(), null, "architectures", null, 0, -1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemDeclEClass, SystemDecl.class, "SystemDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDecl_Parameters(), this.getFormalParameter(), null, "parameters", null, 0, -1, SystemDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDecl_Datatypes(), this.getDataTypeDecl(), null, "datatypes", null, 0, -1, SystemDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDecl_Gates(), this.getGateDecl(), null, "gates", null, 0, -1, SystemDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDecl_Behavior(), this.getBehaviorDecl(), null, "behavior", null, 0, 1, SystemDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDecl_Assertions(), this.getAssertionDecl(), null, "assertions", null, 0, -1, SystemDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(systemDeclEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(architectureDeclEClass, ArchitectureDecl.class, "ArchitectureDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitectureDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArchitectureDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDecl_Parameters(), this.getFormalParameter(), null, "parameters", null, 0, -1, ArchitectureDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDecl_Datatypes(), this.getDataTypeDecl(), null, "datatypes", null, 0, -1, ArchitectureDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDecl_Gates(), this.getGateDecl(), null, "gates", null, 0, -1, ArchitectureDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDecl_Behavior(), this.getArchBehaviorDecl(), null, "behavior", null, 0, 1, ArchitectureDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDecl_Assertions(), this.getAssertionDecl(), null, "assertions", null, 0, -1, ArchitectureDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(architectureDeclEClass, null, "main", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(architectureDeclEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "args", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(mediatorDeclEClass, MediatorDecl.class, "MediatorDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediatorDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, MediatorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorDecl_Parameters(), this.getFormalParameter(), null, "parameters", null, 0, -1, MediatorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorDecl_Datatypes(), this.getDataTypeDecl(), null, "datatypes", null, 0, -1, MediatorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorDecl_Duties(), this.getDutyDecl(), null, "duties", null, 0, -1, MediatorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorDecl_Behavior(), this.getBehaviorDecl(), null, "behavior", null, 0, 1, MediatorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorDecl_Assumptions(), this.getAssertionDecl(), null, "assumptions", null, 0, -1, MediatorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediatorDecl_Assertions(), this.getAssertionDecl(), null, "assertions", null, 0, -1, MediatorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mediatorDeclEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gateDeclEClass, GateDecl.class, "GateDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, GateDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGateDecl_Connections(), this.getConnection(), null, "connections", null, 0, -1, GateDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGateDecl_Protocols(), this.getProtocolDecl(), null, "protocols", null, 0, -1, GateDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dutyDeclEClass, DutyDecl.class, "DutyDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDutyDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, DutyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDutyDecl_Connections(), this.getConnection(), null, "connections", null, 0, -1, DutyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDutyDecl_Assertions(), this.getAssertionDecl(), null, "assertions", null, 0, -1, DutyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDutyDecl_Protocols(), this.getProtocolDecl(), null, "protocols", null, 0, -1, DutyDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Environment(), ecorePackage.getEBoolean(), "environment", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Mode(), this.getModeType(), "mode", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_ValueType(), this.getDataType(), null, "valueType", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(connectionEClass, null, "propagateValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assertionDeclEClass, AssertionDecl.class, "AssertionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertionDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, AssertionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertionDecl_Body(), this.getProtocol(), null, "body", null, 0, 1, AssertionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolDeclEClass, ProtocolDecl.class, "ProtocolDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocolDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProtocolDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolDecl_Body(), this.getProtocol(), null, "body", null, 0, 1, ProtocolDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocol_Statements(), this.getProtocolStatement(), null, "statements", null, 0, -1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolStatementEClass, ProtocolStatement.class, "ProtocolStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protocolActionEClass, ProtocolAction.class, "ProtocolAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolAction_ComplexName(), this.getComplexName(), null, "complexName", null, 0, 1, ProtocolAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolAction_Suite(), this.getProtocolActionSuite(), null, "suite", null, 0, 1, ProtocolAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolActionSuiteEClass, ProtocolActionSuite.class, "ProtocolActionSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(behaviorDeclEClass, BehaviorDecl.class, "BehaviorDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviorDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, BehaviorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorDecl_Body(), this.getBehavior(), null, "body", null, 0, 1, BehaviorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_Statements(), this.getBehaviorStatement(), null, "statements", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorStatementEClass, BehaviorStatement.class, "BehaviorStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertEClass, Assert.class, "Assert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssert_Name(), ecorePackage.getEString(), "name", null, 0, 1, Assert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_ComplexName(), this.getComplexName(), null, "complexName", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Suite(), this.getActionSuite(), null, "suite", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionSuiteEClass, ActionSuite.class, "ActionSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(archBehaviorDeclEClass, ArchBehaviorDecl.class, "ArchBehaviorDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchBehaviorDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArchBehaviorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchBehaviorDecl_Constituents(), this.getConstituent(), null, "constituents", null, 0, -1, ArchBehaviorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchBehaviorDecl_Bindings(), this.getExpression(), null, "bindings", null, 0, 1, ArchBehaviorDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constituentEClass, Constituent.class, "Constituent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstituent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constituent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstituent_Value(), this.getExpression(), null, "value", null, 0, 1, Constituent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(expressionEClass, this.getObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(expressionEClass, null, "performAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementInConstituentEClass, ElementInConstituent.class, "ElementInConstituent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementInConstituent_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ElementInConstituent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementInConstituent_Constituent(), ecorePackage.getEString(), "constituent", null, 0, 1, ElementInConstituent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeDeclEClass, DataTypeDecl.class, "DataTypeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTypeDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeDecl_Datatype(), this.getDataType(), null, "datatype", null, 0, 1, DataTypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeDecl_Functions(), this.getFunctionDecl(), null, "functions", null, 0, -1, DataTypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionDeclEClass, FunctionDecl.class, "FunctionDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionDecl_Data(), this.getFormalParameter(), null, "data", null, 0, 1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDecl_Parameters(), this.getFormalParameter(), null, "parameters", null, 0, -1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDecl_Type(), this.getDataType(), null, "type", null, 0, 1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDecl_Valuing(), this.getValuing(), null, "valuing", null, 0, -1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDecl_Expression(), this.getExpression(), null, "expression", null, 0, 1, FunctionDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formalParameterEClass, FormalParameter.class, "FormalParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormalParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormalParameter_Type(), this.getDataType(), null, "type", null, 0, 1, FormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldDeclEClass, FieldDecl.class, "FieldDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, FieldDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldDecl_Type(), this.getDataType(), null, "type", null, 0, 1, FieldDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexNameEClass, ComplexName.class, "ComplexName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexName_Name(), ecorePackage.getEString(), "name", null, 0, -1, ComplexName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuingEClass, Valuing.class, "Valuing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValuing_Name(), ecorePackage.getEString(), "name", null, 0, 1, Valuing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuing_Type(), this.getDataType(), null, "type", null, 0, 1, Valuing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuing_Expression(), this.getExpression(), null, "expression", null, 0, 1, Valuing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_AbsInt(), ecorePackage.getEInt(), "absInt", null, 0, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleElementEClass, TupleElement.class, "TupleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTupleElement_Label(), ecorePackage.getEString(), "label", null, 0, 1, TupleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTupleElement_Value(), this.getExpression(), null, "value", null, 0, 1, TupleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExpression_Right(), this.getExpression(), null, "right", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soSEClass, SoS.class, "SoS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valuingProtocolEClass, ValuingProtocol.class, "ValuingProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuingProtocol_Valuing(), this.getValuing(), null, "valuing", null, 0, 1, ValuingProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertProtocolEClass, AssertProtocol.class, "AssertProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertProtocol_Assertion(), this.getAssert(), null, "assertion", null, 0, 1, AssertProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyActionEClass, AnyAction.class, "AnyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatProtocolEClass, RepeatProtocol.class, "RepeatProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatProtocol_Repeated(), this.getProtocol(), null, "repeated", null, 0, 1, RepeatProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifThenElseProtocolEClass, IfThenElseProtocol.class, "IfThenElseProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfThenElseProtocol_Condition(), this.getExpression(), null, "condition", null, 0, 1, IfThenElseProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElseProtocol_IfTrue(), this.getProtocol(), null, "ifTrue", null, 0, 1, IfThenElseProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElseProtocol_IfFalse(), this.getProtocol(), null, "ifFalse", null, 0, 1, IfThenElseProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chooseProtocolEClass, ChooseProtocol.class, "ChooseProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChooseProtocol_Branches(), this.getProtocol(), null, "branches", null, 0, -1, ChooseProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEachProtocolEClass, ForEachProtocol.class, "ForEachProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForEachProtocol_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ForEachProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEachProtocol_SetOfValues(), this.getExpression(), null, "setOfValues", null, 0, 1, ForEachProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEachProtocol_Repeated(), this.getProtocol(), null, "repeated", null, 0, 1, ForEachProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doExprProtocolEClass, DoExprProtocol.class, "DoExprProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoExprProtocol_Expression(), this.getExpression(), null, "expression", null, 0, 1, DoExprProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doneProtocolEClass, DoneProtocol.class, "DoneProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendProtocolActionEClass, SendProtocolAction.class, "SendProtocolAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendProtocolAction_Expression(), this.getExpression(), null, "expression", null, 0, 1, SendProtocolAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiveAnyProtocolActionEClass, ReceiveAnyProtocolAction.class, "ReceiveAnyProtocolAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receiveProtocolActionEClass, ReceiveProtocolAction.class, "ReceiveProtocolAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReceiveProtocolAction_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ReceiveProtocolAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuingBehaviorEClass, ValuingBehavior.class, "ValuingBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuingBehavior_Valuing(), this.getValuing(), null, "valuing", null, 0, 1, ValuingBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertBehaviorEClass, AssertBehavior.class, "AssertBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertBehavior_Assertion(), this.getAssert(), null, "assertion", null, 0, 1, AssertBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatBehaviorEClass, RepeatBehavior.class, "RepeatBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatBehavior_Repeated(), this.getBehavior(), null, "repeated", null, 0, 1, RepeatBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifThenElseBehaviorEClass, IfThenElseBehavior.class, "IfThenElseBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfThenElseBehavior_Condition(), this.getExpression(), null, "condition", null, 0, 1, IfThenElseBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElseBehavior_IfTrue(), this.getBehavior(), null, "ifTrue", null, 0, 1, IfThenElseBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfThenElseBehavior_IfFalse(), this.getBehavior(), null, "ifFalse", null, 0, 1, IfThenElseBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chooseBehaviorEClass, ChooseBehavior.class, "ChooseBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChooseBehavior_Branches(), this.getBehavior(), null, "branches", null, 0, -1, ChooseBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEachBehaviorEClass, ForEachBehavior.class, "ForEachBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForEachBehavior_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ForEachBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEachBehavior_SetOfValues(), this.getExpression(), null, "setOfValues", null, 0, 1, ForEachBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEachBehavior_Repeated(), this.getBehavior(), null, "repeated", null, 0, 1, ForEachBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doExprBehaviorEClass, DoExprBehavior.class, "DoExprBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoExprBehavior_Expression(), this.getExpression(), null, "expression", null, 0, 1, DoExprBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doneBehaviorEClass, DoneBehavior.class, "DoneBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recursiveCallEClass, RecursiveCall.class, "RecursiveCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecursiveCall_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, RecursiveCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unobservableBehaviorEClass, UnobservableBehavior.class, "UnobservableBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tellAssertionEClass, TellAssertion.class, "TellAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTellAssertion_Expression(), this.getExpression(), null, "expression", null, 0, 1, TellAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(untellAssertionEClass, UntellAssertion.class, "UntellAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(askAssertionEClass, AskAssertion.class, "AskAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAskAssertion_Expression(), this.getExpression(), null, "expression", null, 0, 1, AskAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendActionEClass, SendAction.class, "SendAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendAction_Expression(), this.getExpression(), null, "expression", null, 0, 1, SendAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiveActionEClass, ReceiveAction.class, "ReceiveAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReceiveAction_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ReceiveAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relayEClass, Relay.class, "Relay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelay_ConnLeft(), this.getComplexName(), null, "connLeft", null, 0, 1, Relay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelay_ConnRight(), this.getComplexName(), null, "connRight", null, 0, 1, Relay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unifyEClass, Unify.class, "Unify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnify_MultLeft(), this.getMultiplicity(), "multLeft", null, 0, 1, Unify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnify_ConnLeft(), this.getComplexName(), null, "connLeft", null, 0, 1, Unify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnify_MultRight(), this.getMultiplicity(), "multRight", null, 0, 1, Unify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnify_ConnRight(), this.getComplexName(), null, "connRight", null, 0, 1, Unify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(unifyEClass, null, "performAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(quantifyEClass, Quantify.class, "Quantify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantify_Quantifier(), this.getQuantifier(), "quantifier", null, 0, 1, Quantify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantify_Elements(), this.getElementInConstituent(), null, "elements", null, 0, -1, Quantify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantify_Bindings(), this.getExpression(), null, "bindings", null, 0, 1, Quantify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedTypeEClass, NamedType.class, "NamedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedType_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tupleTypeEClass, TupleType.class, "TupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleType_Fields(), this.getFieldDecl(), null, "fields", null, 0, -1, TupleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceType_Type(), this.getDataType(), null, "type", null, 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeTypeEClass, RangeType.class, "RangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeType_Vmin(), this.getExpression(), null, "vmin", null, 0, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangeType_Vmax(), this.getExpression(), null, "vmax", null, 0, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionTypeEClass, ConnectionType.class, "ConnectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionType_Mode(), this.getModeType(), "mode", null, 0, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionType_Type(), this.getDataType(), null, "type", null, 0, 1, ConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyEClass, Any.class, "Any", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tupleEClass, Tuple.class, "Tuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTuple_Elements(), this.getTupleElement(), null, "elements", null, 0, -1, Tuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Elements(), this.getExpression(), null, "elements", null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(binaryExpressionEClass, null, "performAction", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(identExpressionEClass, IdentExpression.class, "IdentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentExpression_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, IdentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callExpressionEClass, CallExpression.class, "CallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallExpression_Function(), ecorePackage.getEString(), "function", null, 0, 1, CallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallExpression_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, CallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Object(), this.getExpression(), null, "object", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Field(), ecorePackage.getEString(), "field", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelect_Object(), this.getExpression(), null, "object", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelect_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Condition(), this.getExpression(), null, "condition", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMap_Object(), this.getExpression(), null, "object", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMap_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMap_Expression(), this.getExpression(), null, "expression", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodCallEClass, MethodCall.class, "MethodCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodCall_Object(), this.getExpression(), null, "object", null, 0, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodCall_Method(), ecorePackage.getEString(), "method", null, 0, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodCall_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(quantifierEEnum, Quantifier.class, "Quantifier");
		addEEnumLiteral(quantifierEEnum, Quantifier.QUANTIFIER_FORALL);
		addEEnumLiteral(quantifierEEnum, Quantifier.QUANTIFIER_EXISTS);

		initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MULTIPLICITY_ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MULTIPLICITY_NONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MULTIPLICITY_LONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MULTIPLICITY_ANY);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MULTIPLICITY_SOME);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MULTIPLICITY_ALL);

		initEEnum(modeTypeEEnum, ModeType.class, "ModeType");
		addEEnumLiteral(modeTypeEEnum, ModeType.MODE_TYPE_IN);
		addEEnumLiteral(modeTypeEEnum, ModeType.MODE_TYPE_OUT);
		addEEnumLiteral(modeTypeEEnum, ModeType.MODE_TYPE_INOUT);

		// Initialize data types
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (systemDeclEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (architectureDeclEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (architectureDeclEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (mediatorDeclEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (expressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (expressionEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (unifyEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (binaryExpressionEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (objectEDataType, 
		   source, 
		   new String[] {
		   });
	}

} //SosADLPackageImpl
