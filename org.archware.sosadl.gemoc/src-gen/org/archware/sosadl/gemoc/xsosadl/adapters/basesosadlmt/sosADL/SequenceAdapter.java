package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Sequence;
import org.archware.sosadl.sosADL.Expression;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class SequenceAdapter extends EObjectAdapter<Sequence> implements org.archware.sosadl.sosADL.Sequence {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public SequenceAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  private EList<Expression> elements_;
  
  @Override
  public EList<Expression> getElements() {
    if (elements_ == null)
    	elements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getElements(), adaptersFactory, eResource);
    return elements_;
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getSequence();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SEQUENCE__ELEMENTS:
    		return getElements();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SEQUENCE__ELEMENTS:
    		return getElements() != null && !getElements().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SEQUENCE__ELEMENTS:
    		getElements().clear();
    		getElements().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
