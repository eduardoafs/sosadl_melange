package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.AssertionDecl;
import org.archware.sosadl.sosADL.Protocol;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AssertionDeclAdapter extends EObjectAdapter<AssertionDecl> implements org.archware.sosadl.sosADL.AssertionDecl {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public AssertionDeclAdapter() {
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
  public Protocol getBody() {
    return (Protocol) adaptersFactory.createAdapter(adaptee.getBody(), eResource);
  }
  
  @Override
  public void setBody(final Protocol o) {
    if (o != null)
    	adaptee.setBody(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ProtocolAdapter) o).getAdaptee());
    else adaptee.setBody(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getAssertionDecl();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.ASSERTION_DECL__NAME:
    		return getName();
    	case org.archware.sosadl.sosADL.SosADLPackage.ASSERTION_DECL__BODY:
    		return getBody();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.ASSERTION_DECL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.ASSERTION_DECL__BODY:
    		return getBody() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.ASSERTION_DECL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.ASSERTION_DECL__BODY:
    		setBody(
    		(org.archware.sosadl.sosADL.Protocol)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
