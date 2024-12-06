package ch06;

public class _02_Patient extends _02_Hospital{
	//멤버변수
	String prescription;
	
	//디폴트 생성자
	public _02_Patient() {};
	
	//매개변수 생성자
	public _02_Patient(int patientNo, String patientName, String disease,String prescription) {
		super();
		this.prescription = prescription;
	}
	
	// getter setter
	public String getPrescription() {
		return prescription;
	}
	
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	// printInfo()
	@Override
	public void printInfo(){
		super.printInfo();
		System.out.println("처방 : " + getPrescription());
	}
}
