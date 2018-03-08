package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ChooseBehavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ChooseBehaviorAdapter extends EObjectAdapter<ChooseBehavior> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseBehavior {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ChooseBehaviorAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  private EList<Behavior> branches_;
  
  @Override
  public EList<Behavior> getBranches() {
    if (branches_ == null)
    	branches_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getBranches(), adaptersFactory, eResource);
    return branches_;
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getChooseBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CHOOSE_BEHAVIOR__BRANCHES:
    		return getBranches();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CHOOSE_BEHAVIOR__BRANCHES:
    		return getBranches() != null && !getBranches().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CHOOSE_BEHAVIOR__BRANCHES:
    		getBranches().clear();
    		getBranches().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
