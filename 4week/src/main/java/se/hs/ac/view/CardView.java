package se.hs.ac.view;

import se.hs.ac.dto.BusinessCard;

public class CardView {
    public void showCardMenu() {
        System.out.println("------------------------");
        System.out.println("1. 명함 등록");
        System.out.println("2. 명함 전체검색");
        System.out.println("3. 명함 이름검색");
        System.out.println("4. 명함 삭제");
        System.out.println("5. 명함 수정");
        System.out.println("0. 명함 종료");

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

    public void showOutputBusinessCard(BusinessCard businessCard) {
        System.out.println(businessCard);
    }

    public void showFindName(){
        System.out.print("찾으실 이름을 입력하세요 : ");
    }

    public void showDeleteNumber(){
        System.out.print("삭제하실 전화번호를 입력하세요 : ");
    }

    public void showUpdateNumber(){
        System.out.print("수정하실 전화번호를 입력하세요 : ");
    }

    public void showProgramOut(){
        System.out.println("프로그램을 종료합니다.");
    }
}
