package ch02;

public class _06_SwitchCaseEx {
	public static void main(String[] IfEx04) {
		/*
		   * 나머지 구하기
	     */
		int dividend = 53;
		int divisor = 4;
		int reminder = 0;
		
		if (dividend <0) {
			System.out.println("피제수를 확인해 주세요.(피제수는 0또는 양수입니다.)");
		}
		else {
			switch(dividend%divisor) {
			
					case 1 : reminder = 1;
						break;
					case 2 : reminder = 2;
						break;
					case 3 : reminder = 3;
						break;
					default : reminder = 0;
			}
			
			System.out.println(dividend + "나누기 " + divisor + "의 몫은 " +(dividend/divisor) + "이고, 나머지는 " + reminder + "입니다.");
		}
		
		
	}
}

/*
 * 결과값
 * 53나누기 4의 몫은 13이고, 나머지는 1입니다.
 */

