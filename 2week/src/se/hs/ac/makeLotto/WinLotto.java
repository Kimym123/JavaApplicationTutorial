package se.hs.ac.makeLotto;

import java.util.Set;
import java.util.TreeSet;

public class WinLotto {

	private Set<Integer> winNum = new TreeSet<Integer>();
	private int bonusNum;

	public WinLotto() {
//		this.winNum=new TreeSet<>();
		this.winNum = setWinNum();
		this.bonusNum = setBonusNum();
		this.setWinNum();
		this.setBonusNum();
	}

	public Set<Integer> setWinNum() {
		while (this.winNum.size() < 6) {
			int random = (int) (Math.random() * 42) + 1;
			this.winNum.add(random);
		}
		return this.winNum;
	}

	public int setBonusNum() {
		int random = (int) (Math.random() * 42) + 1;
		while (this.winNum.contains(random)) {
			random = (int) (Math.random() * 42) + 1;
		}
		return this.bonusNum = random;
	}

	public Set<Integer> getWinNum() {
		return this.winNum;
	}

	public int getBonusNum() {
		return this.bonusNum;
	}

	public void clear() {
		this.winNum.clear();
		this.bonusNum = 0;
	}

	@Override
	public String toString() {
		StringBuilder prize = new StringBuilder();
		for (int number : winNum) {
			prize.append(number).append("\t");
		}
		return prize + "+ " + this.bonusNum;
	}
}
