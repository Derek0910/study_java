package ch03;

public class _03_MyInFo {
	
	// 멤버변수(속성)
	private String name;
	private String birthday;
	private int money;
	private String address;
	private Boolean car;
	
	// setter
	public void setName(String name){
		this.name = name;
	}
	public void setBirthday(String birthday){
		this.birthday = birthday;
	}
	public void setMoney(int money){
		this.money = money;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setCar(Boolean car){
		this.car = car;
	}
	
	// 멤버메서드(기능)
	public void printInfo() {
		// 출력정보
		System.out.println("이름 : " + name);
		System.out.println("생일 : " + birthday);
		System.out.println("자산 : " + money);
		System.out.println("주소 : " + address);
		String strB1 = String.valueOf(car);
			   strB1 = "가능";
		String strB2 = String.valueOf(car);
			   strB2 = "불가능";
		if (car==true) {
			System.out.println("운전가능여부 : " + strB1);
		} else {
			System.out.println("운전가능여부 : " + strB2);
		}
	}
}
