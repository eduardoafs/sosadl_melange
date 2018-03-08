package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.DoneProtocol;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class DoneProtocolAdapter extends EObjectAdapter<DoneProtocol> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.DoneProtocol {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public DoneProtocolAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getDoneProtocol();
  }
}
