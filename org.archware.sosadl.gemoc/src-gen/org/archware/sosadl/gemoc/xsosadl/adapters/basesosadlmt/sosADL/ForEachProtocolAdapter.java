package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ForEachProtocol;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.Protocol;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ForEachProtocolAdapter extends EObjectAdapter<ForEachProtocol> implements org.archware.sosadl.sosADL.ForEachProtocol {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public ForEachProtocolAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getVariable() {
    return adaptee.getVariable();
  }
  
  @Override
  public void setVariable(final String o) {
    adaptee.setVariable(o);
  }
  
  @Override
  public Expression getSetOfValues() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getSetOfValues(), eResource);
  }
  
  @Override
  public void setSetOfValues(final Expression o) {
    if (o != null)
    	adaptee.setSetOfValues(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setSetOfValues(null);
  }
  
  @Override
  public Protocol getRepeated() {
    return (Protocol) adaptersFactory.createAdapter(adaptee.getRepeated(), eResource);
  }
  
  @Override
  public void setRepeated(final Protocol o) {
    if (o != null)
    	adaptee.setRepeated(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.ProtocolAdapter) o).getAdaptee());
    else adaptee.setRepeated(null);
  }
  
  protected final static String VARIABLE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getForEachProtocol();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.FOR_EACH_PROTOCOL__VARIABLE:
    		return getVariable();
    	case org.archware.sosadl.sosADL.SosADLPackage.FOR_EACH_PROTOCOL__SET_OF_VALUES:
    		return getSetOfValues();
    	case org.archware.sosadl.sosADL.SosADLPackage.FOR_EACH_PROTOCOL__REPEATED:
    		return getRepeated();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.FOR_EACH_PROTOCOL__VARIABLE:
    		return getVariable() != VARIABLE_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.FOR_EACH_PROTOCOL__SET_OF_VALUES:
    		return getSetOfValues() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.FOR_EACH_PROTOCOL__REPEATED:
    		return getRepeated() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.FOR_EACH_PROTOCOL__VARIABLE:
    		setVariable(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.FOR_EACH_PROTOCOL__SET_OF_VALUES:
    		setSetOfValues(
    		(org.archware.sosadl.sosADL.Expression)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.FOR_EACH_PROTOCOL__REPEATED:
    		setRepeated(
    		(org.archware.sosadl.sosADL.Protocol)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
