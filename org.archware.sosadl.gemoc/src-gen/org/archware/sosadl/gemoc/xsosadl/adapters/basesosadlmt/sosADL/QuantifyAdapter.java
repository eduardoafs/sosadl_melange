package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Quantify;
import org.archware.sosadl.sosADL.ElementInConstituent;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.Quantifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class QuantifyAdapter extends EObjectAdapter<Quantify> implements org.archware.sosadl.sosADL.Quantify {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public QuantifyAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Quantifier getQuantifier() {
    return org.archware.sosadl.sosADL.Quantifier.get(adaptee.getQuantifier().getValue());
  }
  
  @Override
  public void setQuantifier(final Quantifier o) {
    adaptee.setQuantifier(org.archware.sosadl.gemoc.xsosadl.sosADL.Quantifier.get(o.getValue()));
  }
  
  private EList<ElementInConstituent> elements_;
  
  @Override
  public EList<ElementInConstituent> getElements() {
    if (elements_ == null)
    	elements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getElements(), adaptersFactory, eResource);
    return elements_;
  }
  
  @Override
  public Expression getBindings() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getBindings(), eResource);
  }
  
  @Override
  public void setBindings(final Expression o) {
    if (o != null)
    	adaptee.setBindings(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setBindings(null);
  }
  
  protected final static Quantifier QUANTIFIER_EDEFAULT = org.archware.sosadl.sosADL.Quantifier.QUANTIFIER_FORALL;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getQuantify();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.QUANTIFY__QUANTIFIER:
    		return getQuantifier();
    	case org.archware.sosadl.sosADL.SosADLPackage.QUANTIFY__ELEMENTS:
    		return getElements();
    	case org.archware.sosadl.sosADL.SosADLPackage.QUANTIFY__BINDINGS:
    		return getBindings();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.QUANTIFY__QUANTIFIER:
    		return getQuantifier() != QUANTIFIER_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.QUANTIFY__ELEMENTS:
    		return getElements() != null && !getElements().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.QUANTIFY__BINDINGS:
    		return getBindings() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.QUANTIFY__QUANTIFIER:
    		setQuantifier(
    		(org.archware.sosadl.sosADL.Quantifier)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.QUANTIFY__ELEMENTS:
    		getElements().clear();
    		getElements().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.QUANTIFY__BINDINGS:
    		setBindings(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
