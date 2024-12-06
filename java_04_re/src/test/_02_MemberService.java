package test;

import java.util.Scanner;

public class _02_MemberService{
	public static void main(String[] args) {
		//_02_MemberDAO mdao = _02_MemberDAOImpl.getInstance();
		
		_02_MemberDAOImpl  mdao = _02_MemberDAOImpl.getInstance();
		
		
		mdao.login("로그인", "합시다");
		
		
		// dto 객체 생성
		_02_MemberDTO mdto = new _02_MemberDTO();
		
		//setter로 값 전달 -> 멤버변수로		
//		mdto.setId("Derek");
//		mdto.setPassword("Derek1234");
//		mdto.setGender("남성");
//		mdto.setEmail("Derek@email.com");
//		mdto.setAddress("신수동");
//
//		mdao.memberInsert(mdto);
//		mdao.memberUpdate(mdto);
//		mdao.memberDelete("로그인");
//		mdao.memberSelect("아이디");
	}
}
