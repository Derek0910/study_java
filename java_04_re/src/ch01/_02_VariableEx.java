package ch01;

public class _02_VariableEx {
	public static void main(String[] args) {
		byte num1 = 127;
		System.out.println(num1);
		
		short num2 = 32767;
		System.out.println(num2);
		
		int num3 = 2147483647;
		System.out.println(num3);
		
		long num4 = 9223372036854775807L;
		System.out.println(num4);
		
//		long num5 = 9223372036854775807;
//		=> long 값에 L을 넣어주지 않을 경우 아래 에러 발생
//		   (The literal 9223372036854775807 of type int is out of range )
//		System.out.println(num5);
	}
}

/*
 * 결과값
 * 127
 * 32767
 * 2147483647
 * 9223372036854775807
 */

