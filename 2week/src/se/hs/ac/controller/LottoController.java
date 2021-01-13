package se.hs.ac.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import se.hs.ac.game.LottoGame;
import se.hs.ac.makeLotto.UserLotto;
import se.hs.ac.makeLotto.WinLotto;
import se.hs.ac.view.LottoView;

public class LottoController {

	private LottoGame lottoGame;
	private LottoView lottoView;

	public LottoController() {
		lottoGame = new LottoGame();
		lottoView = new LottoView();
	}

	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			lottoView.showPrize();
			System.out.println(lottoGame.getWinLotto());
			lottoView.line();
			lottoView.selectNum();
			int selectNum = Integer.parseInt(br.readLine());
			lottoGame.setUserLottoList(selectNum);
			lottoGame.setLottoListResult();
			lottoView.showUserLottoList(lottoGame.getUserLottoList());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void prizeLotto() {

	}

	public void makeLotto(int num) {
		lottoGame.setWinLotto();
		lottoGame.setUserLottoList(num);
	}

	public int inputNum(BufferedReader br) throws IOException {
		lottoView.selectNum();
		return Integer.parseInt(br.readLine());
	}

}
