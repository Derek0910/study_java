package ch02;

public class _16_ForEx {
	public static void main(String[] ForEx06){
		int i;
		int sum = 0;
		for(i=1; i<=100; i++)
		{
			if(i%5 != 0) {
				continue;
			}
			else if(i%5 == 0)
				System.out.println("i : " + i + ", sum :" + sum + " => " + (sum + i));
				sum =  sum + i;
			if(sum>500)
				break;
		}
		System.out.println("5의 배수의 합이 500이상 일때의 값은 : " + sum + "이고, 그 때의 i의 값은 " + i +"이다.");
		
	}
}
