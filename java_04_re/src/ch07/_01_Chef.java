package ch07;

public class _01_Chef extends _01_Cooker{

	@Override
	public void Ordercheck() {
		super.Cooking();
		System.out.println("쉐프는 주문을 확인합니다.");
	}
}
