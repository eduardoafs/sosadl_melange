package org.archware.sosadl.validation.typing;

import java.util.Arrays;

public class SequentialNameGenerator implements NameGenerator {
	
	private char[] lastReturned = {};

	@Override
	public synchronized String get() {
		if(lastReturned.length == 0 || lastReturned[lastReturned.length - 1] == 'z') {
			lastReturned = new char[lastReturned.length + 1];
			Arrays.fill(lastReturned, 'a');
		} else {
			lastReturned[lastReturned.length - 1] += 1;
		}
		return new String(lastReturned);
	}

}
