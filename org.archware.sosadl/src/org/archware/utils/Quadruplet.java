package org.archware.utils;

/**
 * Created by jeremy on 23/08/16.
 */
public class Quadruplet<A, B, C, D> {
    public final A a;
    public final B b;
    public final C c;
    public final D d;

    public Quadruplet(A a, B b, C c, D d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }

    public D getD() {
        return d;
    }
}
