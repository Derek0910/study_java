package ch06;

public class _02_Hospital {
	//멤버변수
	int patientNo;
	String patientName;
	String disease;
	
	//디폴트 생성자
	public _02_Hospital () {
		System.out.println("<= 병원(부모 디폴트 생성자) 호출 =>");
	}
	
	// 매개변수 생성자
	public _02_Hospital(int patientNo, String patientName, String disease) {
		this.patientNo = patientNo;
		this.patientName = patientName;
		this.disease = disease;
	}
	
	// getter setter
	public int getPatientNo() {
		return patientNo;
	}
	
	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public String getDisease() {
		return disease;
	}
	
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	// printInfo()
	
	public void printInfo(){
		System.out.println("환자번호 : " + getPatientNo());
		System.out.println("환자이름 : " + getPatientName());
		System.out.println("질병명 : " + getDisease());
	}
}
