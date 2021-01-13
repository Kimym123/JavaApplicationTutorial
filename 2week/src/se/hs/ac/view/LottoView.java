package se.hs.ac.view;

import java.util.List;

import se.hs.ac.makeLotto.UserLotto;

public class LottoView {
	public void showPrize() {
		System.out.println("─────────────────당첨된 번호입니다─────────────────");
	}

	public void showUser() {
		System.out.println("─────────────────구매한 복권 번호입니다─────────────────");
	}

	public void line() {
		System.out.println("──────────────────────────────────────────────");
	}

	public void selectNum() {
		System.out.print("실행하실 복권의 숫자를 입력하세요.\n>>");
	}

	public void showUserLottoList(List<UserLotto> userLottoList) {
		userLottoList.forEach(System.out::println);
	}

}
