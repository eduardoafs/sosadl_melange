package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ProtocolActionSuite;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ProtocolActionSuiteAdapter extends EObjectAdapter<ProtocolActionSuite> implements org.archware.sosadl.sosADL.ProtocolActionSuite {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public ProtocolActionSuiteAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getProtocolActionSuite();
  }
}
