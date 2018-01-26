package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.Expression;
import org.archware.sosadl.validation.typing.Environment;

public class Type_protocol_root_expression_nonroot implements Type_protocol_root_expression_node {
    @Mandatory
    private final Environment gamma;

    @Mandatory
    private final Expression e;

    @Mandatory
    private final DataType t;

    @Mandatory
    private final Type_protocol_nonroot_expression_node p1;

    public Type_protocol_root_expression_nonroot(Environment gamma, Expression e, DataType t, Type_protocol_nonroot_expression_node p1) {
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

    public Type_protocol_nonroot_expression_node getP1() {
        return p1;
    }
}
