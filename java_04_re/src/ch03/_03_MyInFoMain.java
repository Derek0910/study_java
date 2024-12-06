package ch03;

public class _03_MyInFoMain {
	public static void main(String[] args){
		_03_MyInFo myinfo= new _03_MyInFo();
		
		myinfo.setName("문희재");
		myinfo.setBirthday("9월 10일");
		myinfo.setMoney(2000);
		myinfo.setAddress("금천구 독산2동");
		myinfo.setCar(false);
		
		myinfo.printInfo();
	}
 
}
