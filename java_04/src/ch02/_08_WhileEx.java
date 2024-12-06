package ch02;

public class _08_WhileEx {
	public static void main(String[] WhileEx02) {
		/* 반복문 : 조건이 참인 동안 계속해서 반복수행(while문, for문)
        1.초기값 -> 2.조건식 -> 3.증감식
        
		 [ while 문법 ]
		 1. 초기값;
		 while(조건식) { // 2. 조건식
		    수행문1;
		    증감식;  // 3. 증감식
		 }
		 수행문2;
		 
		 [ 무한루프 ]
		 while(true) {
		     break;  => 해당 반복문을 빠져나간다.
		 }
		*/
		
		// 출력 => HappyDay1^^   HappyDay2^^  HappyDay3^^  HappyDay4^^  HappyDay5^^
		//         반복문 종료^^
		
		// 1. 초기값
		// 2. 조건식
		// 3. 증감식
		System.out.println();
		System.out.println("=== 1. 1~10까지 출력 ===");
		int i = 1;
		
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		System.out.println("=== 2. 1~10까지 합계 출력 ===");
		int j = 1;
		int sum1 = 0;
		
		while (j<=10){
			sum1 += j;
//			System.out.println(sum1);
			j++;
		}
		System.out.println(sum1);
		
		System.out.println();
		System.out.println("=== 3. 1~10까지 합계과정 출력 ===");
		// k sum2
		// 1 + 0 = 1
		// 2 + 1 = 3
		// 10 + 45 = 55
		// 반복문 종료~
		int k = 1;
		int sum2 = 0;
		while (k<=10) {
			sum2 += k;
			System.out.println(k + " + " + (sum2-k) + "= " + sum2);
			k++;
		}
		System.out.println("반복문 종료~");
		System.out.println();
		System.out.println("=== 3-2. 1~10까지 합계과정 출력 ===");
		int l = 1;
		int sum3 = 0;
		while (l<=10) {
			
//			System.out.println(l + " + " + sum3 + "= " + (sum3+l));
			System.out.println(l + " + " + sum3 + " = " + (sum3+l));
			sum3 += l;
			l++;
//			System.out.println((sum3+l) + "="+ sum3 + "+" + l);
		}
		System.out.println("반복문 종료~");
	}
}
