package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.validation.typing.Environment;

public class Type_protocolprefix_AnyAction implements Type_protocolprefix_other {
    @Mandatory
    private final Environment gamma;

    public Type_protocolprefix_AnyAction(Environment gamma) {
        this.gamma = gamma;
    }

    public Environment getGamma() {
        return gamma;
    }
}

