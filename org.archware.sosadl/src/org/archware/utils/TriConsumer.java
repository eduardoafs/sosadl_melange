package org.archware.utils;

@FunctionalInterface
public interface TriConsumer<S1, S2, S3> {
	void accept(S1 s1, S2 s2, S3 s3);
}
