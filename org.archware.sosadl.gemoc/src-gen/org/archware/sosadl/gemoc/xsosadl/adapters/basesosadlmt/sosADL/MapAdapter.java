package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Map;
import org.archware.sosadl.sosADL.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MapAdapter extends EObjectAdapter<Map> implements org.archware.sosadl.sosADL.Map {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public MapAdapter() {
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
  public Expression getExpression() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final Expression o) {
    if (o != null)
    	adaptee.setExpression(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  protected final static String VARIABLE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getMap();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.MAP__OBJECT:
    		return getObject();
    	case org.archware.sosadl.sosADL.SosADLPackage.MAP__VARIABLE:
    		return getVariable();
    	case org.archware.sosadl.sosADL.SosADLPackage.MAP__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.MAP__OBJECT:
    		return getObject() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.MAP__VARIABLE:
    		return getVariable() != VARIABLE_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.MAP__EXPRESSION:
    		return getExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.MAP__OBJECT:
    		setObject(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.MAP__VARIABLE:
    		setVariable(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.MAP__EXPRESSION:
    		setExpression(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
