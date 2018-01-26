package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.*;
import org.archware.sosadl.validation.typing.Environment;

public class Type_bodyprotocol_generic implements Type_bodyprotocol {
    @Mandatory
    private final Environment gamma;

    @Mandatory
    private final ProtocolStatement s;

    @Mandatory
    private final Environment gamma1;

    @Mandatory
    private final Type_generic_prefixstatement<Protocol, ProtocolStatement, ProtocolActionSuite, ProtocolAction, ChooseProtocol, DoExprProtocol, ForEachProtocol, IfThenElseProtocol, ValuingProtocol, SendProtocolAction, ReceiveProtocolAction, Type_protocolprefix_other, Type_protocol_root_expression, Type_nonfinalprotocol> p1;

    public Type_bodyprotocol_generic(Environment gamma, ProtocolStatement s, Environment gamma1, Type_generic_prefixstatement<Protocol, ProtocolStatement, ProtocolActionSuite, ProtocolAction, ChooseProtocol, DoExprProtocol, ForEachProtocol, IfThenElseProtocol, ValuingProtocol, SendProtocolAction, ReceiveProtocolAction, Type_protocolprefix_other, Type_protocol_root_expression, Type_nonfinalprotocol> p1) {
        this.gamma = gamma;
        this.s = s;
        this.gamma1 = gamma1;
        this.p1 = p1;
    }

    public Environment getGamma() {
        return gamma;
    }

    public ProtocolStatement getS() {
        return s;
    }

    public Environment getGamma1() {
        return gamma1;
    }

    public Type_generic_prefixstatement<Protocol, ProtocolStatement, ProtocolActionSuite, ProtocolAction, ChooseProtocol, DoExprProtocol, ForEachProtocol, IfThenElseProtocol, ValuingProtocol, SendProtocolAction, ReceiveProtocolAction, Type_protocolprefix_other, Type_protocol_root_expression, Type_nonfinalprotocol> getP1() {
        return p1;
    }
}
