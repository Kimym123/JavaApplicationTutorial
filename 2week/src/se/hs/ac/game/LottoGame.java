package se.hs.ac.game;

import java.util.ArrayList;
import java.util.List;

import se.hs.ac.makeLotto.UserLotto;
import se.hs.ac.makeLotto.WinLotto;

public class LottoGame {
	private List<UserLotto> userLottoList;
	private WinLotto winLotto;
	private UserLotto userLotto;

	public LottoGame() {
		this.userLottoList = new ArrayList<UserLotto>();
		this.winLotto = new WinLotto();
		this.userLotto = new UserLotto();
	}

	public void clearGame() {
		this.winLotto.clear();
		this.userLottoList.clear();
	}

	public List<UserLotto> getUserLottoList() {
		return this.userLottoList;
	}

	public void setUserLottoList(int numberTime) {
		while (this.userLottoList.size() < numberTime) {
			this.userLottoList.add(new UserLotto());
		}
	}

	public WinLotto getWinLotto() {
		return winLotto;
	}

	public void setWinLotto() {
		this.winLotto = new WinLotto();
	}

	public void setLottoListResult() {
		for (UserLotto userLotto : userLottoList) {
			int result = judgeDuplicate(userLotto);
			boolean bonus = judgeBonus(userLotto);
			judgeRank(userLotto, result, bonus);
		}
	}

	public int judgeDuplicate(UserLotto userNum) {
		int result = 0;
		for (Integer a : this.winLotto.getWinNum()) {
			if (userNum.getUserNum().contains(a)) {
				result++;
			}
		}
		return result;
	}

	public boolean judgeBonus(UserLotto userNum) {
		boolean bonus = false;
		for (Integer a : userNum.getUserNum()) {
			if (a == this.winLotto.getBonusNum()) {
				bonus = true;
			}
		}
		return bonus;
	}

	public void judgeRank(UserLotto userLotto, int result, boolean bonus) {
		if (result == 6) {
			userLotto.setRankNum("1등");
		} else if (result == 5) {
			if (bonus = true) {
				userLotto.setRankNum("2등");
			}
			userLotto.setRankNum("3등");
		} else if (result == 4) {
			userLotto.setRankNum("4등");
		} else if (result == 3) {
			userLotto.setRankNum("5등");
		}
		userLotto.setRankNum("꽝");

	}

}
