package sosADL.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.LinkedList
import java.util.List
import org.archware.sosadl.sosADL.ArchitectureDecl
import org.archware.sosadl.sosADL.BinaryExpression
import org.archware.sosadl.sosADL.Connection
import org.archware.sosadl.sosADL.Constituent
import org.archware.sosadl.sosADL.DutyDecl
import org.archware.sosadl.sosADL.Expression
import org.archware.sosadl.sosADL.GateDecl
import org.archware.sosadl.sosADL.IdentExpression
import org.archware.sosadl.sosADL.MediatorDecl
import org.archware.sosadl.sosADL.SystemDecl
import org.archware.sosadl.sosADL.Unify
import org.archware.utils.ModelUtils
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import java.util.Random

@Aspect(className=ArchitectureDecl)
class ArchitectureDeclAspect {
	//private Map<String, String> context;
	@Main
	def public void main() {
		// propagate values from input gates
		for (GateDecl g : _self.gates) {
			for (Connection c : g.connections) {
				ConnectionAspect.propagateValue(c)
			}
		}

		// try to execute component's behavior
		for (Constituent c : _self.behavior.constituents) {
			val EObject o = ModelUtils.resolve(c.value as IdentExpression)
			if (o instanceof SystemDecl) {
				SystemDeclAspect.run(o)//, _self.context)
			} else if (o instanceof MediatorDecl) {
				MediatorDeclAspect.run(o)//, _self.context)
			}
		}
	}
	
	@InitializeModel
	def public void init(EList<String> args) {
		// put random values into the input gates
		val r = new Random
		for (GateDecl gate : _self.gates) {
			// random values into connections
			for (Connection c : gate.connections) {
				ConnectionAspect.value(c, "value"+r.nextInt())
			}
		}
		// unify gates
		ExpressionAspect.performAction(_self.behavior.bindings)
		println("Started")
	}


}

@Aspect(className=SystemDecl)
class SystemDeclAspect {
	@Step
	def public void run(){//Map<String, String> context) {
		println("Running "+_self.name)
	}
}

@Aspect(className=MediatorDecl)
class MediatorDeclAspect {
	@Step	
	def public void run(){//Map<String, String> context) {
		println("Running "+_self.name)
	}
}

@Aspect(className=Unify)
class UnifyAspect extends ExpressionAspect {
	public def void performAction() {
		val Connection left = ModelUtils.resolve(_self.connLeft) as Connection
		val Connection right = ModelUtils.resolve(_self.connRight) as Connection
		if (ConnectionAspect.unifiedConnections(left) === null)
			ConnectionAspect.unifiedConnections(left, new LinkedList<Connection>())
		if (ConnectionAspect.unifiedConnections(right) === null)
			ConnectionAspect.unifiedConnections(right, new LinkedList<Connection>())
		ConnectionAspect.unifiedConnections(left).add(right)
		ConnectionAspect.unifiedConnections(right).add(left)
	}
}

@Aspect(className=BinaryExpression)
class BinaryExpressionAspect extends ExpressionAspect {
	public def void performAction() {
		_self.left.performAction // recursive call to unify
		_self.right.performAction // recursive call to unify
	}
}

@Aspect(className=Expression)
abstract class ExpressionAspect {
	public def Object evaluate() {
		println("Evaluating expression "+_self)
		return null 
	}

	abstract def void performAction()
}

@Aspect(className=Connection)
class ConnectionAspect {
	protected String value
	protected List<Connection> unifiedConnections

	def public void propagateValue() {
		for (Connection c : unifiedConnections(_self)) {
			if (ConnectionAspect.value(c) != ConnectionAspect.value(_self)) {
				// copy value
				ConnectionAspect.value(c, ConnectionAspect.value(_self))
				// propagate recursivelly
				ConnectionAspect.propagateValue(c)
			}
		}
	}
}

