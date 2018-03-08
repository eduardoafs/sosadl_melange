package org.archware.utils;

import java.util.Optional;
import java.util.function.Function;

public class OptionalUtils {

	public static <T, U> U mapOrElse(Optional<T> o, Function<T, U> f, U ifEmpty) {
		return o.map(f).orElse(ifEmpty);
	}

	public static <T> Optional<T> orElse(Optional<T> l, Optional<T> r) {
		return l.map(Optional::of).orElse(r);
	}

}
