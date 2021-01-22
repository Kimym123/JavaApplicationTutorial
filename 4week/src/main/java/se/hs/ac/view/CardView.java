package se.hs.ac.view;

public class CardView {
    public void showCardMenu() {
        System.out.println("------------------------");
        System.out.println("1. 명함 입력");
        System.out.println("2. 명함 검색");
        System.out.println("3. 명함 종료");

    }

    public void showSelectNumber() {
        System.out.print("메뉴를 입력하세요 : ");
    }

    public void showInputName() {
        System.out.print("이름을 입력하세요 : ");
    }

    public void showInputPhone() {
        System.out.print("전화번호를 입력하세요 : ");
    }

    public void showInputCompany() {
        System.out.print("회사 이름을 입력하세요 : ");
    }
}
