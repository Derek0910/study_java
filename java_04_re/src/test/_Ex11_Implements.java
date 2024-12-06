package test;

public class _Ex11_Implements implements _Ex11 {
	@Override
	public int add(int num1, int num2) {
		int a = num1 + num2;
		return a;
	}
	
	@Override
	public int sub(int num1, int num2) {
		int a = num1 - num2;
		return a;
	}
	
	
	@Override
	public int times(int num1, int num2) {
		int a = num1 * num2;
		return a;
	}
	
	@Override
	public int div(int num1, int num2) {
		int a = num1 / num2;
		return a;
	}
	
	@Override
	public int rem(int num1, int num2) {
		int a = num1 % num2;
		return a;
	}
	
}
