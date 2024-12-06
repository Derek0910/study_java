package jdbc3;

import java.util.Scanner;

public class _jdbc_bookMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		_jdbc_book_DAOImp dao = _jdbc_book_DAOImp.getInstance();
		
		_jdbc_book_DTO jdto =  new _jdbc_book_DTO();
		
		
		while(true) {
			System.out.println("원하시는 서비스를 선택해주세요.");
			System.out.println("┌───────────────────────────────────────────────────┐");
			System.out.println("※1. 책등록	 2. 책정보	 3. 책정보수정  4. 책삭제 5. 대출가능여부 6. 종료 ※ ");
			System.out.println("└───────────────────────────────────────────────────┘");
			
			int a = scan.nextInt();
			scan.nextLine();
			
			if(a==1) {
				System.out.println("책번호를 입력해주세요.");
				jdto.setBookno(scan.nextInt());
				System.out.println("책제목을 입력해주세요.");
				jdto.setBookname(scan.next());
				System.out.println("책의 저자를 입력해주세요.");
				jdto.setBookauthor(scan.next());
				
				int regCnt = dao.bookReg(jdto);
				System.out.println("여기까지2");

				if (regCnt ==1) {
					System.out.println("책등록 성공");
				} else {
					System.out.println("책등록 실패");
				}
				break;
			} else if(a==2){
				System.out.println("조회하실 책의 제목을 입력해주세요.");
				jdto.setBookname(scan.next());
				_jdbc_book_DTO bjdto = dao.bookSelect(jdto);
				
				System.out.println("bookno : " + jdto.getBookno());
				System.out.println("bookname : " + jdto.getBookname());
				System.out.println("bookrent : " + jdto.getBookrent());
				System.out.println("bookauthor : " + jdto.getBookauthor());
				break;
			} else if(a==3){
				System.out.println("수정할 책의 번호을 입력해주세요.");
				jdto.setBookno(scan.nextInt());
				scan.nextLine();
				System.out.println("수정할 책의 제목을 입력해주세요.");
				jdto.setBookname(scan.next());
				
				int updateCnt = dao.bookUpdate(jdto);
				
				if(updateCnt==1) {
					System.out.println("정보수정 완료");
				} else {
					System.out.println("정보수정 실패");
				}
				break;
				
			} else if(a==4){
				System.out.println("삭제할 책의 번호을 입력해주세요.");
				jdto.setBookno(scan.nextInt());
				scan.nextLine();
				dao.bookDelete(jdto);
				break;
			} else if(a==5){
				System.out.println("대출할 도서 번호를 입력해주세요.");
				
				int rentChk = dao.bookRent(scan.nextInt());

				System.out.println("rentChk : " + rentChk);
				if(rentChk != 0) {
					System.out.println("대출이 불가능합니다.");
				} else {
					System.out.println("대출이 가능합니다.");
				}
				break;
			} else if(a==6){
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("번호를 다시 입력해 주세요.");
				return;
			}
		}
		System.out.println("안녕히가십시오.");
		
		
	}
	
}
