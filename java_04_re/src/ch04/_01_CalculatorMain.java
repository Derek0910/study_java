package ch04;

public class _01_CalculatorMain {
	public static void main(String[] args) {
		_01_Calculator cal = new _01_Calculator();
		double num1 = 9;
		double num2 = 2;
		
		cal.add(num1, num2);
		cal.sub(num1, num2);
		cal.mul(num1, num2);
		cal.div(num1, num2);
		cal.rem(num1, num2);
	}
}

/*
 * 두 수 9.0와 2.0의 합은 11.0
 * 두 수 9.0와 2.0의 차는 7.0
 * 두 수 9.0와 2.0의 곱은 18.0
 * 9.0를 2.0로 나눈 값은 4.5
 * 9.0를 2.0로 나눈 값의 나머지는 1.0 
 */
