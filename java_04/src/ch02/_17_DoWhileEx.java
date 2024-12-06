package ch02;

public class _17_DoWhileEx {
	//112
	public static void main(String[] DoWhileEx) {
		/*
	       * [ do-while ]
	       * => {} 안의 문장을 무조건 한번 수행한 후에 조건식이 참이면 반복, 거짓이면 빠져나간다.
	       * 
	       * do {
	       *     수행문1;
	       *     ...
	       * } while(조건식);    
	       * 수행문2;
	       */
		int num = 1;
		int sum = 0;
		do {
			sum +=num; // sum = 1 -> sum = sum + num = 2 + 1 -> sum = 6 -> sum = 10 
			num++; // num = 2->3->4-> 5;
			System.out.println("실행~ " + sum);
		} while(num<5);
			System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
		
}

