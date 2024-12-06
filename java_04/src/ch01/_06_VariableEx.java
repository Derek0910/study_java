package ch01;

public class _06_VariableEx {
	public static void main(String[] incodingDecoding) {
		/*
		 * 인코딩 : 문자에 해당하는 정수값(아스키코드값) 출력
		 * 디코딩 : 정수값(아스키코드값)에 해당하는 문자 출력
		 * 예시) 
		 * 	인코딩 : A -> 65,
		 * 	디코딩 : 65 -> A
		 */
		char ch1 ='A';
		System.out.println(ch1);
		System.out.println((int)ch1);;
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char ch4 = '>';
		System.out.println(ch4);
		
		int ch5 = 92;
		System.out.println((char)ch5);
		
		char ch6 = 'z';
		System.out.println((int)ch6);
		
		char ch7 = '.';
		System.out.println((int)ch7);
	}
}