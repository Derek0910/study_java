package ch02;

public class _12_ForEx {
	public static void main(String[] ForEx02) {
		int result = 1;
		for (int times = 1; times <= 10; times++) {
			result *= times;
		}
		System.out.println("1 ~ 10까지의 곱의 합 : " + result );
	}
}
