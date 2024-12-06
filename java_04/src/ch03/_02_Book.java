package ch03;

public class _02_Book {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인
	 * 		- 멤버변수(속성) + 멤버메서드(기능, 동작)
	 * 객체 : 클래스를 바탕으로 만들어진 힙(Heap)메모리 공간
	 */
	// 멤버변수(속성)
	int bookNo; 		// 번호 1
	String bookTitle; 	// 제목 java 입문
	String author;		// 저자 박은종
	
	// 멤버메서드(기능, 동작)
	public void showInfo(){
		System.out.println("번호 : " + bookNo);
		System.out.println("제목 : " + bookTitle);
		System.out.println("저자 : " + author);
		
	}	
}
