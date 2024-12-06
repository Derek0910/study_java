package ch07;

public abstract class _01_Cooker extends _01_Administration{

	@Override
	public void information() {
		System.out.println("직원명 : " + super.name);
		System.out.println("직원번호 : " + super.NoOfWorker);
		System.out.println("연봉 : " + super.salary + "천만");
	}

	public void Cooking() {
		System.out.println("요리사는 음식을 만듭니다.");
	}
	
	public abstract void Ordercheck();
	
}
