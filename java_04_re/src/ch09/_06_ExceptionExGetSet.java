package ch09;

public class _06_ExceptionExGetSet {
	private int Num;
	
	public int getNum() {
		System.out.println("입력하신 숫자는 " + Num + "입니다.");
		return Num;
	}
	
	public void setNum(Integer Num) throws _06_ExceptionExClass {
		
		if(Num < 0) {
			
			throw new _06_ExceptionExClass("숫자 입력은 0보다 작을 수 없습니다.");
			
		}
		 else if (Num > 100) {
			
			throw new _06_ExceptionExClass("숫자 입력은 100보다 클 수 없습니다.");
			
		} 
		this.Num = Num;
	}
}
