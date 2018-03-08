package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Select;
import org.archware.sosadl.sosADL.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class SelectAdapter extends EObjectAdapter<Select> implements org.archware.sosadl.sosADL.Select {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public SelectAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
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
  public Expression getObject() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getObject(), eResource);
  }
  
  @Override
  public void setObject(final Expression o) {
    if (o != null)
    	adaptee.setObject(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setObject(null);
  }
  
  @Override
  public Expression getCondition() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Expression o) {
    if (o != null)
    	adaptee.setCondition(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  protected final static String VARIABLE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getSelect();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SELECT__OBJECT:
    		return getObject();
    	case org.archware.sosadl.sosADL.SosADLPackage.SELECT__VARIABLE:
    		return getVariable();
    	case org.archware.sosadl.sosADL.SosADLPackage.SELECT__CONDITION:
    		return getCondition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SELECT__OBJECT:
    		return getObject() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.SELECT__VARIABLE:
    		return getVariable() != VARIABLE_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.SELECT__CONDITION:
    		return getCondition() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SELECT__OBJECT:
    		setObject(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.SELECT__VARIABLE:
    		setVariable(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.SELECT__CONDITION:
    		setCondition(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
