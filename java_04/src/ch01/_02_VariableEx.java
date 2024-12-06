package ch01;

public class _02_VariableEx {
	public static void main(String[] intType) {
		/*
		 * 1. 기본자료형(Primitive Type) : 실제 "값"이 저장되는 공간
		 * 		- 정수형 : byte(1바이트, 8비트) < short(2바이트) < int(4바이트, 기본) < long(8바이트)
		 * 		- 실수형 : float(4바이트) < double(8바이트)
		 * 		- 문자형 : char(2바이트)
		 * 		- 부울형 : boolean(1바이트) => 1(T, true), 0 (F, false)
		 * 
		 * 2. 참조형(Reference Type) : 실제 객체를 가리키는 주소값이 저장되는 공간 - 참조변수의 자료형
		 * 		- 클래스, 인터페이스, 배열
		 * 
		 * 3. 문자열 : String 클래스
		 */
		byte num1=31;
		System.out.println(num1);

		short num2=12345;
		System.out.println(num2);
		
		int num3=1234567890;
		System.out.println(num3);
		
		long num4=12345678900L;
		System.out.println(num4);
		
		System.out.println("\n---------------");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		System.out.println("\n=== 실수형 변수 ===");
		float fnum1 = 3.14f;
		double dnum1 = 5.5; //실수형에서의 기본형은 double형이다!!
		
		System.out.println("fnum1 : " + fnum1);
		System.out.println("dnum1 : " + dnum1);
		
		System.out.println("\n=== 문자형 변수 ===");
		// String은 클래스 타입이므로 반드시 대문자로 시작한다.
		// 초기화 시 쌍따옴표를 사용하며, 공백이 없어도 된다.
		// String str = "";
		String str = "문희재";
		System.out.println("문자형 변수 str : " + str);
		
		// char grade = ' '; // char형은 초기화 시 공백이 있어야 한다.
		char grade = 'A';
		System.out.println("학점 : " + grade);
		
		System.out.println("\n=== 부울형 변수 ===");
		boolean isMarried = true;
		System.out.println("boolean형 변수 isMarried는 " + isMarried);
		
		boolean isWork = false;
		System.out.println("boolean형 변수 isWork는 " + isWork);

	}
}

/*
31
12345
1234567890
12345678900

---------------
num1 : 31
num2 : 12345
num3 : 1234567890
num4 : 12345678900

=== 실수형 변수 ===
fnum1 : 3.14
dnum1 : 5.5

=== 문자형 변수 ===
문자형 변수 str : 문희재
학점 : A

=== 부울형 변수 ===
boolean형 변수 isMarried는 true
boolean형 변수 isWork는 false
*/
