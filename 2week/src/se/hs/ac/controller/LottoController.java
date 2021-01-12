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
//	private WinLotto winLotto;

	public LottoController() {
		lottoGame = new LottoGame();
		lottoView = new LottoView();
//		winLotto = new WinLotto();
	}

	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			lottoView.showPrize(); // 당첨번호
			System.out.println(lottoGame.getWinLotto()); // 당첨 번호들
			lottoView.line(); // 라인
			
			lottoGame.setUserLottoList(5);
			lottoGame.setLottoListResult();
			lottoView.showUserLottoList(lottoGame.getUserLottoList());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void makeLotto(int num) {
		lottoGame.setWinLotto();
		lottoGame.setUserLottoList(num);
	}
	
	public int inputNum(BufferedReader br) throws IOException {
		lottoView.selectNum(); // 복권 숫자 입력
		return Integer.parseInt(br.readLine());
	}
	
	
}
