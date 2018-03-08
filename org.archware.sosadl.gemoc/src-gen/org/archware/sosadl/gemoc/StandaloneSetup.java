package org.archware.sosadl.gemoc;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.archware.sosadl.sosADL.SosADLPackage.eNS_URI,
    	org.archware.sosadl.sosADL.SosADLPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.archware.sosadl.gemoc.xsosadl.sosADL.SosADLPackage.eNS_URI,
    	org.archware.sosadl.gemoc.xsosadl.sosADL.SosADLPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor baseSosADL = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.archware.sosadl.gemoc.BaseSosADL", "", "http://www-archware.irisa.fr/sosadl/SosADL", "org.archware.sosadl.gemoc.BaseSosADLMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.archware.sosadl.gemoc.BaseSosADL",
    	baseSosADL
    );
    MelangeRegistry.LanguageDescriptor xSosadl = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.archware.sosadl.gemoc.XSosadl", "", "http://org.archware.sosadl.gemoc.xsosadl/sosADL/", "org.archware.sosadl.gemoc.XSosadlMT"
    );
    xSosadl.addAdapter("org.archware.sosadl.gemoc.BaseSosADLMT", org.archware.sosadl.gemoc.xsosadl.adapters.basesosadlmt.XSosadlAdapter.class);
    xSosadl.addAdapter("org.archware.sosadl.gemoc.XSosadlMT", org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.archware.sosadl.gemoc.XSosadl",
    	xSosadl
    );
    MelangeRegistry.ModelTypeDescriptor baseSosADLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.archware.sosadl.gemoc.BaseSosADLMT", "", "http://org.archware.sosadl.gemoc.basesosadlmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.archware.sosadl.gemoc.BaseSosADLMT",
    	baseSosADLMT
    );
    MelangeRegistry.ModelTypeDescriptor xSosadlMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.archware.sosadl.gemoc.XSosadlMT", "", "http://org.archware.sosadl.gemoc.xsosadlmt/"
    );
    xSosadlMT.addSuperType("org.archware.sosadl.gemoc.BaseSosADLMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.archware.sosadl.gemoc.XSosadlMT",
    	xSosadlMT
    );
  }
}
