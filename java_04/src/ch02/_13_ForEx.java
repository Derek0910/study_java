package ch02;

public class _13_ForEx {
	public static void main(String[] ForEx03) {
		/*
	       * for문을 이용해 콘솔에서 구구단 출력
	       * 단을 입력하세요 : 2
	       * === 2단 ===
	       * 2 * 1 = 2..
	       * 2 * 9 = 18
	       * =========== 
	       */
		
		int dan = 2, i = 1, result = 0;
		
//		System.out.println("=== 2단 ===");
		System.out.println("=== " + dan + "단 ===");
		
		for (; i<=9;i++) {
			result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
		}
		System.out.println("==========");
		
	}
}
