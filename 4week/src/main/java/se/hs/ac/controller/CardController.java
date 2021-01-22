package se.hs.ac.controller;

import se.hs.ac.module.CardModule;
import se.hs.ac.view.CardView;

import java.util.Scanner;

public class CardController {
    private final CardView view;
    private final CardModule module;

    public CardController() {
        this.view = new CardView();
        this.module = new CardModule();
    }

    public void run() {
        view.showCardMenu();
        view.showSelectNumber();
        Scanner sc = new Scanner(System.in);
        int selectNumber = sc.nextInt();
        caseNumber(selectNumber);

    }

    public void caseNumber(int selectNumber) {
        switch (selectNumber) {
            case 1:
                Scanner sc = new Scanner(System.in);
                view.showInputName();
                String name = sc.next();
                view.showInputPhone();
                String phone = sc.next();
                view.showInputCompany();
                String company = sc.next();
                module.insertUser(name, phone, company);
                break;
            case 2:
                module.outputUser();
                break;
            case 3:
                return;
        }
    }

    public void inputCallingCard() {

    }
}
