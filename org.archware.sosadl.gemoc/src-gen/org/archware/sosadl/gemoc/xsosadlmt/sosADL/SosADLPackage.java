/**
 */
package org.archware.sosadl.gemoc.xsosadlmt.sosADL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLFactory
 * @model kind="package"
 * @generated
 */
public interface SosADLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sosADL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.archware.sosadl.gemoc.xsosadlmt/sosADL/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sosADL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SosADLPackage eINSTANCE = org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLImpl <em>Sos ADL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSosADL()
	 * @generated
	 */
	int SOS_ADL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOS_ADL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOS_ADL__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Sos ADL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOS_ADL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ImportImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Imported Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnitImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DECLS = 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.EntityBlockImpl <em>Entity Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.EntityBlockImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getEntityBlock()
	 * @generated
	 */
	int ENTITY_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BLOCK__DATATYPES = 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BLOCK__FUNCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BLOCK__SYSTEMS = 2;

	/**
	 * The feature id for the '<em><b>Mediators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BLOCK__MEDIATORS = 3;

	/**
	 * The feature id for the '<em><b>Architectures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BLOCK__ARCHITECTURES = 4;

	/**
	 * The number of structural features of the '<em>Entity Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BLOCK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SystemDeclImpl <em>System Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SystemDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSystemDecl()
	 * @generated
	 */
	int SYSTEM_DECL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECL__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECL__DATATYPES = 2;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECL__GATES = 3;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECL__BEHAVIOR = 4;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECL__ASSERTIONS = 5;

	/**
	 * The number of structural features of the '<em>System Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DECL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ArchitectureDeclImpl <em>Architecture Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ArchitectureDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getArchitectureDecl()
	 * @generated
	 */
	int ARCHITECTURE_DECL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DECL__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DECL__DATATYPES = 2;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DECL__GATES = 3;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DECL__BEHAVIOR = 4;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DECL__ASSERTIONS = 5;

	/**
	 * The number of structural features of the '<em>Architecture Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DECL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MediatorDeclImpl <em>Mediator Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MediatorDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getMediatorDecl()
	 * @generated
	 */
	int MEDIATOR_DECL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_DECL__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_DECL__DATATYPES = 2;

	/**
	 * The feature id for the '<em><b>Duties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_DECL__DUTIES = 3;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_DECL__BEHAVIOR = 4;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_DECL__ASSUMPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_DECL__ASSERTIONS = 6;

	/**
	 * The number of structural features of the '<em>Mediator Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_DECL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.GateDeclImpl <em>Gate Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.GateDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getGateDecl()
	 * @generated
	 */
	int GATE_DECL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_DECL__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_DECL__PROTOCOLS = 2;

	/**
	 * The number of structural features of the '<em>Gate Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_DECL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DutyDeclImpl <em>Duty Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DutyDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDutyDecl()
	 * @generated
	 */
	int DUTY_DECL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_DECL__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_DECL__ASSERTIONS = 2;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_DECL__PROTOCOLS = 3;

	/**
	 * The number of structural features of the '<em>Duty Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_DECL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConnectionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 9;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MODE = 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__VALUE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertionDeclImpl <em>Assertion Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertionDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAssertionDecl()
	 * @generated
	 */
	int ASSERTION_DECL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_DECL__BODY = 1;

	/**
	 * The number of structural features of the '<em>Assertion Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_DECL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolDeclImpl <em>Protocol Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getProtocolDecl()
	 * @generated
	 */
	int PROTOCOL_DECL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_DECL__BODY = 1;

	/**
	 * The number of structural features of the '<em>Protocol Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_DECL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 12;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolStatementImpl <em>Protocol Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolStatementImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getProtocolStatement()
	 * @generated
	 */
	int PROTOCOL_STATEMENT = 13;

	/**
	 * The number of structural features of the '<em>Protocol Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolActionImpl <em>Protocol Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolActionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getProtocolAction()
	 * @generated
	 */
	int PROTOCOL_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Complex Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_ACTION__COMPLEX_NAME = PROTOCOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_ACTION__SUITE = PROTOCOL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Protocol Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_ACTION_FEATURE_COUNT = PROTOCOL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolActionSuiteImpl <em>Protocol Action Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolActionSuiteImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getProtocolActionSuite()
	 * @generated
	 */
	int PROTOCOL_ACTION_SUITE = 15;

	/**
	 * The number of structural features of the '<em>Protocol Action Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_ACTION_SUITE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorDeclImpl <em>Behavior Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getBehaviorDecl()
	 * @generated
	 */
	int BEHAVIOR_DECL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DECL__BODY = 1;

	/**
	 * The number of structural features of the '<em>Behavior Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DECL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 17;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorStatementImpl <em>Behavior Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorStatementImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getBehaviorStatement()
	 * @generated
	 */
	int BEHAVIOR_STATEMENT = 18;

	/**
	 * The number of structural features of the '<em>Behavior Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertImpl <em>Assert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAssert()
	 * @generated
	 */
	int ASSERT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Assert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ActionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 20;

	/**
	 * The feature id for the '<em><b>Complex Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COMPLEX_NAME = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SUITE = BEHAVIOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ActionSuiteImpl <em>Action Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ActionSuiteImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getActionSuite()
	 * @generated
	 */
	int ACTION_SUITE = 21;

	/**
	 * The number of structural features of the '<em>Action Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SUITE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ArchBehaviorDeclImpl <em>Arch Behavior Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ArchBehaviorDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getArchBehaviorDecl()
	 * @generated
	 */
	int ARCH_BEHAVIOR_DECL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_BEHAVIOR_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constituents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_BEHAVIOR_DECL__CONSTITUENTS = 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_BEHAVIOR_DECL__BINDINGS = 2;

	/**
	 * The number of structural features of the '<em>Arch Behavior Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_BEHAVIOR_DECL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConstituentImpl <em>Constituent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConstituentImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getConstituent()
	 * @generated
	 */
	int CONSTITUENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Constituent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ExpressionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 24;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ElementInConstituentImpl <em>Element In Constituent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ElementInConstituentImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getElementInConstituent()
	 * @generated
	 */
	int ELEMENT_IN_CONSTITUENT = 25;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_CONSTITUENT__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Constituent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_CONSTITUENT__CONSTITUENT = 1;

	/**
	 * The number of structural features of the '<em>Element In Constituent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IN_CONSTITUENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DataTypeDeclImpl <em>Data Type Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DataTypeDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDataTypeDecl()
	 * @generated
	 */
	int DATA_TYPE_DECL = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DECL__DATATYPE = 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DECL__FUNCTIONS = 2;

	/**
	 * The number of structural features of the '<em>Data Type Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DECL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DataTypeImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 27;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FunctionDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getFunctionDecl()
	 * @generated
	 */
	int FUNCTION_DECL = 28;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__DATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Valuing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__VALUING = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL__EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Function Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FormalParameterImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getFormalParameter()
	 * @generated
	 */
	int FORMAL_PARAMETER = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FieldDeclImpl <em>Field Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FieldDeclImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getFieldDecl()
	 * @generated
	 */
	int FIELD_DECL = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Field Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ComplexNameImpl <em>Complex Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ComplexNameImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getComplexName()
	 * @generated
	 */
	int COMPLEX_NAME = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Complex Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NAME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingImpl <em>Valuing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getValuing()
	 * @generated
	 */
	int VALUING = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUING__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUING__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Valuing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IntegerValueImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 33;

	/**
	 * The feature id for the '<em><b>Abs Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__ABS_INT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleElementImpl <em>Tuple Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleElementImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getTupleElement()
	 * @generated
	 */
	int TUPLE_ELEMENT = 34;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tuple Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnaryExpressionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 35;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.LibraryImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DECLS = UNIT__DECLS;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SoSImpl <em>So S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SoSImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSoS()
	 * @generated
	 */
	int SO_S = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_S__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_S__DECLS = UNIT__DECLS;

	/**
	 * The number of structural features of the '<em>So S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_S_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingProtocolImpl <em>Valuing Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingProtocolImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getValuingProtocol()
	 * @generated
	 */
	int VALUING_PROTOCOL = 38;

	/**
	 * The feature id for the '<em><b>Valuing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUING_PROTOCOL__VALUING = PROTOCOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valuing Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUING_PROTOCOL_FEATURE_COUNT = PROTOCOL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertProtocolImpl <em>Assert Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertProtocolImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAssertProtocol()
	 * @generated
	 */
	int ASSERT_PROTOCOL = 39;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_PROTOCOL__ASSERTION = PROTOCOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assert Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_PROTOCOL_FEATURE_COUNT = PROTOCOL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AnyActionImpl <em>Any Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AnyActionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAnyAction()
	 * @generated
	 */
	int ANY_ACTION = 40;

	/**
	 * The number of structural features of the '<em>Any Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ACTION_FEATURE_COUNT = PROTOCOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RepeatProtocolImpl <em>Repeat Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RepeatProtocolImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getRepeatProtocol()
	 * @generated
	 */
	int REPEAT_PROTOCOL = 41;

	/**
	 * The feature id for the '<em><b>Repeated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_PROTOCOL__REPEATED = PROTOCOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_PROTOCOL_FEATURE_COUNT = PROTOCOL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IfThenElseProtocolImpl <em>If Then Else Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IfThenElseProtocolImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getIfThenElseProtocol()
	 * @generated
	 */
	int IF_THEN_ELSE_PROTOCOL = 42;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_PROTOCOL__CONDITION = PROTOCOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_PROTOCOL__IF_TRUE = PROTOCOL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_PROTOCOL__IF_FALSE = PROTOCOL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Then Else Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_PROTOCOL_FEATURE_COUNT = PROTOCOL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ChooseProtocolImpl <em>Choose Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ChooseProtocolImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getChooseProtocol()
	 * @generated
	 */
	int CHOOSE_PROTOCOL = 43;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE_PROTOCOL__BRANCHES = PROTOCOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choose Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE_PROTOCOL_FEATURE_COUNT = PROTOCOL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ForEachProtocolImpl <em>For Each Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ForEachProtocolImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getForEachProtocol()
	 * @generated
	 */
	int FOR_EACH_PROTOCOL = 44;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_PROTOCOL__VARIABLE = PROTOCOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set Of Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_PROTOCOL__SET_OF_VALUES = PROTOCOL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repeated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_PROTOCOL__REPEATED = PROTOCOL_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For Each Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_PROTOCOL_FEATURE_COUNT = PROTOCOL_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoExprProtocolImpl <em>Do Expr Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoExprProtocolImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDoExprProtocol()
	 * @generated
	 */
	int DO_EXPR_PROTOCOL = 45;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EXPR_PROTOCOL__EXPRESSION = PROTOCOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Do Expr Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EXPR_PROTOCOL_FEATURE_COUNT = PROTOCOL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoneProtocolImpl <em>Done Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoneProtocolImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDoneProtocol()
	 * @generated
	 */
	int DONE_PROTOCOL = 46;

	/**
	 * The number of structural features of the '<em>Done Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONE_PROTOCOL_FEATURE_COUNT = PROTOCOL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SendProtocolActionImpl <em>Send Protocol Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SendProtocolActionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSendProtocolAction()
	 * @generated
	 */
	int SEND_PROTOCOL_ACTION = 47;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PROTOCOL_ACTION__EXPRESSION = PROTOCOL_ACTION_SUITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Protocol Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PROTOCOL_ACTION_FEATURE_COUNT = PROTOCOL_ACTION_SUITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveAnyProtocolActionImpl <em>Receive Any Protocol Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveAnyProtocolActionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getReceiveAnyProtocolAction()
	 * @generated
	 */
	int RECEIVE_ANY_PROTOCOL_ACTION = 48;

	/**
	 * The number of structural features of the '<em>Receive Any Protocol Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ANY_PROTOCOL_ACTION_FEATURE_COUNT = PROTOCOL_ACTION_SUITE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveProtocolActionImpl <em>Receive Protocol Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveProtocolActionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getReceiveProtocolAction()
	 * @generated
	 */
	int RECEIVE_PROTOCOL_ACTION = 49;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PROTOCOL_ACTION__VARIABLE = PROTOCOL_ACTION_SUITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Receive Protocol Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PROTOCOL_ACTION_FEATURE_COUNT = PROTOCOL_ACTION_SUITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingBehaviorImpl <em>Valuing Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingBehaviorImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getValuingBehavior()
	 * @generated
	 */
	int VALUING_BEHAVIOR = 50;

	/**
	 * The feature id for the '<em><b>Valuing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUING_BEHAVIOR__VALUING = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valuing Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUING_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertBehaviorImpl <em>Assert Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertBehaviorImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAssertBehavior()
	 * @generated
	 */
	int ASSERT_BEHAVIOR = 51;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_BEHAVIOR__ASSERTION = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assert Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RepeatBehaviorImpl <em>Repeat Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RepeatBehaviorImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getRepeatBehavior()
	 * @generated
	 */
	int REPEAT_BEHAVIOR = 52;

	/**
	 * The feature id for the '<em><b>Repeated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_BEHAVIOR__REPEATED = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IfThenElseBehaviorImpl <em>If Then Else Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IfThenElseBehaviorImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getIfThenElseBehavior()
	 * @generated
	 */
	int IF_THEN_ELSE_BEHAVIOR = 53;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_BEHAVIOR__CONDITION = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_BEHAVIOR__IF_TRUE = BEHAVIOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_BEHAVIOR__IF_FALSE = BEHAVIOR_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Then Else Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ChooseBehaviorImpl <em>Choose Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ChooseBehaviorImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getChooseBehavior()
	 * @generated
	 */
	int CHOOSE_BEHAVIOR = 54;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE_BEHAVIOR__BRANCHES = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choose Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ForEachBehaviorImpl <em>For Each Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ForEachBehaviorImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getForEachBehavior()
	 * @generated
	 */
	int FOR_EACH_BEHAVIOR = 55;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_BEHAVIOR__VARIABLE = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set Of Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_BEHAVIOR__SET_OF_VALUES = BEHAVIOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repeated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_BEHAVIOR__REPEATED = BEHAVIOR_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For Each Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoExprBehaviorImpl <em>Do Expr Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoExprBehaviorImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDoExprBehavior()
	 * @generated
	 */
	int DO_EXPR_BEHAVIOR = 56;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EXPR_BEHAVIOR__EXPRESSION = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Do Expr Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_EXPR_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoneBehaviorImpl <em>Done Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoneBehaviorImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDoneBehavior()
	 * @generated
	 */
	int DONE_BEHAVIOR = 57;

	/**
	 * The number of structural features of the '<em>Done Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONE_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RecursiveCallImpl <em>Recursive Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RecursiveCallImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getRecursiveCall()
	 * @generated
	 */
	int RECURSIVE_CALL = 58;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_CALL__PARAMETERS = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Recursive Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_CALL_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnobservableBehaviorImpl <em>Unobservable Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnobservableBehaviorImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getUnobservableBehavior()
	 * @generated
	 */
	int UNOBSERVABLE_BEHAVIOR = 59;

	/**
	 * The number of structural features of the '<em>Unobservable Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOBSERVABLE_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TellAssertionImpl <em>Tell Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TellAssertionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getTellAssertion()
	 * @generated
	 */
	int TELL_ASSERTION = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELL_ASSERTION__NAME = ASSERT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELL_ASSERTION__EXPRESSION = ASSERT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tell Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELL_ASSERTION_FEATURE_COUNT = ASSERT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UntellAssertionImpl <em>Untell Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UntellAssertionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getUntellAssertion()
	 * @generated
	 */
	int UNTELL_ASSERTION = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTELL_ASSERTION__NAME = ASSERT__NAME;

	/**
	 * The number of structural features of the '<em>Untell Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTELL_ASSERTION_FEATURE_COUNT = ASSERT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AskAssertionImpl <em>Ask Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AskAssertionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAskAssertion()
	 * @generated
	 */
	int ASK_ASSERTION = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ASSERTION__NAME = ASSERT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ASSERTION__EXPRESSION = ASSERT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ask Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ASSERTION_FEATURE_COUNT = ASSERT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SendActionImpl <em>Send Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SendActionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSendAction()
	 * @generated
	 */
	int SEND_ACTION = 63;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION__EXPRESSION = ACTION_SUITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_ACTION_FEATURE_COUNT = ACTION_SUITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveActionImpl <em>Receive Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveActionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getReceiveAction()
	 * @generated
	 */
	int RECEIVE_ACTION = 64;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ACTION__VARIABLE = ACTION_SUITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Receive Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_ACTION_FEATURE_COUNT = ACTION_SUITE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RelayImpl <em>Relay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RelayImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getRelay()
	 * @generated
	 */
	int RELAY = 65;

	/**
	 * The feature id for the '<em><b>Conn Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAY__CONN_LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conn Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAY__CONN_RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELAY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnifyImpl <em>Unify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnifyImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getUnify()
	 * @generated
	 */
	int UNIFY = 66;

	/**
	 * The feature id for the '<em><b>Mult Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFY__MULT_LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conn Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFY__CONN_LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mult Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFY__MULT_RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conn Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFY__CONN_RIGHT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Unify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.QuantifyImpl <em>Quantify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.QuantifyImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getQuantify()
	 * @generated
	 */
	int QUANTIFY = 67;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFY__QUANTIFIER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFY__ELEMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFY__BINDINGS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.NamedTypeImpl <em>Named Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.NamedTypeImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getNamedType()
	 * @generated
	 */
	int NAMED_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IntegerTypeImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 69;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleTypeImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getTupleType()
	 * @generated
	 */
	int TUPLE_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__FIELDS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SequenceTypeImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RangeTypeImpl <em>Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RangeTypeImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getRangeType()
	 * @generated
	 */
	int RANGE_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Vmin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__VMIN = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vmax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__VMAX = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConnectionTypeImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__MODE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AnyImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 74;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleImpl <em>Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getTuple()
	 * @generated
	 */
	int TUPLE = 75;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__ELEMENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SequenceImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 76;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ELEMENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BinaryExpressionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 77;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IdentExpressionImpl <em>Ident Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IdentExpressionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getIdentExpression()
	 * @generated
	 */
	int IDENT_EXPRESSION = 78;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT_EXPRESSION__IDENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ident Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.CallExpressionImpl <em>Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.CallExpressionImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getCallExpression()
	 * @generated
	 */
	int CALL_EXPRESSION = 79;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FieldImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 80;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELD = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SelectImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 81;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VARIABLE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CONDITION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MapImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 82;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__VARIABLE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MethodCallImpl <em>Method Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MethodCallImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getMethodCall()
	 * @generated
	 */
	int METHOD_CALL = 83;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__METHOD = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BooleanTypeImpl
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 84;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantifier
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 85;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 86;

	/**
	 * The meta object id for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType <em>Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getModeType()
	 * @generated
	 */
	int MODE_TYPE = 87;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 88;


	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADL <em>Sos ADL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sos ADL</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADL
	 * @generated
	 */
	EClass getSosADL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADL#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADL#getImports()
	 * @see #getSosADL()
	 * @generated
	 */
	EReference getSosADL_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADL#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADL#getContent()
	 * @see #getSosADL()
	 * @generated
	 */
	EReference getSosADL_Content();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Import#getImportedLibrary <em>Imported Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Library</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Import#getImportedLibrary()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedLibrary();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unit#getDecls <em>Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decls</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unit#getDecls()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Decls();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock <em>Entity Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Block</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock
	 * @generated
	 */
	EClass getEntityBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getDatatypes()
	 * @see #getEntityBlock()
	 * @generated
	 */
	EReference getEntityBlock_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getFunctions()
	 * @see #getEntityBlock()
	 * @generated
	 */
	EReference getEntityBlock_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systems</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getSystems()
	 * @see #getEntityBlock()
	 * @generated
	 */
	EReference getEntityBlock_Systems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getMediators <em>Mediators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mediators</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getMediators()
	 * @see #getEntityBlock()
	 * @generated
	 */
	EReference getEntityBlock_Mediators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getArchitectures <em>Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architectures</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.EntityBlock#getArchitectures()
	 * @see #getEntityBlock()
	 * @generated
	 */
	EReference getEntityBlock_Architectures();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl <em>System Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl
	 * @generated
	 */
	EClass getSystemDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getName()
	 * @see #getSystemDecl()
	 * @generated
	 */
	EAttribute getSystemDecl_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getParameters()
	 * @see #getSystemDecl()
	 * @generated
	 */
	EReference getSystemDecl_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getDatatypes()
	 * @see #getSystemDecl()
	 * @generated
	 */
	EReference getSystemDecl_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getGates()
	 * @see #getSystemDecl()
	 * @generated
	 */
	EReference getSystemDecl_Gates();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getBehavior()
	 * @see #getSystemDecl()
	 * @generated
	 */
	EReference getSystemDecl_Behavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SystemDecl#getAssertions()
	 * @see #getSystemDecl()
	 * @generated
	 */
	EReference getSystemDecl_Assertions();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl <em>Architecture Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl
	 * @generated
	 */
	EClass getArchitectureDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getName()
	 * @see #getArchitectureDecl()
	 * @generated
	 */
	EAttribute getArchitectureDecl_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getParameters()
	 * @see #getArchitectureDecl()
	 * @generated
	 */
	EReference getArchitectureDecl_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getDatatypes()
	 * @see #getArchitectureDecl()
	 * @generated
	 */
	EReference getArchitectureDecl_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getGates()
	 * @see #getArchitectureDecl()
	 * @generated
	 */
	EReference getArchitectureDecl_Gates();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getBehavior()
	 * @see #getArchitectureDecl()
	 * @generated
	 */
	EReference getArchitectureDecl_Behavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl#getAssertions()
	 * @see #getArchitectureDecl()
	 * @generated
	 */
	EReference getArchitectureDecl_Assertions();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl <em>Mediator Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl
	 * @generated
	 */
	EClass getMediatorDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getName()
	 * @see #getMediatorDecl()
	 * @generated
	 */
	EAttribute getMediatorDecl_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getParameters()
	 * @see #getMediatorDecl()
	 * @generated
	 */
	EReference getMediatorDecl_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getDatatypes()
	 * @see #getMediatorDecl()
	 * @generated
	 */
	EReference getMediatorDecl_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getDuties <em>Duties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duties</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getDuties()
	 * @see #getMediatorDecl()
	 * @generated
	 */
	EReference getMediatorDecl_Duties();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getBehavior()
	 * @see #getMediatorDecl()
	 * @generated
	 */
	EReference getMediatorDecl_Behavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assumptions</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getAssumptions()
	 * @see #getMediatorDecl()
	 * @generated
	 */
	EReference getMediatorDecl_Assumptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MediatorDecl#getAssertions()
	 * @see #getMediatorDecl()
	 * @generated
	 */
	EReference getMediatorDecl_Assertions();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl <em>Gate Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl
	 * @generated
	 */
	EClass getGateDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl#getName()
	 * @see #getGateDecl()
	 * @generated
	 */
	EAttribute getGateDecl_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl#getConnections()
	 * @see #getGateDecl()
	 * @generated
	 */
	EReference getGateDecl_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl#getProtocols()
	 * @see #getGateDecl()
	 * @generated
	 */
	EReference getGateDecl_Protocols();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl <em>Duty Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duty Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl
	 * @generated
	 */
	EClass getDutyDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl#getName()
	 * @see #getDutyDecl()
	 * @generated
	 */
	EAttribute getDutyDecl_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl#getConnections()
	 * @see #getDutyDecl()
	 * @generated
	 */
	EReference getDutyDecl_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl#getAssertions()
	 * @see #getDutyDecl()
	 * @generated
	 */
	EReference getDutyDecl_Assertions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl#getProtocols()
	 * @see #getDutyDecl()
	 * @generated
	 */
	EReference getDutyDecl_Protocols();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#isEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#isEnvironment()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Environment();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getMode()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection#getValueType()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ValueType();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl <em>Assertion Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl
	 * @generated
	 */
	EClass getAssertionDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl#getName()
	 * @see #getAssertionDecl()
	 * @generated
	 */
	EAttribute getAssertionDecl_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl#getBody()
	 * @see #getAssertionDecl()
	 * @generated
	 */
	EReference getAssertionDecl_Body();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl <em>Protocol Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl
	 * @generated
	 */
	EClass getProtocolDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl#getName()
	 * @see #getProtocolDecl()
	 * @generated
	 */
	EAttribute getProtocolDecl_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl#getBody()
	 * @see #getProtocolDecl()
	 * @generated
	 */
	EReference getProtocolDecl_Body();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol#getStatements()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Statements();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolStatement <em>Protocol Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Statement</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolStatement
	 * @generated
	 */
	EClass getProtocolStatement();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction <em>Protocol Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Action</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction
	 * @generated
	 */
	EClass getProtocolAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction#getComplexName <em>Complex Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction#getComplexName()
	 * @see #getProtocolAction()
	 * @generated
	 */
	EReference getProtocolAction_ComplexName();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction#getSuite()
	 * @see #getProtocolAction()
	 * @generated
	 */
	EReference getProtocolAction_Suite();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolActionSuite <em>Protocol Action Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Action Suite</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolActionSuite
	 * @generated
	 */
	EClass getProtocolActionSuite();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorDecl <em>Behavior Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorDecl
	 * @generated
	 */
	EClass getBehaviorDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorDecl#getName()
	 * @see #getBehaviorDecl()
	 * @generated
	 */
	EAttribute getBehaviorDecl_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorDecl#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorDecl#getBody()
	 * @see #getBehaviorDecl()
	 * @generated
	 */
	EReference getBehaviorDecl_Body();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior#getStatements()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Statements();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorStatement <em>Behavior Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Statement</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorStatement
	 * @generated
	 */
	EClass getBehaviorStatement();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Assert <em>Assert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Assert
	 * @generated
	 */
	EClass getAssert();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Assert#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Assert#getName()
	 * @see #getAssert()
	 * @generated
	 */
	EAttribute getAssert_Name();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action#getComplexName <em>Complex Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action#getComplexName()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ComplexName();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action#getSuite()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Suite();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ActionSuite <em>Action Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Suite</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ActionSuite
	 * @generated
	 */
	EClass getActionSuite();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl <em>Arch Behavior Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arch Behavior Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl
	 * @generated
	 */
	EClass getArchBehaviorDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getName()
	 * @see #getArchBehaviorDecl()
	 * @generated
	 */
	EAttribute getArchBehaviorDecl_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getConstituents <em>Constituents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constituents</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getConstituents()
	 * @see #getArchBehaviorDecl()
	 * @generated
	 */
	EReference getArchBehaviorDecl_Constituents();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindings</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl#getBindings()
	 * @see #getArchBehaviorDecl()
	 * @generated
	 */
	EReference getArchBehaviorDecl_Bindings();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent <em>Constituent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constituent</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent
	 * @generated
	 */
	EClass getConstituent();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent#getName()
	 * @see #getConstituent()
	 * @generated
	 */
	EAttribute getConstituent_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent#getValue()
	 * @see #getConstituent()
	 * @generated
	 */
	EReference getConstituent_Value();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent <em>Element In Constituent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element In Constituent</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent
	 * @generated
	 */
	EClass getElementInConstituent();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent#getVariable()
	 * @see #getElementInConstituent()
	 * @generated
	 */
	EAttribute getElementInConstituent_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent#getConstituent <em>Constituent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constituent</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent#getConstituent()
	 * @see #getElementInConstituent()
	 * @generated
	 */
	EAttribute getElementInConstituent_Constituent();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl <em>Data Type Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl
	 * @generated
	 */
	EClass getDataTypeDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl#getName()
	 * @see #getDataTypeDecl()
	 * @generated
	 */
	EAttribute getDataTypeDecl_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl#getDatatype()
	 * @see #getDataTypeDecl()
	 * @generated
	 */
	EReference getDataTypeDecl_Datatype();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl#getFunctions()
	 * @see #getDataTypeDecl()
	 * @generated
	 */
	EReference getDataTypeDecl_Functions();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl <em>Function Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl
	 * @generated
	 */
	EClass getFunctionDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getData()
	 * @see #getFunctionDecl()
	 * @generated
	 */
	EReference getFunctionDecl_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getName()
	 * @see #getFunctionDecl()
	 * @generated
	 */
	EAttribute getFunctionDecl_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getParameters()
	 * @see #getFunctionDecl()
	 * @generated
	 */
	EReference getFunctionDecl_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getType()
	 * @see #getFunctionDecl()
	 * @generated
	 */
	EReference getFunctionDecl_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getValuing <em>Valuing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Valuing</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getValuing()
	 * @see #getFunctionDecl()
	 * @generated
	 */
	EReference getFunctionDecl_Valuing();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl#getExpression()
	 * @see #getFunctionDecl()
	 * @generated
	 */
	EReference getFunctionDecl_Expression();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter
	 * @generated
	 */
	EClass getFormalParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter#getName()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter#getType()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EReference getFormalParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FieldDecl <em>Field Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Decl</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FieldDecl
	 * @generated
	 */
	EClass getFieldDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FieldDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FieldDecl#getName()
	 * @see #getFieldDecl()
	 * @generated
	 */
	EAttribute getFieldDecl_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.FieldDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.FieldDecl#getType()
	 * @see #getFieldDecl()
	 * @generated
	 */
	EReference getFieldDecl_Type();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ComplexName <em>Complex Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ComplexName
	 * @generated
	 */
	EClass getComplexName();

	/**
	 * Returns the meta object for the attribute list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ComplexName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ComplexName#getName()
	 * @see #getComplexName()
	 * @generated
	 */
	EAttribute getComplexName_Name();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing <em>Valuing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valuing</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing
	 * @generated
	 */
	EClass getValuing();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing#getName()
	 * @see #getValuing()
	 * @generated
	 */
	EAttribute getValuing_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing#getType()
	 * @see #getValuing()
	 * @generated
	 */
	EReference getValuing_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing#getExpression()
	 * @see #getValuing()
	 * @generated
	 */
	EReference getValuing_Expression();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerValue#getAbsInt <em>Abs Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abs Int</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerValue#getAbsInt()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_AbsInt();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleElement <em>Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Element</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleElement
	 * @generated
	 */
	EClass getTupleElement();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleElement#getLabel()
	 * @see #getTupleElement()
	 * @generated
	 */
	EAttribute getTupleElement_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleElement#getValue()
	 * @see #getTupleElement()
	 * @generated
	 */
	EReference getTupleElement_Value();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnaryExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnaryExpression#getOp()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnaryExpression#getRight()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SoS <em>So S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So S</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SoS
	 * @generated
	 */
	EClass getSoS();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingProtocol <em>Valuing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valuing Protocol</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingProtocol
	 * @generated
	 */
	EClass getValuingProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingProtocol#getValuing <em>Valuing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valuing</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingProtocol#getValuing()
	 * @see #getValuingProtocol()
	 * @generated
	 */
	EReference getValuingProtocol_Valuing();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertProtocol <em>Assert Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Protocol</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertProtocol
	 * @generated
	 */
	EClass getAssertProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertProtocol#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assertion</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertProtocol#getAssertion()
	 * @see #getAssertProtocol()
	 * @generated
	 */
	EReference getAssertProtocol_Assertion();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AnyAction <em>Any Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Action</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AnyAction
	 * @generated
	 */
	EClass getAnyAction();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatProtocol <em>Repeat Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Protocol</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatProtocol
	 * @generated
	 */
	EClass getRepeatProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatProtocol#getRepeated <em>Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeated</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatProtocol#getRepeated()
	 * @see #getRepeatProtocol()
	 * @generated
	 */
	EReference getRepeatProtocol_Repeated();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol <em>If Then Else Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else Protocol</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol
	 * @generated
	 */
	EClass getIfThenElseProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getCondition()
	 * @see #getIfThenElseProtocol()
	 * @generated
	 */
	EReference getIfThenElseProtocol_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getIfTrue <em>If True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If True</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getIfTrue()
	 * @see #getIfThenElseProtocol()
	 * @generated
	 */
	EReference getIfThenElseProtocol_IfTrue();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getIfFalse <em>If False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If False</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseProtocol#getIfFalse()
	 * @see #getIfThenElseProtocol()
	 * @generated
	 */
	EReference getIfThenElseProtocol_IfFalse();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseProtocol <em>Choose Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choose Protocol</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseProtocol
	 * @generated
	 */
	EClass getChooseProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseProtocol#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseProtocol#getBranches()
	 * @see #getChooseProtocol()
	 * @generated
	 */
	EReference getChooseProtocol_Branches();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol <em>For Each Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each Protocol</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol
	 * @generated
	 */
	EClass getForEachProtocol();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getVariable()
	 * @see #getForEachProtocol()
	 * @generated
	 */
	EAttribute getForEachProtocol_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getSetOfValues <em>Set Of Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Of Values</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getSetOfValues()
	 * @see #getForEachProtocol()
	 * @generated
	 */
	EReference getForEachProtocol_SetOfValues();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getRepeated <em>Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeated</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachProtocol#getRepeated()
	 * @see #getForEachProtocol()
	 * @generated
	 */
	EReference getForEachProtocol_Repeated();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprProtocol <em>Do Expr Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Expr Protocol</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprProtocol
	 * @generated
	 */
	EClass getDoExprProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprProtocol#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprProtocol#getExpression()
	 * @see #getDoExprProtocol()
	 * @generated
	 */
	EReference getDoExprProtocol_Expression();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneProtocol <em>Done Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Done Protocol</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneProtocol
	 * @generated
	 */
	EClass getDoneProtocol();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendProtocolAction <em>Send Protocol Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Protocol Action</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendProtocolAction
	 * @generated
	 */
	EClass getSendProtocolAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendProtocolAction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendProtocolAction#getExpression()
	 * @see #getSendProtocolAction()
	 * @generated
	 */
	EReference getSendProtocolAction_Expression();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAnyProtocolAction <em>Receive Any Protocol Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Any Protocol Action</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAnyProtocolAction
	 * @generated
	 */
	EClass getReceiveAnyProtocolAction();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveProtocolAction <em>Receive Protocol Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Protocol Action</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveProtocolAction
	 * @generated
	 */
	EClass getReceiveProtocolAction();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveProtocolAction#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveProtocolAction#getVariable()
	 * @see #getReceiveProtocolAction()
	 * @generated
	 */
	EAttribute getReceiveProtocolAction_Variable();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingBehavior <em>Valuing Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valuing Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingBehavior
	 * @generated
	 */
	EClass getValuingBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingBehavior#getValuing <em>Valuing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valuing</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingBehavior#getValuing()
	 * @see #getValuingBehavior()
	 * @generated
	 */
	EReference getValuingBehavior_Valuing();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertBehavior <em>Assert Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertBehavior
	 * @generated
	 */
	EClass getAssertBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertBehavior#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assertion</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertBehavior#getAssertion()
	 * @see #getAssertBehavior()
	 * @generated
	 */
	EReference getAssertBehavior_Assertion();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatBehavior <em>Repeat Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatBehavior
	 * @generated
	 */
	EClass getRepeatBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatBehavior#getRepeated <em>Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeated</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatBehavior#getRepeated()
	 * @see #getRepeatBehavior()
	 * @generated
	 */
	EReference getRepeatBehavior_Repeated();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior <em>If Then Else Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior
	 * @generated
	 */
	EClass getIfThenElseBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior#getCondition()
	 * @see #getIfThenElseBehavior()
	 * @generated
	 */
	EReference getIfThenElseBehavior_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior#getIfTrue <em>If True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If True</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior#getIfTrue()
	 * @see #getIfThenElseBehavior()
	 * @generated
	 */
	EReference getIfThenElseBehavior_IfTrue();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior#getIfFalse <em>If False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If False</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior#getIfFalse()
	 * @see #getIfThenElseBehavior()
	 * @generated
	 */
	EReference getIfThenElseBehavior_IfFalse();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseBehavior <em>Choose Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choose Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseBehavior
	 * @generated
	 */
	EClass getChooseBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseBehavior#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseBehavior#getBranches()
	 * @see #getChooseBehavior()
	 * @generated
	 */
	EReference getChooseBehavior_Branches();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior <em>For Each Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior
	 * @generated
	 */
	EClass getForEachBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior#getVariable()
	 * @see #getForEachBehavior()
	 * @generated
	 */
	EAttribute getForEachBehavior_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior#getSetOfValues <em>Set Of Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Of Values</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior#getSetOfValues()
	 * @see #getForEachBehavior()
	 * @generated
	 */
	EReference getForEachBehavior_SetOfValues();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior#getRepeated <em>Repeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeated</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior#getRepeated()
	 * @see #getForEachBehavior()
	 * @generated
	 */
	EReference getForEachBehavior_Repeated();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprBehavior <em>Do Expr Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Expr Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprBehavior
	 * @generated
	 */
	EClass getDoExprBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprBehavior#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoExprBehavior#getExpression()
	 * @see #getDoExprBehavior()
	 * @generated
	 */
	EReference getDoExprBehavior_Expression();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneBehavior <em>Done Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Done Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneBehavior
	 * @generated
	 */
	EClass getDoneBehavior();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RecursiveCall <em>Recursive Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recursive Call</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RecursiveCall
	 * @generated
	 */
	EClass getRecursiveCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RecursiveCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RecursiveCall#getParameters()
	 * @see #getRecursiveCall()
	 * @generated
	 */
	EReference getRecursiveCall_Parameters();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnobservableBehavior <em>Unobservable Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unobservable Behavior</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.UnobservableBehavior
	 * @generated
	 */
	EClass getUnobservableBehavior();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TellAssertion <em>Tell Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tell Assertion</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.TellAssertion
	 * @generated
	 */
	EClass getTellAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TellAssertion#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.TellAssertion#getExpression()
	 * @see #getTellAssertion()
	 * @generated
	 */
	EReference getTellAssertion_Expression();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.UntellAssertion <em>Untell Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Untell Assertion</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.UntellAssertion
	 * @generated
	 */
	EClass getUntellAssertion();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AskAssertion <em>Ask Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ask Assertion</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AskAssertion
	 * @generated
	 */
	EClass getAskAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.AskAssertion#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.AskAssertion#getExpression()
	 * @see #getAskAssertion()
	 * @generated
	 */
	EReference getAskAssertion_Expression();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendAction <em>Send Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Action</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendAction
	 * @generated
	 */
	EClass getSendAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendAction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SendAction#getExpression()
	 * @see #getSendAction()
	 * @generated
	 */
	EReference getSendAction_Expression();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAction <em>Receive Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Action</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAction
	 * @generated
	 */
	EClass getReceiveAction();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAction#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ReceiveAction#getVariable()
	 * @see #getReceiveAction()
	 * @generated
	 */
	EAttribute getReceiveAction_Variable();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay <em>Relay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relay</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay
	 * @generated
	 */
	EClass getRelay();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay#getConnLeft <em>Conn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conn Left</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay#getConnLeft()
	 * @see #getRelay()
	 * @generated
	 */
	EReference getRelay_ConnLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay#getConnRight <em>Conn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conn Right</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Relay#getConnRight()
	 * @see #getRelay()
	 * @generated
	 */
	EReference getRelay_ConnRight();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify <em>Unify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unify</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify
	 * @generated
	 */
	EClass getUnify();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getMultLeft <em>Mult Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult Left</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getMultLeft()
	 * @see #getUnify()
	 * @generated
	 */
	EAttribute getUnify_MultLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getConnLeft <em>Conn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conn Left</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getConnLeft()
	 * @see #getUnify()
	 * @generated
	 */
	EReference getUnify_ConnLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getMultRight <em>Mult Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult Right</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getMultRight()
	 * @see #getUnify()
	 * @generated
	 */
	EAttribute getUnify_MultRight();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getConnRight <em>Conn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conn Right</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Unify#getConnRight()
	 * @see #getUnify()
	 * @generated
	 */
	EReference getUnify_ConnRight();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify <em>Quantify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantify</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify
	 * @generated
	 */
	EClass getQuantify();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getQuantifier()
	 * @see #getQuantify()
	 * @generated
	 */
	EAttribute getQuantify_Quantifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getElements()
	 * @see #getQuantify()
	 * @generated
	 */
	EReference getQuantify_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindings</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantify#getBindings()
	 * @see #getQuantify()
	 * @generated
	 */
	EReference getQuantify_Bindings();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.NamedType
	 * @generated
	 */
	EClass getNamedType();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.NamedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.NamedType#getName()
	 * @see #getNamedType()
	 * @generated
	 */
	EAttribute getNamedType_Name();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleType
	 * @generated
	 */
	EClass getTupleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleType#getFields()
	 * @see #getTupleType()
	 * @generated
	 */
	EReference getTupleType_Fields();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.SequenceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.SequenceType#getType()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Type();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType
	 * @generated
	 */
	EClass getRangeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType#getVmin <em>Vmin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vmin</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType#getVmin()
	 * @see #getRangeType()
	 * @generated
	 */
	EReference getRangeType_Vmin();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType#getVmax <em>Vmax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vmax</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType#getVmax()
	 * @see #getRangeType()
	 * @generated
	 */
	EReference getRangeType_Vmax();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType
	 * @generated
	 */
	EClass getConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType#getMode()
	 * @see #getConnectionType()
	 * @generated
	 */
	EAttribute getConnectionType_Mode();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType#getType()
	 * @see #getConnectionType()
	 * @generated
	 */
	EReference getConnectionType_Type();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Tuple
	 * @generated
	 */
	EClass getTuple();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Tuple#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Tuple#getElements()
	 * @see #getTuple()
	 * @generated
	 */
	EReference getTuple_Elements();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Sequence#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Sequence#getElements()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Elements();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression#getOp()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IdentExpression <em>Ident Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ident Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IdentExpression
	 * @generated
	 */
	EClass getIdentExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.IdentExpression#getIdent <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.IdentExpression#getIdent()
	 * @see #getIdentExpression()
	 * @generated
	 */
	EAttribute getIdentExpression_Ident();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.CallExpression <em>Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.CallExpression
	 * @generated
	 */
	EClass getCallExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.CallExpression#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.CallExpression#getFunction()
	 * @see #getCallExpression()
	 * @generated
	 */
	EAttribute getCallExpression_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.CallExpression#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.CallExpression#getParameters()
	 * @see #getCallExpression()
	 * @generated
	 */
	EReference getCallExpression_Parameters();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Field#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Field#getObject()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Field#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Field#getField()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Field();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select#getObject()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select#getVariable()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Select#getCondition()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Condition();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map#getObject()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map#getVariable()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Map#getExpression()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Expression();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall
	 * @generated
	 */
	EClass getMethodCall();

	/**
	 * Returns the meta object for the containment reference '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall#getObject()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall#getMethod()
	 * @see #getMethodCall()
	 * @generated
	 */
	EAttribute getMethodCall_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.MethodCall#getParameters()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Parameters();

	/**
	 * Returns the meta object for class '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for enum '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantifier
	 * @generated
	 */
	EEnum getQuantifier();

	/**
	 * Returns the meta object for enum '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the meta object for enum '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType <em>Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Type</em>'.
	 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType
	 * @generated
	 */
	EEnum getModeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SosADLFactory getSosADLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLImpl <em>Sos ADL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSosADL()
		 * @generated
		 */
		EClass SOS_ADL = eINSTANCE.getSosADL();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOS_ADL__IMPORTS = eINSTANCE.getSosADL_Imports();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOS_ADL__CONTENT = eINSTANCE.getSosADL_Content();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ImportImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_LIBRARY = eINSTANCE.getImport_ImportedLibrary();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnitImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__DECLS = eINSTANCE.getUnit_Decls();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.EntityBlockImpl <em>Entity Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.EntityBlockImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getEntityBlock()
		 * @generated
		 */
		EClass ENTITY_BLOCK = eINSTANCE.getEntityBlock();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BLOCK__DATATYPES = eINSTANCE.getEntityBlock_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BLOCK__FUNCTIONS = eINSTANCE.getEntityBlock_Functions();

		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BLOCK__SYSTEMS = eINSTANCE.getEntityBlock_Systems();

		/**
		 * The meta object literal for the '<em><b>Mediators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BLOCK__MEDIATORS = eINSTANCE.getEntityBlock_Mediators();

		/**
		 * The meta object literal for the '<em><b>Architectures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BLOCK__ARCHITECTURES = eINSTANCE.getEntityBlock_Architectures();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SystemDeclImpl <em>System Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SystemDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSystemDecl()
		 * @generated
		 */
		EClass SYSTEM_DECL = eINSTANCE.getSystemDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DECL__NAME = eINSTANCE.getSystemDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DECL__PARAMETERS = eINSTANCE.getSystemDecl_Parameters();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DECL__DATATYPES = eINSTANCE.getSystemDecl_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DECL__GATES = eINSTANCE.getSystemDecl_Gates();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DECL__BEHAVIOR = eINSTANCE.getSystemDecl_Behavior();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DECL__ASSERTIONS = eINSTANCE.getSystemDecl_Assertions();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ArchitectureDeclImpl <em>Architecture Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ArchitectureDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getArchitectureDecl()
		 * @generated
		 */
		EClass ARCHITECTURE_DECL = eINSTANCE.getArchitectureDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_DECL__NAME = eINSTANCE.getArchitectureDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DECL__PARAMETERS = eINSTANCE.getArchitectureDecl_Parameters();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DECL__DATATYPES = eINSTANCE.getArchitectureDecl_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DECL__GATES = eINSTANCE.getArchitectureDecl_Gates();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DECL__BEHAVIOR = eINSTANCE.getArchitectureDecl_Behavior();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DECL__ASSERTIONS = eINSTANCE.getArchitectureDecl_Assertions();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MediatorDeclImpl <em>Mediator Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MediatorDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getMediatorDecl()
		 * @generated
		 */
		EClass MEDIATOR_DECL = eINSTANCE.getMediatorDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIATOR_DECL__NAME = eINSTANCE.getMediatorDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_DECL__PARAMETERS = eINSTANCE.getMediatorDecl_Parameters();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_DECL__DATATYPES = eINSTANCE.getMediatorDecl_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Duties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_DECL__DUTIES = eINSTANCE.getMediatorDecl_Duties();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_DECL__BEHAVIOR = eINSTANCE.getMediatorDecl_Behavior();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_DECL__ASSUMPTIONS = eINSTANCE.getMediatorDecl_Assumptions();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR_DECL__ASSERTIONS = eINSTANCE.getMediatorDecl_Assertions();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.GateDeclImpl <em>Gate Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.GateDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getGateDecl()
		 * @generated
		 */
		EClass GATE_DECL = eINSTANCE.getGateDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE_DECL__NAME = eINSTANCE.getGateDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE_DECL__CONNECTIONS = eINSTANCE.getGateDecl_Connections();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE_DECL__PROTOCOLS = eINSTANCE.getGateDecl_Protocols();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DutyDeclImpl <em>Duty Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DutyDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDutyDecl()
		 * @generated
		 */
		EClass DUTY_DECL = eINSTANCE.getDutyDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUTY_DECL__NAME = eINSTANCE.getDutyDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUTY_DECL__CONNECTIONS = eINSTANCE.getDutyDecl_Connections();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUTY_DECL__ASSERTIONS = eINSTANCE.getDutyDecl_Assertions();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUTY_DECL__PROTOCOLS = eINSTANCE.getDutyDecl_Protocols();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConnectionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__ENVIRONMENT = eINSTANCE.getConnection_Environment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__MODE = eINSTANCE.getConnection_Mode();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__VALUE_TYPE = eINSTANCE.getConnection_ValueType();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertionDeclImpl <em>Assertion Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertionDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAssertionDecl()
		 * @generated
		 */
		EClass ASSERTION_DECL = eINSTANCE.getAssertionDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_DECL__NAME = eINSTANCE.getAssertionDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION_DECL__BODY = eINSTANCE.getAssertionDecl_Body();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolDeclImpl <em>Protocol Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getProtocolDecl()
		 * @generated
		 */
		EClass PROTOCOL_DECL = eINSTANCE.getProtocolDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_DECL__NAME = eINSTANCE.getProtocolDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_DECL__BODY = eINSTANCE.getProtocolDecl_Body();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__STATEMENTS = eINSTANCE.getProtocol_Statements();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolStatementImpl <em>Protocol Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolStatementImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getProtocolStatement()
		 * @generated
		 */
		EClass PROTOCOL_STATEMENT = eINSTANCE.getProtocolStatement();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolActionImpl <em>Protocol Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolActionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getProtocolAction()
		 * @generated
		 */
		EClass PROTOCOL_ACTION = eINSTANCE.getProtocolAction();

		/**
		 * The meta object literal for the '<em><b>Complex Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_ACTION__COMPLEX_NAME = eINSTANCE.getProtocolAction_ComplexName();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_ACTION__SUITE = eINSTANCE.getProtocolAction_Suite();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolActionSuiteImpl <em>Protocol Action Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ProtocolActionSuiteImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getProtocolActionSuite()
		 * @generated
		 */
		EClass PROTOCOL_ACTION_SUITE = eINSTANCE.getProtocolActionSuite();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorDeclImpl <em>Behavior Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getBehaviorDecl()
		 * @generated
		 */
		EClass BEHAVIOR_DECL = eINSTANCE.getBehaviorDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_DECL__NAME = eINSTANCE.getBehaviorDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_DECL__BODY = eINSTANCE.getBehaviorDecl_Body();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__STATEMENTS = eINSTANCE.getBehavior_Statements();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorStatementImpl <em>Behavior Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BehaviorStatementImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getBehaviorStatement()
		 * @generated
		 */
		EClass BEHAVIOR_STATEMENT = eINSTANCE.getBehaviorStatement();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertImpl <em>Assert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAssert()
		 * @generated
		 */
		EClass ASSERT = eINSTANCE.getAssert();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT__NAME = eINSTANCE.getAssert_Name();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ActionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Complex Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__COMPLEX_NAME = eINSTANCE.getAction_ComplexName();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SUITE = eINSTANCE.getAction_Suite();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ActionSuiteImpl <em>Action Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ActionSuiteImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getActionSuite()
		 * @generated
		 */
		EClass ACTION_SUITE = eINSTANCE.getActionSuite();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ArchBehaviorDeclImpl <em>Arch Behavior Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ArchBehaviorDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getArchBehaviorDecl()
		 * @generated
		 */
		EClass ARCH_BEHAVIOR_DECL = eINSTANCE.getArchBehaviorDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCH_BEHAVIOR_DECL__NAME = eINSTANCE.getArchBehaviorDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Constituents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCH_BEHAVIOR_DECL__CONSTITUENTS = eINSTANCE.getArchBehaviorDecl_Constituents();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCH_BEHAVIOR_DECL__BINDINGS = eINSTANCE.getArchBehaviorDecl_Bindings();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConstituentImpl <em>Constituent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConstituentImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getConstituent()
		 * @generated
		 */
		EClass CONSTITUENT = eINSTANCE.getConstituent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTITUENT__NAME = eINSTANCE.getConstituent_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTITUENT__VALUE = eINSTANCE.getConstituent_Value();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ExpressionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ElementInConstituentImpl <em>Element In Constituent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ElementInConstituentImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getElementInConstituent()
		 * @generated
		 */
		EClass ELEMENT_IN_CONSTITUENT = eINSTANCE.getElementInConstituent();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IN_CONSTITUENT__VARIABLE = eINSTANCE.getElementInConstituent_Variable();

		/**
		 * The meta object literal for the '<em><b>Constituent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IN_CONSTITUENT__CONSTITUENT = eINSTANCE.getElementInConstituent_Constituent();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DataTypeDeclImpl <em>Data Type Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DataTypeDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDataTypeDecl()
		 * @generated
		 */
		EClass DATA_TYPE_DECL = eINSTANCE.getDataTypeDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_DECL__NAME = eINSTANCE.getDataTypeDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_DECL__DATATYPE = eINSTANCE.getDataTypeDecl_Datatype();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_DECL__FUNCTIONS = eINSTANCE.getDataTypeDecl_Functions();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DataTypeImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FunctionDeclImpl <em>Function Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FunctionDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getFunctionDecl()
		 * @generated
		 */
		EClass FUNCTION_DECL = eINSTANCE.getFunctionDecl();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECL__DATA = eINSTANCE.getFunctionDecl_Data();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DECL__NAME = eINSTANCE.getFunctionDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECL__PARAMETERS = eINSTANCE.getFunctionDecl_Parameters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECL__TYPE = eINSTANCE.getFunctionDecl_Type();

		/**
		 * The meta object literal for the '<em><b>Valuing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECL__VALUING = eINSTANCE.getFunctionDecl_Valuing();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DECL__EXPRESSION = eINSTANCE.getFunctionDecl_Expression();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FormalParameterImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getFormalParameter()
		 * @generated
		 */
		EClass FORMAL_PARAMETER = eINSTANCE.getFormalParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__NAME = eINSTANCE.getFormalParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER__TYPE = eINSTANCE.getFormalParameter_Type();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FieldDeclImpl <em>Field Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FieldDeclImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getFieldDecl()
		 * @generated
		 */
		EClass FIELD_DECL = eINSTANCE.getFieldDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DECL__NAME = eINSTANCE.getFieldDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DECL__TYPE = eINSTANCE.getFieldDecl_Type();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ComplexNameImpl <em>Complex Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ComplexNameImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getComplexName()
		 * @generated
		 */
		EClass COMPLEX_NAME = eINSTANCE.getComplexName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_NAME__NAME = eINSTANCE.getComplexName_Name();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingImpl <em>Valuing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getValuing()
		 * @generated
		 */
		EClass VALUING = eINSTANCE.getValuing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUING__NAME = eINSTANCE.getValuing_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUING__TYPE = eINSTANCE.getValuing_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUING__EXPRESSION = eINSTANCE.getValuing_Expression();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IntegerValueImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Abs Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__ABS_INT = eINSTANCE.getIntegerValue_AbsInt();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleElementImpl <em>Tuple Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleElementImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getTupleElement()
		 * @generated
		 */
		EClass TUPLE_ELEMENT = eINSTANCE.getTupleElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE_ELEMENT__LABEL = eINSTANCE.getTupleElement_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_ELEMENT__VALUE = eINSTANCE.getTupleElement_Value();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnaryExpressionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OP = eINSTANCE.getUnaryExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__RIGHT = eINSTANCE.getUnaryExpression_Right();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.LibraryImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SoSImpl <em>So S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SoSImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSoS()
		 * @generated
		 */
		EClass SO_S = eINSTANCE.getSoS();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingProtocolImpl <em>Valuing Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingProtocolImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getValuingProtocol()
		 * @generated
		 */
		EClass VALUING_PROTOCOL = eINSTANCE.getValuingProtocol();

		/**
		 * The meta object literal for the '<em><b>Valuing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUING_PROTOCOL__VALUING = eINSTANCE.getValuingProtocol_Valuing();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertProtocolImpl <em>Assert Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertProtocolImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAssertProtocol()
		 * @generated
		 */
		EClass ASSERT_PROTOCOL = eINSTANCE.getAssertProtocol();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_PROTOCOL__ASSERTION = eINSTANCE.getAssertProtocol_Assertion();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AnyActionImpl <em>Any Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AnyActionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAnyAction()
		 * @generated
		 */
		EClass ANY_ACTION = eINSTANCE.getAnyAction();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RepeatProtocolImpl <em>Repeat Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RepeatProtocolImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getRepeatProtocol()
		 * @generated
		 */
		EClass REPEAT_PROTOCOL = eINSTANCE.getRepeatProtocol();

		/**
		 * The meta object literal for the '<em><b>Repeated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_PROTOCOL__REPEATED = eINSTANCE.getRepeatProtocol_Repeated();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IfThenElseProtocolImpl <em>If Then Else Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IfThenElseProtocolImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getIfThenElseProtocol()
		 * @generated
		 */
		EClass IF_THEN_ELSE_PROTOCOL = eINSTANCE.getIfThenElseProtocol();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE_PROTOCOL__CONDITION = eINSTANCE.getIfThenElseProtocol_Condition();

		/**
		 * The meta object literal for the '<em><b>If True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE_PROTOCOL__IF_TRUE = eINSTANCE.getIfThenElseProtocol_IfTrue();

		/**
		 * The meta object literal for the '<em><b>If False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE_PROTOCOL__IF_FALSE = eINSTANCE.getIfThenElseProtocol_IfFalse();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ChooseProtocolImpl <em>Choose Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ChooseProtocolImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getChooseProtocol()
		 * @generated
		 */
		EClass CHOOSE_PROTOCOL = eINSTANCE.getChooseProtocol();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOOSE_PROTOCOL__BRANCHES = eINSTANCE.getChooseProtocol_Branches();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ForEachProtocolImpl <em>For Each Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ForEachProtocolImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getForEachProtocol()
		 * @generated
		 */
		EClass FOR_EACH_PROTOCOL = eINSTANCE.getForEachProtocol();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH_PROTOCOL__VARIABLE = eINSTANCE.getForEachProtocol_Variable();

		/**
		 * The meta object literal for the '<em><b>Set Of Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_PROTOCOL__SET_OF_VALUES = eINSTANCE.getForEachProtocol_SetOfValues();

		/**
		 * The meta object literal for the '<em><b>Repeated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_PROTOCOL__REPEATED = eINSTANCE.getForEachProtocol_Repeated();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoExprProtocolImpl <em>Do Expr Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoExprProtocolImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDoExprProtocol()
		 * @generated
		 */
		EClass DO_EXPR_PROTOCOL = eINSTANCE.getDoExprProtocol();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_EXPR_PROTOCOL__EXPRESSION = eINSTANCE.getDoExprProtocol_Expression();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoneProtocolImpl <em>Done Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoneProtocolImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDoneProtocol()
		 * @generated
		 */
		EClass DONE_PROTOCOL = eINSTANCE.getDoneProtocol();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SendProtocolActionImpl <em>Send Protocol Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SendProtocolActionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSendProtocolAction()
		 * @generated
		 */
		EClass SEND_PROTOCOL_ACTION = eINSTANCE.getSendProtocolAction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_PROTOCOL_ACTION__EXPRESSION = eINSTANCE.getSendProtocolAction_Expression();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveAnyProtocolActionImpl <em>Receive Any Protocol Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveAnyProtocolActionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getReceiveAnyProtocolAction()
		 * @generated
		 */
		EClass RECEIVE_ANY_PROTOCOL_ACTION = eINSTANCE.getReceiveAnyProtocolAction();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveProtocolActionImpl <em>Receive Protocol Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveProtocolActionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getReceiveProtocolAction()
		 * @generated
		 */
		EClass RECEIVE_PROTOCOL_ACTION = eINSTANCE.getReceiveProtocolAction();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_PROTOCOL_ACTION__VARIABLE = eINSTANCE.getReceiveProtocolAction_Variable();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingBehaviorImpl <em>Valuing Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ValuingBehaviorImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getValuingBehavior()
		 * @generated
		 */
		EClass VALUING_BEHAVIOR = eINSTANCE.getValuingBehavior();

		/**
		 * The meta object literal for the '<em><b>Valuing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUING_BEHAVIOR__VALUING = eINSTANCE.getValuingBehavior_Valuing();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertBehaviorImpl <em>Assert Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AssertBehaviorImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAssertBehavior()
		 * @generated
		 */
		EClass ASSERT_BEHAVIOR = eINSTANCE.getAssertBehavior();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_BEHAVIOR__ASSERTION = eINSTANCE.getAssertBehavior_Assertion();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RepeatBehaviorImpl <em>Repeat Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RepeatBehaviorImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getRepeatBehavior()
		 * @generated
		 */
		EClass REPEAT_BEHAVIOR = eINSTANCE.getRepeatBehavior();

		/**
		 * The meta object literal for the '<em><b>Repeated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_BEHAVIOR__REPEATED = eINSTANCE.getRepeatBehavior_Repeated();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IfThenElseBehaviorImpl <em>If Then Else Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IfThenElseBehaviorImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getIfThenElseBehavior()
		 * @generated
		 */
		EClass IF_THEN_ELSE_BEHAVIOR = eINSTANCE.getIfThenElseBehavior();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE_BEHAVIOR__CONDITION = eINSTANCE.getIfThenElseBehavior_Condition();

		/**
		 * The meta object literal for the '<em><b>If True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE_BEHAVIOR__IF_TRUE = eINSTANCE.getIfThenElseBehavior_IfTrue();

		/**
		 * The meta object literal for the '<em><b>If False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE_BEHAVIOR__IF_FALSE = eINSTANCE.getIfThenElseBehavior_IfFalse();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ChooseBehaviorImpl <em>Choose Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ChooseBehaviorImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getChooseBehavior()
		 * @generated
		 */
		EClass CHOOSE_BEHAVIOR = eINSTANCE.getChooseBehavior();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOOSE_BEHAVIOR__BRANCHES = eINSTANCE.getChooseBehavior_Branches();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ForEachBehaviorImpl <em>For Each Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ForEachBehaviorImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getForEachBehavior()
		 * @generated
		 */
		EClass FOR_EACH_BEHAVIOR = eINSTANCE.getForEachBehavior();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EACH_BEHAVIOR__VARIABLE = eINSTANCE.getForEachBehavior_Variable();

		/**
		 * The meta object literal for the '<em><b>Set Of Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_BEHAVIOR__SET_OF_VALUES = eINSTANCE.getForEachBehavior_SetOfValues();

		/**
		 * The meta object literal for the '<em><b>Repeated</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_BEHAVIOR__REPEATED = eINSTANCE.getForEachBehavior_Repeated();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoExprBehaviorImpl <em>Do Expr Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoExprBehaviorImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDoExprBehavior()
		 * @generated
		 */
		EClass DO_EXPR_BEHAVIOR = eINSTANCE.getDoExprBehavior();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_EXPR_BEHAVIOR__EXPRESSION = eINSTANCE.getDoExprBehavior_Expression();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoneBehaviorImpl <em>Done Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.DoneBehaviorImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getDoneBehavior()
		 * @generated
		 */
		EClass DONE_BEHAVIOR = eINSTANCE.getDoneBehavior();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RecursiveCallImpl <em>Recursive Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RecursiveCallImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getRecursiveCall()
		 * @generated
		 */
		EClass RECURSIVE_CALL = eINSTANCE.getRecursiveCall();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSIVE_CALL__PARAMETERS = eINSTANCE.getRecursiveCall_Parameters();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnobservableBehaviorImpl <em>Unobservable Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnobservableBehaviorImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getUnobservableBehavior()
		 * @generated
		 */
		EClass UNOBSERVABLE_BEHAVIOR = eINSTANCE.getUnobservableBehavior();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TellAssertionImpl <em>Tell Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TellAssertionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getTellAssertion()
		 * @generated
		 */
		EClass TELL_ASSERTION = eINSTANCE.getTellAssertion();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELL_ASSERTION__EXPRESSION = eINSTANCE.getTellAssertion_Expression();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UntellAssertionImpl <em>Untell Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UntellAssertionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getUntellAssertion()
		 * @generated
		 */
		EClass UNTELL_ASSERTION = eINSTANCE.getUntellAssertion();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AskAssertionImpl <em>Ask Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AskAssertionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAskAssertion()
		 * @generated
		 */
		EClass ASK_ASSERTION = eINSTANCE.getAskAssertion();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASK_ASSERTION__EXPRESSION = eINSTANCE.getAskAssertion_Expression();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SendActionImpl <em>Send Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SendActionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSendAction()
		 * @generated
		 */
		EClass SEND_ACTION = eINSTANCE.getSendAction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_ACTION__EXPRESSION = eINSTANCE.getSendAction_Expression();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveActionImpl <em>Receive Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ReceiveActionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getReceiveAction()
		 * @generated
		 */
		EClass RECEIVE_ACTION = eINSTANCE.getReceiveAction();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_ACTION__VARIABLE = eINSTANCE.getReceiveAction_Variable();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RelayImpl <em>Relay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RelayImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getRelay()
		 * @generated
		 */
		EClass RELAY = eINSTANCE.getRelay();

		/**
		 * The meta object literal for the '<em><b>Conn Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELAY__CONN_LEFT = eINSTANCE.getRelay_ConnLeft();

		/**
		 * The meta object literal for the '<em><b>Conn Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELAY__CONN_RIGHT = eINSTANCE.getRelay_ConnRight();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnifyImpl <em>Unify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.UnifyImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getUnify()
		 * @generated
		 */
		EClass UNIFY = eINSTANCE.getUnify();

		/**
		 * The meta object literal for the '<em><b>Mult Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFY__MULT_LEFT = eINSTANCE.getUnify_MultLeft();

		/**
		 * The meta object literal for the '<em><b>Conn Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFY__CONN_LEFT = eINSTANCE.getUnify_ConnLeft();

		/**
		 * The meta object literal for the '<em><b>Mult Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFY__MULT_RIGHT = eINSTANCE.getUnify_MultRight();

		/**
		 * The meta object literal for the '<em><b>Conn Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFY__CONN_RIGHT = eINSTANCE.getUnify_ConnRight();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.QuantifyImpl <em>Quantify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.QuantifyImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getQuantify()
		 * @generated
		 */
		EClass QUANTIFY = eINSTANCE.getQuantify();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFY__QUANTIFIER = eINSTANCE.getQuantify_Quantifier();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFY__ELEMENTS = eINSTANCE.getQuantify_Elements();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFY__BINDINGS = eINSTANCE.getQuantify_Bindings();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.NamedTypeImpl <em>Named Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.NamedTypeImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getNamedType()
		 * @generated
		 */
		EClass NAMED_TYPE = eINSTANCE.getNamedType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_TYPE__NAME = eINSTANCE.getNamedType_Name();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IntegerTypeImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleTypeImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getTupleType()
		 * @generated
		 */
		EClass TUPLE_TYPE = eINSTANCE.getTupleType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE__FIELDS = eINSTANCE.getTupleType_Fields();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SequenceTypeImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__TYPE = eINSTANCE.getSequenceType_Type();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RangeTypeImpl <em>Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.RangeTypeImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getRangeType()
		 * @generated
		 */
		EClass RANGE_TYPE = eINSTANCE.getRangeType();

		/**
		 * The meta object literal for the '<em><b>Vmin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_TYPE__VMIN = eINSTANCE.getRangeType_Vmin();

		/**
		 * The meta object literal for the '<em><b>Vmax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_TYPE__VMAX = eINSTANCE.getRangeType_Vmax();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.ConnectionTypeImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getConnectionType()
		 * @generated
		 */
		EClass CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_TYPE__MODE = eINSTANCE.getConnectionType_Mode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_TYPE__TYPE = eINSTANCE.getConnectionType_Type();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.AnyImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleImpl <em>Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.TupleImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getTuple()
		 * @generated
		 */
		EClass TUPLE = eINSTANCE.getTuple();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE__ELEMENTS = eINSTANCE.getTuple_Elements();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SequenceImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ELEMENTS = eINSTANCE.getSequence_Elements();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BinaryExpressionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OP = eINSTANCE.getBinaryExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IdentExpressionImpl <em>Ident Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.IdentExpressionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getIdentExpression()
		 * @generated
		 */
		EClass IDENT_EXPRESSION = eINSTANCE.getIdentExpression();

		/**
		 * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENT_EXPRESSION__IDENT = eINSTANCE.getIdentExpression_Ident();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.CallExpressionImpl <em>Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.CallExpressionImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getCallExpression()
		 * @generated
		 */
		EClass CALL_EXPRESSION = eINSTANCE.getCallExpression();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_EXPRESSION__FUNCTION = eINSTANCE.getCallExpression_Function();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EXPRESSION__PARAMETERS = eINSTANCE.getCallExpression_Parameters();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.FieldImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__OBJECT = eINSTANCE.getField_Object();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__FIELD = eINSTANCE.getField_Field();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SelectImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__OBJECT = eINSTANCE.getSelect_Object();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__VARIABLE = eINSTANCE.getSelect_Variable();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__CONDITION = eINSTANCE.getSelect_Condition();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MapImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__OBJECT = eINSTANCE.getMap_Object();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__VARIABLE = eINSTANCE.getMap_Variable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__EXPRESSION = eINSTANCE.getMap_Expression();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MethodCallImpl <em>Method Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.MethodCallImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getMethodCall()
		 * @generated
		 */
		EClass METHOD_CALL = eINSTANCE.getMethodCall();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__OBJECT = eINSTANCE.getMethodCall_Object();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CALL__METHOD = eINSTANCE.getMethodCall_Method();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__PARAMETERS = eINSTANCE.getMethodCall_Parameters();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.BooleanTypeImpl
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantifier <em>Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Quantifier
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getQuantifier()
		 * @generated
		 */
		EEnum QUANTIFIER = eINSTANCE.getQuantifier();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.Multiplicity
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType <em>Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getModeType()
		 * @generated
		 */
		EEnum MODE_TYPE = eINSTANCE.getModeType();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.archware.sosadl.gemoc.xsosadlmt.sosADL.impl.SosADLPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //SosADLPackage
