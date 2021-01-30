package se.hs.ac.controller;

import se.hs.ac.module.CardModule;
import se.hs.ac.view.CardView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static se.hs.ac.util.BusinessCardConstants.menu.*;

public class CardController {
    private final CardView view;
    private final CardModule module;

    public CardController() {
        this.view = new CardView();
        this.module = new CardModule();
    }

    public void run() {
        while (true) {
            view.showCardMenu();
            Scanner sc = new Scanner(System.in);
            String selectNumber = sc.next();
            switch (selectNumber) {
                case CREATE:
                    create();
                    break;
                case ALLSEARCH:
                    module.outputBusinessCard();
                    break;
                case NAMESEARCH:
                    search();
                    break;
                case DELETE:
                    delete();
                    break;
                case UPDATE:
                    update();
                    break;
                case EXIT:
                    view.showProgramOut();
                    return;
            }
        }
    }

    public void create() {
        Scanner create = new Scanner(System.in);
        view.showInputName();
        String name = create.next();
        view.showInputPhone();
        String phone = create.next();
        view.showInputCompany();
        String company = create.next();
        module.insertBusinessCard(name, phone, company);
    }

    public void search() {
        Scanner Scan = new Scanner(System.in);
        view.showFindName();
        String findName = Scan.next();
        module.findBusinessCard(findName);
    }

    public void delete() {
        module.outputBusinessCard();
        Scanner delete = new Scanner(System.in);
        view.showDeleteNumber();
        String deletePhone = delete.next();
        module.deleteBusinessCard(deletePhone);
    }

    public void update() {
        module.outputBusinessCard();
        Scanner update = new Scanner(System.in);
        view.showUpdateNumber();
        String phoneNum = update.next();
        view.showInputName();
        String updateName = update.next();
        view.showInputPhone();
        String updatePhone = update.next();
        view.showInputCompany();
        String updateCompany = update.next();
        module.updateBusinessCard(updateName, updatePhone, updateCompany, phoneNum);
    }


}
