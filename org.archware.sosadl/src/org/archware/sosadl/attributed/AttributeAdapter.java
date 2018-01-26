package org.archware.sosadl.attributed;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.archware.sosadl.attributed.impl.AttributeAdapterFactoryImpl;

public interface AttributeAdapter {
	Object putAttribute(Object attribute, Object value);

	Object getAttribute(Object attribute);

	public static AttributeAdapter adapterOf(EObject o) {
		Adapter result = EcoreUtil.getRegisteredAdapter(o, AttributeAdapter.class);
		if (result != null) {
			return (AttributeAdapter) result;
		} else {
			Resource r = o.eResource();
			if (r != null) {
				ResourceSet rs = r.getResourceSet();
				if (rs != null) {
					List<AdapterFactory> factories = rs.getAdapterFactories();
					factories.add(new AttributeAdapterFactoryImpl());
				}
			}
			AttributeAdapter result2 = (AttributeAdapter) EcoreUtil.getRegisteredAdapter(o, AttributeAdapter.class);
			if (result2 == null) {
				return (AttributeAdapter) new AttributeAdapterFactoryImpl().adapt(o, AttributeAdapter.class);
			} else {
				return result2;
			}
		}
	}
}
