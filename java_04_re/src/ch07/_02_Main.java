package ch07;
/*
<< 방법1. 다형성 적용, 부모는 인터페이스 >>

<_02_Mp3 타입 선언시>
음악을 연주하다.
음악을 멈추다.
문자를 보낸다.
문자를 받다.
cal : 8

<_02_Mobile 타입 선언시>
문자를 보낸다.
문자를 받다.
음악을 연주하다.
음악을 멈추다.
cal : 2

<< 방법2. 다형성 적용, 부모는 클래스 >>
문자를 보낸다.
문자를 받다.
음악을 연주하다.
음악을 멈추다.
cal : 5
*/

public class _02_Main {
	public static void main(String[] args) {
		
		System.out.println("<< 방법1. 다형성 적용, 부모는 인터페이스 >>");
		System.out.println("< 부모 클래스(_02_PDA) or interface(_02_Mobile 또는 _02_Mp3)로 타입 선언 가능 >");
		System.out.println();
		_02_Mp3 mp3 = new _02_Smartphone();
		_02_Mobile moblie = new _02_Smartphone();
		_02_PDA pda = new _02_Smartphone();
//		int x = 3;
//		int y = 5;
		pda.x = 3;
		pda.y = 5;
		pda.calculate(pda.x, pda.y);
		moblie.sendSMS();
		moblie.receiveSMS();
		mp3.play();
		mp3.stop();
		
		System.out.println();
		System.out.println("------------------------------");
		_02_Smartphone smpDownCasting1 = (_02_Smartphone)mp3;
//		_02_Smartphone smpDownCasting2 = (_02_Smartphone)moblie;
//		_02_Smartphone smpDownCasting3 = (_02_Smartphone)pda;
//		x=2;
//		y=8;
		smpDownCasting1.x = 2;
		smpDownCasting1.y = 8;
		smpDownCasting1.calculate(smpDownCasting1.x, smpDownCasting1.y);
		smpDownCasting1.sendSMS();
		smpDownCasting1.receiveSMS();
		smpDownCasting1.play();
		smpDownCasting1.stop();
		smpDownCasting1.display();
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		smpDownCasting1.showInfo();
	}

}
/* 결과값
 * << 방법1. 다형성 적용, 부모는 인터페이스 >>
 * < 부모 클래스(_02_PDA) or interface(_02_Mobile 또는 _02_Mp3)로 타입 선언 가능 >
 * 3와 5의 곱셈의 값은 15입니다.
 * _02_Smartphone에서 문자를 발신합니다.
 * _02_Smartphone에서 문자를 수신했습니다.
 * _02_Smartphone의 음악이 재생됩니다.
 * _02_Smartphone의 음악이 멈춥니다.
 * ------------------------------
 * 2와 8의 곱셈의 값은 16입니다.
 * _02_Smartphone에서 문자를 발신합니다.
 * _02_Smartphone에서 문자를 수신했습니다.
 * _02_Smartphone의 음악이 재생됩니다.
 * _02_Smartphone의 음악이 멈춥니다.
 * _02_Smartphone에서 에러화면을 출력합니다.(추상클래스 복습)
 * ------------------------------
 * 
 * 3와 10의 곱셈의 값은 30입니다.
 * _02_Smartphone의 음악이 재생됩니다.
 * _02_Smartphone의 음악이 멈춥니다.
 * _02_Smartphone에서 문자를 발신합니다.
 * _02_Smartphone에서 문자를 수신했습니다.
 * 
 */