package ch02;

public class _12_ForEx {
	public static void main(String[] ForEx02) {
		int sum = 0;
		System.out.println("[ 1~10까지의 합 ]");
		
		for (int num = 1 ; num<=10; num ++) {
			sum += num;
			System.out.println("* num = " + num + ", sum = " + sum);
		}
		System.out.println("* 1~10까지의 합 : " + sum);
	}
}
