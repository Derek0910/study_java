package ch01;

public class _01_VariableEx_2 {
	private void aa() {
		/*
		 * 자바프로그램의 첫시작을 나타내는 main() 메서드 .. 소문자로 시작한다. 자바가상머신(JVM, Java Virtual Machine)이
		 * 프로그램을 시작하기 위해 호출하는 메서드
		 */
		// System.out.println("*** 변수 ***");

		/*
		 * 변수 선언 및 대입 => 자료형 변수명 = 값; 변수는 소문자로 시작한다. 해당 자료형에 맞게 대입되어야 한다.
		 */

		System.out.println("*** 나의 정보 ***");
		int favorite = 1;
		String name = "Derek";
		String address = "독산동";
		String dream = "RichMan";
		
		// String bloodType = 'A';
		char bloodType = 'A';

		// 이름(name)
		// 주소(address)
		// 꿈(dream)
		// 혈액형(bloodType)

		System.out.println("좋아하는 숫자는 : " + favorite);
		System.out.println("나의 이름 : " + name);
		System.out.println("나의 주소 : " + address);
		System.out.println("과거 꿈 : " + dream);
		dream = "백수";
		System.out.println("현재 꿈 : " + dream);
		System.out.println("나의 혈액형 : " + bloodType + "형");

		// \t => 탭간격 만큼 띄우기, \n => 줄바꿈
		System.out.println("-------------------------");
		System.out.println("좋아하는 숫자는 " + favorite + " 이고," + "\t이름은 " + name + "입니다.");
		System.out.println("-------------------------");
		System.out.println("좋아하는 숫자는 " + favorite + " 이고," + "\n이름은 " + name + "입니다.");
	}
}
