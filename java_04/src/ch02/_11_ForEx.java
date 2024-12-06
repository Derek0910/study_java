package ch02;

public class _11_ForEx {
	public static void main(String[] forEx) {
		/*
	       * 반복문 : 조건이 참인동안 반복(while문, for문)
	       * 
	       * for(초기값; 조건식; 증감식) {  // 반복횟수
	       *     수행문1;
	       *     수행문2;...
	       * }
	       */
	      
	      // 출력 => HappyDay1^^   HappyDay2^^  HappyDay3^^  HappyDay4^^  HappyDay5^^
        //        반복문 종료^^   
		int count = 0;
		for (count = 1; count<=5; count++)
		{
			System.out.print("HappyDay" + count + "^^ ");
		}
		
		System.out.println();
		System.out.println("증가 반복문 종료^^");
		
		System.out.println();
		System.out.println("=============");
		
		for (count = 5; count > 0; count--)
		{
			System.out.println("HappyDay" + count + "^^");
		}
		System.out.println("감소 반복문 종료^^");
	}
}
