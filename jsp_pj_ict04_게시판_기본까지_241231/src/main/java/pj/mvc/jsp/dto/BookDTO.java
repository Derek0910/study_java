package pj.mvc.jsp.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class BookDTO {
	// 멤버변수
	private int bookNo;
	private String bookName;
	private Date publishDate;
	private String publisher;
	private String printNo;
	private Timestamp book_regdate;
	
	// 디폴트 생성자
	
	public BookDTO() {
		super();
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPrintNo() {
		return printNo;
	}

	public void setPrintNo(String printNo) {
		this.printNo = printNo;
	}

	public Timestamp getBook_regdate() {
		return book_regdate;
	}

	public void setBook_regdate(Timestamp book_regdate) {
		this.book_regdate = book_regdate;
	}
	
}
