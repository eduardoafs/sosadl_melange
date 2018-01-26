package org.archware.sosadl.attributed.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.archware.sosadl.attributed.AttributeAdapter;

public class AttributeAdapterFactoryImpl extends AdapterFactoryImpl {
	@Override
	public boolean isFactoryForType(final Object type) {
		return type == AttributeAdapter.class;
	}
	
	@Override
	protected Adapter createAdapter(final Notifier target) {
		return new AttributeAdapterImpl();
	}
}
