package ch02;

public class _10_WhileEx {
	public static void main(String[] WhileQuiz) {
		/* 반복문 : 조건이 참인 동안 계속해서 반복수행(while문, for문)
        1.초기값 -> 2.조건식 -> 3.증감식
        
		 [ while 문법 ]
		 1. 초기값;
		 while(조건식) {	 	// 2. 조건식
		    수행문1;
		    증감식;  		  	// 3. 증감식
		 }
		 수행문2;
		*/
		
		
		/*
       * Test3. while문으로 구구단 작성
       * 2~9단까지 출력
       * 
       * ****************
       * *** 구구단 출력 ***
       * ****************
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
      
		System.out.println("****************");
		System.out.println("*** 구구단 출력 ***");
		System.out.println("****************");
	      
		int dan = 2;
		int result = 0;
		
		while (dan <=9 ) {
			int i = 1;
			System.out.println();
			System.out.println("=== 구구단("+ dan + "단) ===");
			
			while (i<=9) {
				result = dan * i;
				System.out.println(dan + " * " + i + " = " + result);
				i++;
			}
			dan++;
//			break;
		}
		System.out.println("===============");
	}
}
