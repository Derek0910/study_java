package ch01;

public class _05_VariableEx {
	public static void main(String[] Constant) {
		final int MAX_NUM = 2147483647;
		final int MIN_NUM = -2147483647;
		//MIN_NUM = -2147483647; -> 선언과 동시에 초기화 시켜 주는 것이 안전!!
		System.out.println("MAX_NUM는 " + MAX_NUM);
		System.out.println("MIN_NUM는 " + MIN_NUM);
		
		System.out.println();
		System.out.println("----- 퀴 즈 변 형 -----");
		final String MY_NICKNAME = "Derek";
		System.out.println("MY_NICKNAME : " + MY_NICKNAME);
		
		final int MENTAL_AGE = 23;
		System.out.println("MENTAL_AGE : " + MENTAL_AGE + "세");
		
		final double LIVED_YEAR = 40.2;
		System.out.println("LIVED_YEAR : " + LIVED_YEAR + "년");
		
		final boolean MY_HOUSE = false;
		System.out.println("MY_HOUSE : " + MY_HOUSE);
	}
}

/*
 * 결과값
 * MAX_NUM는 2147483647
 * MIN_NUM는 -2147483647
 * ----- 퀴 즈 변 형 -----
 * MY_NICKNAME : Derek
 * MENTAL_AGE : 23세
 * LIVED_YEAR : 40.2년
 * MY_HOUSE : false
*/