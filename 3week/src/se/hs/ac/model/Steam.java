package se.hs.ac.model;

import java.util.Arrays;

public enum Steam {
	EGGPLANT("가지", "1"), SESAME_LEAF("깻잎", "2"), MUSHROOM("버섯", "3"), SPINACH("시금치", "4"), ZUCCHINI("애호박", "5");

	private final String name;
	private final String caseNumber;

	Steam(String name, String caseNumber) {
		this.name = name;
		this.caseNumber = caseNumber;
	}

	public String getName() {
		return name;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public static Steam getInstance(String number) {

		for (Steam steam : values()) {
			if (steam.getCaseNumber().equals(number)) {
				return steam;
			}
		}
		return null;
	}
}
