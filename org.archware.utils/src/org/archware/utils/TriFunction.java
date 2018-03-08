package org.archware.utils;

@FunctionalInterface
public interface TriFunction<S1, S2, S3, R> {
	R apply(S1 p1, S2 p2, S3 p3);
}
