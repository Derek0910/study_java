package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_bookDAOImpl implements _01_bookDAO{
	
	// 디폴트 생성
	public _01_bookDAOImpl() {
		System.out.println("기본 생성자");
	}

	
	// DB 연결
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbID = "scott_04";
	String dbPassword = "tiger";
	
	// 연결 설정
	Connection connect = null;
	PreparedStatement ppstmt= null;
	ResultSet rsset = null;
	
	
	@Override
	public void bookNo(int bookno) {
		// TODO Auto-generated method stub
	}

	@Override
	public void bookTitle(String booktitle) {
		// TODO Auto-generated method stub
	}

	@Override
	public int bookInsert(_01_bookDTO bdto) {
		int insertCnt = 0;
		String sqladd = "INSERT INTO jdbc_book_tbl(bookno, booktitle, bookauthor, bookprice) "
				+ "VALUES(?,?,?,?)";
		try {
			connect = DriverManager.getConnection(dbURL, dbID, dbPassword);
			ppstmt = connect.prepareStatement(sqladd);
			ppstmt.setInt(1, bdto.getBookno());
			ppstmt.setString(2, bdto.getBooktitle());
			ppstmt.setString(3, bdto.getBookauthor());
			ppstmt.setInt(4, bdto.getBookprice());
			insertCnt = ppstmt.executeUpdate();	
			System.out.println("insertCnt : " + insertCnt);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(ppstmt != null) ppstmt.close();
				if(connect != null) connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
//		System.out.println(insertCnt);
		return insertCnt;
	}

	@Override
	public int bookUpdate(_01_bookDTO bdto) {
	}

	@Override
	public int bookDelete(_01_bookDTO bdto) {
	};
	
	
}
