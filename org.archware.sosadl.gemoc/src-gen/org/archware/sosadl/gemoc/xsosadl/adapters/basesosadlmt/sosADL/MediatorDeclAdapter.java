package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.MediatorDecl;
import org.archware.sosadl.sosADL.AssertionDecl;
import org.archware.sosadl.sosADL.BehaviorDecl;
import org.archware.sosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.sosADL.DutyDecl;
import org.archware.sosadl.sosADL.FormalParameter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MediatorDeclAdapter extends EObjectAdapter<MediatorDecl> implements org.archware.sosadl.sosADL.MediatorDecl {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public MediatorDeclAdapter() {
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
  
  private EList<DutyDecl> duties_;
  
  @Override
  public EList<DutyDecl> getDuties() {
    if (duties_ == null)
    	duties_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDuties(), adaptersFactory, eResource);
    return duties_;
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
  
  private EList<AssertionDecl> assumptions_;
  
  @Override
  public EList<AssertionDecl> getAssumptions() {
    if (assumptions_ == null)
    	assumptions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAssumptions(), adaptersFactory, eResource);
    return assumptions_;
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
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getMediatorDecl();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__NAME:
    		return getName();
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__PARAMETERS:
    		return getParameters();
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__DATATYPES:
    		return getDatatypes();
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__DUTIES:
    		return getDuties();
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__BEHAVIOR:
    		return getBehavior();
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__ASSUMPTIONS:
    		return getAssumptions();
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__ASSERTIONS:
    		return getAssertions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__PARAMETERS:
    		return getParameters() != null && !getParameters().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__DATATYPES:
    		return getDatatypes() != null && !getDatatypes().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__DUTIES:
    		return getDuties() != null && !getDuties().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__BEHAVIOR:
    		return getBehavior() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__ASSUMPTIONS:
    		return getAssumptions() != null && !getAssumptions().isEmpty();
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__ASSERTIONS:
    		return getAssertions() != null && !getAssertions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__PARAMETERS:
    		getParameters().clear();
    		getParameters().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__DATATYPES:
    		getDatatypes().clear();
    		getDatatypes().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__DUTIES:
    		getDuties().clear();
    		getDuties().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__BEHAVIOR:
    		setBehavior(
    		(org.archware.sosadl.sosADL.BehaviorDecl)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__ASSUMPTIONS:
    		getAssumptions().clear();
    		getAssumptions().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.MEDIATOR_DECL__ASSERTIONS:
    		getAssertions().clear();
    		getAssertions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
