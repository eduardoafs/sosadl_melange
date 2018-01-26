package org.archware.sosadl.validation.typing.proof;

import org.archware.sosadl.sosADL.DataType;
import org.archware.sosadl.sosADL.ModeType;
import org.archware.sosadl.validation.typing.Environment;

/**
 * Created by jeremy on 23/08/16.
 */
public class Type_connectionname_simple implements Type_connectionname {
    @Mandatory
    private final Environment gamma;

    @Mandatory
    private final boolean is_env;

    @Mandatory
    private final String conn;

    @Mandatory
    private final ModeType mode;

    @Mandatory
    private final DataType conn__tau;

    @Mandatory
    private final Equality p1;

    public Type_connectionname_simple(Environment gamma, boolean is_env, String conn, ModeType mode, DataType conn__tau, Equality p1) {
        this.gamma = gamma;
        this.is_env = is_env;
        this.conn = conn;
        this.mode = mode;
        this.conn__tau = conn__tau;
        this.p1 = p1;
    }

    public Environment getGamma() {
        return gamma;
    }

    public boolean is_env() {
        return is_env;
    }

    public String getConn() {
        return conn;
    }

    public ModeType getMode() {
        return mode;
    }

    public DataType getConn__tau() {
        return conn__tau;
    }

    public Equality getP1() {
        return p1;
    }
}
