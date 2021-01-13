package se.hs.ac;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToDoList {

	private ArrayList<ToDoCtor> work = new ArrayList<ToDoCtor>();
	ToDoView myView = new ToDoView();

	int cnt = 1;

	public void add() {
		myView.showToDoAdd();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ToDoCtor p1 = new ToDoCtor(cnt++, input);
		work.add(p1);
	}

	public void update() {
		display();

		myView.showToDoWorkChange();
		Scanner sc = new Scanner(System.in);
		int selectNumber = sc.nextInt();

		switch (selectNumber) {
		case 1: {

			myView.showToDoUpdate();
			Scanner scan = new Scanner(System.in);
			int IdNum = scan.nextInt();

			for (int i = 0; i < work.size(); i++) {
				if (work.get(i).getId() == IdNum) {
					work.get(i).setStatus("Doing���� �����մϴ�.");
				}
			}
			break;
		}
		case 2: {

			myView.showToDoUpdate();
			Scanner scan = new Scanner(System.in);
			int IdNum = scan.nextInt();

			for (int i = 0; i < work.size(); i++) {
				if (work.get(i).getId() == IdNum) {
					work.get(i).setStatus("Done���� �����մϴ�.");
				}
			}
			break;

		}
		default: {
			System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���");
			break;
		}
		}

	}

	public void remove() {

		display();

		myView.showToDoRemove();
		Scanner sc = new Scanner(System.in);
		int selectNumber = sc.nextInt();

		for (ToDoCtor todoctor : work) {
			if (todoctor.getId() == selectNumber) {
				work.remove(todoctor);
				myView.showRemoveComp();
				return;
			}
		}
	}


	public void display() {

		// ���� for���� ������� �ʴ� ���
//		for (int i=0;i<Work.size();i++) {  
//			ToDoctor w = Work.get(i); 
//			
//			int Id = w.getId();
//			String Date = w.getDate();
//			String Content = w.getContent();
//			System.out.println(Id + " " + Date + " " + Content);
//		}

		// ���� for���� �⺻ ����
//		for (ToDoCtor todoctor : Work) {
//			int Id = todoctor.getId();
//			String Date = todoctor.getDate();
//			String Content = todoctor.getContent();
//			System.out.println(Id + " " + Date + " " + Content);
//		}

		myView.showToDoStatus();
		for (ToDoCtor todoctor : work) {
			int Id = todoctor.getId();
			String Date = todoctor.getDate();
			String Content = todoctor.getContent();
			String Status = todoctor.getStatus();
			if (Status.equals("ToDo")) {
				System.out.println(Id + " " + Date + " " + Content);
			}
		}

		myView.showDoingStatus();
		for (ToDoCtor todoctor : work) {
			int Id = todoctor.getId();
			String Date = todoctor.getDate();
			String Content = todoctor.getContent();
			String Status = todoctor.getStatus();
			if (Status.equals("Doing")) {
				System.out.println(Id + " " + Date + " " + Content);
			}
		}
		myView.showDoneStatus();
		for (ToDoCtor todoctor : work) {
			int Id = todoctor.getId();
			String Date = todoctor.getDate();
			String Content = todoctor.getContent();
			String Status = todoctor.getStatus();
			if (Status.equals("Done")) {
				System.out.println(Id + " " + Date + " " + Content);
			}
		}
		myView.showLine();

	}
}
// �ٽ�!!!!!!!!!!!!! �̰��� �߿�
//for (int i = 0; i < Work.size(); i++) {
//	if(Work.get(i).getContent().equals(content)) {
//		Work.get(i).setStatus("doing");
//	}
