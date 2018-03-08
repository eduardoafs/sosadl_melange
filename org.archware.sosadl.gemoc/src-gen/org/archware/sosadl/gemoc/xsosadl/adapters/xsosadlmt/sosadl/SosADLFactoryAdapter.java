package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosadl;

import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
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
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.NamedType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolAction;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolActionSuite;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolStatement;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class SosADLFactoryAdapter extends EFactoryImpl implements SosADLFactory {
  private XSosadlMTAdaptersFactory adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  
  private org.archware.sosadl.gemoc.xsosadl.sosADL.SosADLFactory sosADLAdaptee = org.archware.sosadl.gemoc.xsosadl.sosADL.SosADLFactory.eINSTANCE;
  
  @Override
  public SosADL createSosADL() {
    return adaptersFactory.createSosADLAdapter(sosADLAdaptee.createSosADL(), null);
  }
  
  @Override
  public Import createImport() {
    return adaptersFactory.createImportAdapter(sosADLAdaptee.createImport(), null);
  }
  
  @Override
  public Unit createUnit() {
    return adaptersFactory.createUnitAdapter(sosADLAdaptee.createUnit(), null);
  }
  
  @Override
  public EntityBlock createEntityBlock() {
    return adaptersFactory.createEntityBlockAdapter(sosADLAdaptee.createEntityBlock(), null);
  }
  
  @Override
  public SystemDecl createSystemDecl() {
    return adaptersFactory.createSystemDeclAdapter(sosADLAdaptee.createSystemDecl(), null);
  }
  
  @Override
  public ArchitectureDecl createArchitectureDecl() {
    return adaptersFactory.createArchitectureDeclAdapter(sosADLAdaptee.createArchitectureDecl(), null);
  }
  
  @Override
  public MediatorDecl createMediatorDecl() {
    return adaptersFactory.createMediatorDeclAdapter(sosADLAdaptee.createMediatorDecl(), null);
  }
  
  @Override
  public GateDecl createGateDecl() {
    return adaptersFactory.createGateDeclAdapter(sosADLAdaptee.createGateDecl(), null);
  }
  
  @Override
  public DutyDecl createDutyDecl() {
    return adaptersFactory.createDutyDeclAdapter(sosADLAdaptee.createDutyDecl(), null);
  }
  
  @Override
  public Connection createConnection() {
    return adaptersFactory.createConnectionAdapter(sosADLAdaptee.createConnection(), null);
  }
  
  @Override
  public AssertionDecl createAssertionDecl() {
    return adaptersFactory.createAssertionDeclAdapter(sosADLAdaptee.createAssertionDecl(), null);
  }
  
  @Override
  public ProtocolDecl createProtocolDecl() {
    return adaptersFactory.createProtocolDeclAdapter(sosADLAdaptee.createProtocolDecl(), null);
  }
  
  @Override
  public Protocol createProtocol() {
    return adaptersFactory.createProtocolAdapter(sosADLAdaptee.createProtocol(), null);
  }
  
  @Override
  public ProtocolStatement createProtocolStatement() {
    return adaptersFactory.createProtocolStatementAdapter(sosADLAdaptee.createProtocolStatement(), null);
  }
  
  @Override
  public ProtocolAction createProtocolAction() {
    return adaptersFactory.createProtocolActionAdapter(sosADLAdaptee.createProtocolAction(), null);
  }
  
  @Override
  public ProtocolActionSuite createProtocolActionSuite() {
    return adaptersFactory.createProtocolActionSuiteAdapter(sosADLAdaptee.createProtocolActionSuite(), null);
  }
  
  @Override
  public BehaviorDecl createBehaviorDecl() {
    return adaptersFactory.createBehaviorDeclAdapter(sosADLAdaptee.createBehaviorDecl(), null);
  }
  
  @Override
  public Behavior createBehavior() {
    return adaptersFactory.createBehaviorAdapter(sosADLAdaptee.createBehavior(), null);
  }
  
  @Override
  public BehaviorStatement createBehaviorStatement() {
    return adaptersFactory.createBehaviorStatementAdapter(sosADLAdaptee.createBehaviorStatement(), null);
  }
  
  @Override
  public Assert createAssert() {
    return adaptersFactory.createAssertAdapter(sosADLAdaptee.createAssert(), null);
  }
  
  @Override
  public Action createAction() {
    return adaptersFactory.createActionAdapter(sosADLAdaptee.createAction(), null);
  }
  
  @Override
  public ActionSuite createActionSuite() {
    return adaptersFactory.createActionSuiteAdapter(sosADLAdaptee.createActionSuite(), null);
  }
  
  @Override
  public ArchBehaviorDecl createArchBehaviorDecl() {
    return adaptersFactory.createArchBehaviorDeclAdapter(sosADLAdaptee.createArchBehaviorDecl(), null);
  }
  
  @Override
  public Constituent createConstituent() {
    return adaptersFactory.createConstituentAdapter(sosADLAdaptee.createConstituent(), null);
  }
  
  @Override
  public Expression createExpression() {
    return adaptersFactory.createExpressionAdapter(sosADLAdaptee.createExpression(), null);
  }
  
  @Override
  public ElementInConstituent createElementInConstituent() {
    return adaptersFactory.createElementInConstituentAdapter(sosADLAdaptee.createElementInConstituent(), null);
  }
  
  @Override
  public DataTypeDecl createDataTypeDecl() {
    return adaptersFactory.createDataTypeDeclAdapter(sosADLAdaptee.createDataTypeDecl(), null);
  }
  
  @Override
  public DataType createDataType() {
    return adaptersFactory.createDataTypeAdapter(sosADLAdaptee.createDataType(), null);
  }
  
  @Override
  public FunctionDecl createFunctionDecl() {
    return adaptersFactory.createFunctionDeclAdapter(sosADLAdaptee.createFunctionDecl(), null);
  }
  
  @Override
  public FormalParameter createFormalParameter() {
    return adaptersFactory.createFormalParameterAdapter(sosADLAdaptee.createFormalParameter(), null);
  }
  
  @Override
  public FieldDecl createFieldDecl() {
    return adaptersFactory.createFieldDeclAdapter(sosADLAdaptee.createFieldDecl(), null);
  }
  
  @Override
  public ComplexName createComplexName() {
    return adaptersFactory.createComplexNameAdapter(sosADLAdaptee.createComplexName(), null);
  }
  
  @Override
  public Valuing createValuing() {
    return adaptersFactory.createValuingAdapter(sosADLAdaptee.createValuing(), null);
  }
  
  @Override
  public IntegerValue createIntegerValue() {
    return adaptersFactory.createIntegerValueAdapter(sosADLAdaptee.createIntegerValue(), null);
  }
  
  @Override
  public TupleElement createTupleElement() {
    return adaptersFactory.createTupleElementAdapter(sosADLAdaptee.createTupleElement(), null);
  }
  
  @Override
  public UnaryExpression createUnaryExpression() {
    return adaptersFactory.createUnaryExpressionAdapter(sosADLAdaptee.createUnaryExpression(), null);
  }
  
  @Override
  public Library createLibrary() {
    return adaptersFactory.createLibraryAdapter(sosADLAdaptee.createLibrary(), null);
  }
  
  @Override
  public SoS createSoS() {
    return adaptersFactory.createSoSAdapter(sosADLAdaptee.createSoS(), null);
  }
  
  @Override
  public ValuingProtocol createValuingProtocol() {
    return adaptersFactory.createValuingProtocolAdapter(sosADLAdaptee.createValuingProtocol(), null);
  }
  
  @Override
  public AssertProtocol createAssertProtocol() {
    return adaptersFactory.createAssertProtocolAdapter(sosADLAdaptee.createAssertProtocol(), null);
  }
  
  @Override
  public AnyAction createAnyAction() {
    return adaptersFactory.createAnyActionAdapter(sosADLAdaptee.createAnyAction(), null);
  }
  
  @Override
  public RepeatProtocol createRepeatProtocol() {
    return adaptersFactory.createRepeatProtocolAdapter(sosADLAdaptee.createRepeatProtocol(), null);
  }
  
  @Override
  public IfThenElseProtocol createIfThenElseProtocol() {
    return adaptersFactory.createIfThenElseProtocolAdapter(sosADLAdaptee.createIfThenElseProtocol(), null);
  }
  
  @Override
  public ChooseProtocol createChooseProtocol() {
    return adaptersFactory.createChooseProtocolAdapter(sosADLAdaptee.createChooseProtocol(), null);
  }
  
  @Override
  public ForEachProtocol createForEachProtocol() {
    return adaptersFactory.createForEachProtocolAdapter(sosADLAdaptee.createForEachProtocol(), null);
  }
  
  @Override
  public DoExprProtocol createDoExprProtocol() {
    return adaptersFactory.createDoExprProtocolAdapter(sosADLAdaptee.createDoExprProtocol(), null);
  }
  
  @Override
  public DoneProtocol createDoneProtocol() {
    return adaptersFactory.createDoneProtocolAdapter(sosADLAdaptee.createDoneProtocol(), null);
  }
  
  @Override
  public SendProtocolAction createSendProtocolAction() {
    return adaptersFactory.createSendProtocolActionAdapter(sosADLAdaptee.createSendProtocolAction(), null);
  }
  
  @Override
  public ReceiveAnyProtocolAction createReceiveAnyProtocolAction() {
    return adaptersFactory.createReceiveAnyProtocolActionAdapter(sosADLAdaptee.createReceiveAnyProtocolAction(), null);
  }
  
  @Override
  public ReceiveProtocolAction createReceiveProtocolAction() {
    return adaptersFactory.createReceiveProtocolActionAdapter(sosADLAdaptee.createReceiveProtocolAction(), null);
  }
  
  @Override
  public ValuingBehavior createValuingBehavior() {
    return adaptersFactory.createValuingBehaviorAdapter(sosADLAdaptee.createValuingBehavior(), null);
  }
  
  @Override
  public AssertBehavior createAssertBehavior() {
    return adaptersFactory.createAssertBehaviorAdapter(sosADLAdaptee.createAssertBehavior(), null);
  }
  
  @Override
  public RepeatBehavior createRepeatBehavior() {
    return adaptersFactory.createRepeatBehaviorAdapter(sosADLAdaptee.createRepeatBehavior(), null);
  }
  
  @Override
  public IfThenElseBehavior createIfThenElseBehavior() {
    return adaptersFactory.createIfThenElseBehaviorAdapter(sosADLAdaptee.createIfThenElseBehavior(), null);
  }
  
  @Override
  public ChooseBehavior createChooseBehavior() {
    return adaptersFactory.createChooseBehaviorAdapter(sosADLAdaptee.createChooseBehavior(), null);
  }
  
  @Override
  public ForEachBehavior createForEachBehavior() {
    return adaptersFactory.createForEachBehaviorAdapter(sosADLAdaptee.createForEachBehavior(), null);
  }
  
  @Override
  public DoExprBehavior createDoExprBehavior() {
    return adaptersFactory.createDoExprBehaviorAdapter(sosADLAdaptee.createDoExprBehavior(), null);
  }
  
  @Override
  public DoneBehavior createDoneBehavior() {
    return adaptersFactory.createDoneBehaviorAdapter(sosADLAdaptee.createDoneBehavior(), null);
  }
  
  @Override
  public RecursiveCall createRecursiveCall() {
    return adaptersFactory.createRecursiveCallAdapter(sosADLAdaptee.createRecursiveCall(), null);
  }
  
  @Override
  public UnobservableBehavior createUnobservableBehavior() {
    return adaptersFactory.createUnobservableBehaviorAdapter(sosADLAdaptee.createUnobservableBehavior(), null);
  }
  
  @Override
  public TellAssertion createTellAssertion() {
    return adaptersFactory.createTellAssertionAdapter(sosADLAdaptee.createTellAssertion(), null);
  }
  
  @Override
  public UntellAssertion createUntellAssertion() {
    return adaptersFactory.createUntellAssertionAdapter(sosADLAdaptee.createUntellAssertion(), null);
  }
  
  @Override
  public AskAssertion createAskAssertion() {
    return adaptersFactory.createAskAssertionAdapter(sosADLAdaptee.createAskAssertion(), null);
  }
  
  @Override
  public SendAction createSendAction() {
    return adaptersFactory.createSendActionAdapter(sosADLAdaptee.createSendAction(), null);
  }
  
  @Override
  public ReceiveAction createReceiveAction() {
    return adaptersFactory.createReceiveActionAdapter(sosADLAdaptee.createReceiveAction(), null);
  }
  
  @Override
  public Relay createRelay() {
    return adaptersFactory.createRelayAdapter(sosADLAdaptee.createRelay(), null);
  }
  
  @Override
  public Unify createUnify() {
    return adaptersFactory.createUnifyAdapter(sosADLAdaptee.createUnify(), null);
  }
  
  @Override
  public Quantify createQuantify() {
    return adaptersFactory.createQuantifyAdapter(sosADLAdaptee.createQuantify(), null);
  }
  
  @Override
  public NamedType createNamedType() {
    return adaptersFactory.createNamedTypeAdapter(sosADLAdaptee.createNamedType(), null);
  }
  
  @Override
  public IntegerType createIntegerType() {
    return adaptersFactory.createIntegerTypeAdapter(sosADLAdaptee.createIntegerType(), null);
  }
  
  @Override
  public TupleType createTupleType() {
    return adaptersFactory.createTupleTypeAdapter(sosADLAdaptee.createTupleType(), null);
  }
  
  @Override
  public SequenceType createSequenceType() {
    return adaptersFactory.createSequenceTypeAdapter(sosADLAdaptee.createSequenceType(), null);
  }
  
  @Override
  public RangeType createRangeType() {
    return adaptersFactory.createRangeTypeAdapter(sosADLAdaptee.createRangeType(), null);
  }
  
  @Override
  public ConnectionType createConnectionType() {
    return adaptersFactory.createConnectionTypeAdapter(sosADLAdaptee.createConnectionType(), null);
  }
  
  @Override
  public Any createAny() {
    return adaptersFactory.createAnyAdapter(sosADLAdaptee.createAny(), null);
  }
  
  @Override
  public Tuple createTuple() {
    return adaptersFactory.createTupleAdapter(sosADLAdaptee.createTuple(), null);
  }
  
  @Override
  public Sequence createSequence() {
    return adaptersFactory.createSequenceAdapter(sosADLAdaptee.createSequence(), null);
  }
  
  @Override
  public BinaryExpression createBinaryExpression() {
    return adaptersFactory.createBinaryExpressionAdapter(sosADLAdaptee.createBinaryExpression(), null);
  }
  
  @Override
  public IdentExpression createIdentExpression() {
    return adaptersFactory.createIdentExpressionAdapter(sosADLAdaptee.createIdentExpression(), null);
  }
  
  @Override
  public CallExpression createCallExpression() {
    return adaptersFactory.createCallExpressionAdapter(sosADLAdaptee.createCallExpression(), null);
  }
  
  @Override
  public Field createField() {
    return adaptersFactory.createFieldAdapter(sosADLAdaptee.createField(), null);
  }
  
  @Override
  public Select createSelect() {
    return adaptersFactory.createSelectAdapter(sosADLAdaptee.createSelect(), null);
  }
  
  @Override
  public Map createMap() {
    return adaptersFactory.createMapAdapter(sosADLAdaptee.createMap(), null);
  }
  
  @Override
  public MethodCall createMethodCall() {
    return adaptersFactory.createMethodCallAdapter(sosADLAdaptee.createMethodCall(), null);
  }
  
  @Override
  public BooleanType createBooleanType() {
    return adaptersFactory.createBooleanTypeAdapter(sosADLAdaptee.createBooleanType(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getSosADLPackage();
  }
  
  public SosADLPackage getSosADLPackage() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE;
  }
}
