package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.ComplexName;
import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.ModeType;
import org.archware.sosadl.validation.typing.Environment;

public class Type_protocolprefix_ReceiveAny implements Type_protocolprefix_other {
    @Mandatory
    private final Environment gamma;

    @Mandatory
    private final ComplexName cn;

    @Mandatory
    private final boolean is_env;

    @Mandatory
    private final ModeType mode;;

    @Mandatory
    private final DataType conn__tau;

    @Mandatory
    private final Type_connectionname p1;

    @Mandatory
    private final Mode_receive p2;

    public Type_protocolprefix_ReceiveAny(Environment gamma, ComplexName cn, boolean is_env, ModeType mode, DataType conn__tau, Type_connectionname p1, Mode_receive p2) {
        this.gamma = gamma;
        this.cn = cn;
        this.is_env = is_env;
        this.mode = mode;
        this.conn__tau = conn__tau;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Environment getGamma() {
        return gamma;
    }

    public ComplexName getCn() {
        return cn;
    }

    public boolean is_env() {
        return is_env;
    }

    public ModeType getMode() {
        return mode;
    }

    public DataType getConn__tau() {
        return conn__tau;
    }

    public Type_connectionname getP1() {
        return p1;
    }

    public Mode_receive getP2() {
        return p2;
    }
}

