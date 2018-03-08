package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.EntityBlock;
import org.archware.sosadl.sosADL.ArchitectureDecl;
import org.archware.sosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.sosADL.FunctionDecl;
import org.archware.sosadl.sosADL.MediatorDecl;
import org.archware.sosadl.sosADL.SystemDecl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EntityBlockAdapter extends EObjectAdapter<EntityBlock> implements org.archware.sosadl.sosADL.EntityBlock {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public EntityBlockAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  private EList<DataTypeDecl> datatypes_;
  
  @Override
  public EList<DataTypeDecl> getDatatypes() {
    if (datatypes_ == null)
    	datatypes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDatatypes(), adaptersFactory, eResource);
    return datatypes_;
  }
  
  private EList<FunctionDecl> functions_;
  
  @Override
  public EList<FunctionDecl> getFunctions() {
    if (functions_ == null)
    	functions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFunctions(), adaptersFactory, eResource);
    return functions_;
  }
  
  private EList<SystemDecl> systems_;
  
  @Override
  public EList<SystemDecl> getSystems() {
    if (systems_ == null)
    	systems_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSystems(), adaptersFactory, eResource);
    return systems_;
  }
  
  private EList<MediatorDecl> mediators_;
  
  @Override
  public EList<MediatorDecl> getMediators() {
    if (mediators_ == null)
    	mediators_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMediators(), adaptersFactory, eResource);
    return mediators_;
  }
  
  private EList<ArchitectureDecl> architectures_;
  
  @Override
  public EList<ArchitectureDecl> getArchitectures() {
    if (architectures_ == null)
    	architectures_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getArchitectures(), adaptersFactory, eResource);
    return architectures_;
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getEntityBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__DATATYPES:
    		return getDatatypes();
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__FUNCTIONS:
    		return getFunctions();
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__SYSTEMS:
    		return getSystems();
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__MEDIATORS:
    		return getMediators();
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__ARCHITECTURES:
    		return getArchitectures();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__DATATYPES:
    		return getDatatypes() != null && !getDatatypes().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__FUNCTIONS:
    		return getFunctions() != null && !getFunctions().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__SYSTEMS:
    		return getSystems() != null && !getSystems().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__MEDIATORS:
    		return getMediators() != null && !getMediators().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__ARCHITECTURES:
    		return getArchitectures() != null && !getArchitectures().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__DATATYPES:
    		getDatatypes().clear();
    		getDatatypes().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__FUNCTIONS:
    		getFunctions().clear();
    		getFunctions().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__SYSTEMS:
    		getSystems().clear();
    		getSystems().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__MEDIATORS:
    		getMediators().clear();
    		getMediators().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.ENTITY_BLOCK__ARCHITECTURES:
    		getArchitectures().clear();
    		getArchitectures().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
