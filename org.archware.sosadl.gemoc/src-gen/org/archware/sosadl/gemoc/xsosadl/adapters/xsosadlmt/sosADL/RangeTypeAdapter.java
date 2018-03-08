package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.RangeType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class RangeTypeAdapter extends EObjectAdapter<RangeType> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.RangeType {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public RangeTypeAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getVmin() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getVmin(), eResource);
  }
  
  @Override
  public void setVmin(final Expression o) {
    if (o != null)
    	adaptee.setVmin(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setVmin(null);
  }
  
  @Override
  public Expression getVmax() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getVmax(), eResource);
  }
  
  @Override
  public void setVmax(final Expression o) {
    if (o != null)
    	adaptee.setVmax(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setVmax(null);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getRangeType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.RANGE_TYPE__VMIN:
    		return getVmin();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.RANGE_TYPE__VMAX:
    		return getVmax();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.RANGE_TYPE__VMIN:
    		return getVmin() != null;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.RANGE_TYPE__VMAX:
    		return getVmax() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.RANGE_TYPE__VMIN:
    		setVmin(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.RANGE_TYPE__VMAX:
    		setVmax(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
