package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Unify;
import org.archware.sosadl.sosADL.ComplexName;
import org.archware.sosadl.sosADL.Multiplicity;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class UnifyAdapter extends EObjectAdapter<Unify> implements org.archware.sosadl.sosADL.Unify {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public UnifyAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Multiplicity getMultLeft() {
    return org.archware.sosadl.sosADL.Multiplicity.get(adaptee.getMultLeft().getValue());
  }
  
  @Override
  public void setMultLeft(final Multiplicity o) {
    adaptee.setMultLeft(org.archware.sosadl.gemoc.xsosadl.sosADL.Multiplicity.get(o.getValue()));
  }
  
  @Override
  public Multiplicity getMultRight() {
    return org.archware.sosadl.sosADL.Multiplicity.get(adaptee.getMultRight().getValue());
  }
  
  @Override
  public void setMultRight(final Multiplicity o) {
    adaptee.setMultRight(org.archware.sosadl.gemoc.xsosadl.sosADL.Multiplicity.get(o.getValue()));
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
  
  protected final static Multiplicity MULT_LEFT_EDEFAULT = org.archware.sosadl.sosADL.Multiplicity.MULTIPLICITY_ONE;
  
  protected final static Multiplicity MULT_RIGHT_EDEFAULT = org.archware.sosadl.sosADL.Multiplicity.MULTIPLICITY_ONE;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getUnify();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__MULT_LEFT:
    		return getMultLeft();
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__CONN_LEFT:
    		return getConnLeft();
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__MULT_RIGHT:
    		return getMultRight();
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__CONN_RIGHT:
    		return getConnRight();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__MULT_LEFT:
    		return getMultLeft() != MULT_LEFT_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__CONN_LEFT:
    		return getConnLeft() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__MULT_RIGHT:
    		return getMultRight() != MULT_RIGHT_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__CONN_RIGHT:
    		return getConnRight() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__MULT_LEFT:
    		setMultLeft(
    		(org.archware.sosadl.sosADL.Multiplicity)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__CONN_LEFT:
    		setConnLeft(
    		(org.archware.sosadl.sosADL.ComplexName)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__MULT_RIGHT:
    		setMultRight(
    		(org.archware.sosadl.sosADL.Multiplicity)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIFY__CONN_RIGHT:
    		setConnRight(
    		(org.archware.sosadl.sosADL.ComplexName)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
