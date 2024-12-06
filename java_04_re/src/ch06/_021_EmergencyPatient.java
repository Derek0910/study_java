package ch06;

public class _021_EmergencyPatient extends _02_Hospital{
	//멤버변수
	String Emergency;
	
	//디폴트 생성자
	public _021_EmergencyPatient() {};
	
	//매개변수 생성자
	public _021_EmergencyPatient(int patientNo, String patientName, String disease, String Emergency) {
		super();
		this.Emergency = Emergency;
	}
	
	public _021_EmergencyPatient(String Emergency) {
		super();
		this.Emergency = Emergency;
		System.out.println("** _061_EmergencyPatient 매개변수 생성자 호출 **");
	}
	
	// getter setter
	public String getEmergency() {
		return Emergency;
	}
	
	public void setEmergency(String Emergency) {
		this.Emergency = Emergency;
	}
	
	// printInfo()
	public void printInfo(){
		System.out.println(getEmergency() + " 응급상황입니다!!!");
	}
}
