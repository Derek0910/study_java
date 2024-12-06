package ch02;

public class _13_ForEx {
	public static void main(String[] ForEx03){
		int dan = 4, i = 1, result = 1;
		System.out.println("=== " + dan + "의 짝수곱 ===");
		for(i = 1; i<=25 ; i++) {
			if(i%2==0) {
				result = dan * i;
				System.out.println(dan + " * " + i + " = " + result);
			}
			else {
				continue;
			}
		}
	}
}
