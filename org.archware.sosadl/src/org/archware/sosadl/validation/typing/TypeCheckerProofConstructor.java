package org.archware.sosadl.validation.typing;

import org.archware.sosadl.sosADL.*;
import org.archware.sosadl.validation.typing.proof.*;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import java.math.BigInteger;
import java.util.List;

public abstract class TypeCheckerProofConstructor extends TypeCheckerInference {

    protected Type_sosADL createType_SosADL_file(EList<Import> i, Unit d, Type_unit p) {
        return new Type_SosADL_file(i, d, p);
    }

    protected Type_unit createType_SoS(Environment gamma, String n, EntityBlock e, Type_entityBlock p) {
        return new Type_SoS(gamma, n, e, p);
    }

    protected Type_unit createType_Library(Environment gamma, String n, EntityBlock e, Type_entityBlock p) {
        return new Type_Library(gamma, n, e, p);
    }

    protected Type_entityBlock createType_EntityBlock_whole(Environment gamma, List<DataTypeDecl> datatypes,
                                                            Environment gamma1, List<FunctionDecl> funs, Environment gamma2, List<SystemDecl> systems,
                                                            Environment gamma3, List<MediatorDecl> mediators, Environment gamma4, List<ArchitectureDecl> architectures,
                                                            Environment gamma5, Incrementally<DataTypeDecl, Type_datatypeDecl> p1,
                                                            Incrementally<FunctionDecl, Type_function> p2,
                                                            Incrementally<SystemDecl, Simple_increment<SystemDecl, Type_system>> p3,
                                                            Incrementally<MediatorDecl, Simple_increment<MediatorDecl, Type_mediator>> p4,
                                                            Incrementally<ArchitectureDecl, Simple_increment<ArchitectureDecl, Type_architecture>> p5) {
        return new Type_EntityBlock_whole(gamma, datatypes, gamma1, funs, gamma2, systems, gamma3, mediators, gamma4,
                architectures, gamma5, p1, p2, p3, p4, p5);
    }
    
    protected Type_architecture createType_ArchitectureDecl(Environment gamma, ArchitectureDecl a) {
    	return new Type_ArchitectureDecl(gamma, a);
    }

    protected Type_system createType_SystemDecl(Environment gamma, String name, EList<FormalParameter> params,
                                                EList<FormalParameter> params2, Environment gamma1, EList<DataTypeDecl> datatypes, Environment gamma2,
                                                EList<GateDecl> gates, Environment gamma3, BehaviorDecl bhv, EList<AssertionDecl> assrt,
                                                Mutually_translate<FormalParameter, Type_formalParameter> p1,
                                                Incrementally<DataTypeDecl, Type_datatypeDecl> p2,
                                                Ex<List<GateDecl>, Mutually_translate<GateDecl, Type_gate>> p3, Type_behavior p4,
                                                Forall<AssertionDecl, Type_assertion> p5) {
        return new Type_SystemDecl(gamma, name, params, params2, gamma1, datatypes, gamma2, gates, gamma3, bhv, assrt,
                p1, p2, p3, p4, p5);
    }

    protected Type_mediator createType_MediatorDecl(Environment gamma, String name, EList<FormalParameter> params,
                                                    EList<FormalParameter> params2, Environment gamma1, EList<DataTypeDecl> datatypes, Environment gamma2,
                                                    EList<DutyDecl> duties, Environment gamma3, BehaviorDecl bhv, EList<AssertionDecl> assump, EList<AssertionDecl> assrt,
                                                    Mutually_translate<FormalParameter, Type_formalParameter> p1,
                                                    Incrementally<DataTypeDecl, Type_datatypeDecl> p2,
                                                    Ex<List<DutyDecl>, Mutually_translate<DutyDecl, Type_duty>> p3, Type_behavior p4,
                                                    Forall<AssertionDecl, Type_assertion> p5, Forall<AssertionDecl, Type_assertion> p6) {
        return new Type_MediatorDecl(gamma, name, params, params2, gamma1, datatypes, gamma2, duties, gamma3, bhv,
                assump, assrt, p1, p2, p3, p4, p5, p6);
    }

    protected Type_datatypeDecl createType_DataTypeDecl_def(Environment gamma, String name, DataType t, DataType t2,
                                                            EList<FunctionDecl> funs, Environment gamma1, Type_datatype p1,
                                                            Forall<FunctionDecl, Ex<FormalParameter, And<Equality, Equality>>> p2,
                                                            Incrementally<FunctionDecl, Type_function> p3) {
        return new Type_DataTypeDecl_def(gamma, name, t, t2, funs, gamma1, p1, p2, p3);
    }

    protected Type_datatypeDecl createType_DataTypeDecl_def_None(Environment gamma, String name, String name2,
                                                                 EList<FunctionDecl> funs, Environment gamma1, Equality p1,
                                                                 Forall<FunctionDecl, Ex<FormalParameter, And<Equality, Equality>>> p2,
                                                                 Incrementally<FunctionDecl, Type_function> p3) {
        return new Type_DataTypeDecl_def_None(gamma, name, name2, funs, gamma1, p1, p2, p3);
    }

    protected Type_datatype createType_NamedType(Environment gamma, String n, DataType u, DataTypeDecl t,
                                                 Ex<List<FunctionDecl>, Equality> p) {
        return new Type_NamedType(gamma, n, u, t, p);
    }

    protected Type_datatype createType_TupleType(Environment gamma, EList<FieldDecl> fields, EList<FieldDecl> fields2,
                                                 Equality p1,
                                                 Forall2<FieldDecl, FieldDecl, And<Equality, Ex<DataType, And<Equality, Ex<DataType, And<Equality, Type_datatype>>>>>> p2) {
        return new Type_TupleType(gamma, fields, fields2, p1, p2);
    }

    protected Type_datatype createType_SequenceType(Environment gamma, DataType t, DataType t2, Type_datatype p) {
        return new Type_SequenceType(gamma, t, t2, p);
    }

    protected Type_datatype createType_RangeType_trivial(Environment gamma, Expression min, Expression max,
                                                         Expression_le p1) {
        return new Type_RangeType_trivial(gamma, min, max, p1);
    }

    protected Type_datatype createType_BooleanType(Environment gamma) {
        return new Type_BooleanType(gamma);
    }

    protected Type_function createType_FunctionDecl_Method(Environment gamma, String dataName, String dataTypeName,
                                                           DataTypeDecl dataTypeDecl, DataType dataTypeReal, EList<FunctionDecl> dataTypeMethods, String name,
                                                           EList<FormalParameter> params, EList<FormalParameter> params2, Environment gammap, DataType rettype,
                                                           DataType rettype2, EList<Valuing> vals, Environment gammav, Expression retexpr, DataType tau,
                                                           Environment gamma1, Equality p1, Type_datatype p2,
                                                           Mutually_translate<FormalParameter, Type_formalParameter> p3,
                                                           Incrementally<Valuing, Type_valuing<Type_expression>> p4, Type_expression p5, Subtype p6, Equality p7) {
        return new Type_FunctionDecl_Method(gamma, dataName, dataTypeName, dataTypeDecl, dataTypeReal, dataTypeMethods,
                name, params, params2, gammap, rettype, rettype2, vals, gammav, retexpr, tau, gamma1, p1, p2, p3, p4,
                p5, p6, p7);
    }

    protected <T> Type_expression_node<T> createType_expression_IntegerValue(Environment gamma, BigInteger v) {
        return new Type_expression_IntegerValue<>(gamma, v);
    }

    protected Type_expression createType_expression_and_type(Environment gamma, Expression e, DataType t,
                                                             Type_expression_node<Type_expression> p1, Check_datatype p2) {
        return new Type_expression_and_type(gamma, e, t, p1, p2);
    }

    protected Expression_le createIn_Z(Expression l, BigInteger zl, Expression r, BigInteger zr, Equality p1,
                                       Equality p2, Equality p3) {
        return new In_Z(l, zl, r, zr, p1, p2, p3);
    }

    protected Constexpr_expression createConstexpr_IntegerValue(BigInteger v) {
        return new Constexpr_IntegerValue(v);
    }

    protected Constexpr_expression createConstexpr_Opposite(Expression e, Constexpr_expression p) {
        return new Constexpr_Opposite(e, p);
    }

    protected Constexpr_expression createConstexpr_Same(Expression e, Constexpr_expression p) {
        return new Constexpr_Same(e, p);
    }

    protected Constexpr_expression createConstexpr_Add(Expression l, Expression r, Constexpr_expression p1,
                                                       Constexpr_expression p2) {
        return new Constexpr_Add(l, r, p1, p2);
    }

    protected Constexpr_expression createConstexpr_Sub(Expression l, Expression r, Constexpr_expression p1,
                                                       Constexpr_expression p2) {
        return new Constexpr_Sub(l, r, p1, p2);
    }

    protected Constexpr_expression createConstexpr_Mul(Expression l, Expression r, Constexpr_expression p1,
                                                       Constexpr_expression p2) {
        return new Constexpr_Mul(l, r, p1, p2);
    }

    protected Constexpr_expression createConstexpr_Div(Expression l, Expression r, Constexpr_expression p1,
                                                       Constexpr_expression p2) {
        return new Constexpr_Div(l, r, p1, p2);
    }

    protected Constexpr_expression createConstexpr_Mod(Expression l, Expression r, Constexpr_expression p1,
                                                       Constexpr_expression p2) {
        return new Constexpr_Mod(l, r, p1, p2);
    }

    protected <T, P> Incrementally<T, P> createIncrementally_nil(Environment gamma) {
        return new Incrementally_nil<>(gamma);
    }

    protected <T, P> Incrementally<T, P> createIncrementally_cons(Environment gamma, T x, Environment gammai, List<T> l,
                                                                  Environment gamma1, P p1, Incrementally<T, P> p2) {
        return new Incrementally_cons<T, P>(gamma, x, gammai, l, gamma1, p1, p2);
    }

    protected <T, P> Simple_increment<T, P> createSimple_increment_step(String n, String c, Environment gamma, T x,
                                                                        Environment gamma1, Equality p1, P p2) {
        return new Simple_increment_step<>(n, c, gamma, x, gamma1, p1, p2);
    }

    protected <T, P> Mutually<T, P> createMutually_all_explicit(String name, String content, Environment gamma,
                                                                List<T> l, Environment gamma1, Equality p1, Equality p2, Forall<T, P> p3) {
        return new Mutually_all_explicit<>(name, content, gamma, l, gamma1, p1, p2, p3);
    }

    protected <T, P> Mutually_translate<T, P> createMutually_translate_all_explicit(String name, String content,
                                                                                    Environment gamma, List<T> l, List<T> l1, Environment gamma1, Equality p1, Equality p2,
                                                                                    Forall2<T, T, And<Equality, P>> p3) {
        return new Mutually_translate_all_explicit<>(name, content, gamma, l, l1, gamma1, p1, p2, p3);
    }

    protected <T, P> Optionally<T, P> createOptionally_None(Environment gamma) {
        return new Optionally_None<>(gamma);
    }

    protected <T, P> Optionally<T, P> createOptionally_Some(Environment gamma, T x, P p1) {
        return new Optionally_Some<>(gamma, x, p1);
    }

    protected <A, B> And<A, B> createConj(A a, B b) {
        return new Conj<>(a, b);
    }

    protected <T, P> Ex<T, P> createEx_intro(T t, P p) {
        return new Ex_intro<>(t, p);
    }

    protected <T, P> Forall<T, P> createForall_nil() {
        return new Forall_nil<>();
    }

    protected <T, P> Forall<T, P> createForall_cons(T t, P p1, Forall<T, P> p2) {
        return new Forall_cons<>(t, p1, p2);
    }

    protected <A, B, P> Forall2<A, B, P> createForall2_nil() {
        return new Forall2_nil<>();
    }

    protected <A, B, P> Forall2<A, B, P> createForall2_cons(A x, B y, P p1, Forall2<A, B, P> p2) {
        return new Forall2_cons<A, B, P>(x, y, p1, p2);
    }

    protected Equality createReflexivity() {
        return new Eq_refl();
    }

    protected True createI() {
        return new I();
    }

    protected Type_formalParameter createType_FormalParameter_typed(Environment gamma, String n, DataType t,
                                                                    DataType t1, Environment gamma1, Type_datatype p1) {
        return new Type_FormalParameter_typed(gamma, n, t, t1, gamma1, p1);
    }

    protected <T> Type_expression_node<T> createType_expression_Same(Environment gamma, Expression e, DataType tau,
                                                                     Expression min, Expression max, T p1, Subtype p2) {
        return new Type_expression_Same<>(gamma, e, tau, min, max, p1, p2);
    }

    protected <T> Type_expression_node<T> createType_expression_Opposite(Environment gamma, Expression e, DataType tau,
                                                                         Expression min, Expression max, T p1, Subtype p2) {
        return new Type_expression_Opposite<>(gamma, e, tau, min, max, p1, p2);
    }

    protected <T> Type_expression_node<T> createType_expression_Not(Environment gamma, Expression e, DataType tau, T p1,
                                                                    Subtype p2) {
        return new Type_expression_Not<>(gamma, e, tau, p1, p2);
    }

    protected <T> Type_expression_node<T> createType_expression_Add(Environment gamma, Expression l, DataType l__tau,
                                                                    Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max,
                                                                    T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Add<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Sub(Environment gamma, Expression l, DataType l__tau,
                                                                    Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max,
                                                                    T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Sub<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Mul(Environment gamma, Expression l, DataType l__tau,
                                                                    Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max,
                                                                    Expression min, Expression max, T p1, Subtype p2, T p3, Subtype p4, Expression_le p5, Expression_le p6,
                                                                    Expression_le p7, Expression_le p8, Expression_le p9, Expression_le pa, Expression_le pb,
                                                                    Expression_le pc) {
        return new Type_expression_Mul<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, min, max, p1, p2,
                p3, p4, p5, p6, p7, p8, p9, pa, pb, pc);
    }

    protected <T> Type_expression_node<T> createType_expression_Div_pos(Environment gamma, Expression l,
                                                                        DataType l__tau, Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min,
                                                                        Expression r__max, Expression min, Expression max, T p1, Subtype p2, T p3, Subtype p4, Expression_le p5,
                                                                        Expression_le p6, Expression_le p7, Expression_le p8, Expression_le p9, Expression_le pa, Expression_le pb,
                                                                        Expression_le pc, Expression_le pd) {
        return new Type_expression_Div_pos<T>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, min, max, p1,
                p2, p3, p4, p5, p6, p7, p8, p9, pa, pb, pc, pd);
    }

    protected <T> Type_expression_node<T> createType_expression_Div_neg(Environment gamma, Expression l,
                                                                        DataType l__tau, Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min,
                                                                        Expression r__max, Expression min, Expression max, T p1, Subtype p2, T p3, Subtype p4, Expression_le p5,
                                                                        Expression_le p6, Expression_le p7, Expression_le p8, Expression_le p9, Expression_le pa, Expression_le pb,
                                                                        Expression_le pc, Expression_le pd) {
        return new Type_expression_Div_neg<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, min, max, p1,
                p2, p3, p4, p5, p6, p7, p8, p9, pa, pb, pc, pd);
    }

    protected <T> Type_expression_node<T> createType_expression_Mod(Environment gamma, Expression l, DataType l__tau,
                                                                    Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max,
                                                                    Expression min, Expression max, T p1, Subtype p2, T p3, Subtype p4, Range_modulo_min p5,
                                                                    Range_modulo_max p6) {
        return new Type_expression_Mod<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, min, max, p1, p2,
                p3, p4, p5, p6);
    }

    protected <T> Type_expression_node<T> createType_expression_Implies(Environment gamma, Expression l,
                                                                        DataType l__tau, Expression r, DataType r__tau, T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Implies<>(gamma, l, l__tau, r, r__tau, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Or(Environment gamma, Expression l, DataType l__tau,
                                                                   Expression r, DataType r__tau, T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Or<>(gamma, l, l__tau, r, r__tau, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Xor(Environment gamma, Expression l, DataType l__tau,
                                                                    Expression r, DataType r__tau, T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Xor<>(gamma, l, l__tau, r, r__tau, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_And(Environment gamma, Expression l, DataType l__tau,
                                                                    Expression r, DataType r__tau, T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_And<>(gamma, l, l__tau, r, r__tau, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Equal(Environment gamma, Expression l, DataType l__tau,
                                                                      Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max,
                                                                      T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Equal<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Diff(Environment gamma, Expression l, DataType l__tau,
                                                                     Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max,
                                                                     T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Diff<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Lt(Environment gamma, Expression l, DataType l__tau,
                                                                   Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max,
                                                                   T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Lt<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Le(Environment gamma, Expression l, DataType l__tau,
                                                                   Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max,
                                                                   T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Le<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Gt(Environment gamma, Expression l, DataType l__tau,
                                                                   Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max,
                                                                   T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Gt<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Ge(Environment gamma, Expression l, DataType l__tau,
                                                                   Expression l__min, Expression l__max, Expression r, DataType r__tau, Expression r__min, Expression r__max,
                                                                   T p1, Subtype p2, T p3, Subtype p4) {
        return new Type_expression_Ge<>(gamma, l, l__tau, l__min, l__max, r, r__tau, r__min, r__max, p1, p2, p3, p4);
    }

    protected <T> Type_expression_node<T> createType_expression_Ident(Environment gamma, String x, DataType tau,
                                                                      Equality p) {
        return new Type_expression_Ident<>(gamma, x, tau, p);
    }

    protected <T> Type_expression_node<T> createType_expression_MethodCall(Environment gamma, Expression self,
                                                                           DataType t, DataTypeDecl typeDecl, DataType tau, EList<FunctionDecl> methods, String name,
                                                                           EList<FormalParameter> formalparams, DataType ret, EList<Expression> params, T p1,
                                                                           Ex<BigInteger, Equality> p2, Subtype p4,
                                                                           Ex<BigInteger, And<Equality, And<Equality, And<Equality, Equality>>>> p5,
                                                                           Forall2<FormalParameter, Expression, Ex<DataType, And<Equality, Ex<DataType, And<T, Subtype>>>>> p6) {
        return new Type_expression_MethodCall<>(gamma, self, t, typeDecl, tau, methods, name, formalparams, ret, params,
                p1, p2, p4, p5, p6);
    }

    protected <T> Type_expression_node<T> createType_expression_Tuple(Environment gamma, EList<TupleElement> elts,
                                                                      EList<FieldDecl> typ, Equality p1, Forall2<TupleElement, FieldDecl, Equality> p2,
                                                                      Forall2<TupleElement, FieldDecl, Ex<Expression, And<Equality, Ex<DataType, And<Equality, T>>>>> p3) {
        return new Type_expression_Tuple<>(gamma, elts, typ, p1, p2, p3);
    }

    protected <T> Type_expression_node<T> createType_expression_Field(Environment gamma, Expression self,
                                                                      EList<FieldDecl> tau, String name, DataType tau__f, T p1, Equality p2) {
        return new Type_expression_Field<>(gamma, self, tau, name, tau__f, p1, p2);
    }

    protected <T> Type_expression_node<T> createType_expression_Sequence(Environment gamma, EList<Expression> elts,
                                                                         DataType tau, Forall<Expression, Ex<DataType, And<T, Subtype>>> p1) {
        return new Type_expression_Sequence<>(gamma, elts, tau, p1);
    }

    protected <T> Type_expression_node<T> createType_expression_Map(Environment gamma, Expression object, DataType tau,
                                                                    String variable, Expression expression, DataType tau__e, T p1, T p2) {
        return new Type_expression_Map<>(gamma, object, tau, variable, expression, tau__e, p1, p2);
    }

    protected <T> Type_expression_node<T> createType_expression_Select(Environment gamma, Expression object,
                                                                       DataType tau, String variable, Expression expression, T p1, T p2) {
        return new Type_expression_Select<>(gamma, object, tau, variable, expression, p1, p2);
    }

    protected Range_modulo_min createRange_modulo_min_pos(Expression lmin, Expression lmax, Expression rmin,
                                                          Expression rmax, Expression min, Expression_le p1, Expression_le p2) {
        return new Range_modulo_min_pos(lmin, lmax, rmin, rmax, min, p1, p2);
    }

    protected Range_modulo_min createRange_modulo_min_zero(Expression lmin, Expression lmax, Expression rmin,
                                                           Expression rmax, Expression min, Expression_le p1, Expression_le p2) {
        return new Range_modulo_min_zero(lmin, lmax, rmin, rmax, min, p1, p2);
    }

    protected Range_modulo_min createRange_modulo_min_neg(Expression lmin, Expression lmax, Expression rmin,
                                                          Expression rmax, Expression min, Expression_le p1, Expression_le p2) {
        return new Range_modulo_min_neg(lmin, lmax, rmin, rmax, min, p1, p2);
    }

    protected Range_modulo_max createRange_modulo_max_pos(Expression lmin, Expression lmax, Expression rmin,
                                                          Expression rmax, Expression min, Expression_le p1, Expression_le p2) {
        return new Range_modulo_max_pos(lmin, lmax, rmin, rmax, min, p1, p2);
    }

    protected Range_modulo_max createRange_modulo_max_zero(Expression lmin, Expression lmax, Expression rmin,
                                                           Expression rmax, Expression min, Expression_le p1, Expression_le p2) {
        return new Range_modulo_max_zero(lmin, lmax, rmin, rmax, min, p1, p2);
    }

    protected Range_modulo_max createRange_modulo_max_neg(Expression lmin, Expression lmax, Expression rmin,
                                                          Expression rmax, Expression min, Expression_le p1, Expression_le p2) {
        return new Range_modulo_max_neg(lmin, lmax, rmin, rmax, min, p1, p2);
    }

    protected Subtype createSubtype_refl(DataType t) {
        return new Subtype_refl(t);
    }

    protected Subtype createSubtype_range(Expression lmi, Expression lma, Expression rmi, Expression rma,
                                          Expression_le p1, Expression_le p2) {
        return new Subtype_range(lmi, lma, rmi, rma, p1, p2);
    }

    protected Subtype createSubtype_tuple(EList<FieldDecl> l, EList<FieldDecl> r,
                                          Forall<FieldDecl, Ex<String, And<Equality, Ex<DataType, And<Equality, Ex<DataType, And<Equality, Subtype>>>>>>> p1) {
        return new Subtype_tuple(l, r, p1);
    }

    protected Subtype createSubtype_sequence(DataType l, DataType r, Subtype p1) {
        return new Subtype_sequence(l, r, p1);
    }

    protected Check_datatype createCheck_NamedType(String n) {
        return new Check_NamedType(n);
    }

    protected Check_datatype createCheck_TupleType(EList<FieldDecl> fields, Equality p1,
                                                   Forall<FieldDecl, Ex<DataType, And<Equality, Check_datatype>>> p2) {
        return new Check_TupleType(fields, p1, p2);
    }

    protected Check_datatype createCheck_SequenceType(DataType t, Check_datatype p1) {
        return new Check_SequenceType(t, p1);
    }

    protected Check_datatype createCheck_RangeType_trivial(Expression min, Expression max, Expression_le p1) {
        return new Check_RangeType_trivial(min, max, p1);
    }

    protected Check_datatype createCheck_BooleanType() {
        return new Check_BooleanType();
    }

    protected <T> Type_valuing<T> createType_Valuing_typed(Environment gamma, String x, DataType tau, DataType tau1,
                                                           Expression e, DataType tau__e, T p1, Subtype p2, Type_datatype p3) {
        return new Type_Valuing_typed<>(gamma, x, tau, tau1, e, tau__e, p1, p2, p3);
    }

    protected <T> Type_valuing<T> createType_Valuing_inferred(Environment gamma, String x, Expression e,
                                                              DataType tau__e, T p1) {
        return new Type_Valuing_inferred<>(gamma, x, e, tau__e, p1);
    }

    protected Type_gate createType_GateDecl(Environment gamma, String name, EList<Connection> conns,
                                            EList<Connection> conns1, Environment gamma2, EList<ProtocolDecl> p, Environment gamma1,
                                            Mutually_translate<Connection, Type_connection> p1, Forall<ProtocolDecl, Type_protocol> p2) {
        return new Type_GateDecl(gamma, name, conns, conns1, gamma2, p, gamma1, p1, p2);
    }

    protected Type_duty createType_DutyDecl(Environment gamma, String name, EList<Connection> conns,
                                            EList<Connection> conns1, Environment gamma2, EList<AssertionDecl> assump, EList<ProtocolDecl> p, Environment gamma1,
                                            Mutually_translate<Connection, Type_connection> p1, Forall<AssertionDecl, Type_assertion> p2, Forall<ProtocolDecl, Type_protocol> p3) {
        return new Type_DutyDecl(gamma, name, conns, conns1, gamma2, assump, p, gamma1, p1, p2, p3);
    }

    protected Type_connection createType_Connection_simple(Environment gamma, String name, boolean k, ModeType m,
                                                           DataType t, DataType t1, Environment gamma1, Type_datatype p1) {
        return new Type_Connection_simple(gamma, name, k, m, t, t1, gamma1, p1);
    }

    protected Type_behavior createType_BehaviorDecl(Environment gamma, String name, EList<BehaviorStatement> b,
                                                    Type_finalbody p1) {
        return new Type_BehaviorDecl(gamma, name, b, p1);
    }

    protected Type_finalbody_other createType_finalbody_RecursiveCall(Environment gamma) {
        return new Type_finalbody_RecursiveCall(gamma);
    }

    protected Type_finalbody createType_finalbody_generic(Environment gamma, EList<BehaviorStatement> l,
                                                          Type_generic_finalbody<Behavior, BehaviorStatement, ChooseBehavior, DoneBehavior, IfThenElseBehavior, RepeatBehavior, Type_finalbody_other, Type_expression, Type_bodyprefix, Type_nonfinalbody> p1) {
        return new Type_finalbody_generic(gamma, l, p1);
    }

    protected Type_nonfinalbody createType_nonfinalbody_generic(Environment gamma, EList<BehaviorStatement> l,
                                                                Type_generic_nonfinalbody<BehaviorStatement, Type_bodyprefix> p1) {
        return new Type_nonfinalbody_generic(gamma, l, p1);
    }

    protected Type_bodyprefix createType_bodyprefix_generic(Environment gamma, BehaviorStatement s, Environment gamma1, Type_generic_prefixstatement<Behavior, BehaviorStatement, ActionSuite, Action, ChooseBehavior, DoExprBehavior, ForEachBehavior, IfThenElseBehavior, ValuingBehavior, SendAction, ReceiveAction, Type_bodyprefix_other, Type_expression, Type_nonfinalbody> p1) {
        return new Type_bodyprefix_generic(gamma, s, gamma1, p1);
    }

    protected Mode_send createMode_send_out() {
        return new Mode_send_out();
    }

    protected Mode_send createMode_send_inout() {
        return new Mode_send_inout();
    }

    protected Mode_receive createMode_receive_inout() {
        return new Mode_receive_inout();
    }

    protected Mode_receive createMode_receive_in() {
        return new Mode_receive_in();
    }

    protected Condition_true createCondition_true_general(Environment gamma, Expression c) {
        return new Condition_true_general(gamma, c);
    }

    protected Condition_true createCondition_true_not(Environment gamma, Expression c, Environment gamma1,
                                                      Condition_false p1) {
        return new Condition_true_not(gamma, c, gamma1, p1);
    }

    protected Condition_true createCondition_true_and(Environment gamma, Expression c1, Environment gamma1,
                                                      Expression c2, Environment gamma2, Condition_true p1, Condition_true p2) {
        return new Condition_true_and(gamma, c1, gamma1, c2, gamma2, p1, p2);
    }

    protected Condition_true createCondition_true_lt(Environment gamma, String x, Expression x_min, Expression x_max,
                                                     Expression x_max_, Expression r, Expression r_min, Expression r_max, Environment gamma1, Type_expression p1,
                                                     Type_expression p2, Smallest p3, Check_datatype p4, Condition_true p5) {
        return new Condition_true_lt(gamma, x, x_min, x_max, x_max_, r, r_min, r_max, gamma1, p1, p2, p3, p4, p5);
    }

    protected Condition_true createCondition_true_le(Environment gamma, String x, Expression x_min, Expression x_max,
                                                     Expression x_max_, Expression r, Expression r_min, Expression r_max, Environment gamma1, Type_expression p1,
                                                     Type_expression p2, Smallest p3, Check_datatype p4, Condition_true p5) {
        return new Condition_true_le(gamma, x, x_min, x_max, x_max_, r, r_min, r_max, gamma1, p1, p2, p3, p4, p5);
    }

    protected Condition_true createCondition_true_eq(Environment gamma, String x, Expression x_min, Expression x_min_,
                                                     Expression x_max, Expression x_max_, Expression r, Expression r_min, Expression r_max, Environment gamma1,
                                                     Type_expression p1, Type_expression p2, Greatest p3, Smallest p4, Check_datatype p5, Condition_true p6) {
        return new Condition_true_eq(gamma, x, x_min, x_min_, x_max, x_max_, r, r_min, r_max, gamma1, p1, p2, p3, p4,
                p5, p6);
    }

    protected Condition_true createCondition_true_gt(Environment gamma, String x, Expression x_min, Expression x_min_,
                                                     Expression x_max, Expression r, Expression r_min, Expression r_max, Environment gamma1, Type_expression p1,
                                                     Type_expression p2, Greatest p3, Check_datatype p4, Condition_true p5) {
        return new Condition_true_gt(gamma, x, x_min, x_min_, x_max, r, r_min, r_max, gamma1, p1, p2, p3, p4, p5);
    }

    protected Condition_true createCondition_true_ge(Environment gamma, String x, Expression x_min, Expression x_min_,
                                                     Expression x_max, Expression r, Expression r_min, Expression r_max, Environment gamma1, Type_expression p1,
                                                     Type_expression p2, Greatest p3, Check_datatype p4, Condition_true p5) {
        return new Condition_true_ge(gamma, x, x_min, x_min_, x_max, r, r_min, r_max, gamma1, p1, p2, p3, p4, p5);
    }

    protected Condition_true createCondition_true_sym(Environment gamma, Expression l, String op, Expression r,
                                                      Environment gamma1, Condition_true p1) {
        return new Condition_true_sym(gamma, l, op, r, gamma1, p1);
    }

    protected Condition_false createCondition_false_general(Environment gamma, Expression c) {
        return new Condition_false_general(gamma, c);
    }

    protected Condition_false createCondition_false_not(Environment gamma, Expression c, Environment gamma1,
                                                        Condition_true p1) {
        return new Condition_false_not(gamma, c, gamma1, p1);
    }

    protected Condition_false createCondition_false_or(Environment gamma, Expression c1, Environment gamma1,
                                                       Expression c2, Environment gamma2, Condition_false p1, Condition_false p2) {
        return new Condition_false_or(gamma, c1, gamma1, c2, gamma2, p1, p2);
    }

    protected Condition_false createCondition_false_cmp(Environment gamma, Expression c1, String op, Expression c2,
                                                        Environment gamma1, Condition_true p1) {
        return new Condition_false_cmp(gamma, c1, op, c2, gamma1, p1);
    }

    protected Smallest createSmallest_l(Expression m, Expression l, Expression r, Expression_le p1, Expression_le p2) {
        return new Smallest_l(m, l, r, p1, p2);
    }

    protected Smallest createSmallest_r(Expression m, Expression l, Expression r, Expression_le p1, Expression_le p2) {
        return new Smallest_r(m, l, r, p1, p2);
    }

    protected Greatest createGreatest_l(Expression m, Expression l, Expression r, Expression_le p1, Expression_le p2) {
        return new Greatest_l(m, l, r, p1, p2);
    }

    protected Greatest createGreatest_r(Expression m, Expression l, Expression r, Expression_le p1, Expression_le p2) {
        return new Greatest_r(m, l, r, p1, p2);
    }

    protected Type_protocol createType_ProtocolDecl(Environment gamma, String name, EList<ProtocolStatement> body,
                                                    Type_finalprotocol p1) {
        return new Type_ProtocolDecl(gamma, name, body, p1);
    }

    protected Type_assertion createType_AssertionDecl(Environment gamma, String name, EList<ProtocolStatement> body,
                                                      Type_finalprotocol p1) {
        return new Type_AssertionDecl(gamma, name, body, p1);
    }

    protected Type_finalprotocol createType_finalprotocol_generic(Environment gamma, EList<ProtocolStatement> l,
                                                                  Type_generic_finalbody<Protocol, ProtocolStatement, ChooseProtocol, DoneProtocol, IfThenElseProtocol, RepeatProtocol, Type_finalprotocol_other, Type_protocol_root_expression, Type_bodyprotocol, Type_nonfinalprotocol> p1) {
        return new Type_finalprotocol_generic(gamma, l, p1);
    }

    protected Type_nonfinalprotocol createType_nonfinalprotocol_generic(Environment gamma, EList<ProtocolStatement> l,
                                                                        Type_generic_nonfinalbody<ProtocolStatement, Type_bodyprotocol> p1) {
        return new Type_nonfinalprotocol_generic(gamma, l, p1);
    }

    protected <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> createType_generic_Done(
            String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse, Class<Repeat> repeat,
            Class<Other> other, Class<E> type_expression, Class<P> type_generic_prefix,
            Class<NF> type_generic_nonfinalbody, Environment gamma) {
        return new Type_generic_Done<>(block, choose, done, ifThenElse, repeat, other, type_expression,
                type_generic_prefix, type_generic_nonfinalbody, gamma);
    }

    protected <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> createType_generic_prefix(
            String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse, Class<Repeat> repeat,
            Class<Other> other, Class<E> type_expression, Class<P> type_generic_prefix,
            Class<NF> type_generic_nonfinalbody, Environment gamma, Statement s, Environment gamma1, EList<Statement> l,
            P p1, Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> p2) {
        return new Type_generic_prefix<>(block, choose, done, ifThenElse, repeat, other, type_expression,
                type_generic_prefix, type_generic_nonfinalbody, gamma, s, gamma1, l, p1, p2);
    }

    protected <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> createType_generic_other(
            String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse, Class<Repeat> repeat,
            Class<Other> other, Class<E> type_expression, Class<P> type_generic_prefix,
            Class<NF> type_generic_nonfinalbody, Environment gamma, Statement s, Other p1) {
        return new Type_generic_other<>(block, choose, done, ifThenElse, repeat, other, type_expression,
                type_generic_prefix, type_generic_nonfinalbody, gamma, s, p1);
    }

    protected <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> createType_generic_Repeat(
            String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse, Class<Repeat> repeat,
            Class<Other> other, Class<E> type_expression, Class<P> type_generic_prefix,
            Class<NF> type_generic_nonfinalbody, Environment gamma, EList<Statement> l, NF p1) {
        return new Type_generic_Repeat<>(block, choose, done, ifThenElse, repeat, other, type_expression,
                type_generic_prefix, type_generic_nonfinalbody, gamma, l, p1);
    }

    protected <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> createType_generic_IfThenElse(
            String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse, Class<Repeat> repeat,
            Class<Other> other, Class<E> type_expression, Class<P> type_generic_prefix,
            Class<NF> type_generic_nonfinalbody, Environment gamma, Expression c, Environment gammat,
            EList<Statement> t, Environment gammae, EList<Statement> e, E p1, Condition_true p2,
            Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> p3,
            Condition_false p4,
            Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> p5) {
        return new Type_generic_IfThenElse<>(block, choose, done, ifThenElse, repeat, other, type_expression,
                type_generic_prefix, type_generic_nonfinalbody, gamma, c, gammat, t, gammae, e, p1, p2, p3, p4, p5);
    }

    protected <Body extends EObject, Statement extends EObject, Choose extends Statement, Done extends Statement, IfThenElse extends Statement, Repeat extends Statement, Other extends ProofTerm, E extends ProofTerm, P extends ProofTerm, NF extends ProofTerm> Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF> createType_generic_Choose(
            String block, Class<Choose> choose, Class<Done> done, Class<IfThenElse> ifThenElse, Class<Repeat> repeat,
            Class<Other> other, Class<E> type_expression, Class<P> type_generic_prefix,
            Class<NF> type_generic_nonfinalbody, Environment gamma, EList<EList<Statement>> branches,
            Forall<EList<Statement>, Type_generic_finalbody<Body, Statement, Choose, Done, IfThenElse, Repeat, Other, E, P, NF>> p1) {
        return new Type_generic_Choose<>(block, choose, done, ifThenElse, repeat, other, type_expression,
                type_generic_prefix, type_generic_nonfinalbody, gamma, branches, p1);
    }

    protected <S extends EObject, P extends ProofTerm> Type_generic_nonfinalbody<S, P> createType_generic_empty(
            Class<P> type_generic_prefix, Environment gamma) {
        return new Type_generic_empty<>(type_generic_prefix, gamma);
    }

    protected <S extends EObject, P extends ProofTerm> Type_generic_nonfinalbody<S, P> createType_generic_nonfinalprefix(
            Class<P> type_generic_prefix, Environment gamma, S s, Environment gamma1, EList<S> l, P p1,
            Type_generic_nonfinalbody<S, P> p2) {
        return new Type_generic_nonfinalprefix<>(type_generic_prefix, gamma, s, gamma1, l, p1, p2);
    }

    protected <Body extends EObject, Statement extends EObject, Command extends EObject, Action_ extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Type_generic_prefixstatement<Body, Statement, Command, Action_, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> createType_generic_otherprefix(
            String block, Class<Action_> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach,
            Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive,
            Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, Statement s,
            Environment gamma1, O p1) {
        return new Type_generic_otherprefix<>(block, action, choose, doExpr, forEach, ifThenElse, valuing, send,
                receive, other, type_expression, type_nonfinalbody, gamma, s, gamma1, p1);
    }

    protected <Body extends EObject, Statement extends EObject, Command extends EObject, Action_ extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm> Type_generic_prefixstatement<Body, Statement, Command, Action_, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP> createType_generic_DoExpr(String block, Class<Action_> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, Expression e, DataType tau, E p1) {
        return new Type_generic_DoExpr<>(block, action, choose, doExpr, forEach, ifThenElse, valuing, send,
                receive, other, type_expression, type_nonfinalbody, gamma, e, tau, p1);
    }

    protected <Body extends EObject, Statement extends EObject, Command extends EObject, Action_ extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm>
    Type_generic_prefixstatement<Body, Statement, Command, Action_, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>
    createType_generic_Valuing(String block, Class<Action_> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, Valuing v, Environment gamma1, Type_valuing<E> p1) {
        return new Type_generic_Valuing<>(block, action, choose, doExpr, forEach, ifThenElse, valuing, send,
                receive, other, type_expression, type_nonfinalbody, gamma, v, gamma1, p1);
    }

    protected <Body extends EObject, Statement extends EObject, Command extends EObject, Action_ extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm>
    Type_generic_prefixstatement<Body, Statement, Command, Action_, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>
    createType_generic_IfThenElse_prefix(String block, Class<Action_> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, Expression c, Environment gammat, EList<Statement> t, Body oe, E p1, Condition_true p2, NP p3, Optionally<Body, Ex<Environment, And<Condition_false, Ex<EList<Statement>, And<Equality, NP>>>>> p4) {
        return new Type_generic_IfThenElse_prefix<>(block, action, choose, doExpr, forEach, ifThenElse, valuing, send,
                receive, other, type_expression, type_nonfinalbody, gamma, c, gammat, t, oe, p1, p2, p3, p4);
    }

    protected <Body extends EObject, Statement extends EObject, Command extends EObject, Action_ extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm>
    Type_generic_prefixstatement<Body, Statement, Command, Action_, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>
    createType_generic_Choose_prefix(String block, Class<Action_> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, EList<EList<Statement>> branches, Forall<EList<Statement>, NP> p1) {
        return new Type_generic_Choose_prefix<>(block, action, choose, doExpr, forEach, ifThenElse, valuing, send,
                receive, other, type_expression, type_nonfinalbody, gamma, branches, p1);
    }

    protected <Body extends EObject, Statement extends EObject, Command extends EObject, Action_ extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm>
    Type_generic_prefixstatement<Body, Statement, Command, Action_, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>
    createType_generic_ForEach(String block, Class<Action_> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, String x, Expression vals, DataType tau, DataType tau__x, EList<Statement> b, E p1, NP p2, Subtype p3) {
        return new Type_generic_ForEach<>(block, action, choose, doExpr, forEach, ifThenElse, valuing, send,
                receive, other, type_expression, type_nonfinalbody, gamma, x, vals, tau, tau__x, b, p1, p2, p3);
    }

    protected <Body extends EObject, Statement extends EObject, Command extends EObject, Action_ extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm>
    Type_generic_prefixstatement<Body, Statement, Command, Action_, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>
    createType_generic_Send(String block, Class<Action_> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, ComplexName cn, boolean is_env, ModeType mode, DataType conn__tau, Expression e, DataType tau__e, Type_connectionname p1, Mode_send p2, E p3, Subtype p4) {
        return new Type_generic_Send<>(block, action, choose, doExpr, forEach, ifThenElse, valuing, send,
                receive, other, type_expression, type_nonfinalbody, gamma, cn, is_env, mode, conn__tau, e, tau__e, p1, p2, p3, p4);
    }

    protected <Body extends EObject, Statement extends EObject, Command extends EObject, Action_ extends Statement, Choose extends Statement, DoExpr extends Statement, ForEach extends Statement, IfThenElse extends Statement, Valuin extends Statement, Send extends Command, Receive extends Command, O extends ProofTerm, E extends ProofTerm, NP extends ProofTerm>
    Type_generic_prefixstatement<Body, Statement, Command, Action_, Choose, DoExpr, ForEach, IfThenElse, Valuin, Send, Receive, O, E, NP>
    createType_generic_Receive(String block, Class<Action_> action, Class<Choose> choose, Class<DoExpr> doExpr, Class<ForEach> forEach, Class<IfThenElse> ifThenElse, Class<Valuin> valuing, Class<Send> send, Class<Receive> receive, Class<O> other, Class<E> type_expression, Class<NP> type_nonfinalbody, Environment gamma, ComplexName cn, boolean is_env, ModeType mode, DataType conn__tau, String x, Environment gamma1, Type_connectionname p1, Mode_receive p2, Equality p3) {
        return new Type_generic_Receive<>(block, action, choose, doExpr, forEach, ifThenElse, valuing, send,
                receive, other, type_expression, type_nonfinalbody, gamma, cn, is_env, mode, conn__tau, x, gamma1, p1, p2, p3);
    }

    protected Type_bodyprotocol createType_bodyprotocol_generic(Environment gamma, ProtocolStatement s, Environment gamma1, Type_generic_prefixstatement<Protocol, ProtocolStatement, ProtocolActionSuite, ProtocolAction, ChooseProtocol, DoExprProtocol, ForEachProtocol, IfThenElseProtocol, ValuingProtocol, SendProtocolAction, ReceiveProtocolAction, Type_protocolprefix_other, Type_protocol_root_expression, Type_nonfinalprotocol> p1) {
        return new Type_bodyprotocol_generic(gamma, s, gamma1, p1);
    }

    protected Type_protocolprefix_other createType_protocolprefix_ReceiveAny(Environment gamma, ComplexName cn, boolean is_env, ModeType mode, DataType conn__tau, Type_connectionname p1, Mode_receive p2) {
        return new Type_protocolprefix_ReceiveAny(gamma, cn, is_env, mode, conn__tau, p1, p2);
    }

    protected Type_protocolprefix_other createType_protocolprefix_Repeat(Environment gamma, EList<ProtocolStatement> l, Type_nonfinalprotocol p1) {
        return new Type_protocolprefix_Repeat(gamma, l, p1);
    }

    protected Type_protocolprefix_other createType_protocolprefix_AnyAction(Environment gamma) {
        return new Type_protocolprefix_AnyAction(gamma);
    }

    protected Type_connectionname createType_connectionname_qualified(Environment gamma, String gd, EList<Connection> endpoints, boolean is_env, String conn, ModeType mode, DataType conn__tau, Equality p1, Ex<BigInteger, Equality> p2) {
        return new Type_connectionname_qualified(gamma, gd, endpoints, is_env, conn, mode, conn__tau, p1, p2);
    }

    protected Type_connectionname createType_connectionname_simple(Environment gamma, boolean is_env, String conn, ModeType mode, DataType conn__tau, Equality p1) {
        return new Type_connectionname_simple(gamma, is_env, conn, mode, conn__tau, p1);
    }

    protected Type_protocol_root_expression createType_protocol_root_expression_and_type(Environment gamma, Expression e, DataType t,
                                                                                         Type_protocol_root_expression_node p1, Check_datatype p2) {
        return new Type_protocol_root_expression_and_type(gamma, e, t, p1, p2);
    }

    protected Type_protocol_nonroot_expression createType_protocol_nonroot_expression_and_type(Environment gamma, Expression e, DataType t,
                                                                                         Type_protocol_nonroot_expression_node p1, Check_datatype p2) {
        return new Type_protocol_nonroot_expression_and_type(gamma, e, t, p1, p2);
    }

    protected Type_protocol_root_expression_node createType_protocol_root_expression_nonroot(Environment gamma, Expression e, DataType t, Type_protocol_nonroot_expression_node p1) {
        return new Type_protocol_root_expression_nonroot(gamma, e, t, p1);
    }

    protected Type_protocol_root_expression_node createType_protocol_root_expression_any(Environment gamma, DataType t) {
        return new Type_protocol_root_expression_any(gamma, t);
    }

    protected Type_protocol_nonroot_expression_node createType_protocol_nonroot_expression_generic(Environment gamma, Expression e, DataType t, Type_expression_node<Type_protocol_nonroot_expression> p1) {
        return new Type_protocol_nonroot_expression_generic(gamma, e, t, p1);
    }

    protected Type_protocol_nonroot_expression_node createType_protocol_nonroot_expression_MethodCall(Environment gamma, Expression self, DataType t, DataTypeDecl typeDecl,
                                                                                                      DataType tau, EList<FunctionDecl> methods, String name, EList<FormalParameter> formalparams, DataType ret,
                                                                                                      EList<Expression> params, Type_protocol_nonroot_expression p1, Ex<BigInteger, Equality> p2, Subtype p4,
                                                                                                      Ex<BigInteger, And<Equality, And<Equality, And<Equality, Equality>>>> p5,
                                                                                                      Forall2<FormalParameter, Expression, Ex<DataType, And<Equality, Ex<DataType, And<Type_protocol_root_expression, Subtype>>>>> p6) {
        return new Type_protocol_nonroot_expression_MethodCall(gamma, self, t, typeDecl, tau, methods, name, formalparams, ret, params, p1, p2, p4, p5, p6);
    }
}
