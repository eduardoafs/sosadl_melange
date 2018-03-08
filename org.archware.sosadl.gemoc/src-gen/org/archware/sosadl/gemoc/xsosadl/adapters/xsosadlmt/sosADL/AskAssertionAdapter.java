package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.AskAssertion;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AskAssertionAdapter extends EObjectAdapter<AskAssertion> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.AskAssertion {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public AskAssertionAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
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
  public Expression getExpression() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final Expression o) {
    if (o != null)
    	adaptee.setExpression(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getAskAssertion();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ASK_ASSERTION__NAME:
    		return getName();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ASK_ASSERTION__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ASK_ASSERTION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ASK_ASSERTION__EXPRESSION:
    		return getExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ASK_ASSERTION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ASK_ASSERTION__EXPRESSION:
    		setExpression(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
