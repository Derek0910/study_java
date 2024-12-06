package ch03;

public class _04_JobMain {
	public static void main(String[] args) {
		
		_04_Job jh= new _04_Job();
		
		jh.setCompany("이노그리드");
		jh.setLocation("금천구");
		jh.setWorkerOfNum(30);
		jh.setSalary(4500);
		
		jh.setOutout();
	}
	
}
/*
 * 회사명 : 이노그리드
 * 희망근무지역 : 금천구
 * 희망근로자수 : 30명 이상
 * 희망연봉 : 4500만원 이상
 */
