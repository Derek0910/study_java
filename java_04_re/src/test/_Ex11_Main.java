package test;

public class _Ex11_Main {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 4;
		
		_Ex11_Implements com = new _Ex11_Implements();
		
		System.out.println(com.add(num1, num2));
		System.out.println(com.sub(num1, num2));
		System.out.println(com.times(num1, num2));
		try {
			System.out.println(com.div(num1, num2));
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
		}
		try {
			System.out.println(com.rem(num1, num2));
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
		}
	}
}
