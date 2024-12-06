package ch02;

public class _08_WhileEx {
	public static void main(String[] WhileEx02) {
		System.out.println("=== 1. 1~5의 2의 배수 출력 ===");
		int i = 1;
		int b = 2;
		while (i<=5) {
			int a = b * i;
			System.out.println(a);
			i++;
		}
		
		System.out.println();
		System.out.println("=== 2. 1~10까지의 곱의 값 출력 ===");
		int j = 1;
		int c = 1;
		while (j<=10) {
			c*=j;
			j++;
		}
		System.out.println(c);
		
		System.out.println();
		System.out.println("=== 3. 1~10까지의 곱의 과정 출력 ===");
		int k = 1;
		int d = 1;
		while (k<=10) {
			System.out.println(d + " * " + k + " = " + (d * k));
			d*=k;
			k++;
		}
	}
}

/*
 * 결과값
 * === 1. 1~5의 2의 배수 출력 ===
	2
	4
	6
	8
	10
	
	=== 2. 1~10까지의 곱의 값 출력 ===
	3628800
	
	=== 3. 1~10까지의 곱의 과정 출력 ===
	1 * 1 = 1
	1 * 2 = 2
	2 * 3 = 6
	6 * 4 = 24
	24 * 5 = 120
	120 * 6 = 720
	720 * 7 = 5040
	5040 * 8 = 40320
	40320 * 9 = 362880
	362880 * 10 = 3628800
 */
