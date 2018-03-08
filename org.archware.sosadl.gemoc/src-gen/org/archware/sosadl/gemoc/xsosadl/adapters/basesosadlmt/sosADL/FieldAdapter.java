package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Field;
import org.archware.sosadl.sosADL.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FieldAdapter extends EObjectAdapter<Field> implements org.archware.sosadl.sosADL.Field {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public FieldAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getField() {
    return adaptee.getField();
  }
  
  @Override
  public void setField(final String o) {
    adaptee.setField(o);
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
  
  protected final static String FIELD_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getField();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.FIELD__OBJECT:
    		return getObject();
    	case org.archware.sosadl.sosADL.SosADLPackage.FIELD__FIELD:
    		return getField();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.FIELD__OBJECT:
    		return getObject() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.FIELD__FIELD:
    		return getField() != FIELD_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.FIELD__OBJECT:
    		setObject(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.FIELD__FIELD:
    		setField(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
