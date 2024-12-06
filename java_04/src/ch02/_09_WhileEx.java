package ch02;

public class _09_WhileEx {
	public static void main(String[] WhileQuiz) {
		/* 
		 * === 2단 ===
		 * 2 * 1 = 2
		 * ...
		 * 2 * 9 = 18
		 * ==========
		 */
//		int dan = 1;
		int dan = 2;
		int i = 1;
		int result = 0;
		
		while (dan <=9 ) {
			System.out.println();
			System.out.println("=== 구구단("+ dan + "단) ===");
//			System.out.println("=== "+ dan + "단 ===");
			while (i<=9) {
				result = dan * i;
				System.out.println(dan + " * " + i + " = " + result);
				i++;
			}
			dan++;
			i = 1;
//			System.out.println("==========");
			System.out.println("===============");
		}
	}
}
