package ch02;

public class _10_WhileEx {
	public static void main(String[] WhileQuiz02) {
		
		System.out.println("****************");
		System.out.println("*** 구구단 출력 ***");
		System.out.println("****************");
	      
		int dan = 9;
		int result = 0;
		
		while (dan >=2 ) {
			int i = 9;
			System.out.println();
			System.out.println("=== 구구단("+ dan + "단) ===");
			
			while (i>=1) {
				result = dan * i;
				System.out.println(dan + " * " + i + " = " + result);
				i--;
			}
			dan--;
		}
		System.out.println("===============");
	}
}
