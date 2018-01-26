package org.archware.sosadl.validation.typing;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

import org.archware.sosadl.sosADL.Any;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.sosADL.MethodCall;
import org.archware.sosadl.sosADL.SosADLPackage;
import org.archware.sosadl.validation.typing.proof.Check_datatype;
import org.archware.sosadl.validation.typing.proof.ProofTerm;
import org.archware.sosadl.validation.typing.proof.Type_expression_node;
import org.archware.sosadl.validation.typing.proof.Type_protocol_nonroot_expression;
import org.archware.sosadl.validation.typing.proof.Type_protocol_nonroot_expression_node;
import org.archware.sosadl.validation.typing.proof.Type_protocol_root_expression;
import org.archware.sosadl.validation.typing.proof.Type_protocol_root_expression_node;
import org.archware.utils.ListUtils;
import org.archware.utils.Pair;
import org.archware.utils.PentaFunction;
import org.eclipse.xtext.xbase.lib.ListExtensions;

public abstract class TypeCheckerProtocolExpression extends TypeCheckerBehavior {

    protected Pair<Type_protocol_root_expression, DataType> type_protocol_root_expression(Environment gamma, Expression e) {
        return type_protocol_expression(Type_protocol_root_expression.class, this::type_protocol_root_expression_node,
                gamma, e, this::createType_protocol_root_expression_and_type);
    }

    private Pair<Type_protocol_nonroot_expression, DataType> type_protocol_nonroot_expression(Environment gamma, Expression e) {
        return type_protocol_expression(Type_protocol_nonroot_expression.class, this::type_protocol_nonroot_expression_node,
                gamma, e, this::createType_protocol_nonroot_expression_and_type);
    }

    private <T extends ProofTerm, TN extends ProofTerm> Pair<T, DataType> type_protocol_expression(Class<T> tpe, BiFunction<Environment, Expression, Pair<TN, DataType>> tpen,
                                                               Environment gamma, Expression e,
                                                               PentaFunction<Environment, Expression, DataType, TN, Check_datatype, T> create) {
        if (e != null) {
            saveEnvironment(e, gamma);
            Pair<TN, DataType> p1 = tpen.apply(gamma, e);
            TN ten = p1.getA();
            DataType t = p1.getB();
            if (ten != null && t != null) {
                saveProof(e, ten);
                saveType(e, t);
                T proof = p(tpe, gamma, (gamma_) -> p(tpe, t,
                        (t_) -> create.apply(gamma_, e, t_, ten, check_datatype(t_))));
                return new Pair<>(proof, t);
            } else {
                return new Pair<>(null, null);
            }
        } else {
            return new Pair<>(null, null);
        }
    }

    private Pair<Type_protocol_root_expression_node,DataType> type_protocol_root_expression_node(Environment gamma, Expression e) {
        if(e instanceof Any) {
            return root_expression_any(gamma, e);
        } else {
            return root_expression_nonroot(gamma, e);
        }
    }

    private Pair<Type_protocol_root_expression_node, DataType> root_expression_nonroot(Environment gamma, Expression e) {
        Pair<Type_protocol_nonroot_expression_node, DataType> pt = type_protocol_nonroot_expression_node(gamma, e);
        Type_protocol_nonroot_expression_node p1 = pt.getA();
        DataType t = pt.getB();
        if(p1 != null && t != null) {
            Type_protocol_root_expression_node proof = p(Type_protocol_root_expression_node.class, gamma,
                    (gamma_) -> p(Type_protocol_root_expression_node.class, t,
                            (t_) -> createType_protocol_root_expression_nonroot(gamma_, e, t_, p1)));
            return new Pair<>(proof, t);
        } else {
            return new Pair<>(null, null);
        }
    }

    private Pair<Type_protocol_root_expression_node, DataType> root_expression_any(Environment gamma, Expression e) {
        DataType t = createFreshTypeVariable(e, null, (lb, ub) -> chooseBetweenOrElse(ub, lb, Optional.empty()));
        Type_protocol_root_expression_node proof = p(Type_protocol_root_expression_node.class, gamma,
                (gamma_) -> p(Type_protocol_root_expression_node.class, t,
                    (t_) -> createType_protocol_root_expression_any(gamma_, t_)));
        return new Pair<>(proof, t);
    }

    private Pair<Type_protocol_nonroot_expression_node,DataType> type_protocol_nonroot_expression_node(Environment gamma, Expression e) {
        if(e instanceof MethodCall) {
            return nonroot_expression_MethodCall(gamma, (MethodCall) e);
        } else {
            return nonroot_expression_generic(gamma, e);
        }
    }

    private Pair<Type_protocol_nonroot_expression_node, DataType> nonroot_expression_MethodCall(Environment gamma, MethodCall mc) {
        String methodName = mc.getMethod();
        if (methodName != null) {
            Pair<Type_protocol_nonroot_expression, DataType> self = type_protocol_nonroot_expression(gamma, mc.getObject());
            List<Pair<Expression, Pair<Type_protocol_root_expression, DataType>>> params = ListExtensions.map(mc.getParameters(),
                    (p) -> new Pair<>(p, type_protocol_root_expression(gamma, p)));
            DataType selfType = self.getB();
            if (self.getA() != null && selfType != null
                    && params.stream().allMatch((p) -> p.getA() != null && p.getB() != null)) {
                NonRootMethodCallTyper nrmct = new NonRootMethodCallTyper(gamma, mc, methodName, selfType, self.getA(), params);
                Optional<DataType> oret = nrmct.computeReturnType();
                if (oret.isPresent()) {
                    DataType ret = oret.get();
                    return new Pair<>(saveProof(mc, nrmct.computeProof()), saveType(mc, ret));
                } else {
                    return new Pair<>(null, null);
                }

            } else {
                return new Pair<>(null, null);
            }
        } else {
            error("A method name must be provided", mc, SosADLPackage.Literals.METHOD_CALL__METHOD);
            return new Pair<>(null, null);
        }
    }

    private Pair<Type_protocol_nonroot_expression_node, DataType> nonroot_expression_generic(Environment gamma, Expression e) {
        Pair<Type_expression_node<Type_protocol_nonroot_expression>, DataType> pt =
                type_expression_node(gamma, e, this::type_protocol_nonroot_expression);
        Type_expression_node<Type_protocol_nonroot_expression> p1 = pt.getA();
        DataType t = pt.getB();
        if(p1 != null && t != null) {
            Type_protocol_nonroot_expression_node proof =
                    p(Type_protocol_nonroot_expression_node.class, gamma,
                            (gamma_) -> p(Type_protocol_nonroot_expression_node.class, t,
                                    (t_) -> createType_protocol_nonroot_expression_generic(gamma_, e, t_, p1)));
            return new Pair<>(proof, t);
        } else {
            return new Pair<>(null, null);
        }
    }


    private class NonRootMethodCallTyper extends CommonMethodCall<Type_protocol_root_expression> {
        private final Type_protocol_nonroot_expression selfP;

        public NonRootMethodCallTyper(Environment gamma, MethodCall mc, String methodName, DataType selfType,
                               Type_protocol_nonroot_expression selfP,
                               List<Pair<Expression, Pair<Type_protocol_root_expression, DataType>>> params) {
            super(gamma, mc, methodName, selfType, params);
            this.selfP = selfP;
        }

        /*
         * (non-Javadoc)
         *
         * @see org.archware.sosadl.validation.typing.Typer#computeProof()
         */
        public Type_protocol_nonroot_expression_node computeProof() {
            return p(Type_protocol_nonroot_expression_node.class, gamma, this::buildProof);
        }

        private Type_protocol_nonroot_expression_node buildProof(Environment gamma) {
            List<Pair<Expression, Pair<Type_protocol_root_expression, DataType>>> p = params;
            Type_protocol_nonroot_expression_node proof = p(Type_protocol_nonroot_expression_node.class, selfType,
                    (DataType selfType_) -> p(Type_protocol_nonroot_expression_node.class, decl.getData().getType(),
                            (DataType ddt_) -> p(Type_protocol_nonroot_expression_node.class, p,
                                    (params_) -> doBuildProof(gamma, selfType_, ddt_, params_))));
            return proof;
        }

        private Type_protocol_nonroot_expression_node doBuildProof(Environment gamma, DataType selfType_, DataType ddt_,
                                                     List<Pair<Expression, Pair<Type_protocol_root_expression, DataType>>> params_) {
            return createType_protocol_nonroot_expression_MethodCall(gamma, mc.getObject(), selfType_, tec.getDataTypeDecl(), ddt_,
                    tec.getMethods(), methodName, decl.getParameters(), decl.getType(), mc.getParameters(), selfP,
                    createEx_intro(BigInteger.valueOf(tecRank), createReflexivity()),
                    subtype(selfType, decl.getData().getType(), mc, null).orElse(null),
                    createEx_intro(BigInteger.valueOf(mRank),
                            createConj(createReflexivity(),
                                    createConj(createReflexivity(),
                                            createConj(createReflexivity(), createReflexivity())))),
                    proveForall2(decl.getParameters(), mc.getParameters(), (fp, p) -> {
                        Pair<Type_protocol_root_expression, DataType> tp = ListUtils.assoc(params_, p);
                        Type_protocol_root_expression pp = tp.getA();
                        DataType pt = tp.getB();
                        return createEx_intro(fp.getType(), createConj(createReflexivity(),
                                createEx_intro(pt, createConj(pp, subtype(pt, fp.getType(), mc, null).orElse(null)))));
                    }));
        }
    }

}