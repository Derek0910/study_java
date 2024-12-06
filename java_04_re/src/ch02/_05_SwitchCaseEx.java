// 1. 상수
// final 자료형 변수명;

// 2.
package ch02;

public class _05_SwitchCaseEx {
	public static void main(String[] IfEx04) {
		/*
		   * 주택청약 점수 구하기
	     */
		int tScore = 0;
		String grade = "";
		String New_Wedding = "S";
		
		if (grade == New_Wedding) {
			System.out.println("우선 청약대상자입니다.");
		}
		else {
			if(tScore>=0 && tScore<=85) {
				if (tScore >= 78) {
					grade = "A";
				}
				else if(tScore >= 75){
					grade = "B";
				}
				else if(tScore >= 72){
					grade = "C";
				}
				else {
					grade = "F";
				}
				System.out.println("청약점수는 " + tScore + "점, 청약등급은 " + grade + "입니다." );
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		
	}
}

/*
 * 결과값
 * 청약점수는 78점, 청약등급은 A입니다.
 */

