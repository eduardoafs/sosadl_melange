package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ReceiveAnyProtocolAction;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ReceiveAnyProtocolActionAdapter extends EObjectAdapter<ReceiveAnyProtocolAction> implements org.archware.sosadl.sosADL.ReceiveAnyProtocolAction {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public ReceiveAnyProtocolActionAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getReceiveAnyProtocolAction();
  }
}
