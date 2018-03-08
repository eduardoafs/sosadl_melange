package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ArchitectureDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.AssertionDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataTypeDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.GateDecl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ArchitectureDeclAdapter extends EObjectAdapter<ArchitectureDecl> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchitectureDecl {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ArchitectureDeclAdapter() {
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
  public ArchBehaviorDecl getBehavior() {
    return (ArchBehaviorDecl) adaptersFactory.createAdapter(adaptee.getBehavior(), eResource);
  }
  
  @Override
  public void setBehavior(final ArchBehaviorDecl o) {
    if (o != null)
    	adaptee.setBehavior(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ArchBehaviorDeclAdapter) o).getAdaptee());
    else adaptee.setBehavior(null);
  }
  
  private EList<AssertionDecl> assertions_;
  
  @Override
  public EList<AssertionDecl> getAssertions() {
    if (assertions_ == null)
    	assertions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAssertions(), adaptersFactory, eResource);
    return assertions_;
  }
  
  @Override
  public void init(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    org.archware.sosadl.gemoc.xsosadl.aspects.ArchitectureDeclAspect.init(adaptee, args
    );
  }
  
  @Override
  public void main() {
    org.archware.sosadl.gemoc.xsosadl.aspects.ArchitectureDeclAspect.main(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getArchitectureDecl();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__NAME:
    		return getName();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__PARAMETERS:
    		return getParameters();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__DATATYPES:
    		return getDatatypes();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__GATES:
    		return getGates();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__BEHAVIOR:
    		return getBehavior();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__ASSERTIONS:
    		return getAssertions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__PARAMETERS:
    		return getParameters() != null && !getParameters().isEmpty();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__DATATYPES:
    		return getDatatypes() != null && !getDatatypes().isEmpty();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__GATES:
    		return getGates() != null && !getGates().isEmpty();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__BEHAVIOR:
    		return getBehavior() != null;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__ASSERTIONS:
    		return getAssertions() != null && !getAssertions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__PARAMETERS:
    		getParameters().clear();
    		getParameters().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__DATATYPES:
    		getDatatypes().clear();
    		getDatatypes().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__GATES:
    		getGates().clear();
    		getGates().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__BEHAVIOR:
    		setBehavior(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCHITECTURE_DECL__ASSERTIONS:
    		getAssertions().clear();
    		getAssertions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
