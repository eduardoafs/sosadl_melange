package org.archware.sosadl.design.tools;

import java.util.Collection;
import java.util.Map;

import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.sosADL.DutyDecl;
import org.archware.sosadl.sosADL.GateDecl;
import org.archware.sosadl.sosADL.ModeType;
import org.archware.sosadl.sosADL.SosADLFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;

public class CreateElement extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		Object type = getOptionalParameter(arg1, "type", Object.class);
		EObject parent = (EObject) arg0.toArray()[0];
		SosADLFactory fac = SosADLFactory.eINSTANCE;
		if (type.equals("connection")) {
			Connection c = fac.createConnection();
			c.setName("newConnection");
			c.setMode(ModeType.MODE_TYPE_INOUT);
			c.setValueType(fac.createIntegerType());
			// Parent is a gate or duty
			if (parent instanceof GateDecl) {
				((GateDecl) parent).getConnections().add(c);
			} else {
				((DutyDecl) parent).getConnections().add(c);
			}
		}
	}

}
