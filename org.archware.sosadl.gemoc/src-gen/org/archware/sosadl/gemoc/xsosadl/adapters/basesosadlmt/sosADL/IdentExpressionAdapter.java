package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.IdentExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IdentExpressionAdapter extends EObjectAdapter<IdentExpression> implements org.archware.sosadl.sosADL.IdentExpression {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public IdentExpressionAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getIdent() {
    return adaptee.getIdent();
  }
  
  @Override
  public void setIdent(final String o) {
    adaptee.setIdent(o);
  }
  
  protected final static String IDENT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getIdentExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.IDENT_EXPRESSION__IDENT:
    		return getIdent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.IDENT_EXPRESSION__IDENT:
    		return getIdent() != IDENT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.IDENT_EXPRESSION__IDENT:
    		setIdent(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
