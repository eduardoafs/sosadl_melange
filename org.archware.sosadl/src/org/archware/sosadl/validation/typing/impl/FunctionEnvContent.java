package org.archware.sosadl.validation.typing.impl;

import org.archware.sosadl.sosADL.FunctionDecl;
import org.archware.sosadl.validation.typing.EnvContent;
import org.archware.sosadl.validation.typing.proof.CoqConstructor;
import org.archware.sosadl.validation.typing.proof.CoqTransient;
import org.archware.sosadl.validation.typing.proof.Mandatory;
import org.eclipse.emf.ecore.EObject;

@CoqConstructor("EFunction")
public class FunctionEnvContent implements EnvContent {
	@Mandatory
	private final FunctionDecl function;

	public FunctionEnvContent(FunctionDecl function) {
		super();
		this.function = function;
	}

	@Override
	public EObject getBinder() {
		return this.getFunction();
	}

	public FunctionDecl getFunction() {
		return function;
	}

}
