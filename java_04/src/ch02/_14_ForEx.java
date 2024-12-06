package ch02;

public class _14_ForEx {
	public static void main(String[] ForEx04) {
		/*
	       * Test4. for문으로 구구단 작성
	       * 2~9단까지 출력
	       * 
	       * *** 구구단 출력 ***
	       * === 2단 ===
	       * 2 * 1 = 2
	       * ...
	       * 2 * 9 = 18
	       * === 9단 ===
	       * 9 * 1 = 9
	       * ...
	       * 9 * 9 = 81
	       * ==========  마지막에 한번만
	       */
		int result = 0;
		System.out.println("*** 구구단 출력 ***");
		for(int dan = 2;dan<=9;dan++) {
			System.out.println();
			System.out.println("=== " + dan + "단 ===");
			for (int i = 1; i<=9;i++) {
				result = dan * i;
				System.out.println(dan + " * " + i + " = " + result);
			}
		}
		System.out.println("==========");
	}
}
