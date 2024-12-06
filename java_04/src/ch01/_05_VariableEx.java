package ch01;

public class _05_VariableEx {
	public static void main(String[] constant) {
		/*
		 * 상수 : 프로그램이 실행되는 동안, 값이 변하지 않는 수 또는 변경불가능한 수
		 * 		주로 대문자 사용.
		 * 		만약 값을 변경해야 할 경우, 상수를 선얺나 곳의 초기값만 변경하면 됨.
		 * 
		 * 문법 : final 자료형 변수명; 예) final double PI = 3.14;
		 * 		1) 변수(상수) : 변수의 값 변경불가
		 * 		2) 메서드 : 재정의 불가
		 * 		3) 클래스 : 상속 불가
		 */
		System.out.println("*-- p61 --*");
		final int MAX_NUM = 100;
//		int MAX_NUM = 100;
		final int MIN_NUM = 0;
		
//		MIN_NUM = 0;
		
		System.out.println("MAX_NUM = " + MAX_NUM);
		System.out.println("MIN_NUM = " + MIN_NUM);
		
//		MAX_NUM = 1000;
		System.out.println("MAX_NUM = " + MAX_NUM);
		System.out.println();
		System.out.println("*-- p62 --*");
		final int MY_AGE = 22;
		System.out.println(MY_AGE);
		
		System.out.println();
		System.out.println("-------------");
		String name = "홍길동";
		System.out.println("변경 전 name : " + name);
		name ="소지섭";
		System.out.println("변경 후 name : " + name);
		
		System.out.println();
		System.out.println("----- 퀴 즈 -----");
		// 상수로 내정보 출력(MY_NAME, MY_AGE, MY_ASSET, MY_EMAIL)
		final String MY_NAME = "문희재";
		System.out.println("MY_NAME : " + MY_NAME);
		
		final int MOON_AGE = 41;
		System.out.println("MY_AGE : " + MOON_AGE + "세");
		
		final double MY_ASSET = -1;
		System.out.println("MY_ASSET : " + MY_ASSET + "억");
		
		final String MY_EMAIL = "01028020910@daum.net";
		System.out.println("MY_EMAIL : " + MY_EMAIL);
	}
}