package se.hs.ac;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ToDoCtor {

	private int Id;
	private String status;
	private String date;
	private String content;

	private SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	Date time = new Date();

	public ToDoCtor(int id, String content) {

		this.Id = id;
		this.status = "ToDo";
		this.date = format1.format(time);
		this.content = content;
	}

	public void workChange(int num) {

		do {
			switch (num) {
			case 1: {
				this.status = "Doing";
				break;
			}

			case 2: {
				this.status = "Done";
				break;
			}
			default:
				System.out.println("잘못된 숫자를 입력했습니다");
				break;
			}
		} while (num == 1 || num == 2);

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId() + " " + getDate() + " " + getContent() + " " + getStatus();
	}
}

//public String ToDoctorInfo() {
//return getId() + " " + getDate() + " " + getContent();
//}
