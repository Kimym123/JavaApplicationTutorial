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
				System.out.println("�����մϴ�.");
				break;

			default:
				System.out.println("�߸��� ���ڸ� �Է��߽��ϴ�");
				break;
			}

		}

	}

}

//�̷������� ����
//ToDoctor p1 = new ToDoctor(1, "�ȳ��ϼ���");
//System.out.println(p1);
