package se.hs.ac.model;

import java.util.Arrays;

public enum Roast {
	MACKEREL("고등어", "1"), CUTLASSFISH("갈치", "2"), SAURY("꽁치", "3"), SHRIMP("새우", "4"), RIB("갈비", "5");

	private final String name;
	private final String caseNumber;

	Roast(String name, String caseNumber) {
		this.name = name;
		this.caseNumber = caseNumber;
	}

	public String getName() {
		return name;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public static Roast getInstance(String number) {
		for (Roast roast : values()) {
			if (roast.getCaseNumber().equals(number)) {
				return roast;
			}
		}
		return null;
	}

//		return Arrays.stream(values())
//				.filter(roast -> roast.caseNumber.equals(number))
//				.findFirst()
//				.orElse(MACKEREL);

}

// MACKEREL("고등어", "1")
// =
// Roast MACKERL = new Roast("고등어","1")
