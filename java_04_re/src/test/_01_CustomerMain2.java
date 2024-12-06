package test;

public class _01_CustomerMain2 {
	public static void main(String[] args) {
		System.out.println("<<< 객체생성(디폴트생성자) + setter -> 멤버변수 >>>");
		
		_01_Customer cst = new _01_Customer();
		
		cst.setCustomerID("C001");
		cst.setCustomerName("김태희");
		cst.setBonusPoint(10);
		cst.setBonusRate(0.05);
		
		cst.getInfo();
		
		System.out.println("===================");
		System.out.println();
		System.out.println("<<< 객체생성(매개변수 생성자)-> 멤버변수 >>>");
		
		_01_Customer2 cst2 = new _01_Customer2("C002","비",5,0.03);
		
		cst2.getInfo();
		
	}
}
