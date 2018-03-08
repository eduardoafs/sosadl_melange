package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ActionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ActionSuiteAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AnyActionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AnyAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ArchBehaviorDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ArchitectureDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AskAssertionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertBehaviorAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertProtocolAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertionDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorStatementAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BinaryExpressionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BooleanTypeAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.CallExpressionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ChooseBehaviorAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ChooseProtocolAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ComplexNameAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConnectionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConnectionTypeAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConstituentAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoExprBehaviorAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoExprProtocolAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoneBehaviorAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoneProtocolAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DutyDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ElementInConstituentAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.EntityBlockAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FieldAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FieldDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ForEachBehaviorAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ForEachProtocolAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FormalParameterAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FunctionDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.GateDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IdentExpressionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IfThenElseBehaviorAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IfThenElseProtocolAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ImportAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IntegerTypeAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IntegerValueAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.LibraryAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MapAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MediatorDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MethodCallAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.NamedTypeAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolActionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolActionSuiteAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolStatementAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.QuantifyAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RangeTypeAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveActionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveAnyProtocolActionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveProtocolActionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RecursiveCallAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RelayAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RepeatBehaviorAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RepeatProtocolAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SelectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SendActionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SendProtocolActionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SequenceAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SequenceTypeAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SoSAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SosADLAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SystemDeclAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TellAssertionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleElementAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleTypeAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnaryExpressionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnifyAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnitAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnobservableBehaviorAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UntellAssertionAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingBehaviorAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingProtocolAdapter;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Action;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ActionSuite;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Any;
import org.archware.sosadl.gemoc.xsosadl.sosADL.AnyAction;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ArchBehaviorDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ArchitectureDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.AskAssertion;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Assert;
import org.archware.sosadl.gemoc.xsosadl.sosADL.AssertBehavior;
import org.archware.sosadl.gemoc.xsosadl.sosADL.AssertProtocol;
import org.archware.sosadl.gemoc.xsosadl.sosADL.AssertionDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Behavior;
import org.archware.sosadl.gemoc.xsosadl.sosADL.BehaviorDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.BehaviorStatement;
import org.archware.sosadl.gemoc.xsosadl.sosADL.BinaryExpression;
import org.archware.sosadl.gemoc.xsosadl.sosADL.BooleanType;
import org.archware.sosadl.gemoc.xsosadl.sosADL.CallExpression;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ChooseBehavior;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ChooseProtocol;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ComplexName;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Connection;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ConnectionType;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Constituent;
import org.archware.sosadl.gemoc.xsosadl.sosADL.DataType;
import org.archware.sosadl.gemoc.xsosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.DoExprBehavior;
import org.archware.sosadl.gemoc.xsosadl.sosADL.DoExprProtocol;
import org.archware.sosadl.gemoc.xsosadl.sosADL.DoneBehavior;
import org.archware.sosadl.gemoc.xsosadl.sosADL.DoneProtocol;
import org.archware.sosadl.gemoc.xsosadl.sosADL.DutyDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ElementInConstituent;
import org.archware.sosadl.gemoc.xsosadl.sosADL.EntityBlock;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Expression;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Field;
import org.archware.sosadl.gemoc.xsosadl.sosADL.FieldDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ForEachBehavior;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ForEachProtocol;
import org.archware.sosadl.gemoc.xsosadl.sosADL.FormalParameter;
import org.archware.sosadl.gemoc.xsosadl.sosADL.FunctionDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.GateDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.IdentExpression;
import org.archware.sosadl.gemoc.xsosadl.sosADL.IfThenElseBehavior;
import org.archware.sosadl.gemoc.xsosadl.sosADL.IfThenElseProtocol;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Import;
import org.archware.sosadl.gemoc.xsosadl.sosADL.IntegerType;
import org.archware.sosadl.gemoc.xsosadl.sosADL.IntegerValue;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Library;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Map;
import org.archware.sosadl.gemoc.xsosadl.sosADL.MediatorDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.MethodCall;
import org.archware.sosadl.gemoc.xsosadl.sosADL.NamedType;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Protocol;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolAction;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolActionSuite;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolStatement;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Quantify;
import org.archware.sosadl.gemoc.xsosadl.sosADL.RangeType;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ReceiveAction;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ReceiveAnyProtocolAction;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ReceiveProtocolAction;
import org.archware.sosadl.gemoc.xsosadl.sosADL.RecursiveCall;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Relay;
import org.archware.sosadl.gemoc.xsosadl.sosADL.RepeatBehavior;
import org.archware.sosadl.gemoc.xsosadl.sosADL.RepeatProtocol;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Select;
import org.archware.sosadl.gemoc.xsosadl.sosADL.SendAction;
import org.archware.sosadl.gemoc.xsosadl.sosADL.SendProtocolAction;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Sequence;
import org.archware.sosadl.gemoc.xsosadl.sosADL.SequenceType;
import org.archware.sosadl.gemoc.xsosadl.sosADL.SoS;
import org.archware.sosadl.gemoc.xsosadl.sosADL.SosADL;
import org.archware.sosadl.gemoc.xsosadl.sosADL.SystemDecl;
import org.archware.sosadl.gemoc.xsosadl.sosADL.TellAssertion;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Tuple;
import org.archware.sosadl.gemoc.xsosadl.sosADL.TupleElement;
import org.archware.sosadl.gemoc.xsosadl.sosADL.TupleType;
import org.archware.sosadl.gemoc.xsosadl.sosADL.UnaryExpression;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Unify;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Unit;
import org.archware.sosadl.gemoc.xsosadl.sosADL.UnobservableBehavior;
import org.archware.sosadl.gemoc.xsosadl.sosADL.UntellAssertion;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Valuing;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ValuingBehavior;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ValuingProtocol;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class XSosadlMTAdaptersFactory implements AdaptersFactory {
  private static XSosadlMTAdaptersFactory instance;
  
  public static XSosadlMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XSosadlMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.SosADL){
    	return createSosADLAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.SosADL) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Import){
    	return createImportAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Import) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Unit){
    	return createUnitAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Unit) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.EntityBlock){
    	return createEntityBlockAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.EntityBlock) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.SystemDecl){
    	return createSystemDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.SystemDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ArchitectureDecl){
    	return createArchitectureDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ArchitectureDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.MediatorDecl){
    	return createMediatorDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.MediatorDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.GateDecl){
    	return createGateDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.GateDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.DutyDecl){
    	return createDutyDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.DutyDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Connection){
    	return createConnectionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Connection) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.AssertionDecl){
    	return createAssertionDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.AssertionDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolDecl){
    	return createProtocolDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Protocol){
    	return createProtocolAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Protocol) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolAction){
    	return createProtocolActionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolAction) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolStatement){
    	return createProtocolStatementAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolStatement) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolActionSuite){
    	return createProtocolActionSuiteAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolActionSuite) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.BehaviorDecl){
    	return createBehaviorDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.BehaviorDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Behavior){
    	return createBehaviorAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Behavior) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Action){
    	return createActionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Action) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.BehaviorStatement){
    	return createBehaviorStatementAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.BehaviorStatement) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Assert){
    	return createAssertAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Assert) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ActionSuite){
    	return createActionSuiteAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ActionSuite) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ArchBehaviorDecl){
    	return createArchBehaviorDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ArchBehaviorDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Constituent){
    	return createConstituentAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Constituent) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Expression){
    	return createExpressionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Expression) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ElementInConstituent){
    	return createElementInConstituentAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ElementInConstituent) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.DataTypeDecl){
    	return createDataTypeDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.DataTypeDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.DataType){
    	return createDataTypeAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.DataType) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.FunctionDecl){
    	return createFunctionDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.FunctionDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.FormalParameter){
    	return createFormalParameterAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.FormalParameter) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.FieldDecl){
    	return createFieldDeclAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.FieldDecl) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ComplexName){
    	return createComplexNameAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ComplexName) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Valuing){
    	return createValuingAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Valuing) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.IntegerValue){
    	return createIntegerValueAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.IntegerValue) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.TupleElement){
    	return createTupleElementAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.TupleElement) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.UnaryExpression){
    	return createUnaryExpressionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.UnaryExpression) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Library){
    	return createLibraryAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Library) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.SoS){
    	return createSoSAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.SoS) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ValuingProtocol){
    	return createValuingProtocolAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ValuingProtocol) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.AssertProtocol){
    	return createAssertProtocolAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.AssertProtocol) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.AnyAction){
    	return createAnyActionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.AnyAction) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.RepeatProtocol){
    	return createRepeatProtocolAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.RepeatProtocol) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.IfThenElseProtocol){
    	return createIfThenElseProtocolAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.IfThenElseProtocol) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ChooseProtocol){
    	return createChooseProtocolAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ChooseProtocol) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ForEachProtocol){
    	return createForEachProtocolAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ForEachProtocol) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.DoExprProtocol){
    	return createDoExprProtocolAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.DoExprProtocol) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.DoneProtocol){
    	return createDoneProtocolAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.DoneProtocol) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.SendProtocolAction){
    	return createSendProtocolActionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.SendProtocolAction) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ReceiveAnyProtocolAction){
    	return createReceiveAnyProtocolActionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ReceiveAnyProtocolAction) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ReceiveProtocolAction){
    	return createReceiveProtocolActionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ReceiveProtocolAction) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ValuingBehavior){
    	return createValuingBehaviorAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ValuingBehavior) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.AssertBehavior){
    	return createAssertBehaviorAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.AssertBehavior) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.RepeatBehavior){
    	return createRepeatBehaviorAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.RepeatBehavior) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.IfThenElseBehavior){
    	return createIfThenElseBehaviorAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.IfThenElseBehavior) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ChooseBehavior){
    	return createChooseBehaviorAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ChooseBehavior) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ForEachBehavior){
    	return createForEachBehaviorAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ForEachBehavior) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.DoExprBehavior){
    	return createDoExprBehaviorAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.DoExprBehavior) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.DoneBehavior){
    	return createDoneBehaviorAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.DoneBehavior) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.RecursiveCall){
    	return createRecursiveCallAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.RecursiveCall) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.UnobservableBehavior){
    	return createUnobservableBehaviorAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.UnobservableBehavior) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.TellAssertion){
    	return createTellAssertionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.TellAssertion) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.UntellAssertion){
    	return createUntellAssertionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.UntellAssertion) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.AskAssertion){
    	return createAskAssertionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.AskAssertion) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.SendAction){
    	return createSendActionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.SendAction) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ReceiveAction){
    	return createReceiveActionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ReceiveAction) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Relay){
    	return createRelayAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Relay) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Unify){
    	return createUnifyAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Unify) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Quantify){
    	return createQuantifyAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Quantify) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.NamedType){
    	return createNamedTypeAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.NamedType) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.IntegerType){
    	return createIntegerTypeAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.IntegerType) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.TupleType){
    	return createTupleTypeAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.TupleType) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.SequenceType){
    	return createSequenceTypeAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.SequenceType) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.RangeType){
    	return createRangeTypeAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.RangeType) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.ConnectionType){
    	return createConnectionTypeAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.ConnectionType) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Any){
    	return createAnyAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Any) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Tuple){
    	return createTupleAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Tuple) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Sequence){
    	return createSequenceAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Sequence) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.BinaryExpression){
    	return createBinaryExpressionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.BinaryExpression) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.IdentExpression){
    	return createIdentExpressionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.IdentExpression) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.CallExpression){
    	return createCallExpressionAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.CallExpression) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Field){
    	return createFieldAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Field) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Select){
    	return createSelectAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Select) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.Map){
    	return createMapAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.Map) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.MethodCall){
    	return createMethodCallAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.MethodCall) o, res);
    }
    if (o instanceof org.archware.sosadl.gemoc.xsosadl.sosADL.BooleanType){
    	return createBooleanTypeAdapter((org.archware.sosadl.gemoc.xsosadl.sosADL.BooleanType) o, res);
    }
    
    return null;
  }
  
  public SosADLAdapter createSosADLAdapter(final SosADL adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SosADLAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SosADLAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SosADLAdapter) adapter;
    }
  }
  
  public ImportAdapter createImportAdapter(final Import adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ImportAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ImportAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ImportAdapter) adapter;
    }
  }
  
  public UnitAdapter createUnitAdapter(final Unit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnitAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnitAdapter) adapter;
    }
  }
  
  public EntityBlockAdapter createEntityBlockAdapter(final EntityBlock adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.EntityBlockAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.EntityBlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.EntityBlockAdapter) adapter;
    }
  }
  
  public SystemDeclAdapter createSystemDeclAdapter(final SystemDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SystemDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SystemDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SystemDeclAdapter) adapter;
    }
  }
  
  public ArchitectureDeclAdapter createArchitectureDeclAdapter(final ArchitectureDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ArchitectureDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ArchitectureDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ArchitectureDeclAdapter) adapter;
    }
  }
  
  public MediatorDeclAdapter createMediatorDeclAdapter(final MediatorDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MediatorDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MediatorDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MediatorDeclAdapter) adapter;
    }
  }
  
  public GateDeclAdapter createGateDeclAdapter(final GateDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.GateDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.GateDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.GateDeclAdapter) adapter;
    }
  }
  
  public DutyDeclAdapter createDutyDeclAdapter(final DutyDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DutyDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DutyDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DutyDeclAdapter) adapter;
    }
  }
  
  public ConnectionAdapter createConnectionAdapter(final Connection adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConnectionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConnectionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConnectionAdapter) adapter;
    }
  }
  
  public AssertionDeclAdapter createAssertionDeclAdapter(final AssertionDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertionDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertionDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertionDeclAdapter) adapter;
    }
  }
  
  public ProtocolDeclAdapter createProtocolDeclAdapter(final ProtocolDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolDeclAdapter) adapter;
    }
  }
  
  public ProtocolAdapter createProtocolAdapter(final Protocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolAdapter) adapter;
    }
  }
  
  public ProtocolStatementAdapter createProtocolStatementAdapter(final ProtocolStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolStatementAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolStatementAdapter) adapter;
    }
  }
  
  public ProtocolActionAdapter createProtocolActionAdapter(final ProtocolAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolActionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolActionAdapter) adapter;
    }
  }
  
  public ProtocolActionSuiteAdapter createProtocolActionSuiteAdapter(final ProtocolActionSuite adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolActionSuiteAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolActionSuiteAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolActionSuiteAdapter) adapter;
    }
  }
  
  public BehaviorDeclAdapter createBehaviorDeclAdapter(final BehaviorDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorDeclAdapter) adapter;
    }
  }
  
  public BehaviorAdapter createBehaviorAdapter(final Behavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorAdapter) adapter;
    }
  }
  
  public BehaviorStatementAdapter createBehaviorStatementAdapter(final BehaviorStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorStatementAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorStatementAdapter) adapter;
    }
  }
  
  public AssertAdapter createAssertAdapter(final Assert adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertAdapter) adapter;
    }
  }
  
  public ActionAdapter createActionAdapter(final Action adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ActionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ActionAdapter) adapter;
    }
  }
  
  public ActionSuiteAdapter createActionSuiteAdapter(final ActionSuite adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ActionSuiteAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ActionSuiteAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ActionSuiteAdapter) adapter;
    }
  }
  
  public ArchBehaviorDeclAdapter createArchBehaviorDeclAdapter(final ArchBehaviorDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ArchBehaviorDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ArchBehaviorDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ArchBehaviorDeclAdapter) adapter;
    }
  }
  
  public ConstituentAdapter createConstituentAdapter(final Constituent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConstituentAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConstituentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConstituentAdapter) adapter;
    }
  }
  
  public ExpressionAdapter createExpressionAdapter(final Expression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter) adapter;
    }
  }
  
  public ElementInConstituentAdapter createElementInConstituentAdapter(final ElementInConstituent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ElementInConstituentAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ElementInConstituentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ElementInConstituentAdapter) adapter;
    }
  }
  
  public DataTypeDeclAdapter createDataTypeDeclAdapter(final DataTypeDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeDeclAdapter) adapter;
    }
  }
  
  public DataTypeAdapter createDataTypeAdapter(final DataType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeAdapter) adapter;
    }
  }
  
  public FunctionDeclAdapter createFunctionDeclAdapter(final FunctionDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FunctionDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FunctionDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FunctionDeclAdapter) adapter;
    }
  }
  
  public FormalParameterAdapter createFormalParameterAdapter(final FormalParameter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FormalParameterAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FormalParameterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FormalParameterAdapter) adapter;
    }
  }
  
  public FieldDeclAdapter createFieldDeclAdapter(final FieldDecl adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FieldDeclAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FieldDeclAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FieldDeclAdapter) adapter;
    }
  }
  
  public ComplexNameAdapter createComplexNameAdapter(final ComplexName adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ComplexNameAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ComplexNameAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ComplexNameAdapter) adapter;
    }
  }
  
  public ValuingAdapter createValuingAdapter(final Valuing adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingAdapter) adapter;
    }
  }
  
  public IntegerValueAdapter createIntegerValueAdapter(final IntegerValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IntegerValueAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IntegerValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IntegerValueAdapter) adapter;
    }
  }
  
  public TupleElementAdapter createTupleElementAdapter(final TupleElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleElementAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleElementAdapter) adapter;
    }
  }
  
  public UnaryExpressionAdapter createUnaryExpressionAdapter(final UnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnaryExpressionAdapter) adapter;
    }
  }
  
  public LibraryAdapter createLibraryAdapter(final Library adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.LibraryAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.LibraryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.LibraryAdapter) adapter;
    }
  }
  
  public SoSAdapter createSoSAdapter(final SoS adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SoSAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SoSAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SoSAdapter) adapter;
    }
  }
  
  public ValuingProtocolAdapter createValuingProtocolAdapter(final ValuingProtocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingProtocolAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingProtocolAdapter) adapter;
    }
  }
  
  public AssertProtocolAdapter createAssertProtocolAdapter(final AssertProtocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertProtocolAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertProtocolAdapter) adapter;
    }
  }
  
  public AnyActionAdapter createAnyActionAdapter(final AnyAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AnyActionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AnyActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AnyActionAdapter) adapter;
    }
  }
  
  public RepeatProtocolAdapter createRepeatProtocolAdapter(final RepeatProtocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RepeatProtocolAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RepeatProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RepeatProtocolAdapter) adapter;
    }
  }
  
  public IfThenElseProtocolAdapter createIfThenElseProtocolAdapter(final IfThenElseProtocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IfThenElseProtocolAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IfThenElseProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IfThenElseProtocolAdapter) adapter;
    }
  }
  
  public ChooseProtocolAdapter createChooseProtocolAdapter(final ChooseProtocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ChooseProtocolAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ChooseProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ChooseProtocolAdapter) adapter;
    }
  }
  
  public ForEachProtocolAdapter createForEachProtocolAdapter(final ForEachProtocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ForEachProtocolAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ForEachProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ForEachProtocolAdapter) adapter;
    }
  }
  
  public DoExprProtocolAdapter createDoExprProtocolAdapter(final DoExprProtocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoExprProtocolAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoExprProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoExprProtocolAdapter) adapter;
    }
  }
  
  public DoneProtocolAdapter createDoneProtocolAdapter(final DoneProtocol adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoneProtocolAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoneProtocolAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoneProtocolAdapter) adapter;
    }
  }
  
  public SendProtocolActionAdapter createSendProtocolActionAdapter(final SendProtocolAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SendProtocolActionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SendProtocolActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SendProtocolActionAdapter) adapter;
    }
  }
  
  public ReceiveAnyProtocolActionAdapter createReceiveAnyProtocolActionAdapter(final ReceiveAnyProtocolAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveAnyProtocolActionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveAnyProtocolActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveAnyProtocolActionAdapter) adapter;
    }
  }
  
  public ReceiveProtocolActionAdapter createReceiveProtocolActionAdapter(final ReceiveProtocolAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveProtocolActionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveProtocolActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveProtocolActionAdapter) adapter;
    }
  }
  
  public ValuingBehaviorAdapter createValuingBehaviorAdapter(final ValuingBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingBehaviorAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingBehaviorAdapter) adapter;
    }
  }
  
  public AssertBehaviorAdapter createAssertBehaviorAdapter(final AssertBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertBehaviorAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AssertBehaviorAdapter) adapter;
    }
  }
  
  public RepeatBehaviorAdapter createRepeatBehaviorAdapter(final RepeatBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RepeatBehaviorAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RepeatBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RepeatBehaviorAdapter) adapter;
    }
  }
  
  public IfThenElseBehaviorAdapter createIfThenElseBehaviorAdapter(final IfThenElseBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IfThenElseBehaviorAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IfThenElseBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IfThenElseBehaviorAdapter) adapter;
    }
  }
  
  public ChooseBehaviorAdapter createChooseBehaviorAdapter(final ChooseBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ChooseBehaviorAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ChooseBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ChooseBehaviorAdapter) adapter;
    }
  }
  
  public ForEachBehaviorAdapter createForEachBehaviorAdapter(final ForEachBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ForEachBehaviorAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ForEachBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ForEachBehaviorAdapter) adapter;
    }
  }
  
  public DoExprBehaviorAdapter createDoExprBehaviorAdapter(final DoExprBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoExprBehaviorAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoExprBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoExprBehaviorAdapter) adapter;
    }
  }
  
  public DoneBehaviorAdapter createDoneBehaviorAdapter(final DoneBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoneBehaviorAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoneBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DoneBehaviorAdapter) adapter;
    }
  }
  
  public RecursiveCallAdapter createRecursiveCallAdapter(final RecursiveCall adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RecursiveCallAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RecursiveCallAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RecursiveCallAdapter) adapter;
    }
  }
  
  public UnobservableBehaviorAdapter createUnobservableBehaviorAdapter(final UnobservableBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnobservableBehaviorAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnobservableBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnobservableBehaviorAdapter) adapter;
    }
  }
  
  public TellAssertionAdapter createTellAssertionAdapter(final TellAssertion adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TellAssertionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TellAssertionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TellAssertionAdapter) adapter;
    }
  }
  
  public UntellAssertionAdapter createUntellAssertionAdapter(final UntellAssertion adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UntellAssertionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UntellAssertionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UntellAssertionAdapter) adapter;
    }
  }
  
  public AskAssertionAdapter createAskAssertionAdapter(final AskAssertion adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AskAssertionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AskAssertionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AskAssertionAdapter) adapter;
    }
  }
  
  public SendActionAdapter createSendActionAdapter(final SendAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SendActionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SendActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SendActionAdapter) adapter;
    }
  }
  
  public ReceiveActionAdapter createReceiveActionAdapter(final ReceiveAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveActionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ReceiveActionAdapter) adapter;
    }
  }
  
  public RelayAdapter createRelayAdapter(final Relay adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RelayAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RelayAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RelayAdapter) adapter;
    }
  }
  
  public UnifyAdapter createUnifyAdapter(final Unify adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnifyAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnifyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.UnifyAdapter) adapter;
    }
  }
  
  public QuantifyAdapter createQuantifyAdapter(final Quantify adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.QuantifyAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.QuantifyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.QuantifyAdapter) adapter;
    }
  }
  
  public NamedTypeAdapter createNamedTypeAdapter(final NamedType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.NamedTypeAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.NamedTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.NamedTypeAdapter) adapter;
    }
  }
  
  public IntegerTypeAdapter createIntegerTypeAdapter(final IntegerType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IntegerTypeAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IntegerTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IntegerTypeAdapter) adapter;
    }
  }
  
  public TupleTypeAdapter createTupleTypeAdapter(final TupleType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleTypeAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleTypeAdapter) adapter;
    }
  }
  
  public SequenceTypeAdapter createSequenceTypeAdapter(final SequenceType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SequenceTypeAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SequenceTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SequenceTypeAdapter) adapter;
    }
  }
  
  public RangeTypeAdapter createRangeTypeAdapter(final RangeType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RangeTypeAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RangeTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.RangeTypeAdapter) adapter;
    }
  }
  
  public ConnectionTypeAdapter createConnectionTypeAdapter(final ConnectionType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConnectionTypeAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConnectionTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ConnectionTypeAdapter) adapter;
    }
  }
  
  public AnyAdapter createAnyAdapter(final Any adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AnyAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AnyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.AnyAdapter) adapter;
    }
  }
  
  public TupleAdapter createTupleAdapter(final Tuple adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.TupleAdapter) adapter;
    }
  }
  
  public SequenceAdapter createSequenceAdapter(final Sequence adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SequenceAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SequenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SequenceAdapter) adapter;
    }
  }
  
  public BinaryExpressionAdapter createBinaryExpressionAdapter(final BinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BinaryExpressionAdapter) adapter;
    }
  }
  
  public IdentExpressionAdapter createIdentExpressionAdapter(final IdentExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IdentExpressionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IdentExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.IdentExpressionAdapter) adapter;
    }
  }
  
  public CallExpressionAdapter createCallExpressionAdapter(final CallExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.CallExpressionAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.CallExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.CallExpressionAdapter) adapter;
    }
  }
  
  public FieldAdapter createFieldAdapter(final Field adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FieldAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FieldAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FieldAdapter) adapter;
    }
  }
  
  public SelectAdapter createSelectAdapter(final Select adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SelectAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SelectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.SelectAdapter) adapter;
    }
  }
  
  public MapAdapter createMapAdapter(final Map adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MapAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MapAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MapAdapter) adapter;
    }
  }
  
  public MethodCallAdapter createMethodCallAdapter(final MethodCall adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MethodCallAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MethodCallAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.MethodCallAdapter) adapter;
    }
  }
  
  public BooleanTypeAdapter createBooleanTypeAdapter(final BooleanType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BooleanTypeAdapter) adapter;
    else {
    	adapter = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BooleanTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BooleanTypeAdapter) adapter;
    }
  }
}
