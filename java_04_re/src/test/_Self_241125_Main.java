package test;

public class _Self_241125_Main {
	public static void main(String[] args) {
		_Self_241125 s2c = new  _Self_241125_Child();
		_Self_241125_Child asd = (_Self_241125_Child)s2c;
		int a = 10;
		int b = 0;
		
		s2c.add(a, b);
		System.out.println(s2c.add(a, b));
		
		s2c.sub(a, b);
		System.out.println(s2c.sub(a, b));
		
		s2c.mul(a, b);
		System.out.println(s2c.mul(a, b));
		
		try {
			s2c.div(a, b);
			System.out.println(s2c.div(a, b));
		} catch(ArithmeticException e) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
		}
	
		try {
			s2c.rem(a, b);
			System.out.println(s2c.rem(a, b));
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println(asd.loud());
		
		
	}
}
