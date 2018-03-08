package org.archware.utils;

import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamUtils {
	public static <T> Stream<T> toStream(Optional<T> o) {
		return OptionalUtils.mapOrElse(o, Stream::of, Stream.empty());
	}

	public static <A, B> Stream<Pair<A, B>> mapi(Stream<A> s, Function<A, B> f) {
		return s.map((x) -> new Pair<>(x, f.apply(x)));
	}

	public static <T> Stream<IntPair<T>> indexed(Stream<T> s) {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(indexed(s.iterator()),
				Spliterator.DISTINCT | Spliterator.IMMUTABLE | Spliterator.NONNULL), false);
	}

	public static <T> Iterator<IntPair<T>> indexed(Iterator<T> i) {
		return new Iterator<IntPair<T>>() {
			private final Iterator<T> parent = i;
			private int position = 0;

			@Override
			public boolean hasNext() {
				return parent.hasNext();
			}

			@Override
			public IntPair<T> next() {
				return new IntPair<>(position++, parent.next());
			}
		};
	}

	public static <R, S> Stream<Pair<R, S>> zip(Stream<R> r, Stream<S> s) {
		return StreamSupport.stream(Spliterators.spliteratorUnknownSize(zip(r.iterator(), s.iterator()),
				Spliterator.IMMUTABLE | Spliterator.NONNULL), false);
	}

	public static <R, S> Iterator<Pair<R, S>> zip(Iterator<R> r, Iterator<S> s) {
		return new Iterator<Pair<R, S>>() {
			@Override
			public boolean hasNext() {
				return r.hasNext() && s.hasNext();
			}

			@Override
			public Pair<R, S> next() {
				return new Pair<>(r.next(), s.next());
			}
		};
	}
}
