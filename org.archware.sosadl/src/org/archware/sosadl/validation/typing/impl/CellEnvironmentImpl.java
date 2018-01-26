package org.archware.sosadl.validation.typing.impl;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.archware.sosadl.validation.typing.EnvContent;
import org.archware.sosadl.validation.typing.Environment;

public class CellEnvironmentImpl extends EnvironmentImpl implements Environment {
	private final Environment parent;
	private final String name;
	private final EnvContent info;

	public CellEnvironmentImpl(Environment parent, String name, EnvContent info) {
		this.parent = parent;
		this.name = name;
		this.info = info;
	}

	@Override
	public EnvContent get(String name) {
		if (name.equals(this.name)) {
			return info;
		} else {
			return parent.get(name);
		}
	}

	public String getName() {
		return name;
	}

	public EnvContent getInfo() {
		return info;
	}

	public Environment getParent() {
		return parent;
	}

	@Override
	public Stream<EnvContent> stream() {
		return Stream.concat(Stream.of(info), parent.stream());
	}

	@Override
	public <T> T match(BiFunction<EnvContent, Environment, T> ifCons, Supplier<T> ifNil) {
		return ifCons.apply(info, parent);
	}

	@Override public Environment deepClone(Function<EnvContent,EnvContent> cloneCell) {
		return new CellEnvironmentImpl(parent.deepClone(cloneCell), this.name, cloneCell.apply(info));
	}
}
