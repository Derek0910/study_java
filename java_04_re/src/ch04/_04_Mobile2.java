package ch04;

public class _04_Mobile2 {
	String brand;
	int globalRank;
	String model;
	
	public String getBrand() {
		return brand;
	}
	public int getGlobalRank() {
		return globalRank;
	}
	public String getModel() {
		return model;
	}
	
	public _04_Mobile2() {} //default 생성자 선언
	
	public _04_Mobile2(String brandM, int globalRankM, String modelM) {
		this.brand = brandM;
		this.globalRank = globalRankM;
		this.model = modelM;
	}
	
	public _04_Mobile2(String brandM, int globalRankM) {
		this.brand = brandM;
		this.globalRank = globalRankM;
	}
	
}
