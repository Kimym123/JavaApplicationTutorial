package se.hs.ac.dto;

public class GuestBook {
	private int bbsId;
	private String bbsName;
	private String bbsContent;
	private String bbsDate;

	public int getBbsId() {
		return bbsId;
	}

	public void setBbsId(int bbsId) {
		this.bbsId = bbsId;
	}

	public String getBbsName() {
		return bbsName;
	}

	public void setBbsName(String bbsName) {
		this.bbsName = bbsName;
	}

	public String getBbsContent() {
		return bbsContent;
	}

	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}

	public String getBbsDate() {
		return bbsDate;
	}

	public void setBbsDate(String bbsDate) {
		this.bbsDate = bbsDate;
	}

	public GuestBook(int bbsId, String bbsName, String bbsContent, String bbsDate) {
		super();
		this.bbsId = bbsId;
		this.bbsName = bbsName;
		this.bbsContent = bbsContent;
		this.bbsDate = bbsDate;
	}

	public GuestBook() {

	}

}
