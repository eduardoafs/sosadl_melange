package org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory;
import org.archware.sosadl.gemoc.xsosadl.sosADL.FunctionDecl;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter;
import org.archware.sosadl.gemoc.xsosadlmt.sosADL.Valuing;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FunctionDeclAdapter extends EObjectAdapter<FunctionDecl> implements org.archware.sosadl.gemoc.xsosadlmt.sosADL.FunctionDecl {
  private XSosadlMTAdaptersFactory adaptersFactory;
  
  public FunctionDeclAdapter() {
    super(org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance());
    adaptersFactory = org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.XSosadlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public FormalParameter getData() {
    return (FormalParameter) adaptersFactory.createAdapter(adaptee.getData(), eResource);
  }
  
  @Override
  public void setData(final FormalParameter o) {
    if (o != null)
    	adaptee.setData(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.FormalParameterAdapter) o).getAdaptee());
    else adaptee.setData(null);
  }
  
  private EList<FormalParameter> parameters_;
  
  @Override
  public EList<FormalParameter> getParameters() {
    if (parameters_ == null)
    	parameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParameters(), adaptersFactory, eResource);
    return parameters_;
  }
  
  @Override
  public DataType getType() {
    return (DataType) adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final DataType o) {
    if (o != null)
    	adaptee.setType(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.DataTypeAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  private EList<Valuing> valuing_;
  
  @Override
  public EList<Valuing> getValuing() {
    if (valuing_ == null)
    	valuing_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getValuing(), adaptersFactory, eResource);
    return valuing_;
  }
  
  @Override
  public Expression getExpression() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final Expression o) {
    if (o != null)
    	adaptee.setExpression(((org.archware.sosadl.gemoc.xsosadl.adapters.xsosadlmt.sosADL.ExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.eINSTANCE.getFunctionDecl();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__DATA:
    		return getData();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__NAME:
    		return getName();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__PARAMETERS:
    		return getParameters();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__TYPE:
    		return getType();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__VALUING:
    		return getValuing();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__DATA:
    		return getData() != null;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__PARAMETERS:
    		return getParameters() != null && !getParameters().isEmpty();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__TYPE:
    		return getType() != null;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__VALUING:
    		return getValuing() != null && !getValuing().isEmpty();
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__EXPRESSION:
    		return getExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__DATA:
    		setData(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.FormalParameter)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__PARAMETERS:
    		getParameters().clear();
    		getParameters().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__TYPE:
    		setType(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.DataType)
    		 newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__VALUING:
    		getValuing().clear();
    		getValuing().addAll((Collection) newValue);
    		return;
    	case org.archware.sosadl.gemoc.xsosadlmt.sosADL.SosADLPackage.FUNCTION_DECL__EXPRESSION:
    		setExpression(
    		(org.archware.sosadl.gemoc.xsosadlmt.sosADL.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
