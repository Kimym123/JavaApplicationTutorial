package se.hs.ac;

public class ToDoView {
	public void showMenuView() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("---------�޴�---------");
		System.out.println("1. �� �� �߰�");
		System.out.println("2. �� �� ����");
		System.out.println("3. �� �� ����");
		System.out.println("4. �� �� ��ȸ");
		System.out.println("5. ������");
	}

	public void showToDoStatus() {
		System.out.println("------------------");
		System.out.println("      ToDo        ");
	}

	public void showDoingStatus() {
		System.out.println("------------------");
		System.out.println("      Doing       ");
	}

	public void showDoneStatus() {
		System.out.println("------------------");
		System.out.println("      Done        ");
	}

	public void showToDoAdd() {
		System.out.println("�ؾ� �� ���� �Է��ϼ��� : ");
	}

	public void showToDoWorkChange() {
		System.out.println("������ �۾��� �Է��ϼ���(1. ����� Doing���� ����  2. ����� Done���� ����) : ");
	}

	public void showToDoUpdate() {
		System.out.println("�����ϰ� ���� ������ ��ȣ�� �Է��ϼ��� : ");
	}

	public void showToDoRemove() {
		System.out.println("�����ϰ� ���� ������ ��ȣ�� �Է��ϼ��� : ");
	}

	public void showRemoveComp() {
		System.out.println("���� �Ϸ��߽��ϴ�.");
	}

	public void showLine() {
		System.out.println("------------------");
	}

}
