package org.archware.sosadl.gemoc;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface XSosadlMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract SosADLFactory getSosADLFactory();
  
  public abstract void save(final String uri) throws IOException;
}
