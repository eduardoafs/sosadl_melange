package org.archware.sosadl.design.tools;

import java.util.Collection;
import java.util.Map;

import org.archware.sosadl.sosADL.ArchBehaviorDecl;
import org.archware.sosadl.sosADL.Constituent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;

public class DeleteElement extends AbstractExternalJavaAction{

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true; // Always can execute
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		Object o = arg0.toArray()[0];
		if (o instanceof Constituent) {
			ArchBehaviorDecl beha = (ArchBehaviorDecl) ((Constituent)o).eContainer();
			beha.getConstituents().remove(o);
		}
	}

}
