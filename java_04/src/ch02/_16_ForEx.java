package ch02;

// p121
public class _16_ForEx {
	public static void main(String[] ForEx06_Break) {
		/*
	       * [ break문 ]
	       * - 반복문이 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료한다.
	       * - 반복문안에서 continue문을 만나면, 아래의 문장은 수행하지 않되 계속수행하며,
	       *    beeak문을 만나면 반복문을 더 이상 수행하지 않고 빠져나올때 사용한다.
	       */
	      
	      // 1~100까지 더하기(5050), sum이 100 이상이면 빠져나온다.
		int sum = 0;
		int k= 1;
//		int sum = 0;
//		int result = 0;
		
		for (k= 1; k <=100 ; k++) {
			
			sum += k;
//			if(sum>=100)
//			break;
//			System.out.println(k + "번째 결과값음 " + sum);
		}
		System.out.println("1~100까지 더하기 : " + sum);
		System.out.println();
		
		for (k= 1, sum = 0; k <=100 ; k++) {
			
			sum += k;
			if(sum>=100)
			break;
			System.out.println(k + "번째 결과값은 " + sum);
		}
		
		System.out.println();
		System.out.println("sum의 합이 100이상 일 때의 값은 " + sum + "이고, 그때의 k의 값은 " + k + "이다.");
	}
}
