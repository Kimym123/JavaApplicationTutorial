package se.hs.ac;

public class ToDoView {
	public void showMenuView() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("---------메뉴---------");
		System.out.println("1. 할 일 추가");
		System.out.println("2. 할 일 수정");
		System.out.println("3. 할 일 삭제");
		System.out.println("4. 할 일 조회");
		System.out.println("5. 끝내기");
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
		System.out.println("해야 할 일을 입력하세요 : ");
	}

	public void showToDoWorkChange() {
		System.out.println("수행할 작업을 입력하세요(1. 목록을 Doing으로 변경  2. 목록을 Done으로 변경) : ");
	}

	public void showToDoUpdate() {
		System.out.println("수정하고 싶은 내용의 번호를 입력하세요 : ");
	}

	public void showToDoRemove() {
		System.out.println("삭제하고 싶은 내용의 번호를 입력하세요 : ");
	}

	public void showRemoveComp() {
		System.out.println("삭제 완료했습니다.");
	}

	public void showLine() {
		System.out.println("------------------");
	}

}
