package org.archware.sosadl.validation.typing;

import org.archware.sosadl.sosADL.*;
import org.archware.sosadl.validation.typing.impl.ConnectionEnvContent;
import org.archware.sosadl.validation.typing.impl.GateOrDutyEnvContent;
import org.archware.sosadl.validation.typing.proof.Type_connectionname;
import org.archware.utils.IntPair;
import org.archware.utils.Pair;
import org.archware.utils.Quadruplet;
import org.archware.utils.StreamUtils;
import org.eclipse.emf.common.util.EList;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jeremy on 23/08/16.
 */
public abstract class TypeCheckerConnectionName extends TypeCheckerValuing {
    protected Quadruplet<Type_connectionname, Boolean, ModeType, DataType> type_connectionname(Environment gamma, ComplexName cn) {
        if (cn.getName().size() == 1) {
            String conn = cn.getName().get(0);
            EnvContent cEc = gamma.get(conn);
            if (cEc != null) {
                if (cEc instanceof ConnectionEnvContent) {
                    ConnectionEnvContent ec = (ConnectionEnvContent) cEc;
                    Connection connection = ec.getConnection();
                    boolean is_env = connection.isEnvironment();
                    ModeType mode = connection.getMode();
                    DataType conn__tau = connection.getValueType();
                    if (mode != null && conn__tau != null) {
                        Type_connectionname proof = p(Type_connectionname.class, gamma, (gamma_) ->
                                p(Type_connectionname.class, conn__tau, (conn__tau_) ->
                                        createType_connectionname_simple(gamma_, is_env, conn, mode, conn__tau_,
                                                createReflexivity())));
                        return new Quadruplet<>(proof, is_env, mode, conn__tau);
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    error("`" + conn + "' is not a connection", cn, SosADLPackage.Literals.COMPLEX_NAME__NAME, 0);
                    return null;
                }
            } else {
                error("Connection named `" + conn + "' is undefined", cn, SosADLPackage.Literals.COMPLEX_NAME__NAME, 0);
                return null;
            }
        } else if (cn.getName().size() == 2) {
            String gd = cn.getName().get(0);
            String conn = cn.getName().get(1);
            EnvContent gdEc = gamma.get(gd);
            if (gdEc != null) {
                if (gdEc instanceof GateOrDutyEnvContent) {
                    GateOrDutyEnvContent ec = (GateOrDutyEnvContent) gdEc;
                    EList<Connection> endpoints = ec.getConnections();
                    Pair<BigInteger, Connection> rankedConnection = lookupForConnection(endpoints, conn);
                    if (rankedConnection != null) {
                        BigInteger rank = rankedConnection.getA();
                        Connection connection = rankedConnection.getB();
                        boolean is_env = connection.isEnvironment();
                        ModeType mode = connection.getMode();
                        DataType conn__tau = connection.getValueType();
                        if (mode != null && conn__tau != null) {
                            Type_connectionname proof = p(Type_connectionname.class, gamma, (gamma_) ->
                                    p(Type_connectionname.class, conn__tau, (conn__tau_) ->
                                            createType_connectionname_qualified(gamma_, gd, endpoints, is_env, conn, mode, conn__tau_,
                                                    createReflexivity(), createEx_intro(rank, createReflexivity()))));
                            return new Quadruplet<>(proof, is_env, mode, conn__tau);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        error("No connection named `" + conn + "' in gate or duty `" + gd + "'", cn, SosADLPackage.Literals.COMPLEX_NAME__NAME, 1);
                        return null;
                    }
                } else {
                    error("`" + gd + "' is neither a gate nor a duty", cn, SosADLPackage.Literals.COMPLEX_NAME__NAME, 0);
                    return null;
                }
            } else {
                error("Gate or duty named `" + gd + "' is undefined", cn, SosADLPackage.Literals.COMPLEX_NAME__NAME, 0);
                return null;
            }
        } else {
            error("A connection name is either `<connection>' or `<gate-or-duty> :: <connection>'", cn, null);
            return null;
        }
    }

    protected Pair<BigInteger, Connection> lookupForConnection(EList<Connection> endpoints, String conn) {
        List<IntPair<Connection>> l = StreamUtils.indexed(endpoints.stream())
                .filter((p) -> conn.equals(p.getB().getName())).collect(Collectors.toList());
        if (l.size() >= 2) {
            throw new IllegalArgumentException("several connections named `" + conn + "' in the environment");
        }
        return l.stream().findAny().map((p) -> new Pair<>(BigInteger.valueOf(p.getA()), p.getB())).orElse(null);
    }
}
