package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.RepeatProtocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class RepeatProtocolAdapter extends EObjectAdapter<RepeatProtocol> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatProtocol {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public RepeatProtocolAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Protocol getRepeated() {
    return (Protocol) adaptersFactory.createAdapter(adaptee.getRepeated(), eResource);
  }
  
  @Override
  public void setRepeated(final Protocol o) {
    if (o != null)
    	adaptee.setRepeated(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ProtocolAdapter) o).getAdaptee());
    else adaptee.setRepeated(null);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getRepeatProtocol();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.REPEAT_PROTOCOL__REPEATED:
    		return getRepeated();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.REPEAT_PROTOCOL__REPEATED:
    		return getRepeated() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.REPEAT_PROTOCOL__REPEATED:
    		setRepeated(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
