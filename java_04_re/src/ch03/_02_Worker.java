package ch03;

public class _02_Worker {
	String company;
	int establish;
	String business;
	int worker;
	
	public void setCompany(String company)	{
		this.company = company;
	}
	public void setEstablish(int establish)	{
		this.establish = establish;
	}
	public void setBusiness(String business)	{
		this.business = business;
	}
	public void setWorker(int worker)	{
		this.worker = worker;
	}
	
	public void showInfo() {
		System.out.println("회사 이름 : " + company);
		System.out.println("설립 연도 : " + establish+ "년");
		System.out.println("주요 사업 : " + business);
		System.out.println("직원수 : " + worker + "명");
	}
	
}
