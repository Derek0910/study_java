package ch03;

import java.util.Scanner;

public class _02_BookMain {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스명 참조변수 = new 클래스명(); => 참조변수를 클래스의 주소값으로 사용한다.
		// 참조변수.멤버변수 = 값;
		_02_Book book1 = new _02_Book();
		
		book1.bookNo = 1;
		book1.bookTitle = "java 입문";
		book1.author = "박은종";
		
		// 참조변수.멤버메서드;
		book1.showInfo();
		
		System.out.println();
		System.out.println("-----------");
		Scanner book2Input = new Scanner(System.in);
		
		_02_Book book2 = new _02_Book();
		
		book2.bookNo = 2;
		book2.bookTitle = "JSP";
		book2.author = "최범균";
		System.out.println("저자를 입력해주세요. : ");
		book2.author = book2Input.next();
		book2.showInfo();
	}
}
