package jdbc2;

import java.util.Scanner;

public class _02_MemberService_part2 {
	static _02_MemberDAO_Impl mdao = _02_MemberDAO_Impl.getInstance();
	static Scanner scan = new Scanner(System.in);
	static _02_MemberDTO_part2 mdto2 = new _02_MemberDTO_part2();
	
	public static void main(String[] args) {
		while(true){
			System.out.println("*-----------------------------------------------------------");
			System.out.println(" 1. 로그인  2. 회원가입  3. 회원정보수정  4. 회원정보조회  5. 회원정보삭제  6. 종료");
			System.out.println("*-----------------------------------------------------------");
			
			int menuNo = scan.nextInt();
			scan.nextLine();
			
			switch(menuNo) {
			case 1:
				memberLogin();
				break;
			case 2:
				memberInsert();
				break;
			case 3:
				memberUpdate();
				break;
			case 4:
				memberSelect();
				break;
			case 5:
				memberDelete();
				break;
			case 6:
			System.out.println("프로그램을 종료합니다.");
			return;
			default:
				System.out.println("메뉴를 다시 선택해 주세요.");
			}
		}
		
	}
	static void memberLogin() {
		
		System.out.println("ID : ");
		mdto2.setId(scan.nextLine());
		
		System.out.println("비밀번호 : ");
		mdto2.setPassword(scan.nextLine());
			
		int loginCnt = mdao.memberLogin(mdto2);
		
		if(loginCnt ==1 ) {
			System.out.println("성공~");
//			System.out.println(mdto2.getId()+ "님 환영합시다.");
//			System.out.println("비번은 " + mdto2.getPassword());
			
		} else {
			System.out.println("로그인 실패!!!!");
		}
	}
	
	static void memberInsert() {
		System.out.println("ID : ");
		mdto2.setId(scan.nextLine());
		System.out.println("비밀번호 : ");
		mdto2.setPassword(scan.nextLine());
		System.out.println("성별 : ");
		mdto2.setName(scan.nextLine());
		System.out.println("email : ");
		mdto2.setEmail(scan.nextLine());
		System.out.println("주소 : ");
		mdto2.setAddress(scan.nextLine());
		
		int inserCnt = mdao.memberInsert(mdto2);
		
		if(inserCnt ==1 ) {
			System.out.println("회원가입 성공~");
		} else {
			System.out.println("회원가입 실패!!!!");
		}
	}
	
	static void memberUpdate() {
		System.out.println("변경할 ID를 입력해주세요. : ");
		mdto2.setId(scan.nextLine());
		System.out.println("변경할 비밀번호를 입력해주세요. : ");
		mdto2.setPassword(scan.nextLine());
		
		int updateCnt = mdao.memberUpdate(mdto2);
		
		if(updateCnt ==1 ) {
			System.out.println("회원정보 수정 성공");
		} else {
			System.out.println("회원정보 수정에 실패하셨습니다.");
		}
	}
	
	static void memberSelect() {
		System.out.println("조회할 ID를 입력해주세요. : ");
		_02_MemberDTO_part2 dto_p2 = mdao.memberSelect(scan.nextLine());
		
		System.out.println("id : " + dto_p2.getId());
		System.out.println("password : " + dto_p2.getPassword());
		System.out.println("gender : " + dto_p2.getGender());
		System.out.println("email : " + dto_p2.getEmail());
		System.out.println("address : " + dto_p2.getAddress());
	}
	
	static void memberDelete() {
		System.out.println("삭제할 ID를 입력해주세요. : ");
		int dto_p2 = mdao.memberDelete(scan.nextLine());
	}
}
