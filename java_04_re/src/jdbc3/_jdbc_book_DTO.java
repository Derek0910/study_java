package jdbc3;

public class _jdbc_book_DTO {
	private int bookno;
	private String bookname = null;
	private int bookrent;
	private String bookauthor = null;
	private String memberid = null;
	private String memberno = null;
	
	public int getBookno() {
		return bookno;
	}
	
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	
	public String getBookname() {
		return bookname;
	}
	
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public int getBookrent() {
		return bookrent;
	}
	
	public void setBookrent(int bookrent) {
		this.bookrent = bookrent;
	}
	
	public String getMemberid() {
		return memberid;
	}
	
	public String getBookauthor() {
		return bookauthor;
	}
	
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	
	public String getMemberno() {
		return memberno;
	}
	
	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}

	
}
