package ch03;

public class _01_Student {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인
	 * 		- 멤버변수(속성) + 멤버메서드(기능, 동작)
	 * 객체 : 클래스를 바탕으로 만들어진 힙(Heap)메모리 공간
	 */
	
	// 멤버변수(속성)
	String studentId;	// 학번  = "S001"
	String name;		// 이름  = "아이유"
	String email;		// 이메일  = "iu@naver.com"
	String address;		//주소 도쿄도 아다치구
	
	// 멤버메서드(기능, 동작)
	public void printInfo() {
		// 멤버변수 정보 출력
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + name);
		System.out.println("email : " + email);
		System.out.println("address : " + address);
	}
	

	
}
