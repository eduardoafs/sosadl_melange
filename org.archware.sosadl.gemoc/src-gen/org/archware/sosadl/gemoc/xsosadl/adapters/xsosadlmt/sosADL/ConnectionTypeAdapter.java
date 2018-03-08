package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ConnectionType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ConnectionTypeAdapter extends EObjectAdapter<ConnectionType> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.ConnectionType {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ConnectionTypeAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ModeType getMode() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType.get(adaptee.getMode().getValue());
  }
  
  @Override
  public void setMode(final ModeType o) {
    adaptee.setMode(org.archware.sosadl.gemoc.xsosadl.sosADL.ModeType.get(o.getValue()));
  }
  
  @Override
  public DataType getType() {
    return (DataType) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final DataType o) {
    if (o != null)
    	adaptee.setType(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  protected final static ModeType MODE_EDEFAULT = org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType.MODE_TYPE_IN;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getConnectionType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION_TYPE__MODE:
    		return getMode();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION_TYPE__TYPE:
    		return getType();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION_TYPE__MODE:
    		return getMode() != MODE_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION_TYPE__TYPE:
    		return getType() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION_TYPE__MODE:
    		setMode(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION_TYPE__TYPE:
    		setType(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}