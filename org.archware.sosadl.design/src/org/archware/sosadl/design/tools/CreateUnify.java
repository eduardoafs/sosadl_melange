package org.archware.sosadl.design.tools;

import java.util.Collection;
import java.util.Map;

import org.archware.sosadl.sosADL.ArchBehaviorDecl;
import org.archware.sosadl.sosADL.BinaryExpression;
import org.archware.sosadl.sosADL.ComplexName;
import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.sosADL.Constituent;
import org.archware.sosadl.sosADL.DutyDecl;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.GateDecl;
import org.archware.sosadl.sosADL.Multiplicity;
import org.archware.sosadl.sosADL.SosADLFactory;
import org.archware.sosadl.sosADL.Unify;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;

import org.eclipse.sirius.diagram.DNode;

public class CreateUnify extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		DNode sourceView = (DNode) getOptionalParameter(arg1, "sourceView", EObject.class);
		Constituent sourceConstituent = (Constituent) ((DNode) sourceView.eContainer().eContainer()).getTarget();
		DNode targetView = (DNode) getOptionalParameter(arg1, "targetView", EObject.class);
		Constituent targetConstituent = (Constituent) ((DNode) targetView.eContainer().eContainer()).getTarget();
		
		Unify newU = SosADLFactory.eINSTANCE.createUnify();
		newU.setMultLeft(Multiplicity.MULTIPLICITY_ONE);
		newU.setMultRight(Multiplicity.MULTIPLICITY_ONE);
		
		Connection source = getOptionalParameter(arg1, "source", Connection.class);
		Connection target = getOptionalParameter(arg1, "target", Connection.class);
		
		EObject sourceContainer = source.eContainer();
		String srcContainerName = (sourceContainer instanceof GateDecl)? ((GateDecl)sourceContainer).getName() : ((DutyDecl)sourceContainer).getName();
		EObject targetContainer = target.eContainer();
		String tarContainerName = (targetContainer instanceof GateDecl)? ((GateDecl)targetContainer).getName() : ((DutyDecl)targetContainer).getName();
		// Source and target are connections
		// Build names like constituent::source.eContainer()::source
		ComplexName sourceName = SosADLFactory.eINSTANCE.createComplexName();
		ComplexName targetName = SosADLFactory.eINSTANCE.createComplexName();
		
		sourceName.getName().add(sourceConstituent.getName());
		sourceName.getName().add(srcContainerName);
		sourceName.getName().add(source.getName());
		
		targetName.getName().add(targetConstituent.getName());
		targetName.getName().add(tarContainerName);
		targetName.getName().add(target.getName());
		
		newU.setConnLeft(sourceName);
		newU.setConnRight(targetName);

		ArchBehaviorDecl arch = (ArchBehaviorDecl) sourceConstituent.eContainer();
		// Create new binary expression
		
		Expression curBinding = arch.getBindings();
		if (curBinding!=null) {
			BinaryExpression exp = SosADLFactory.eINSTANCE.createBinaryExpression();
			exp.setOp("and");
			exp.setLeft(newU);
			exp.setRight(curBinding);
			arch.setBindings(exp);
		} else {
			arch.setBindings(newU);
		}
		
		//arch.setBindings(exp);
	}

}
