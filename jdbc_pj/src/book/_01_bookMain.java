package book;

public class _01_bookMain {
	public static void main(String[] args) {
		_01_bookDAOImpl bdao = new _01_bookDAOImpl();
		
		bdao.bookNo(1);

		// DTO 객체 생성
		_01_bookDTO bdto = new _01_bookDTO();
		
		bdto.setBookno(1);
		bdto.setBooktitle("책제목1");
		bdto.setBooktitle("저자1");
		bdto.setBookprice(17000);
		
//		bdao.bookInsert(bdto);
		
		int insertCnt = bdao.bookInsert(bdto);
		
		System.out.println(insertCnt);
		
		if(insertCnt==1){
			System.out.println("책 추가 성공 " + insertCnt);
		} else{
			System.out.println("책 추가 실패 " + insertCnt);
		}
		

		
	}
	
}
