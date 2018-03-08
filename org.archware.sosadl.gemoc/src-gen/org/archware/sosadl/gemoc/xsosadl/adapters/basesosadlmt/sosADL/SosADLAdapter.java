package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.SosADL;
import org.archware.sosadl.sosADL.Import;
import org.archware.sosadl.sosADL.Unit;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class SosADLAdapter extends EObjectAdapter<SosADL> implements org.archware.sosadl.sosADL.SosADL {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public SosADLAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  private EList<Import> imports_;
  
  @Override
  public EList<Import> getImports() {
    if (imports_ == null)
    	imports_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getImports(), adaptersFactory, eResource);
    return imports_;
  }
  
  @Override
  public Unit getContent() {
    return (Unit) adaptersFactory.createAdapter(adaptee.getContent(), eResource);
  }
  
  @Override
  public void setContent(final Unit o) {
    if (o != null)
    	adaptee.setContent(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.UnitAdapter) o).getAdaptee());
    else adaptee.setContent(null);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getSosADL();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SOS_ADL__IMPORTS:
    		return getImports();
    	case org.archware.sosadl.sosADL.SosADLPackage.SOS_ADL__CONTENT:
    		return getContent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SOS_ADL__IMPORTS:
    		return getImports() != null && !getImports().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.SOS_ADL__CONTENT:
    		return getContent() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SOS_ADL__IMPORTS:
    		getImports().clear();
    		getImports().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.SOS_ADL__CONTENT:
    		setContent(
    		(org.archware.sosadl.sosADL.Unit)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
