package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Type_protocol_nonroot_expression_generic implements Type_protocol_nonroot_expression_node {
    @Mandatory
    private final Environment gamma;

    @Mandatory
    private final Expression e;

    @Mandatory
    private final DataType t;

    @Mandatory
    private final Type_expression_node<Type_protocol_nonroot_expression> p1;

    public Type_protocol_nonroot_expression_generic(Environment gamma, Expression e, DataType t, Type_expression_node<Type_protocol_nonroot_expression> p1) {
        this.gamma = gamma;
        this.e = e;
        this.t = t;
        this.p1 = p1;
    }

    public Environment getGamma() {
        return gamma;
    }

    public Expression getE() {
        return e;
    }

    public DataType getT() {
        return t;
    }

    public Type_expression_node<Type_protocol_nonroot_expression> getP1() {
        return p1;
    }
}
