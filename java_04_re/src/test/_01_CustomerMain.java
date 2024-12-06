package test;

public class _01_CustomerMain {
	public static void main(String[] args) {
		System.out.println("<<< 객체생성(디폴트생성자) + setter -> 멤버변수 >>>");
		System.out.println();
		
		_01_Customer cst = new _01_Customer();
		
		cst.setCustomerID("C001");
		cst.setCustomerName("김태희");
		cst.setBonusPoint(10);
		cst.setBonusRate(0.05);
		
		System.out.println("고객아이디 : " + cst.getCustomerID());
		System.out.println("고객명 : " + cst.getCustomerName());
		System.out.println("보너스포인트 : " + cst.getBonusPoint());
		System.out.println("포인트 적립비율 : " + cst.getBonusRate());
		System.out.println();
		System.out.println("=====================");
		cst.getInfo();
		
		System.out.println();
		System.out.println("<<< 객체생성(매개변수 생성자)-> 멤버변수 >>>");
		System.out.println();
		
		_01_Customer2 cst2 = new _01_Customer2("C002","비",5,0.03);
		
		System.out.println(cst2);
//		System.out.println(test._01_Customer2@1e643faf);
		System.out.println("고객아이디 : " + cst2.getCustomerID());
		System.out.println("고객명 : " +cst2.getCustomerName());
		System.out.println("보너스포인트 : " + cst2.getBonusPoint());
		System.out.println("포인트 적립비율 : " + cst2.getBonusRate());
		
		System.out.println();
		System.out.println("===================");
		cst2.getInfo();
		
	}
}
