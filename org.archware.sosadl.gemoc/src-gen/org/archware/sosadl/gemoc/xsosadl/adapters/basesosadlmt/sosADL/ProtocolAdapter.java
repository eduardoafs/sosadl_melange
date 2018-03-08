package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Protocol;
import org.archware.sosadl.sosADL.ProtocolStatement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ProtocolAdapter extends EObjectAdapter<Protocol> implements org.archware.sosadl.sosADL.Protocol {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public ProtocolAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  private EList<ProtocolStatement> statements_;
  
  @Override
  public EList<ProtocolStatement> getStatements() {
    if (statements_ == null)
    	statements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStatements(), adaptersFactory, eResource);
    return statements_;
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getProtocol();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.PROTOCOL__STATEMENTS:
    		return getStatements();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.PROTOCOL__STATEMENTS:
    		return getStatements() != null && !getStatements().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.PROTOCOL__STATEMENTS:
    		getStatements().clear();
    		getStatements().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
