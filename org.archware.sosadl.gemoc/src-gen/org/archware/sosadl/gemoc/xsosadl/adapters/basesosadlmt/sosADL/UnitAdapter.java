package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Unit;
import org.archware.sosadl.sosADL.EntityBlock;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class UnitAdapter extends EObjectAdapter<Unit> implements org.archware.sosadl.sosADL.Unit {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public UnitAdapter() {
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
  public EntityBlock getDecls() {
    return (EntityBlock) adaptersFactory.createAdapter(adaptee.getDecls(), eResource);
  }
  
  @Override
  public void setDecls(final EntityBlock o) {
    if (o != null)
    	adaptee.setDecls(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.EntityBlockAdapter) o).getAdaptee());
    else adaptee.setDecls(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getUnit();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIT__NAME:
    		return getName();
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIT__DECLS:
    		return getDecls();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIT__DECLS:
    		return getDecls() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.UNIT__DECLS:
    		setDecls(
    		(org.archware.sosadl.sosADL.EntityBlock)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
