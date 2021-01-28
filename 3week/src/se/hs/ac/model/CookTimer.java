package se.hs.ac.model;

public class CookTimer {
	private int sec;

	public CookTimer() {
		this.sec = sec;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int input) {
		this.sec = input;
	}
	
	@Override
	public String toString() {
		return sec + " 초";
	}
	
}
