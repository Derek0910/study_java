package ch03;

public class _02_Book2_p {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인
	 * 		- 멤버변수(속성) + 멤버메서드(기능, 동작)
	 * 객체 : 클래스를 바탕으로 만들어진 힙(Heap)메모리 공간
	 */
	// 멤버변수(속성)
	private int bookNo; 		
	private String bookTitle; 	
	private String author;	
	private int price;
	
	// 멤버메서드(기능, 동작)
	public void setBookNo( int bookNo){
		this.bookNo = bookNo;
	}	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	// 멤버메서드(기능, 동작)
	public void showInfo(){
		System.out.println("번호 : " + bookNo);
		System.out.println("제목 : " + bookTitle);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price + "원");
		
	}	
}
