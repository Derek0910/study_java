package ch02;

// p119
public class _15_ForEx {
	public static void main(String[] ForEx05_continue) {
		/*
	       * [ continue문 ]
	       * continue문은 반복문과 함께 사용한다.
	       * 반복문안에서 continue문을 만나면, 그 이후의 문장은 수행하지 않고,
	       * for문으로 돌아가 증감식을 수행한다.
	       */
	      // 1~100까지의 짝수 합계
		int i;
		int sum = 0;
		for(i=1; i<=100; i++)
		{
			if(i%2 == 1)
				continue;
			sum =  sum + i;
		}
		System.out.println("1~100까지의 짝수 합계 : " + sum);
		
	}
}
