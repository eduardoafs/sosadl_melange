package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.TupleElement;
import org.archware.sosadl.sosADL.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TupleElementAdapter extends EObjectAdapter<TupleElement> implements org.archware.sosadl.sosADL.TupleElement {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public TupleElementAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getLabel() {
    return adaptee.getLabel();
  }
  
  @Override
  public void setLabel(final String o) {
    adaptee.setLabel(o);
  }
  
  @Override
  public Expression getValue() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final Expression o) {
    if (o != null)
    	adaptee.setValue(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  protected final static String LABEL_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getTupleElement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.TUPLE_ELEMENT__LABEL:
    		return getLabel();
    	case org.archware.sosadl.sosADL.SosADLPackage.TUPLE_ELEMENT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.TUPLE_ELEMENT__LABEL:
    		return getLabel() != LABEL_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.TUPLE_ELEMENT__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.TUPLE_ELEMENT__LABEL:
    		setLabel(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.TUPLE_ELEMENT__VALUE:
    		setValue(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
