package se.hs.ac.dto;

public class GuestBook {
	private int guestBookId;
	private String guestBookName;
	private String guestBookContent;
	private String guestBookDate;

	public int getGuestBookId() {
		return guestBookId;
	}

	public void setGuestBookId(int guestBookId) {
		this.guestBookId = guestBookId;
	}

	public String getGuestBookName() {
		return guestBookName;
	}

	public void setGuestBookName(String guestBookName) {
		this.guestBookName = guestBookName;
	}

	public String getGuestBookContent() {
		return guestBookContent;
	}

	public void setGuestBookContent(String guestBookContent) {
		this.guestBookContent = guestBookContent;
	}

	public String getGuestBookDate() {
		return guestBookDate;
	}

	public void setGuestBookDate(String guestBookDate) {
		this.guestBookDate = guestBookDate;
	}

	public GuestBook() {

	}

	public GuestBook(int guestBookId, String guestBookName, String guestBookContent, String guestBookDate) {
		this.guestBookId = guestBookId;
		this.guestBookName = guestBookName;
		this.guestBookContent = guestBookContent;
		this.guestBookDate = guestBookDate;
	}

}
