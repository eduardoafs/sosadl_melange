package org.archware.sosadl.design.tools;

import java.util.Collection;
import java.util.Map;

import org.archware.sosadl.sosADL.AssertionDecl;
import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.sosADL.DutyDecl;
import org.archware.sosadl.sosADL.MediatorDecl;
import org.archware.sosadl.sosADL.ModeType;
import org.archware.sosadl.sosADL.Protocol;
import org.archware.sosadl.sosADL.ProtocolDecl;
import org.archware.sosadl.sosADL.SosADLFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;

public class CreateDuty extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		SosADLFactory fac = SosADLFactory.eINSTANCE;
		Object o = arg0.toArray()[0];
		if (!(o instanceof MediatorDecl)) {
			// DO NOTHING
			return;
		}
		MediatorDecl m = (MediatorDecl) o;
		
		DutyDecl newDuty = fac.createDutyDecl();
		
		newDuty.setName("duty"+m.getDuties().size());
		
		// A lot of fields need to be initialized, build required objects
		Connection c = fac.createConnection();
		c.setName("newConnection");
		c.setMode(ModeType.MODE_TYPE_INOUT);
		c.setValueType(fac.createIntegerType());
		AssertionDecl a = fac.createAssertionDecl();
		a.setName("default");
		Protocol _p0 = fac.createProtocol();
		_p0.getStatements().add(fac.createDoneProtocol());
		a.setBody(_p0);

		ProtocolDecl p = fac.createProtocolDecl();
		p.setName("default");
		Protocol _p1 = fac.createProtocol();
		_p1.getStatements().add(fac.createDoneProtocol());
		p.setBody(_p1);
		
		// Initialize the fields
		newDuty.getConnections().add(c);
		newDuty.getAssertions().add(a);
		newDuty.getProtocols().add(p);
		
		// New, just add the new duty to the mediator
		m.getDuties().add(newDuty);

	}

}
