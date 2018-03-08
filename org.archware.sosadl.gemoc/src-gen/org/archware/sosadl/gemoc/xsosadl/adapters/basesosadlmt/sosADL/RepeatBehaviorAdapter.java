package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.RepeatBehavior;
import org.archware.sosadl.sosADL.Behavior;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class RepeatBehaviorAdapter extends EObjectAdapter<RepeatBehavior> implements org.archware.sosadl.sosADL.RepeatBehavior {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public RepeatBehaviorAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Behavior getRepeated() {
    return (Behavior) adaptersFactory.createAdapter(adaptee.getRepeated(), eResource);
  }
  
  @Override
  public void setRepeated(final Behavior o) {
    if (o != null)
    	adaptee.setRepeated(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.BehaviorAdapter) o).getAdaptee());
    else adaptee.setRepeated(null);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getRepeatBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.REPEAT_BEHAVIOR__REPEATED:
    		return getRepeated();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.REPEAT_BEHAVIOR__REPEATED:
    		return getRepeated() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.REPEAT_BEHAVIOR__REPEATED:
    		setRepeated(
    		(org.archware.sosadl.sosADL.Behavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
