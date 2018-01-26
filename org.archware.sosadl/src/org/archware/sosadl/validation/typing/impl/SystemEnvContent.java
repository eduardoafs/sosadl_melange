package org.archware.sosadl.validation.typing.impl;

import org.archware.sosadl.sosADL.SystemDecl;
import org.archware.sosadl.validation.typing.EnvContent;
import org.archware.sosadl.validation.typing.proof.CoqConstructor;
import org.archware.sosadl.validation.typing.proof.Mandatory;
import org.eclipse.emf.ecore.EObject;

@CoqConstructor("ESystem")
public class SystemEnvContent implements EnvContent {
	@Mandatory
	private final SystemDecl systemDecl;

	public SystemEnvContent(SystemDecl dtd) {
		this.systemDecl = dtd;
	}

	public SystemDecl getSystemDecl() {
		return this.systemDecl;
	}

	@Override
	public EObject getBinder() {
		return this.getSystemDecl();
	}
}
