package test;

//DTO(Data Transfer Object)
public class _01_Customer {
	//멤버변수
	private String customerID;		//	고객아이디		C001	C002
	private String customerName;	//	고객명			김태희		비
	private int bonusPoint;			//	보너스포인트		10		5
	private double bonusRate;		//	포인트 적립피율	0.05	0.03
		
	//생성자
	//디폴트 생성자
//	_01_Customer(){};
	
	//매개변수 생성자
	
	//멤버메서드 getter setter
	
	public String getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(String customerIDM) {
		this.customerID = customerIDM;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerNameM) {
		this.customerName = customerNameM;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public void setBonusPoint(int bonusPointM) {
		this.bonusPoint = bonusPointM;
	}
	
	public double getBonusRate() {
		return bonusRate;
	}
	
	public void setBonusRate(double bonusRateM) {
		this.bonusRate = bonusRate;
	}
	
	public void getInfo() {
		System.out.println("I) 고객아이디 : " + getCustomerID());
		System.out.println("I) 고객명 : " + getCustomerName());
		System.out.println("I) 보너스포인트 : " + getBonusPoint());
		System.out.println("I) 포인트 적립비율 : " + getBonusRate());
	}
	
}
