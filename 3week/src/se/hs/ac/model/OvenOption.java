package se.hs.ac.model;

public enum OvenOption {
	DEODORIZATION("탈취", "1"), STEAM_CLEANING("스팀청소", "2"), Drying("건조", "3"), RESIDUAL_REMOVAL("잔수제거", "4");

	private final String name;
	private final String caseNumber;

	OvenOption(String name, String caseNumber) {
		this.name = name;
		this.caseNumber = caseNumber;
	}

	public String getName() {
		return name;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public static OvenOption getInstance(String number) {
		for (OvenOption option : values()) {
			if (option.getCaseNumber().equals(number)) {
				return option;
			}
		}
		return null;
	}
}
