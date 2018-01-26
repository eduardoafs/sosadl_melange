package org.archware.utils;

import java.util.List;

import org.archware.sosadl.sosADL.ArchBehaviorDecl;
import org.archware.sosadl.sosADL.ComplexName;
import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.sosADL.Constituent;
import org.archware.sosadl.sosADL.DutyDecl;
import org.archware.sosadl.sosADL.GateDecl;
import org.archware.sosadl.sosADL.IdentExpression;
import org.archware.sosadl.sosADL.SosADL;
import org.archware.sosadl.validation.TypeInformation;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

public class ModelUtils {
	/**
	 * Goes up the the tree model until find an instance of class
	 * @param n
	 * @param class1
	 * @return
	 */
	static public EObject upUntilFind(EObject n, Class<? extends EObject> class1) {
		EObject obj = n;
		while((!class1.isAssignableFrom(obj.getClass())) && obj.getClass()!=SosADL.class) {
			obj = obj.eContainer();
		}
		return obj;
	}
	
	public static SosADL getModel(EObject o) {
		return (SosADL) EcoreUtil.getRootContainer(o);
	}

	@SuppressWarnings("all")
	public static EObject resolve(IdentExpression e) {
		XtextResource resource = (XtextResource) e.eResource();
		IResourceValidator validator = resource.getResourceServiceProvider().get(IResourceValidator.class);
		// Therefore I will validate it manually
		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);

		EObject o = TypeInformation.resolve(e);

		return o;
	}

	public static EObject resolve(ComplexName n) {
		String relevantName = n.getName().get(n.getName().size() - 1);

		SosADL model = getModel(n);

		TreeIterator<EObject> t = model.eAllContents();
		EObject obj = model;
		// Scan all contents of the model, trying to find the gate
		while (t.hasNext()) {
			obj = t.next();
			if (obj instanceof DutyDecl) {
				if (((DutyDecl) obj).getName().equals(relevantName))
					return obj;
			} else if (obj instanceof GateDecl) {
				if (((GateDecl) obj).getName().equals(relevantName))
					return obj;
			} else if (obj instanceof Connection) {
				if (((Connection) obj).getName().equals(relevantName)) {
					int nameSize = n.getName().size();
					if (nameSize>1) {
						EObject container = obj.eContainer(); 
						String cName = container instanceof GateDecl? ((GateDecl)container).getName() : ((DutyDecl)container).getName();
						if (cName.equals(n.getName().get(nameSize-2))) {
							// Also, need to check the first part of the name
							if (nameSize>2) { // need to include this information
								EObject cContainer = container.eContainer();
								EObject s = resolve((IdentExpression)findConstituent(n).getValue());
								
								// cContainer must be equal to s
								if (cContainer.equals(s)) return obj;
								else continue;
							} else 
							// resolve the name of constituent
							// check if resolution is equal to container.eContainer()
							
							return obj;
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * TODO implement me
	 * Finds a constituent at n.getName().get(0)
	 * @param n
	 * @return
	 */
	public static Constituent findConstituent(ComplexName n) {
		// ComplexNames are contained in Unify, Unifies are contained in ArchBehaviorDecl
		ArchBehaviorDecl e = (ArchBehaviorDecl) org.archware.utils.ModelUtils.upUntilFind(n, ArchBehaviorDecl.class);
		for (Constituent c : e.getConstituents()) {
			if (c.getName().equals(n.getName().get(0))) return c;
		}
		return null;
	}

	/**
	 * TODO implement me
	 * Better complex name resolver
	 * @param n
	 * @return
	 */
	public static EObject resolve2(ComplexName n) {
		EObject obj = null;
		SosADL model = getModel(n);
		TreeIterator<EObject> t = model.eAllContents();

		for (int i = 0; i < n.getName().size(); i++) {

		}
		return obj;
	}
}
