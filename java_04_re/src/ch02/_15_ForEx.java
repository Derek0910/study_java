package ch02;

public class _15_ForEx {
	public static void main(String[] ForEx05){
		int i;
		int sum = 0;
		for(i=1; i<=100; i++)
		{
			if(i%4 == 0)
				continue;
			System.out.println("i : " + i + ", sum :" + sum + " => " + (sum + i));
			sum =  sum + i;
		}
		System.out.println("1~100까지 수에서 4의 배수를 제외한 수의 합계 : " + sum);
		
	}
}
