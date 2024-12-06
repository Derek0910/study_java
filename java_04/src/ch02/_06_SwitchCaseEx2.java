package ch02;

public class _06_SwitchCaseEx2 {
	public static void main(String[] switch01) {
		int score = 100;
		String grade = "";
		switch(score/10) {
			case 10:
			case 9 : grade = "A";
				break;
			case 8 : grade = "B";
				break;
			case 7 : grade = "C";
				break;
			case 6 : grade = "D";
				break;
			default : grade = "F";
		}
		System.out.println(score + "점 : " + grade);
	      
	}
}
