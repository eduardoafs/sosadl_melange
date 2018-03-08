package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.SystemDecl;
import org.archware.sosadl.sosADL.AssertionDecl;
import org.archware.sosadl.sosADL.BehaviorDecl;
import org.archware.sosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.sosADL.FormalParameter;
import org.archware.sosadl.sosADL.GateDecl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class SystemDeclAdapter extends EObjectAdapter<SystemDecl> implements org.archware.sosadl.sosADL.SystemDecl {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public SystemDeclAdapter() {
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
  
  private EList<FormalParameter> parameters_;
  
  @Override
  public EList<FormalParameter> getParameters() {
    if (parameters_ == null)
    	parameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParameters(), adaptersFactory, eResource);
    return parameters_;
  }
  
  private EList<DataTypeDecl> datatypes_;
  
  @Override
  public EList<DataTypeDecl> getDatatypes() {
    if (datatypes_ == null)
    	datatypes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDatatypes(), adaptersFactory, eResource);
    return datatypes_;
  }
  
  private EList<GateDecl> gates_;
  
  @Override
  public EList<GateDecl> getGates() {
    if (gates_ == null)
    	gates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getGates(), adaptersFactory, eResource);
    return gates_;
  }
  
  @Override
  public BehaviorDecl getBehavior() {
    return (BehaviorDecl) adaptersFactory.createAdapter(adaptee.getBehavior(), eResource);
  }
  
  @Override
  public void setBehavior(final BehaviorDecl o) {
    if (o != null)
    	adaptee.setBehavior(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.BehaviorDeclAdapter) o).getAdaptee());
    else adaptee.setBehavior(null);
  }
  
  private EList<AssertionDecl> assertions_;
  
  @Override
  public EList<AssertionDecl> getAssertions() {
    if (assertions_ == null)
    	assertions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAssertions(), adaptersFactory, eResource);
    return assertions_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getSystemDecl();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__NAME:
    		return getName();
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__PARAMETERS:
    		return getParameters();
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__DATATYPES:
    		return getDatatypes();
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__GATES:
    		return getGates();
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__BEHAVIOR:
    		return getBehavior();
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__ASSERTIONS:
    		return getAssertions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__PARAMETERS:
    		return getParameters() != null && !getParameters().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__DATATYPES:
    		return getDatatypes() != null && !getDatatypes().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__GATES:
    		return getGates() != null && !getGates().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__BEHAVIOR:
    		return getBehavior() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__ASSERTIONS:
    		return getAssertions() != null && !getAssertions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__PARAMETERS:
    		getParameters().clear();
    		getParameters().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__DATATYPES:
    		getDatatypes().clear();
    		getDatatypes().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__GATES:
    		getGates().clear();
    		getGates().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__BEHAVIOR:
    		setBehavior(
    		(org.archware.sosadl.sosADL.BehaviorDecl)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.SYSTEM_DECL__ASSERTIONS:
    		getAssertions().clear();
    		getAssertions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
