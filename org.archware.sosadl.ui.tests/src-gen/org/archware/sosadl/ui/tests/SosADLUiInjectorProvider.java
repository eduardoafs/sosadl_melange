/*
 * generated by Xtext 2.12.0
 */
package org.archware.sosadl.ui.tests;

import com.google.inject.Injector;
import org.archware.sosadl.ui.internal.SosadlActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class SosADLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SosadlActivator.getInstance().getInjector("org.archware.sosadl.SosADL");
	}

}
