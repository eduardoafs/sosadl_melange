package org.archware.sosadl.attributed.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.archware.sosadl.attributed.AttributeAdapter;

public class AttributeAdapterImpl extends AdapterImpl implements AttributeAdapter {
	private final Map<Object, Object> attributes;

	public AttributeAdapterImpl() {
		this.attributes = new HashMap<Object, Object>();
	}

	@Override
	public Object putAttribute(final Object attr, final Object value) {
		return this.attributes.put(attr, value);
	}

	@Override
	public Object getAttribute(final Object attr) {
		return this.attributes.get(attr);
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == AttributeAdapter.class;
	}
}
