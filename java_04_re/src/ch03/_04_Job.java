package ch03;

public class _04_Job {
	String company;
	String location;
	int workerOfNum;
	int salary;
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setWorkerOfNum(int workerOfNum) {
		this.workerOfNum = workerOfNum; 
	}
	
	public void setSalary(int salary) {
		this.salary = salary; 
	}
	
	public void setOutout() {
		System.out.println("회사명 : " + company);
		System.out.println("희망근무지역 : " + location);
		System.out.println("희망근로자수 : " + workerOfNum + "명 이상");
		System.out.println("희망연봉 : " + salary + "만원 이상");
	}
	
}
