package ch06;

public class _02_HospitalMain {
	public static void main(String[] args) {
		_02_Patient pt = new _02_Patient();
		
		pt.setPatientNo(0001);
		pt.setPatientName("김튼튼");
		pt.setDisease("엄살");
		
		pt.setPrescription("퇴원");
		pt.printInfo();
		
		System.out.println();
		System.out.println("================");
		
		_021_EmergencyPatient emP = new _021_EmergencyPatient("응급!!!");
		
		emP.printInfo();
		
	}
}

/* 결과값
<= 병원(부모 디폴트 생성자) 호출 =>
환자번호 : 1
환자이름 : 김튼튼
질병명 : 엄살
처방 : 퇴원

================
<= 병원(부모 디폴트 생성자) 호출 =>
** _061_EmergencyPatient 매개변수 생성자 호출 **
응급!!! 응급상황입니다!!!
 */
