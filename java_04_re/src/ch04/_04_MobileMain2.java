package ch04;

public class _04_MobileMain2 {
	public static void main(String[] args) {
		_04_Mobile2 mb2 = new _04_Mobile2("Apple", 1, "iPhone 15 Pro Max");

		System.out.println("브랜드는 : " + mb2.getBrand());
		System.out.println("global 판매량 순위 : " + mb2.getGlobalRank());
		System.out.println("모델명 : "+mb2.getModel());
		
		System.out.println();
		System.out.println("==== 생산자 오버로드 ====");
		_04_Mobile2 mb3 = new _04_Mobile2("Apple", 1);
		System.out.println("브랜드는 : " + mb3.getBrand());
		System.out.println("global 판매량 순위 : " + mb3.getGlobalRank());
	}
}

/* 결과값
브랜드는 : Apple
global 판매량 순위 : 1
모델명 : iPhone 15 Pro Max

==== 생산자 오버로드 ====
브랜드는 : Apple
global 판매량 순위 : 1
*/