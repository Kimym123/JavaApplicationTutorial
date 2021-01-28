package se.hs.ac.model;

public enum Microwave {
	DEFROST("해동", "1"), RICE_HEAT("밥 데우기", "2"), SOUP_HEAT("국 데우기", "3"), STEAMED_EGGS("달걀찜", "4"), RAMEN("라면", "5");

	private final String name;
	private final String caseNumber;

	Microwave(String name, String caseNumber) {
		this.name = name;
		this.caseNumber = caseNumber;
	}

	public String getName() {
		return name;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public static Microwave getInstance(String number) {

		for (Microwave microwave : values()) {
			if (microwave.getCaseNumber().equals(number)) {
				return microwave;
			}
		}
		return null;
	}
}
