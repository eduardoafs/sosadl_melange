package org.archware.sosadl.validation.typing;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.archware.sosadl.validation.typing.impl.EnvironmentImpl;

public interface Environment {
	public EnvContent get(String name);
	public Environment put(String name, EnvContent info);
	public Stream<EnvContent> stream();
	public <T> T match(BiFunction<EnvContent, Environment, T> ifCons, Supplier<T> ifNil);
	public Environment deepClone(Function<EnvContent,EnvContent> cellClone);
	
	public static Environment empty() {
		return new EnvironmentImpl();
	}
}
