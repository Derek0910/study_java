package ch07;

public class _02_Smartphone extends _02_PDA implements _02_Mobile, _02_Mp3{

	@Override
	public void play() {
		System.out.println("_02_Smartphone의 음악이 재생됩니다.");
	}

	@Override
	public void stop() {
		System.out.println("_02_Smartphone의 음악이 멈춥니다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("_02_Smartphone에서 문자를 발신합니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("_02_Smartphone에서 문자를 수신했습니다.");		
	}
	
	@Override
	public int calculate(int x,int y) {
		int result = x * y;
		System.out.println(x + "와 " + y + "의 곱셈의 값은 " + result + "입니다.");
		return result;
	}
	
	public void showInfo() {
		x = 3;
		y = 10;
		this.calculate(x, y);
		this.play();
		this.stop();
		this.sendSMS();
		this.receiveSMS();
	}

	@Override // 추상클래스 적용
	public void display() {
		System.out.println("_02_Smartphone에서 에러화면을 출력합니다.(추상클래스 복습)");
	}
	

}
