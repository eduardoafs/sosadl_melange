package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Connection;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ConnectionAdapter extends EObjectAdapter<Connection> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ConnectionAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isEnvironment() {
    return adaptee.isEnvironment();
  }
  
  @Override
  public void setEnvironment(final boolean o) {
    adaptee.setEnvironment(o);
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
  public ModeType getMode() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType.get(adaptee.getMode().getValue());
  }
  
  @Override
  public void setMode(final ModeType o) {
    adaptee.setMode(org.archware.sosadl.gemoc.xsosadl.sosADL.ModeType.get(o.getValue()));
  }
  
  @Override
  public DataType getValueType() {
    return (DataType) adaptersFactory.createAdapter(adaptee.getValueType(), eResource);
  }
  
  @Override
  public void setValueType(final DataType o) {
    if (o != null)
    	adaptee.setValueType(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeAdapter) o).getAdaptee());
    else adaptee.setValueType(null);
  }
  
  @Override
  public void propagateValue() {
    org.archware.sosadl.gemoc.xsosadl.aspects.ConnectionAspect.propagateValue(adaptee);
  }
  
  protected final static boolean ENVIRONMENT_EDEFAULT = false;
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static ModeType MODE_EDEFAULT = org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType.MODE_TYPE_IN;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getConnection();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__ENVIRONMENT:
    		return isEnvironment() ? Boolean.TRUE : Boolean.FALSE;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__NAME:
    		return getName();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__MODE:
    		return getMode();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__VALUE_TYPE:
    		return getValueType();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__ENVIRONMENT:
    		return isEnvironment() != ENVIRONMENT_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__MODE:
    		return getMode() != MODE_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__VALUE_TYPE:
    		return getValueType() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__ENVIRONMENT:
    		setEnvironment(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__MODE:
    		setMode(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.ModeType)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CONNECTION__VALUE_TYPE:
    		setValueType(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
