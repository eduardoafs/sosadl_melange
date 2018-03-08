package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Action;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ActionSuite;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ComplexName;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ActionAdapter extends EObjectAdapter<Action> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.Action {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ActionAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public ComplexName getComplexName() {
    return (ComplexName) adaptersFactory.createAdapter(adaptee.getComplexName(), eResource);
  }
  
  @Override
  public void setComplexName(final ComplexName o) {
    if (o != null)
    	adaptee.setComplexName(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ComplexNameAdapter) o).getAdaptee());
    else adaptee.setComplexName(null);
  }
  
  @Override
  public ActionSuite getSuite() {
    return (ActionSuite) adaptersFactory.createAdapter(adaptee.getSuite(), eResource);
  }
  
  @Override
  public void setSuite(final ActionSuite o) {
    if (o != null)
    	adaptee.setSuite(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ActionSuiteAdapter) o).getAdaptee());
    else adaptee.setSuite(null);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ACTION__COMPLEX_NAME:
    		return getComplexName();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ACTION__SUITE:
    		return getSuite();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ACTION__COMPLEX_NAME:
    		return getComplexName() != null;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ACTION__SUITE:
    		return getSuite() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ACTION__COMPLEX_NAME:
    		setComplexName(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.ComplexName)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ACTION__SUITE:
    		setSuite(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.ActionSuite)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
