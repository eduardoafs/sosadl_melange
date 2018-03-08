package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Behavior;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.BehaviorStatement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BehaviorAdapter extends EObjectAdapter<Behavior> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.Behavior {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public BehaviorAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  private EList<BehaviorStatement> statements_;
  
  @Override
  public EList<BehaviorStatement> getStatements() {
    if (statements_ == null)
    	statements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStatements(), adaptersFactory, eResource);
    return statements_;
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getBehavior();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.BEHAVIOR__STATEMENTS:
    		return getStatements();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.BEHAVIOR__STATEMENTS:
    		return getStatements() != null && !getStatements().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.BEHAVIOR__STATEMENTS:
    		getStatements().clear();
    		getStatements().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
