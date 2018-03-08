package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ForEachBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ForEachBehaviorAdapter extends EObjectAdapter<ForEachBehavior> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.ForEachBehavior {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ForEachBehaviorAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getVariable() {
    return adaptee.getVariable();
  }
  
  @Override
  public void setVariable(final String o) {
    adaptee.setVariable(o);
  }
  
  @Override
  public Expression getSetOfValues() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getSetOfValues(), eResource);
  }
  
  @Override
  public void setSetOfValues(final Expression o) {
    if (o != null)
    	adaptee.setSetOfValues(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setSetOfValues(null);
  }
  
  @Override
  public Behavior getRepeated() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getRepeated(), eResource);
  }
  
  @Override
  public void setRepeated(final Behavior o) {
    if (o != null)
    	adaptee.setRepeated(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorAdapter) o).getAdaptee());
    else adaptee.setRepeated(null);
  }
  
  protected final static String VARIABLE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getForEachBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FOR_EACH_BEHAVIOR__VARIABLE:
    		return getVariable();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FOR_EACH_BEHAVIOR__SET_OF_VALUES:
    		return getSetOfValues();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FOR_EACH_BEHAVIOR__REPEATED:
    		return getRepeated();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FOR_EACH_BEHAVIOR__VARIABLE:
    		return getVariable() != VARIABLE_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FOR_EACH_BEHAVIOR__SET_OF_VALUES:
    		return getSetOfValues() != null;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FOR_EACH_BEHAVIOR__REPEATED:
    		return getRepeated() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FOR_EACH_BEHAVIOR__VARIABLE:
    		setVariable(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FOR_EACH_BEHAVIOR__SET_OF_VALUES:
    		setSetOfValues(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FOR_EACH_BEHAVIOR__REPEATED:
    		setRepeated(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
