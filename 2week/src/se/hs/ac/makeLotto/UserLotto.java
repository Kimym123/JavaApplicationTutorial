package se.hs.ac.makeLotto;

import java.util.Set;
import java.util.TreeSet;

public class UserLotto {
	private Set<Integer> UserNumber = new TreeSet<Integer>();
	private String rankNum;

	public UserLotto() {
		this.UserNumber = setUserNum();
	}

	public void clear() {
		this.UserNumber.clear();
	}

	public Set<Integer> setUserNum() {
		while (this.UserNumber.size() < 6) {
			int random = (int) (Math.random() * 42) + 1;
			this.UserNumber.add(random);
		}
		return this.UserNumber;
	}

	public Set<Integer> getUserNum() {
		return this.UserNumber;
	}

	public String getRankNum() {
		return rankNum;
	}

	public void setRankNum(String userNum) {
		this.rankNum = userNum;

	}

	@Override
	public String toString() {
		RankNum rank = new RankNum();
		StringBuilder user = new StringBuilder();
		for (int number : UserNumber) {
			user.append(number).append("\t");
		}
		return user + ">> " + getRankNum();
	}
}
