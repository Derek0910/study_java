package book;

public class _01_bookDAOImpl_before_dateConnection implements _01_bookDAO{
	
	// 디폴트 생성
	public _01_bookDAOImpl_before_dateConnection() {
		System.out.println("기본 생성자");
	}

	
	// DB 연결
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	
	@Override
	public int bookNo(int bookno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String bookTitle(String booktitle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String bookInsert(_01_bookDTO bdto) {
		String insert_result = "";

		System.out.println(bdto.getBookno());
		System.out.println(bdto.getBookno());
		System.out.println(bdto.getBooktitle());
		System.out.println(bdto.getBookauthor());
		System.out.println(bdto.getBookprice());
		return insert_result;
	}

	@Override
	public String bookUpdate(_01_bookDTO bdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String bookDelete(_01_bookDTO bdto) {
		// TODO Auto-generated method stub
		return null;
	};
	
	
}
