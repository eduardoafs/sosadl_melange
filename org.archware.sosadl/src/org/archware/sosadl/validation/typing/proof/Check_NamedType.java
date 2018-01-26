package org.archware.sosadl.validation.typing.proof;

public class Check_NamedType implements Check_datatype {
	@Mandatory
	private final String n;

	public Check_NamedType(String n) {
		super();
		this.n = n;
	}

	public String getN() {
		return n;
	}

}
