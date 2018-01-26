package org.archware.sosadl.validation.typing.impl;

import java.util.LinkedList;
import java.util.List;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.DataTypeDecl;
import org.archware.sosadl.sosADL.FunctionDecl;
import org.archware.sosadl.validation.typing.EnvContent;
import org.archware.sosadl.validation.typing.proof.CoqConstructor;
import org.archware.sosadl.validation.typing.proof.Mandatory;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@CoqConstructor("EType")
public class TypeEnvContent implements EnvContent {
	@Mandatory
	private final DataTypeDecl dataTypeDecl;

	@Mandatory
	private final DataType dataType;

	private final EList<FunctionDecl> methods;

	public TypeEnvContent(DataTypeDecl dtd, DataType dt, EList<FunctionDecl> methods) {
		this.dataTypeDecl = dtd;
		this.dataType = dt;
		this.methods = methods;
	}

	public DataTypeDecl getDataTypeDecl() {
		return this.dataTypeDecl;
	}

	public DataType getDataType() {
		return dataType;
	}

	public EList<FunctionDecl> getMethods() {
		return this.methods;
	}

	public EnvContent addMethod(FunctionDecl f) {
		return new TypeEnvContent(dataTypeDecl, dataType, cons(f, methods));
	}

	private static <T> EList<T> cons(T v, List<T> l) {
		List<T> lv = new LinkedList<>();
		lv.add(v);
		EList<T> ret = ECollections.asEList(lv);
		ret.addAll(l);
		return ECollections.unmodifiableEList(ret);
	}

	@Override
	public EObject getBinder() {
		return this.getDataTypeDecl();
	}
}
