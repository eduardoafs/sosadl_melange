package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ChooseProtocol;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Protocol;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ChooseProtocolAdapter extends EObjectAdapter<ChooseProtocol> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.ChooseProtocol {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ChooseProtocolAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  private EList<Protocol> branches_;
  
  @Override
  public EList<Protocol> getBranches() {
    if (branches_ == null)
    	branches_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getBranches(), adaptersFactory, eResource);
    return branches_;
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getChooseProtocol();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CHOOSE_PROTOCOL__BRANCHES:
    		return getBranches();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CHOOSE_PROTOCOL__BRANCHES:
    		return getBranches() != null && !getBranches().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.CHOOSE_PROTOCOL__BRANCHES:
    		getBranches().clear();
    		getBranches().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
