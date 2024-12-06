package ch03;

import java.util.Scanner;

public class _02_BookMain2 {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스명 참조변수 = new 클래스명(); => 참조변수를 클래스의 주소값으로 사용한다.
		// 참조변수.멤버변수 = 값;
		_02_Book2_p book1 = new _02_Book2_p();
		
		book1.setBookNo(1);
		book1.setBookTitle("java 입문");
		book1.setAuthor("박은종");
		book1.setPrice(25000);
		
		// 참조변수.멤버메서드;
		book1.showInfo();
		
		System.out.println();
		System.out.println("-----------");
		Scanner book2Input = new Scanner(System.in);
		
		_02_Book2_p book2 = new _02_Book2_p();
		

		book2.setBookNo(2);
		book2.setBookTitle("JSP");
		book2.setAuthor("최범균");
		book2.setPrice(35000);
		
		book2.showInfo();
	}
}
