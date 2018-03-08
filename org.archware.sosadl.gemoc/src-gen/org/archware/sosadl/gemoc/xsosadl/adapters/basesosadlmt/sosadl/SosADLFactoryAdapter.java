package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosadl;

import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.sosADL.Action;
import org.archware.sosadl.sosADL.ActionSuite;
import org.archware.sosadl.sosADL.Any;
import org.archware.sosadl.sosADL.AnyAction;
import org.archware.sosadl.sosADL.ArchBehaviorDecl;
import org.archware.sosadl.sosADL.ArchitectureDecl;
import org.archware.sosadl.sosADL.AskAssertion;
import org.archware.sosadl.sosADL.Assert;
import org.archware.sosadl.sosADL.AssertBehavior;
import org.archware.sosadl.sosADL.AssertProtocol;
import org.archware.sosadl.sosADL.AssertionDecl;
import org.archware.sosadl.sosADL.Behavior;
import org.archware.sosadl.sosADL.BehaviorDecl;
import org.archware.sosadl.sosADL.BehaviorStatement;
import org.archware.sosadl.sosADL.BinaryExpression;
import org.archware.sosadl.sosADL.BooleanType;
import org.archware.sosadl.sosADL.CallExpression;
import org.archware.sosadl.sosADL.ChooseBehavior;
import org.archware.sosadl.sosADL.ChooseProtocol;
import org.archware.sosadl.sosADL.ComplexName;
import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.sosADL.ConnectionType;
import org.archware.sosadl.sosADL.Constituent;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.sosADL.DoExprBehavior;
import org.archware.sosadl.sosADL.DoExprProtocol;
import org.archware.sosadl.sosADL.DoneBehavior;
import org.archware.sosadl.sosADL.DoneProtocol;
import org.archware.sosadl.sosADL.DutyDecl;
import org.archware.sosadl.sosADL.ElementInConstituent;
import org.archware.sosadl.sosADL.EntityBlock;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.Field;
import org.archware.sosadl.sosADL.FieldDecl;
import org.archware.sosadl.sosADL.ForEachBehavior;
import org.archware.sosadl.sosADL.ForEachProtocol;
import org.archware.sosadl.sosADL.FormalParameter;
import org.archware.sosadl.sosADL.FunctionDecl;
import org.archware.sosadl.sosADL.GateDecl;
import org.archware.sosadl.sosADL.IdentExpression;
import org.archware.sosadl.sosADL.IfThenElseBehavior;
import org.archware.sosadl.sosADL.IfThenElseProtocol;
import org.archware.sosadl.sosADL.Import;
import org.archware.sosadl.sosADL.IntegerType;
import org.archware.sosadl.sosADL.IntegerValue;
import org.archware.sosadl.sosADL.Library;
import org.archware.sosadl.sosADL.Map;
import org.archware.sosadl.sosADL.MediatorDecl;
import org.archware.sosadl.sosADL.MethodCall;
import org.archware.sosadl.sosADL.NamedType;
import org.archware.sosadl.sosADL.Protocol;
import org.archware.sosadl.sosADL.ProtocolAction;
import org.archware.sosadl.sosADL.ProtocolActionSuite;
import org.archware.sosadl.sosADL.ProtocolDecl;
import org.archware.sosadl.sosADL.ProtocolStatement;
import org.archware.sosadl.sosADL.Quantify;
import org.archware.sosadl.sosADL.RangeType;
import org.archware.sosadl.sosADL.ReceiveAction;
import org.archware.sosadl.sosADL.ReceiveAnyProtocolAction;
import org.archware.sosadl.sosADL.ReceiveProtocolAction;
import org.archware.sosadl.sosADL.RecursiveCall;
import org.archware.sosadl.sosADL.Relay;
import org.archware.sosadl.sosADL.RepeatBehavior;
import org.archware.sosadl.sosADL.RepeatProtocol;
import org.archware.sosadl.sosADL.Select;
import org.archware.sosadl.sosADL.SendAction;
import org.archware.sosadl.sosADL.SendProtocolAction;
import org.archware.sosadl.sosADL.Sequence;
import org.archware.sosadl.sosADL.SequenceType;
import org.archware.sosadl.sosADL.SoS;
import org.archware.sosadl.sosADL.SosADL;
import org.archware.sosadl.sosADL.SosADLFactory;
import org.archware.sosadl.sosADL.SosADLPackage;
import org.archware.sosadl.sosADL.SystemDecl;
import org.archware.sosadl.sosADL.TellAssertion;
import org.archware.sosadl.sosADL.Tuple;
import org.archware.sosadl.sosADL.TupleElement;
import org.archware.sosadl.sosADL.TupleType;
import org.archware.sosadl.sosADL.UnaryExpression;
import org.archware.sosadl.sosADL.Unify;
import org.archware.sosadl.sosADL.Unit;
import org.archware.sosadl.sosADL.UnobservableBehavior;
import org.archware.sosadl.sosADL.UntellAssertion;
import org.archware.sosadl.sosADL.Valuing;
import org.archware.sosadl.sosADL.ValuingBehavior;
import org.archware.sosadl.sosADL.ValuingProtocol;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class SosADLFactoryAdapter extends EFactoryImpl implements SosADLFactory {
  private BaseSosADLMTAdaptersFactory adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  
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
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE;
  }
}
