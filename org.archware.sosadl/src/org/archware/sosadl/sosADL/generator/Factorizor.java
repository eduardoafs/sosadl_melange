package org.archware.sosadl.sosADL.generator;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.archware.utils.Pair;

public class Factorizor {
	private static final int THRESHOLD = 16;
	
	private long lastGeneratedName = 0;
	
	private final List<Pair<String,String>> definitions = new LinkedList<>();
	
	private final Map<String, String> cache = new TreeMap<>();
	
	public CharSequence hook(CharSequence s) {
		String s2 = s.toString();
		if(s2.length() < THRESHOLD) {
			return s2;
		} else {
			return cache.computeIfAbsent(s2, (x) -> {
				String name = freshName();
				definitions.add(new Pair<>(name, s2));
				return name;
			});
		}
	}
	
	public Iterable<Pair<String,String>> getDefinitions() {
		return this.definitions;
	}
	
	private String freshName() {
		return "_" + lastGeneratedName++;
	}
}
