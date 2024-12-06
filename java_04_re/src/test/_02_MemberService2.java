package test;

import java.util.Scanner;

public class _02_MemberService2{
	public static void main(String[] args) {
		
		// 다형성 적용, 싱글톤 호출
		_02_MemberDAO dao = _02_MemberDAOImpl.getInstance();
		
		// 메서드 호출
		dao.login("hong", "1234");
		
		// dto 객체 생성
		
		// setter로 값 전달 -> 멤버변수로 전달
		dao.memberInsert(null);
	}
}
