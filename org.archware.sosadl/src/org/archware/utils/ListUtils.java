package org.archware.utils;

import java.util.Collection;

public class ListUtils {
	public static <A, B> B assoc(Collection<Pair<A, B>> l, A x) {
		for (Pair<A, B> i : l) {
			if (i.getA() == x) {
				return i.getB();
			}
		}
		return null;
	}
}
