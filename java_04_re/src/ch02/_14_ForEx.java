package ch02;

public class _14_ForEx {
	public static void main(String[] ForEx04){
		int dan = 1, result = 1;
		for(;dan<=9;dan++){
			if(dan%2!=0) {
				System.out.println("=== 홀수 " + dan + "의 짝수곱 ===");
				for(int i = 1; i<=25 ; i++) {
					if(i%2==0) {
						result = dan * i;
						System.out.println(dan + " * " + i + " = " + result);
					}
					else {
						continue;
					}
				}
				System.out.println("==================");
				System.out.println();
			}
			else {
				continue;
			}
			
		}
		
	}
}
