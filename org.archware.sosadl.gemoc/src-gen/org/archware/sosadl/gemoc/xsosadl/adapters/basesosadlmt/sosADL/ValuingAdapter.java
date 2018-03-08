package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Valuing;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ValuingAdapter extends EObjectAdapter<Valuing> implements org.archware.sosadl.sosADL.Valuing {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public ValuingAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public DataType getType() {
    return (DataType) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final DataType o) {
    if (o != null)
    	adaptee.setType(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.DataTypeAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  @Override
  public Expression getExpression() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final Expression o) {
    if (o != null)
    	adaptee.setExpression(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getValuing();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.VALUING__NAME:
    		return getName();
    	case org.archware.sosadl.sosADL.SosADLPackage.VALUING__TYPE:
    		return getType();
    	case org.archware.sosadl.sosADL.SosADLPackage.VALUING__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.VALUING__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.VALUING__TYPE:
    		return getType() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.VALUING__EXPRESSION:
    		return getExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.VALUING__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.VALUING__TYPE:
    		setType(
    		(org.archware.sosadl.sosADL.DataType)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.VALUING__EXPRESSION:
    		setExpression(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
