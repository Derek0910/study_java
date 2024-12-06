package ch04;

public class _02_BookMain {
	public static void main(String[]bm){
		_02_Book book1 = new _02_Book();
		
		book1.setBookNo(833);
		book1.setBookTitle("만화로 보는 한국사");
		book1.setAuthor("지은이");
		book1.setPrice(12000);
		book1.setPageCount(300);
		
		book1.setterOut();
		
		System.out.println();
		System.out.println("===============");
		book1.getterOut();
	}
}

/* 
 * 결과값
 * bookNo : 833
 * bookTitle : 만화로 보는 한국사
 * author : 지은이
 * price : 12000원
 * pageCount : 300쪽
 * 
 * ===============
 * getBookNo() : 833
 * getBookTitle() : 만화로 보는 한국사
 * getAuthor() : 지은이
 * getPrice() : 12000
 * getPageCount() : 300
 * 
 */
