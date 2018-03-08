package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.TupleType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.FieldDecl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TupleTypeAdapter extends EObjectAdapter<TupleType> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.TupleType {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public TupleTypeAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  private EList<FieldDecl> fields_;
  
  @Override
  public EList<FieldDecl> getFields() {
    if (fields_ == null)
    	fields_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFields(), adaptersFactory, eResource);
    return fields_;
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getTupleType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.TUPLE_TYPE__FIELDS:
    		return getFields();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.TUPLE_TYPE__FIELDS:
    		return getFields() != null && !getFields().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.TUPLE_TYPE__FIELDS:
    		getFields().clear();
    		getFields().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
