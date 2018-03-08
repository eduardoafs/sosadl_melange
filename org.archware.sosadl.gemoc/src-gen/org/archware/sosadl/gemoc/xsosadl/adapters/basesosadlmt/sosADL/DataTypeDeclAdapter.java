package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.FunctionDecl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class DataTypeDeclAdapter extends EObjectAdapter<DataTypeDecl> implements org.archware.sosadl.sosADL.DataTypeDecl {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public DataTypeDeclAdapter() {
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
  public DataType getDatatype() {
    return (DataType) adaptersFactory.createAdapter(adaptee.getDatatype(), eResource);
  }
  
  @Override
  public void setDatatype(final DataType o) {
    if (o != null)
    	adaptee.setDatatype(((org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL.DataTypeAdapter) o).getAdaptee());
    else adaptee.setDatatype(null);
  }
  
  private EList<FunctionDecl> functions_;
  
  @Override
  public EList<FunctionDecl> getFunctions() {
    if (functions_ == null)
    	functions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFunctions(), adaptersFactory, eResource);
    return functions_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getDataTypeDecl();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.DATA_TYPE_DECL__NAME:
    		return getName();
    	case org.archware.sosadl.sosADL.SosADLPackage.DATA_TYPE_DECL__DATATYPE:
    		return getDatatype();
    	case org.archware.sosadl.sosADL.SosADLPackage.DATA_TYPE_DECL__FUNCTIONS:
    		return getFunctions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.DATA_TYPE_DECL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.sosADL.SosADLPackage.DATA_TYPE_DECL__DATATYPE:
    		return getDatatype() != null;
    	case org.archware.sosadl.sosADL.SosADLPackage.DATA_TYPE_DECL__FUNCTIONS:
    		return getFunctions() != null && !getFunctions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.sosADL.SosADLPackage.DATA_TYPE_DECL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.DATA_TYPE_DECL__DATATYPE:
    		setDatatype(
    		(org.archware.sosadl.sosADL.DataType)
    		 newValue);
    		return;
    	case org.archware.sosadl.sosADL.SosADLPackage.DATA_TYPE_DECL__FUNCTIONS:
    		getFunctions().clear();
    		getFunctions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
