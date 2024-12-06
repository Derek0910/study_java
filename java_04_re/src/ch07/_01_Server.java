package ch07;

public class _01_Server extends _01_Administration{

	@Override
	public void information() {
		System.out.println("직원명 : " + super.name);
		System.out.println("직원번호 : " + super.NoOfWorker);
		System.out.println("연봉 : " + super.salary + "천만");
	}
	
	public void Serving() {
		System.out.println("서버는 음식을 제공합니다.");
	}
	
}
