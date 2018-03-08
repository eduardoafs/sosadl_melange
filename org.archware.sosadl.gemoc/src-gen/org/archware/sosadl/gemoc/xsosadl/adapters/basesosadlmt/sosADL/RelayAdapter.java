package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Relay;
import org.archware.sosadl.sosADL.ComplexName;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class RelayAdapter extends EObjectAdapter<Relay> implements org.archware.sosadl.sosADL.Relay {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public RelayAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComplexName getConnLeft() {
    return (ComplexName) adaptersFactory.createAdapter(adaptee.getConnLeft(), eResource);
  }
  
  @Override
  public void setConnLeft(final ComplexName o) {
    if (o != null)
    	adaptee.setConnLeft(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ComplexNameAdapter) o).getAdaptee());
    else adaptee.setConnLeft(null);
  }
  
  @Override
  public ComplexName getConnRight() {
    return (ComplexName) adaptersFactory.createAdapter(adaptee.getConnRight(), eResource);
  }
  
  @Override
  public void setConnRight(final ComplexName o) {
    if (o != null)
    	adaptee.setConnRight(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ComplexNameAdapter) o).getAdaptee());
    else adaptee.setConnRight(null);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getRelay();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.RELAY__CONN_LEFT:
    		return getConnLeft();
    	case org.archware.sosadl.sosADL.SosADLPackage.RELAY__CONN_RIGHT:
    		return getConnRight();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.RELAY__CONN_LEFT:
    		return getConnLeft() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.RELAY__CONN_RIGHT:
    		return getConnRight() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.RELAY__CONN_LEFT:
    		setConnLeft(
    		(org.archware.sosadl.sosADL.ComplexName)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.RELAY__CONN_RIGHT:
    		setConnRight(
    		(org.archware.sosadl.sosADL.ComplexName)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
