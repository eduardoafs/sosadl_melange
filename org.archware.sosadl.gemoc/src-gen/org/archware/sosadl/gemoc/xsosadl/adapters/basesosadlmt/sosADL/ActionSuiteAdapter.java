package org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.ActionSuite;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ActionSuiteAdapter extends EObjectAdapter<ActionSuite> implements org.archware.sosadl.sosADL.ActionSuite {
  private BaseSosADLMTAdaptersFactory adaptersFactory;
  
  public ActionSuiteAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.BaseSosADLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE.getActionSuite();
  }
}
