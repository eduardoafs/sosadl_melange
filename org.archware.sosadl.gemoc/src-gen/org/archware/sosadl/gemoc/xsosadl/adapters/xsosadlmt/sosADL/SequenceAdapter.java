package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Sequence;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class SequenceAdapter extends EObjectAdapter<Sequence> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.Sequence {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public SequenceAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  private EList<Expression> elements_;
  
  @Override
  public EList<Expression> getElements() {
    if (elements_ == null)
    	elements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getElements(), adaptersFactory, eResource);
    return elements_;
  }
  
  @Override
  public Object evaluate() {
    return org.archware.sosadl.gemoc.xsosadl.aspects.ExpressionAspect.evaluate(adaptee);
  }
  
  @Override
  public void performAction() {
    org.archware.sosadl.gemoc.xsosadl.aspects.ExpressionAspect.performAction(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getSequence();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.SEQUENCE__ELEMENTS:
    		return getElements();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.SEQUENCE__ELEMENTS:
    		return getElements() != null && !getElements().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.SEQUENCE__ELEMENTS:
    		getElements().clear();
    		getElements().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
