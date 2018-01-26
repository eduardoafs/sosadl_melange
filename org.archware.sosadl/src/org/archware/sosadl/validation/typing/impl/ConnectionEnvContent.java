package org.archware.sosadl.validation.typing.impl;

import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.validation.typing.EnvContent;
import org.archware.sosadl.validation.typing.proof.CoqConstructor;
import org.archware.sosadl.validation.typing.proof.CoqTransient;
import org.archware.sosadl.validation.typing.proof.Mandatory;
import org.eclipse.emf.ecore.EObject;

@CoqConstructor("EConnection")
public class ConnectionEnvContent implements EnvContent {
	@CoqTransient
	private final EObject binder;

	@Mandatory
	private final Connection connection;

	public ConnectionEnvContent(EObject binder, Connection connection) {
		super();
		this.binder = binder;
		this.connection = connection;
	}

	@Override
	public EObject getBinder() {
		return binder;
	}

	public Connection getConnection() {
		return connection;
	}

}
