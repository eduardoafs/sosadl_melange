package org.archware.sosadl.sosADL.generator;

public class FactorizingCoqGenerator extends SosADLCoqGenerator {
	private final Factorizor factorizor;

	public FactorizingCoqGenerator(Factorizor f) {
		this.factorizor = f;
	}

	@Override
	public CharSequence _hook(CharSequence s) {
		return factorizor.hook(s);
	}
}
