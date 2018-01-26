package org.archware.sosadl.design;

import org.archware.sosadl.sosADL.ArchitectureDecl;
import org.archware.sosadl.sosADL.BinaryExpression;
import org.archware.sosadl.sosADL.Connection;
import org.archware.sosadl.sosADL.Constituent;
import org.archware.sosadl.sosADL.DutyDecl;
import org.archware.sosadl.sosADL.EntityBlock;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.GateDecl;
import org.archware.sosadl.sosADL.IdentExpression;
import org.archware.sosadl.sosADL.MediatorDecl;
import org.archware.sosadl.sosADL.SosADL;
import org.archware.sosadl.sosADL.SystemDecl;
import org.archware.sosadl.sosADL.Unify;
import org.archware.utils.ModelUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%
	 * 2Fdoc%2Findex.html&cp=24 for documentation on how to write service
	 * methods.
	 */

	/**
	 * Returns a list of all gates of a constituent
	 * @param c
	 *            constituent
	 * @return list of gates
	 */
	@SuppressWarnings("all")
	public EList<GateDecl> allGates(Constituent c) {
		EObject e = ModelUtils.resolve((IdentExpression) c.getValue());

		if (e instanceof SystemDecl) {
			return ((SystemDecl) e).getGates();
		} else
			return null;
	}

	/**
	 * Returns list with all duties of a constituent
	 * @param c
	 *            constituent
	 * @return list of duties
	 */
	@SuppressWarnings("all")
	public EList<DutyDecl> allDuties(Constituent c) {
		EObject e = ModelUtils.resolve((IdentExpression) c.getValue());

		if (e instanceof MediatorDecl) {
			return ((MediatorDecl) e).getDuties();
		} else
			return null;
	}

	public Connection firstConnection(Unify u) {
		return (Connection) ModelUtils.resolve(u.getConnLeft());
	}

	public Connection secondConnection(Unify u) {
		return (Connection) ModelUtils.resolve(u.getConnRight());
	}

	/**
	 * 
	 * @param e
	 * @return
	 */
	public EList<EObject> availableConstituent(EObject e) {
		EList<EObject> constituents = new BasicEList<EObject>();

		SosADL find = ModelUtils.getModel(e);

		// Now find is a SosADL
		EntityBlock entity = find.getContent().getDecls();

		// Add all systems and mediators
		constituents.addAll(entity.getSystems());
		constituents.addAll(entity.getMediators());

		// TODO resolve imports
		/*
		 * for (Import i : ((SosADL)find).getImports()) { String libName =
		 * i.getImportedLibrary(); }
		 */

		return constituents;
	}

	public EList<Unify> allUnifies(ArchitectureDecl arch) {
		EList<Unify> uni = new BasicEList<Unify>();
		Expression binding = arch.getBehavior().getBindings();
		
		uni.addAll(extractUnify(binding));
		return uni;
	}
	
	/**
	 * Recursive method to retrieve all unifies, a simple tree-path algorithm
	 * @param e expression with the unifies
	 * @return list of unifies
	 */
	private EList<Unify> extractUnify(Expression e) {
		EList<Unify> r = new BasicEList<Unify>();
		if (e instanceof Unify) {
			r.add((Unify) e);
		} else {
			if (e instanceof BinaryExpression) {
				BinaryExpression bin = (BinaryExpression) e;
				r.addAll(extractUnify(bin.getLeft()));
				r.addAll(extractUnify(bin.getRight()));
			}
		}
		return r;
	}


}
