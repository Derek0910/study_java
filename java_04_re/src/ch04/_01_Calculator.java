package ch04;

public class _01_Calculator {
	
	public void add(double a, double b) {
		double result = a + b ;
		System.out.println("두 수 " + a + "와 " + b + "의 합은 " + result);
	}
	public void sub(double a, double b) {
		double result = a - b ;
		System.out.println("두 수 " + a + "와 " + b + "의 차는 " + result);
	}
	public void mul(double a, double b) {
		double result = a * b ;
		System.out.println("두 수 " + a + "와 " + b + "의 곱은 " + result);
	}
	public void div(double a, double b) {
		double result = a / b ;
		System.out.println(a + "를 " + b + "로 나눈 값은 " + result);
	}
	public void rem(double a, double b) {
		double result = a % b ;
		System.out.println(a + "를 " + b + "로 나눈 값의 나머지는 " + result);
	}
}
