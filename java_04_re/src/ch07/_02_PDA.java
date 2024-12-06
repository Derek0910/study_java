package ch07;

public abstract class _02_PDA {
	int x;
	int y;
	public int calculate(int x,int y) {
		int result = x + y;
		System.out.println(x + "와 " + y + "의 덧셈의 값은 " + result + "입니다.");
		return result;
	}
	
	public abstract void display();
}
