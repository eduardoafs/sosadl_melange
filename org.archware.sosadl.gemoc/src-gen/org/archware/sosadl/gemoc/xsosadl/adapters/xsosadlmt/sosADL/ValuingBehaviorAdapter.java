package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ValuingBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ValuingBehaviorAdapter extends EObjectAdapter<ValuingBehavior> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.ValuingBehavior {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ValuingBehaviorAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Valuing getValuing() {
    return (Valuing) adaptersFactory.createAdapter(adaptee.getValuing(), eResource);
  }
  
  @Override
  public void setValuing(final Valuing o) {
    if (o != null)
    	adaptee.setValuing(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ValuingAdapter) o).getAdaptee());
    else adaptee.setValuing(null);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getValuingBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.VALUING_BEHAVIOR__VALUING:
    		return getValuing();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.VALUING_BEHAVIOR__VALUING:
    		return getValuing() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.VALUING_BEHAVIOR__VALUING:
    		setValuing(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
