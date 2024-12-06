package ch02;

public class _06_SwitchCaseEx {
	public static void main(String[] switch01) {
		int score = 70;
		System.out.println(score);
		String grade = "";
		switch((score/10)*10) {
			case 100 : case 90 : grade = "A";
				break;
			case 80 : grade = "B";
				break;
			case 70 : grade = "C";
				break;
			case 60 : grade = "D";
				break;
			default : grade = "F";
		}
		System.out.println(score + "점 : " + grade);
	      
	}
}
