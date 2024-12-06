package ch03;

public class _01_Player {
	String player;
	int backNum;
	int salary;
	int joinYear;
	
	public void showPInfo() {
		System.out.println("선수명 : " + player);
		System.out.println("등번호 : " + backNum);
		System.out.println("연봉 : " + salary + "만원");
		System.out.println("입단년도 : " + joinYear + "년");
	}

}
