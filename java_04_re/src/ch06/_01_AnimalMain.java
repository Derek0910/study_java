package ch06;

public class _01_AnimalMain {
	public static void main(String[] args) {
		_01_Animal animal1 = new _01_Animal();
		

		
		animal1.setKind("스핑크스");
		animal1.setLegs(4);
		animal1.setWeight(8);
		
		animal1.cat1.printInfo();
		animal1.cat1.cry();
		
		System.out.println();
		System.out.println("======================");

		
		animal1.setKind("닥스훈트");
		animal1.setLegs(4);
		animal1.setWeight(6);
		
		animal1.dog1.printInfo();
		animal1.dog1.bark();
	}
}
