package se.hs.ac.module;

import java.io.BufferedReader;
import java.io.IOException;

import se.hs.ac.model.Comb;
import se.hs.ac.model.CookTimer;
import se.hs.ac.model.Microwave;
import se.hs.ac.model.Oven;
import se.hs.ac.model.Roast;
import se.hs.ac.model.Steam;

import static se.hs.ac.util.WorkConstants.method.*;

public class OvenModule {
	private CookTimer timer;
	private String result = "";
	private Roast roast;

	public OvenModule() {
		this.timer = new CookTimer();
	}

	public void ovenTime(int input) {
		timer.setSec(input);
	}

	public CookTimer getTime() {
		return this.timer;
	}
	
	public String roastItemName(String number) {
		Roast roast = Roast.getInstance(number);
		return roast.getName();
	}

	public void roastCookResult(String number) throws IOException {
		String second = timer.toString();
		Roast roast = Roast.getInstance(number);
		result = second + " 간 " + roast.getName() + "를(을)" + "조리합니다.";
	}

	public String getResult() {
		return result;
	}

//	public void cookResult(BufferedReader br) {
//		CookTimer second = getTime();
//		String select = br.readLine();
//		switch (select) {
//		case 구이:
//			this.result = second;
//			break;
//		}
//	}

}
