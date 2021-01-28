package se.hs.ac.model;

public enum Oven {
	PIZZA("피자", "1"), GRATIN("그라탕", "2"), ROLL_CAKE("롤케익", "3"), CHOCOLATE_COOKIES("초코쿠키", "4"), SPAGHETTI("스파게티", "5");

	private final String name;
	private final String caseNumber;

	Oven(String name, String caseNumber) {
		this.name = name;
		this.caseNumber = caseNumber;
	}

	public String getName() {
		return name;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public static Oven getInstance(String number) {

		for (Oven oven : values()) {
			if (oven.getCaseNumber().equals(number)) {
				return oven;
			}
		}
		return null;
	}
}
