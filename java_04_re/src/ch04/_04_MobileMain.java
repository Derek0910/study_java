package ch04;

public class _04_MobileMain {
	public static void main(String[] args) {
		_04_Mobile mb = new _04_Mobile();
		
		mb.setBrand("SAMSUNG");
		mb.setGlobalRank(5);
		mb.setModel("Galaxy S24 Ultra");
		
		System.out.println("브랜드는 : " + mb.getBrand());
		System.out.println("global 판매량 순위 : " + mb.getGlobalRank());
		System.out.println("모델명 : "+mb.getModel());
	}
}

/* 결과값
브랜드는 : SAMSUNG
global 판매량 순위 : 5
모델명 : Galaxy S24 Ultra
*/