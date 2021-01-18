package se.hs.ac.model;

public enum Comb {
	CHICKEN("통닭", "1"), PORK_CUTLET("돈까스", "2"), PORK_BELLY("삼겹살", "3"), BARBECUE("바베큐", "4"), WHOLE_POTATOES("통감자", "5");

	private final String name;
	private final String caseNumber;

	Comb(String name, String caseNumber) {
		this.name = name;
		this.caseNumber = caseNumber;
	}

	public String getName() {
		return name;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public static Comb getInstance(String number) {

		for (Comb comb : values()) {
			if (comb.getCaseNumber().equals(number)) {
				return comb;
			}
		}
		return null;
	}
}
