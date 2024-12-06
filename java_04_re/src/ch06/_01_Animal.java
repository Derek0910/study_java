package ch06;

public class _01_Animal {
	_01_Cat cat1 = new _01_Cat();
	_01_Dog dog1 = new _01_Dog();
	
	//	멤버변수
	private String kind;
	private int legs;
	private int weight;
	
	//	멤버메서드
	//	getter setter
	public String getKind() {
		return kind; 
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

	//	멤버변수 정보 출력
	public void printInfo() {
		System.out.println("종류 : " + getKind());
		System.out.println("다리수 : " + getLegs() + "개");
		System.out.println("무게 : " + getWeight() + "kg");
	}
}
