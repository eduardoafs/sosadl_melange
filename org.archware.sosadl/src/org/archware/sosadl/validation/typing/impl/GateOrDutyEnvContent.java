package org.archware.sosadl.validation.typing.impl;

import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.validation.typing.EnvContent;
import org.archware.sosadl.validation.typing.proof.CoqConstructor;
import org.archware.sosadl.validation.typing.proof.CoqTransient;
import org.archware.sosadl.validation.typing.proof.Mandatory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@CoqConstructor("EGateOrDuty")
public class GateOrDutyEnvContent implements EnvContent {
	@CoqTransient
	private final EObject binder;

	@Mandatory
	private final EList<Connection> connections;

	public GateOrDutyEnvContent(EObject binder, EList<Connection> connections) {
		super();
		this.binder = binder;
		this.connections = connections;
	}

	@Override
	public EObject getBinder() {
		return binder;
	}

	public EList<Connection> getConnections() {
		return connections;
	}

}
