package ch04;

public class _05_VisitorMain {
	public static void main(String[] args) {
		_05_Visitor vst= new _05_Visitor();
		
		vst.setVisitor(5);
		
		System.out.println(_05_Visitor.workDay2);
		System.out.println("영업일이 " + vst.getSalesDay() + "일 지났습니다.");
		System.out.println("방문자는 " + vst.getVisitor() + "명 입니다.");
		
		_05_Visitor vst2= new _05_Visitor();
		
		vst2.setVisitor(10);
		
		System.out.println(_05_Visitor.workDay2);
		System.out.println("영업일이 " + vst.getSalesDay() + "일 지났습니다.");
		System.out.println("방문자는 " + vst.getVisitor() + "명 입니다.");
	}
}

/*결과값
1
영업일이 0일 지났습니다.
방문자는 5명 입니다.
2
영업일이 0일 지났습니다. // 메모리의 workDay2의 값이 변하지 않아 계속 0이 출력됨
방문자는 5명 입니다.
*/
