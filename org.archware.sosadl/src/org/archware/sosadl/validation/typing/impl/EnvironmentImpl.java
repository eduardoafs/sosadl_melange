package org.archware.sosadl.validation.typing.impl;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.archware.sosadl.validation.typing.EnvContent;
import org.archware.sosadl.validation.typing.Environment;

public class EnvironmentImpl implements Environment {
	@Override
	public EnvContent get(String name) {
		return null;
	}

	@Override
	public Environment put(String name, EnvContent info) {
		return new CellEnvironmentImpl(this, name, info);
	}

	@Override
	public Stream<EnvContent> stream() {
		return Stream.empty();
	}

	@Override
	public <T> T match(BiFunction<EnvContent, Environment, T> ifCons, Supplier<T> ifNil) {
		return ifNil.get();
	}

	@Override
	public Environment deepClone(Function<EnvContent, EnvContent> cellClone) {
		return this;
	}
}
