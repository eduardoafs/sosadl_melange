package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ArchBehaviorDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Constituent;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ArchBehaviorDeclAdapter extends EObjectAdapter<ArchBehaviorDecl> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.ArchBehaviorDecl {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ArchBehaviorDeclAdapter() {
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
  
  private EList<Constituent> constituents_;
  
  @Override
  public EList<Constituent> getConstituents() {
    if (constituents_ == null)
    	constituents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConstituents(), adaptersFactory, eResource);
    return constituents_;
  }
  
  @Override
  public Expression getBindings() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getBindings(), eResource);
  }
  
  @Override
  public void setBindings(final Expression o) {
    if (o != null)
    	adaptee.setBindings(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setBindings(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getArchBehaviorDecl();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCH_BEHAVIOR_DECL__NAME:
    		return getName();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCH_BEHAVIOR_DECL__CONSTITUENTS:
    		return getConstituents();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCH_BEHAVIOR_DECL__BINDINGS:
    		return getBindings();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCH_BEHAVIOR_DECL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCH_BEHAVIOR_DECL__CONSTITUENTS:
    		return getConstituents() != null && !getConstituents().isEmpty();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCH_BEHAVIOR_DECL__BINDINGS:
    		return getBindings() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCH_BEHAVIOR_DECL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCH_BEHAVIOR_DECL__CONSTITUENTS:
    		getConstituents().clear();
    		getConstituents().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.ARCH_BEHAVIOR_DECL__BINDINGS:
    		setBindings(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
