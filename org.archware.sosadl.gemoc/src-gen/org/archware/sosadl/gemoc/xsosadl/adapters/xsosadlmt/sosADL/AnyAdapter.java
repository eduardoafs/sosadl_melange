package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.Any;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AnyAdapter extends EObjectAdapter<Any> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.Any {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public AnyAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Object evaluate() {
    return org.archware.sosadl.gemoc.xsosadl.aspects.ExpressionAspect.evaluate(adaptee);
  }
  
  @Override
  public void performAction() {
    org.archware.sosadl.gemoc.xsosadl.aspects.ExpressionAspect.performAction(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getAny();
  }
}
