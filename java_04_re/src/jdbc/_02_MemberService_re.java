package jdbc;

import java.util.Scanner;

public class _02_MemberService_re{
	static Scanner scan = new Scanner(System.in); 
	static _02_MemberDAOImpl2  mdao12 = _02_MemberDAOImpl2.getInstance();
	public static void main(String[] args) {
		
		while(true) {	
			
		System.out.println("*--------------------------------------------------");
		System.out.println(" 1. 회원추가  2. 로그인  3. 회원수정  4. 회원삭제  5. 조회  6. 종료");
		System.out.println("*--------------------------------------------------");
		
		int menuNo = scan.nextInt();
		scan.nextLine();
		
		switch(menuNo) {
			case 1:
				memberInsert();
				break;
			case 2:
				login();
				break;
			case 3:
				memberUpdate();
				break;
			case 4:
				memberDelete();
				break;
			case 5:
				memberSelect();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				return;
			default :
				System.out.println("메뉴를 다시 선택해주세요.");
			}
		}
	}
		
	// --- [ 로그인 ]---
	static void login() {
		//객채 생성
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("id를 입력해주세요. : ");
		String id = scan1.next();
		System.out.println("password를 입력해주세요. : ");
		String password = scan2.next();
		mdao12.login(id, password);
//		mdao12.memberDelete("게스트1");
	}

	static void memberInsert() {
		// 회원 가입
		// dto 객체 생성
		_02_MemberDTO2 mdto2 = new _02_MemberDTO2();
		
//		String id2 = scan.next();
		mdto2.setId("게스트3");
		mdto2.setPassword("게스트비번2");
		mdto2.setGender("남자");
		mdto2.setEmail("guest4@email.com");
		mdto2.setAddress("서울시 강남구");
		
		int insertCnt = mdao12.memberInsert(mdto2);
		
		//setter로 값 전달 -> 멤버변수로		
		if(insertCnt==1){
			System.out.println("회원가입 성공 " + insertCnt);
		} else{
			System.out.println("회원가입 실패 " + insertCnt);
		}
	}
	
	static void memberUpdate() {
		_02_MemberDTO2 mdto2 = new _02_MemberDTO2();
		
		//-- [ 회원정보수정 ] --
		// 바구니 준비 -> 수정할 정보를 setter로 바구니에 담아 전달
		mdto2.setId("게스트2");
		mdto2.setPassword("h999");
		mdto2.setGender("여성");
		mdto2.setEmail("hong@naver.com");
		mdto2.setAddress("세울시 갱냄구");
		
		int updatecnt = mdao12.memberUpdate(mdto2);
		
		if(updatecnt==1) {
			System.out.println("업데이트 성공");
		} else {
			System.out.println("업데이트 실패");
		}
	}
	
	static void memberDelete() {
	}
	
	static void memberSelect() {
//		String SelInput = scan.nextLine();
		_02_MemberDTO2 mdto2 = mdao12.memberSelect(scan.nextLine()); 
		System.out.println("id : " + mdto2.getId());
		System.out.println("password : " + mdto2.getPassword());
		System.out.println("gender : " + mdto2.getGender());
		System.out.println("email : " + mdto2.getEmail());
		System.out.println("address : " + mdto2.getAddress());
	}
}

