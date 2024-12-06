package ch10;

public class _01_Class {
	//멤버 변수
	public String student;
	
	//디폴트 생성자
	// 1. 디폴트 생성자를 private으로 생성해준다.
	private _01_Class() {
		System.out.println("기본 생성자");
	}; 
	
	//매개변수 생성자
	private _01_Class(String student) {
	}
	
	//멤버 메서드
	// 2. 클래스 내부에 static으로 유일한 인스턴스를 생성한다.
	public static _01_Class instance = new _01_Class();
	
	// 3. 인스턴스를 받을 수 있는 메서드를 생성한다.
	
	public static _01_Class getInstance() {
		if(instance == null) {
		// 여러 곳에서 인스턴스를 호출할 경우 인스턴스가 생성이 되지 않을 수 있어서 넣어둠
		// 동기화(synchronized를 이용한 동기화) 시켜도 되나 그러면 속도가 느리다.
			instance = new _01_Class();
		}
		return instance;
	}
	
	public String getStudent() {
		return student;
	}
	
	public void setStudent(String student) {
		this.student = student;
	}
	
	public String gotoSchool(String student) {
		System.out.println(student + "는 학교에 갑니다.");
		return student;
	}
	
	public int[] arr;
}
