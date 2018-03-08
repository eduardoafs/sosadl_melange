package org.archware.sosadl.gemoc;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.archware.sosadl.gemoc.BaseSosADLMT;
import org.archware.sosadl.gemoc.XSosadlMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class XSosadl implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XSosadl load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XSosadl mm = new XSosadl();
    mm.setResource(res);
    return mm ;
  }
  
  public BaseSosADLMT toBaseSosADLMT() {
    org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.XSosadlAdapter adaptee = new org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.XSosadlAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XSosadlMT toXSosadlMT() {
    org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlAdapter adaptee = new org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
