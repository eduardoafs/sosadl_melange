package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.BinaryExpression;
import org.archware.sosadl.sosADL.Expression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BinaryExpressionAdapter extends EObjectAdapter<BinaryExpression> implements org.archware.sosadl.sosADL.BinaryExpression {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public BinaryExpressionAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getOp() {
    return adaptee.getOp();
  }
  
  @Override
  public void setOp(final String o) {
    adaptee.setOp(o);
  }
  
  @Override
  public Expression getLeft() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final Expression o) {
    if (o != null)
    	adaptee.setLeft(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public Expression getRight() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final Expression o) {
    if (o != null)
    	adaptee.setRight(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  protected final static String OP_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getBinaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.BINARY_EXPRESSION__LEFT:
    		return getLeft();
    	case org.archware.sosadl.sosADL.SosADLPackage.BINARY_EXPRESSION__OP:
    		return getOp();
    	case org.archware.sosadl.sosADL.SosADLPackage.BINARY_EXPRESSION__RIGHT:
    		return getRight();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.BINARY_EXPRESSION__LEFT:
    		return getLeft() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.BINARY_EXPRESSION__OP:
    		return getOp() != OP_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.BINARY_EXPRESSION__RIGHT:
    		return getRight() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.BINARY_EXPRESSION__LEFT:
    		setLeft(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.BINARY_EXPRESSION__OP:
    		setOp(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.BINARY_EXPRESSION__RIGHT:
    		setRight(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}