package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.ProtocolStatement;
import org.archware.sosadl.validation.typing.Environment;
import org.eclipse.emf.common.util.EList;

public class Type_protocolprefix_Repeat implements Type_protocolprefix_other {
    @Mandatory
    private final Environment gamma;

    private final EList<ProtocolStatement> l;

    @Mandatory
    private final Type_nonfinalprotocol p1;

    public Type_protocolprefix_Repeat(Environment gamma, EList<ProtocolStatement> l, Type_nonfinalprotocol p1) {
        this.gamma = gamma;
        this.l = l;
        this.p1 = p1;
    }

    public Environment getGamma() {
        return gamma;
    }

    public EList<ProtocolStatement> getL() {
        return l;
    }

    public Type_nonfinalprotocol getP1() {
        return p1;
    }
}

