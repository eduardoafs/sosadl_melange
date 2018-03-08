package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ElementInConstituent;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ElementInConstituentAdapter extends EObjectAdapter<ElementInConstituent> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.ElementInConstituent {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ElementInConstituentAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getVariable() {
    return adaptee.getVariable();
  }
  
  @Override
  public void setVariable(final String o) {
    adaptee.setVariable(o);
  }
  
  @Override
  public String getConstituent() {
    return adaptee.getConstituent();
  }
  
  @Override
  public void setConstituent(final String o) {
    adaptee.setConstituent(o);
  }
  
  protected final static String VARIABLE_EDEFAULT = null;
  
  protected final static String CONSTITUENT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getElementInConstituent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ELEMENT_IN_CONSTITUENT__VARIABLE:
    		return getVariable();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ELEMENT_IN_CONSTITUENT__CONSTITUENT:
    		return getConstituent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ELEMENT_IN_CONSTITUENT__VARIABLE:
    		return getVariable() != VARIABLE_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ELEMENT_IN_CONSTITUENT__CONSTITUENT:
    		return getConstituent() != CONSTITUENT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ELEMENT_IN_CONSTITUENT__VARIABLE:
    		setVariable(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ELEMENT_IN_CONSTITUENT__CONSTITUENT:
    		setConstituent(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
