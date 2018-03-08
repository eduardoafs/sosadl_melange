package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.MethodCall;
import org.archware.sosadl.sosADL.Expression;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MethodCallAdapter extends EObjectAdapter<MethodCall> implements org.archware.sosadl.sosADL.MethodCall {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public MethodCallAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getMethod() {
    return adaptee.getMethod();
  }
  
  @Override
  public void setMethod(final String o) {
    adaptee.setMethod(o);
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
  
  private EList<Expression> parameters_;
  
  @Override
  public EList<Expression> getParameters() {
    if (parameters_ == null)
    	parameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParameters(), adaptersFactory, eResource);
    return parameters_;
  }
  
  protected final static String METHOD_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getMethodCall();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.METHOD_CALL__OBJECT:
    		return getObject();
    	case org.archware.sosadl.sosADL.SosADLPackage.METHOD_CALL__METHOD:
    		return getMethod();
    	case org.archware.sosadl.sosADL.SosADLPackage.METHOD_CALL__PARAMETERS:
    		return getParameters();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.METHOD_CALL__OBJECT:
    		return getObject() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.METHOD_CALL__METHOD:
    		return getMethod() != METHOD_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.METHOD_CALL__PARAMETERS:
    		return getParameters() != null && !getParameters().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.METHOD_CALL__OBJECT:
    		setObject(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.METHOD_CALL__METHOD:
    		setMethod(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.METHOD_CALL__PARAMETERS:
    		getParameters().clear();
    		getParameters().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
