package se.hs.ac.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import se.hs.ac.model.CookTimer;
import se.hs.ac.module.OvenModule;
import se.hs.ac.view.OvenView;

import static se.hs.ac.util.WorkConstants.menu.*;
import static se.hs.ac.util.WorkConstants.method.*;

public class OvenController {
	private final OvenView view;
	private final OvenModule module;

	public OvenController() {
		this.view = new OvenView();
		this.module = new OvenModule();
	}

	public void run() {
		ovenMenu();
	}

	public void ovenMenu() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			view.showOvenMeun();
			String select = br.readLine();
			switch (select) {
			case CookMethod:
				loadMethod(br);
				break;
			case MyRecipe:
				loadRecipe(br);
				break;
			case CookOption:
				loadOption(br);
				break;
			case Exit: // 끝내기
				return;
			}
		} catch (Exception e) {
			view.showError();
		}
	}

	public void loadMethod(BufferedReader br) throws IOException {
		view.showOvenMethod();
		String select = br.readLine();
		switch (select) {
		case 구이:
//			getRoastCookItem(br);
			cookTimer(br);
//			module.roastItemName(num);
//			cookResult(num);
			break;
		case 레인지:
			microwaveCookItem(br);
			cookTimer(br);
			cookResult(select);
			break;
		case 오븐:
			ovenCookItem(br);
			cookTimer(br);
			cookResult(select);
			break;
		case 콤비:
			combCookItem(br);
			cookTimer(br);		
			cookResult(select);
			break;
		case 스팀:
			steamCookItem(br);
			cookTimer(br);
			cookResult(select);
			break;
		}

	}

	public void roastCookItem(BufferedReader br) throws IOException {
		view.showOvenItem();
		view.roastPrintItem(); // 세부 목록 출력
		String number = br.readLine();
	}
	
	public void microwaveCookItem(BufferedReader br) throws IOException {
		view.showOvenItem();
		view.microwavePrintItem(); // 세부 목록 출력
		String number = br.readLine();
	}
	
	public void ovenCookItem(BufferedReader br) throws IOException {
		view.showOvenItem();
		view.ovenPrintItem(); // 세부 목록 출력
		String number = br.readLine();
	}
	
	public void combCookItem(BufferedReader br) throws IOException {
		view.showOvenItem();
		view.combPrintItem(); // 세부 목록 출력
		String number = br.readLine();
	}
	
	public void steamCookItem(BufferedReader br) throws IOException {
		view.showOvenItem();
		view.steamPrintItem(); // 세부 목록 출력
		String number = br.readLine();
	}
	
	public void cookTimer(BufferedReader br) throws IOException {
		view.showOvenTimer();
		int inputTime = Integer.parseInt(br.readLine());
		module.ovenTime(inputTime);
	}

	public void cookResult(String select) throws IOException {
		view.showResult();
		module.roastCookResult(select);
		System.out.println(module.getResult());

	}

	public void loadRecipe(BufferedReader br) throws IOException {

	}

	public void loadOption(BufferedReader br) throws IOException {
		view.showOption();
		view.optionPrintItem();
	}



}
