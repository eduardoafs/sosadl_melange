package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.BehaviorDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BehaviorDeclAdapter extends EObjectAdapter<BehaviorDecl> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorDecl {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public BehaviorDeclAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
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
  public Behavior getBody() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getBody(), eResource);
  }
  
  @Override
  public void setBody(final Behavior o) {
    if (o != null)
    	adaptee.setBody(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorAdapter) o).getAdaptee());
    else adaptee.setBody(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getBehaviorDecl();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.BEHAVIOR_DECL__NAME:
    		return getName();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.BEHAVIOR_DECL__BODY:
    		return getBody();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.BEHAVIOR_DECL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.BEHAVIOR_DECL__BODY:
    		return getBody() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.BEHAVIOR_DECL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.BEHAVIOR_DECL__BODY:
    		setBody(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
