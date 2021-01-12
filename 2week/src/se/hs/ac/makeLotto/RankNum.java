package se.hs.ac.makeLotto;


import se.hs.ac.makeLotto.UserLotto;
import se.hs.ac.makeLotto.WinLotto;

public class RankNum {
	private int rank;
	private boolean bonus;
	
	public RankNum() {
		
	}

	public RankNum(int rank, boolean bonus) {
		this.rank = rank;
		this.bonus = bonus;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
