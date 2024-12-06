package ch03;

import java.util.Scanner;

//import _01_Student();

public class _01_Student_Main {
	public static void main(String[] args){
		// 객체 생성
		// 클래스명 참조변수 = new 클래스명(); => 참조변수를 클래스의 주소값으로 사용한다.
		// 참조변수.멤버변수;
		// 참조변수.멤버메서드;
		// 여기서 _01_Student이 객체이다. new로 새로운 객체를 만든다.
		_01_Student iu = new _01_Student(); 
		iu.studentId = "S001";
		iu.name = "아이유";
		iu.email = "iu@naver.com";
		iu.address = "베버리힐스";
//		System.out.println(iu.studentId);
		
		iu.printInfo();
		System.out.println();
		System.out.println("------------");
		
		_01_Student mhj = new _01_Student(); 
		mhj.studentId = "I002";
		mhj.name = "문희재";
		mhj.email = "01028020910@daum.net";
		mhj.address = "도쿄도 아다치구";
		
		mhj.printInfo();
		
		
		System.out.println();
		System.out.println("============");
		
		Scanner mhj1 = new Scanner(System.in);
		System.out.println("이름을 입력하세요. : ");
		String InputName = mhj1.next();
//		String InputName = mhj1.nextLine();
		System.out.println("입력하신 이름은 : " + InputName + "입니다. 저장하시겠습니까?");
		
	}
}
