package org.archware.sosadl.validation.typing.impl;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.validation.typing.EnvContent;
import org.archware.sosadl.validation.typing.proof.CoqConstructor;
import org.archware.sosadl.validation.typing.proof.CoqTransient;
import org.archware.sosadl.validation.typing.proof.Mandatory;
import org.eclipse.emf.ecore.EObject;

@CoqConstructor("EVariable")
public class VariableEnvContent implements EnvContent {
	@CoqTransient
	private final EObject binder;

	@Mandatory
	private final DataType type;

	public VariableEnvContent(EObject binder, DataType type) {
		super();
		this.binder = binder;
		this.type = type;
	}

	public EObject getBinder() {
		return binder;
	}

	public DataType getType() {
		return type;
	}

}
