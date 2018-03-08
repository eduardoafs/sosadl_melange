package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.RepeatBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class RepeatBehaviorAdapter extends EObjectAdapter<RepeatBehavior> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.RepeatBehavior {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public RepeatBehaviorAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Behavior getRepeated() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getRepeated(), eResource);
  }
  
  @Override
  public void setRepeated(final Behavior o) {
    if (o != null)
    	adaptee.setRepeated(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.BehaviorAdapter) o).getAdaptee());
    else adaptee.setRepeated(null);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getRepeatBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.REPEAT_BEHAVIOR__REPEATED:
    		return getRepeated();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.REPEAT_BEHAVIOR__REPEATED:
    		return getRepeated() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.REPEAT_BEHAVIOR__REPEATED:
    		setRepeated(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
