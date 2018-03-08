package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Import;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ImportAdapter extends EObjectAdapter<Import> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.Import {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public ImportAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getImportedLibrary() {
    return adaptee.getImportedLibrary();
  }
  
  @Override
  public void setImportedLibrary(final String o) {
    adaptee.setImportedLibrary(o);
  }
  
  protected final static String IMPORTED_LIBRARY_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getImport();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IMPORT__IMPORTED_LIBRARY:
    		return getImportedLibrary();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IMPORT__IMPORTED_LIBRARY:
    		return getImportedLibrary() != IMPORTED_LIBRARY_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.IMPORT__IMPORTED_LIBRARY:
    		setImportedLibrary(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
