package ch07;

public class _01_AdmMain {
	public static void main(String[] args) {
		// _01_Administration adm  = new _01_Cooker(); 추상클래스는 객체 생성이 불가능하다
//		_01_Administration adm  = new _01_Chef();
//		
//		adm.name = "문희재";
//		adm.NoOfWorker = 001;
//		adm.salary = 4.2;
//		adm.information();
//		
		
		_01_Administration adm  = new _01_Chef();
		adm.name = "수쉐프";
		adm.NoOfWorker = 000;
		adm.salary = 10.0;
		adm.information();
		_01_Chef chef = (_01_Chef)adm;
		chef.Ordercheck();
		
		System.out.println();
		System.out.println("---------------");
		
		_01_Administration adm1  = new _01_Server();
		adm1.name = "조세호";
		adm1.NoOfWorker = 002;
		adm1.salary = 3.2;
		adm1.information();
		CompanyWork(new _01_Server());
		
		System.out.println();
		System.out.println("---------------");
		CompanyWork(new _01_Chef());

	}
	
	public static void CompanyWork(_01_Administration admst) {
		
		if(admst instanceof _01_Chef) {
			admst.name = "대니얼 리";
			admst.NoOfWorker = 999;
			admst.salary = 2.0;
			admst.information();
			_01_Chef chef1 = (_01_Chef)admst;
			chef1.Ordercheck();
		} else if(admst instanceof _01_Server) {
			_01_Server server = (_01_Server)admst;
			server.Serving();
		} 
	}
}
