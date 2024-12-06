package ch02;

public class _09_WhileEx {
	public static void main(String[] WhileQuiz01) {
		int i = 9;
		int dan = 9;
		int result = 0;
		
		System.out.println("=== 거꾸로 구구단 ===");
		while (i>=1) {
			result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
			i--;
		}
		System.out.println("===============");
	}
}
