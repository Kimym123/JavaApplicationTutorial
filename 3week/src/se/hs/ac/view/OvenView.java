package se.hs.ac.view;


import se.hs.ac.model.Comb;
import se.hs.ac.model.Microwave;
import se.hs.ac.model.Oven;
import se.hs.ac.model.OvenOption;
import se.hs.ac.model.Roast;
import se.hs.ac.model.Steam;

public class OvenView {
	public void showTitle(String input) {
		System.out.println("──────────────────"+ input +"──────────────────");
	}
	
	public void showOvenMeun() {
		showTitle("오븐 메뉴");
		System.out.println("1. 조리 방법 선택화면으로 갑니다.");
		System.out.println("2. 즐겨찾기 레시피 화면으로 갑니다.");
		System.out.print("3. 추가기능 화면으로 갑니다.\n>>> ");
	}
	
	public void showOvenMethod() {
		showTitle("조리 방법");
		System.out.println("1. 구이");
		System.out.println("2. 레인지");
		System.out.println("3. 오븐");
		System.out.println("4. 콤비");
		System.out.println("5. 스팀");
	}
	
	public void showOvenItem() {
		showTitle("세부 품목");
	}
	
	public void showOvenTimer() {
		showTitle("시간 설정");
		System.out.println("원하시는 시간(초)을 입력하세요\n>>> ");
	}
	
	public void showResult() {
		showTitle("실행 결과");
	}
	
	public void showError() {
		System.out.println("비정상적인 프로그램 에러로 인해서 프로그램이 종료됩니다.");
	}
	
	public void showOption() {
		showTitle("옵션 메뉴");
		System.out.println("");
	}
	
	
	public void roastPrintItem() {
		int num = 1;
		for (Roast roast : Roast.values()) {
			System.out.println(num++ + ". " + roast.getName());
		}
	}

	public void microwavePrintItem() {
		int num = 1;
		for (Microwave microwave : Microwave.values()) {
			System.out.println(num++ + ". " + microwave.getName());
		}
	}

	public void ovenPrintItem() {
		int num = 1;
		for (Oven oven : Oven.values()) {
			System.out.println(num++ + ". " + oven.getName());
		}
	}

	public void combPrintItem() {
		int num = 1;
		for (Comb comb : Comb.values()) {
			System.out.println(num++ + ". " + comb.getName());
		}
	}

	public void steamPrintItem() {
		int num = 1;
		for (Steam steam : Steam.values()) {
			System.out.println(num++ + ". " + steam.getName());
		}
	}
	
	public void optionPrintItem() {
		int num = 1;
		for (OvenOption option : OvenOption.values()) {
			System.out.println(num++ + ". " + option.getName());
		}
	}
}
