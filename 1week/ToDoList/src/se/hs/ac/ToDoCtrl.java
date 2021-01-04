package se.hs.ac;

import java.awt.Menu;
import java.io.IOException;
import java.util.Scanner;

public class ToDoCtrl {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int select = 0;

		ToDoView myView = new ToDoView();
		ToDoList myList = new ToDoList();

		while (select != 5) {

			myView.showMenuView();
			select = sc.nextInt();

			switch (select) {
			case 1:
				myList.add();
				break;

			case 2:
				myList.update();
				break;

			case 3:
				myList.remove();
				break;

			case 4:
				myList.display();
				break;

			case 5:
				System.out.println("종료합니다.");
				break;

			default:
				System.out.println("잘못된 숫자를 입력했습니다");
				break;
			}

		}

	}

}

//이런식으로 쓰임
//ToDoctor p1 = new ToDoctor(1, "안녕하세요");
//System.out.println(p1);
