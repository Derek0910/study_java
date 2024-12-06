package jdbc;

import java.util.Scanner;

public class _02_MemberService_redd {
   static _02_MemberDAOImpl2 a = _02_MemberDAOImpl2.getInstance();
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      
      while(true) {
         System.out.println("---------------------------------------------------------------");
         System.out.println("1. 회원추가    2. 로그인    3. 회원수정    4.회원삭제    5.회원조회    6.종료");
         System.out.println("---------------------------------------------------------------");
         
         
         int menuNo  = scan.nextInt();
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
               System.out.println("프로그램 종료합니다");
               System.out.println();
               return;
               default:
            System.out.println("메뉴를 다시 선택해주세요");
         }
         
      }
   }
       // 로그인
     static void login() {
     a.login("hong", "1234");

     }
     
     
     // 회원가입
     // 바구니 준비 -> 등록할 정보를 setter로 바구니에 담아 전달
     static void memberInsert() {
     
	 _02_MemberDTO2 dto = new _02_MemberDTO2();
     dto.setId("hong2");
     dto.setPassword("1234");
     dto.setGender("남자");
     dto.setEmail("hong3@email.com");
     dto.setAddress("남양주");
     
     int insertCnt = a.memberInsert(dto);
     if(insertCnt==1) {
        System.out.println("회원가입 성공 : " + insertCnt);
     }
     else {
        System.out.println("회원가입 실패 : " + insertCnt);
        }
  
     }
     
     //회원수정
     // 바구니 준비 -> 수정할 정보로 바구니에 담아 setter로 전달
     static void memberUpdate() {
	 _02_MemberDTO2 dto2 = new _02_MemberDTO2();
     dto2.setId("test");
     dto2.setPassword("h9999");
     dto2.setGender("여성");
     dto2.setEmail("h7788@daum.net");
     dto2.setAddress("강남구");
     //  "h9999" "여성" "h7788@daum.net" "강남구"
     
     
     int updateCnt = a.memberUpdate(dto2);
     if(updateCnt==1) {
        System.out.println("회원수정 완료 : " + updateCnt);
     }
     else {
        System.out.println("회원가입 실패 :" + updateCnt);
        }
     a.memberUpdate(dto2);
     }
     
     
     //회원 탈퇴
     static void memberDelete() {
     a.memberDelete("test");
     }
     
     //회원 탈퇴
     static void memberSelect() {
        
     a.memberSelect("test");
     }
}
   


