package se.hs.ac.game;

import java.util.ArrayList;
import java.util.List;

import se.hs.ac.makeLotto.UserLotto;
import se.hs.ac.makeLotto.WinLotto;

public class LottoGame {
	private List<UserLotto> userLottoList;
	private WinLotto winLotto;
	
	public LottoGame() {
		this.userLottoList = new ArrayList<UserLotto>();
		this.winLotto = new WinLotto();
	}
	
	public void clearGame() {
		this.winLotto.clear();
		this.userLottoList.clear();
	}
	
	public List<UserLotto> getUserLottoList() {
		return this.userLottoList;
	}
	
	public void setUserLottoList(int selectNum) {
		while(this.userLottoList.size()<selectNum) {
			this.userLottoList.add(new UserLotto());
		}
	}
	
	public WinLotto getWinLotto() {
		return this.winLotto = new WinLotto();
	}
	
	public void setWinLotto() {
		this.winLotto = new WinLotto();
	}
}
