package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.DutyDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Connection;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ProtocolDecl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class DutyDeclAdapter extends EObjectAdapter<DutyDecl> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.DutyDecl {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public DutyDeclAdapter() {
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
  
  private EList<Connection> connections_;
  
  @Override
  public EList<Connection> getConnections() {
    if (connections_ == null)
    	connections_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConnections(), adaptersFactory, eResource);
    return connections_;
  }
  
  private EList<AssertionDecl> assertions_;
  
  @Override
  public EList<AssertionDecl> getAssertions() {
    if (assertions_ == null)
    	assertions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAssertions(), adaptersFactory, eResource);
    return assertions_;
  }
  
  private EList<ProtocolDecl> protocols_;
  
  @Override
  public EList<ProtocolDecl> getProtocols() {
    if (protocols_ == null)
    	protocols_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProtocols(), adaptersFactory, eResource);
    return protocols_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getDutyDecl();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__NAME:
    		return getName();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__CONNECTIONS:
    		return getConnections();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__ASSERTIONS:
    		return getAssertions();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__PROTOCOLS:
    		return getProtocols();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__CONNECTIONS:
    		return getConnections() != null && !getConnections().isEmpty();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__ASSERTIONS:
    		return getAssertions() != null && !getAssertions().isEmpty();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__PROTOCOLS:
    		return getProtocols() != null && !getProtocols().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__CONNECTIONS:
    		getConnections().clear();
    		getConnections().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__ASSERTIONS:
    		getAssertions().clear();
    		getAssertions().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.DUTY_DECL__PROTOCOLS:
    		getProtocols().clear();
    		getProtocols().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
