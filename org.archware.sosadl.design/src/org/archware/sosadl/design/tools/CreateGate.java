package org.archware.sosadl.design.tools;

import java.util.Collection;
import java.util.Map;

import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.sosADL.GateDecl;
import org.archware.sosadl.sosADL.ModeType;
import org.archware.sosadl.sosADL.Protocol;
import org.archware.sosadl.sosADL.ProtocolDecl;
import org.archware.sosadl.sosADL.SosADLFactory;
import org.archware.sosadl.sosADL.SystemDecl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;

public class CreateGate extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		SosADLFactory fac = SosADLFactory.eINSTANCE;
		Object o = arg0.toArray()[0];
		if (!(o instanceof SystemDecl)) {
			// DO NOTHING
			return;
		}
		SystemDecl m = (SystemDecl) o;
		
		GateDecl newDuty = fac.createGateDecl();
		
		newDuty.setName("gate"+m.getGates().size());
		
		// A lot of fields need to be initialized, build required objects
		Connection c = fac.createConnection();
		c.setName("newConnection");
		c.setMode(ModeType.MODE_TYPE_INOUT);
		c.setValueType(fac.createIntegerType());
		
		ProtocolDecl p = fac.createProtocolDecl();
		p.setName("default");
		Protocol _p1 = fac.createProtocol();
		_p1.getStatements().add(fac.createDoneProtocol());
		p.setBody(_p1);
		
		// Initialize the fields
		newDuty.getConnections().add(c);
		newDuty.getProtocols().add(p);
		
		// New, just add the new duty to the mediator
		m.getGates().add(newDuty);

	}

}
