package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.IntegerValue;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntegerValueAdapter extends EObjectAdapter<IntegerValue> implements org.archware.sosadl.sosADL.IntegerValue {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public IntegerValueAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getAbsInt() {
    return adaptee.getAbsInt();
  }
  
  @Override
  public void setAbsInt(final int o) {
    adaptee.setAbsInt(o);
  }
  
  protected final static int ABS_INT_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getIntegerValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.INTEGER_VALUE__ABS_INT:
    		return new java.lang.Integer(getAbsInt());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.INTEGER_VALUE__ABS_INT:
    		return getAbsInt() != ABS_INT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.INTEGER_VALUE__ABS_INT:
    		setAbsInt(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
