package org.archware.sosadl.validation.typing;

public class SequentialNumberGenerator implements NumberGenerator {
	private int current = 0;

	@Override
	public synchronized int getAsInt() {
		return current++;
	}
}
