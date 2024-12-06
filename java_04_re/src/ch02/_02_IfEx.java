package ch02;

public class _02_IfEx {
	public static void main(String[] IfEx02) {
		int salary = 5000;
		String grade = "";
		if (salary == 5000) {
			grade = "중위소득";
		}
		else if(salary > 5000){
			grade = "상위소득";
		}
		else {
			grade = "하위소득";
		}
		System.out.println("당신은 " + grade +"자입니다.");
		System.out.println("종료");
	}
}
/*
 * 결과값
 * 당신은 중위소득자입니다.
 * 종료
 */
