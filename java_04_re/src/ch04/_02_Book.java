package ch04;

public class _02_Book {
	private int bookNo;
	private String bookTitle;
	private String author;
	private int price;
	private int pageCount;
	
	public void setBookNo(int bn){
		this.bookNo = bn;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookTitle(String bt){
		this.bookTitle = bt;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setAuthor(String auth){
		this.author = auth;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int pr){
		this.price = pr;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPageCount(int pc){
		this.pageCount = pc;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	//setter 출력
	public void setterOut() {
		System.out.println("bookNo : " + bookNo);
		System.out.println("bookTitle : " + bookTitle);
		System.out.println("author : " + author);
		System.out.println("price : " + price + "원");
		System.out.println("pageCount : " + pageCount + "쪽");
	}
	
	//getter 출력
	
	public void getterOut() {
		System.out.println("getBookNo() : " + getBookNo());
		System.out.println("getBookTitle() : " + getBookTitle());
		System.out.println("getAuthor() : " + getAuthor());
		System.out.println("getPrice() : " + getPrice());
		System.out.println("getPageCount() : " + getPageCount());
	}
	
}
