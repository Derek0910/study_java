package ch02;

public class _03_IfEx {
	public static void main(String[] IfEx03) {
		/*
        [if - else if - else문]
        
        if(조건식1) {   // 조건식1이 참인 경우 수행문1을 실행
           수행문1;
        }
        else if(조건식2) {  // 조건식2이 참인 경우 수행문2을 실행
           수행문2;
        }   
        else if(조건식3) {  // 조건식3이 참인 경우 수행문3을 실행
           수행문3;
        }   
        else {         // 위의 조건이 모두 해당되지 않는 경우 수행문4를 실행
           수행문4;
        }
        
        수행문5;   // 무조건 실행
       */
		
		// score가 60점 이상이면 result에 합격, 
		// 60점 미만이면 result에 불합격(40~59),
		// 40점 미만이면 result에 과락(39~0)
		// 예시 > 70점 : 합격
		
		int score = 130;
		String result ="";
		
		if(score>= 60) {
			result = "합격";
		}
		else if(score<40) {
			result = "과락";
		}
		else {
			result = "불합격";
		}
		System.out.println("당신의 점수는 " + score +"점이며, 결과는 " + "'" + result + "'" + "입니다.");
		
		System.out.println();
		System.out.println("=== 잘못된 점수 ===");
		
		if(score>=0&&score<=100) {
			if(score>= 60) {
				result = "합격";
			}
			else if(score<40) {
				result = "과락";
			}
			else {
				result = "불합격";
			}
			System.out.println("당신의 점수는 " + score +"점이며, 결과는 " + "'" + result + "'" + "입니다.");
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
//		
//		if(score < 0 || score > 100) {
//			System.out.println("잘못된 입력입니다.");
//		}
//		else {
//			if(score>= 60) {
//				result = "합격";
//			}
//			else if(score<40) {
//				result = "과락";
//			}
//			else {
//				result = "불합격";
//			}
//			System.out.println("당신의 점수는 " + score +"점이며, 결과는 " + "'" + result + "'" + "입니다.");
//		}
		
	
		System.out.println();
		System.out.println("=== 3항 연산자 ===");
		
		String result1 = "";
		int a = 60;
		
		result1 = (a >= 60) ? "합격" : ((a >= 40) ? "불합격" : "과락");
		System.out.println(result1);
		
		
	}
}
	
