package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.IfThenElseBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IfThenElseBehaviorAdapter extends EObjectAdapter<IfThenElseBehavior> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.IfThenElseBehavior {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public IfThenElseBehaviorAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getCondition() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Expression o) {
    if (o != null)
    	adaptee.setCondition(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public Behavior getIfTrue() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getIfTrue(), eResource);
  }
  
  @Override
  public void setIfTrue(final Behavior o) {
    if (o != null)
    	adaptee.setIfTrue(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorAdapter) o).getAdaptee());
    else adaptee.setIfTrue(null);
  }
  
  @Override
  public Behavior getIfFalse() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getIfFalse(), eResource);
  }
  
  @Override
  public void setIfFalse(final Behavior o) {
    if (o != null)
    	adaptee.setIfFalse(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorAdapter) o).getAdaptee());
    else adaptee.setIfFalse(null);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getIfThenElseBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IF_THEN_ELSE_BEHAVIOR__CONDITION:
    		return getCondition();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IF_THEN_ELSE_BEHAVIOR__IF_TRUE:
    		return getIfTrue();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IF_THEN_ELSE_BEHAVIOR__IF_FALSE:
    		return getIfFalse();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IF_THEN_ELSE_BEHAVIOR__CONDITION:
    		return getCondition() != null;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IF_THEN_ELSE_BEHAVIOR__IF_TRUE:
    		return getIfTrue() != null;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IF_THEN_ELSE_BEHAVIOR__IF_FALSE:
    		return getIfFalse() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IF_THEN_ELSE_BEHAVIOR__CONDITION:
    		setCondition(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IF_THEN_ELSE_BEHAVIOR__IF_TRUE:
    		setIfTrue(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IF_THEN_ELSE_BEHAVIOR__IF_FALSE:
    		setIfFalse(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
