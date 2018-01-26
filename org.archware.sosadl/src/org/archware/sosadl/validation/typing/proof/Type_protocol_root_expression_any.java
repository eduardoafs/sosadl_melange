package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.validation.typing.Environment;

public class Type_protocol_root_expression_any implements Type_protocol_root_expression_node {
    @Mandatory
    private final Environment gamma;

    @Mandatory
    private final DataType t;

    public Type_protocol_root_expression_any(Environment gamma, DataType t) {
        this.gamma = gamma;
        this.t = t;
    }

    public Environment getGamma() {
        return gamma;
    }

    public DataType getT() {
        return t;
    }
}
