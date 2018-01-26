package org.archware.utils;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapUtils {
	public static <K, V1, V2> Map<K, Pair<Optional<V1>, Optional<V2>>> merge(Map<K, V1> l, Map<K, V2> r) {
		Stream<Map.Entry<K, Pair<Optional<V1>, Optional<V2>>>> ls = l.entrySet().stream().map(MapUtils::makeLeft);
		Stream<Map.Entry<K, Pair<Optional<V1>, Optional<V2>>>> rs = r.entrySet().stream().map(MapUtils::makeRight);
		Stream<Map.Entry<K, Pair<Optional<V1>, Optional<V2>>>> s = Stream.of(ls, rs).flatMap((x) -> x);
		return s.collect(Collectors.toConcurrentMap(Map.Entry::getKey, Map.Entry::getValue, MapUtils::mergeEntries));
	}

	private static <K, V1, V2> Map.Entry<K, Pair<Optional<V1>, Optional<V2>>> makeLeft(Map.Entry<K, V1> e) {
		return new AbstractMap.SimpleImmutableEntry<>(e.getKey(),
				new Pair<>(Optional.of(e.getValue()), Optional.empty()));
	}

	private static <K, V1, V2> Map.Entry<K, Pair<Optional<V1>, Optional<V2>>> makeRight(Map.Entry<K, V2> e) {
		return new AbstractMap.SimpleImmutableEntry<>(e.getKey(),
				new Pair<>(Optional.empty(), Optional.of(e.getValue())));
	}

	private static <V1, V2> Pair<Optional<V1>, Optional<V2>> mergeEntries(Pair<Optional<V1>, Optional<V2>> l,
			Pair<Optional<V1>, Optional<V2>> r) {
		return new Pair<>(OptionalUtils.orElse(l.getA(), r.getA()), OptionalUtils.orElse(l.getB(), r.getB()));
	}
}
