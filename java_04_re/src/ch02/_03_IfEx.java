package ch02;

public class _03_IfEx {
	public static void main(String[] IfEx03_02) {
		int family = 100;
		int score = 0;
		if(family < 0) {
			System.out.println("0이상의 수를 입력해주세요.");
		}
		else {
			if (family == 0) {
				score = 5;
			}
			else if(family == 1){
				score = 10;
			}
			else if(family == 2){
				score = 15;
			}
			else if(family == 3){
				score = 20;
			}
			else if(family == 4){
				score = 25;
				
			}
			else if(family == 5){
				score = 30;
			}
			else {
				score = 35;
			}
			System.out.println("당신의 부양가족 수는 " + family +"명 이므로," +" 가산점은 " + score +"점입니다. (가점상한:35점)");
		}
	}
}
/*
 * 결과값 
 * 당신의 부양가족 수는 100명 이므로, 가산점은 35점입니다. (가점상한:35점)
 */

