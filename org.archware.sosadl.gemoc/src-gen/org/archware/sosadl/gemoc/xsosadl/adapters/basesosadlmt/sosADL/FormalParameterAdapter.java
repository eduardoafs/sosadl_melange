package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.FormalParameter;
import org.archware.sosadl.sosADL.DataType;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FormalParameterAdapter extends EObjectAdapter<FormalParameter> implements org.archware.sosadl.sosADL.FormalParameter {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public FormalParameterAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public DataType getType() {
    return (DataType) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final DataType o) {
    if (o != null)
    	adaptee.setType(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.DataTypeAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getFormalParameter();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.FORMAL_PARAMETER__NAME:
    		return getName();
    	case org.archware.sosadl.sosADL.SosADLPackage.FORMAL_PARAMETER__TYPE:
    		return getType();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.FORMAL_PARAMETER__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.FORMAL_PARAMETER__TYPE:
    		return getType() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.FORMAL_PARAMETER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.FORMAL_PARAMETER__TYPE:
    		setType(
    		(org.archware.sosadl.sosADL.DataType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
