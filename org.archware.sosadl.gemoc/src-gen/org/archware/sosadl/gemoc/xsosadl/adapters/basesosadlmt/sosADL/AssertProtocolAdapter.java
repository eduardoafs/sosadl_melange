package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.AssertProtocol;
import org.archware.sosadl.sosADL.Assert;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AssertProtocolAdapter extends EObjectAdapter<AssertProtocol> implements org.archware.sosadl.sosADL.AssertProtocol {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public AssertProtocolAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Assert getAssertion() {
    return (Assert) adaptersFactory.createAdapter(adaptee.getAssertion(), eResource);
  }
  
  @Override
  public void setAssertion(final Assert o) {
    if (o != null)
    	adaptee.setAssertion(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.AssertAdapter) o).getAdaptee());
    else adaptee.setAssertion(null);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getAssertProtocol();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.ASSERT_PROTOCOL__ASSERTION:
    		return getAssertion();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.ASSERT_PROTOCOL__ASSERTION:
    		return getAssertion() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.ASSERT_PROTOCOL__ASSERTION:
    		setAssertion(
    		(org.archware.sosadl.sosADL.Assert)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
