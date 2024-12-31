package pj.mvc.jsp.dao;

import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import pj.mvc.jsp.dto.BookDTO;

public class BookDAOImpl implements BookDAO {
	
	//커넥션 풀 객체를 보관
	
	static BookDAOImpl instance = new BookDAOImpl();
	
	public static BookDAOImpl getInstance() {
		
		if(instance==null) {
			instance = new BookDAOImpl();
		}
		return instance;
	}
	
	// 디폴트 생성자
	// 커넥션풀(DBCP : DataBase connection Pool 방식) - context.xml에 설정
	DataSource dataSource = null;
	private BookDAOImpl() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jsp_pj_ict04");
		} catch(NamingException e) {
			e.printStackTrace();
		}
		
	};
	
	

	@Override
	public int bookCheck(int bookNo) {
		
		System.out.println(" DAOImp - bookCheck ");
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		ResultSet rs = null;				// SQL 실행결과(SELECT)
		
		int selectCnt = 0;
		
		try {
			// 1.DB 연결 => 데이터베이스 커넥션 생성
			conn = dataSource.getConnection();
						
			// 2.SQL 작성 => prepareStatement 작성
			String sql = "SELECT * FROM mvc_book_tbl WHERE bookNo = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bookNo);
		
//			selectCnt = pstmt.executeUpdate();
			
			rs= pstmt.executeQuery();
			
			if(rs.next()){
				selectCnt = 1;
			}
			System.out.println("selectCnt는 " + selectCnt );
		} catch (SQLException e) {
				e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {pstmt.close();}
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		return selectCnt;
		
	}

	@Override
	public int insertBook(BookDTO dto) {
		
		System.out.println(" DAOImp - insertBook ");
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		ResultSet rs = null;				// SQL 실행결과(SELECT)
	 
		
		int insertCnt = 0;
		
		try {
			// 1.DB 연결 => 데이터베이스 커넥션 생성
			conn = dataSource.getConnection();
			
			// 2.SQL 작성 => prepareStatement 작성
			String sql = "INSERT INTO mvc_customer_tbl( bookNo,"
					+ " bookName, "
					+ " publishDate,"
					+ " publisher,"
					+ " printNo,"
					+ " book_regdate)"
					+ " VALUES(?, ?, ?, ?, ?, ?) ";
			
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setInt(1, (dto.getBookNo()));
			pstmt.setString(2, (dto.getBookName()));
			pstmt.setDate(3, (dto.getPublishDate()));
			pstmt.setString(4, (dto.getPublisher()));
			pstmt.setString(5, (dto.getPrintNo()));
			pstmt.setTimestamp(6, (dto.getBook_regdate()));
			
			insertCnt = pstmt.executeUpdate();
			
			System.out.println("insertCnt : " + insertCnt);
		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return insertCnt;
	}

	@Override
	public int bookChk(int bookNo, String bookName) {
		
		System.out.println(" DAOImp - bookChk ");
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		ResultSet rs = null;				// SQL 실행결과(SELECT)
	 
		
		int selectCnt = 0;
		
		try {
			// 1.DB 연결 => 데이터베이스 커넥션 생성
			conn = dataSource.getConnection();
			
			String sql = "SELECT * FROM mvc_customer_tbl WHERE user_id= ? AND user_password= ? ";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookNo);
			pstmt.setString(2, bookName);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				selectCnt = 1;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null) {rs.close();}
				if(pstmt!=null) {rs.close();}
				if(conn!=null) {rs.close();}
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(selectCnt);
		return selectCnt;
	}

	@Override
	public int deleteBook(int bookNo) {
		int deleteCnt = 0 ;
		
		System.out.println(" DAOImp - deleteCustomer ");
		
		BookDTO dto = new BookDTO();
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		
		try {
				// 1.DB 연결 => 데이터베이스 커넥션 생성
				conn = dataSource.getConnection();
				
				String sql = "DELETE FROM mvc_book_tbl WHERE bookNo= ?";
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bookNo);
				
				deleteCnt = pstmt.executeUpdate();
				
				System.out.println("deleteCnt : " + deleteCnt);
			}	catch(SQLException e) {
			e.printStackTrace();
			} finally{
				try {
					if(pstmt!=null) {pstmt.close();}
					if(conn!=null) {conn.close();}
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		return deleteCnt;
	}

	@Override
	public BookDTO getBookDetail(int bookNo) {

		System.out.println(" DAOImp - getBookDetail ");
		
		BookDTO dto = new BookDTO();
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		ResultSet rs = null;				// SQL 실행결과(SELECT)
		
		try {
			// 1.DB 연결 => 데이터베이스 커넥션 생성
			conn = dataSource.getConnection();
			
			String sql = "SELECT * FROM mvc_book_tbl WHERE bookNo= ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookNo);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setBookNo(bookNo);
				dto.setBookName(rs.getString("bookName"));
				dto.setPublishDate(rs.getDate("publishDate"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setPrintNo(rs.getString("printNo"));
				dto.setBook_regdate(rs.getTimestamp("book_regdate"));
			}
		}	catch(SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null) {rs.close();}
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		dto.toString();
		return dto;
	}

	@Override
	public int updateBook(BookDTO dto) {
		
		System.out.println(" DAOImp - updateCustomer ");
		
	
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		
		int updateCnt = 0;
		
		try {
			// 1.DB 연결 => 데이터베이스 커넥션 생성
			conn = dataSource.getConnection();
			
			String sql = "UPDATE mvc_customer_tbl "
					+ "SET user_password= ? ,"
					+ 	 " user_name= ? ,"
					+ 	 " user_birthday= ? ,"
					+ 	 " user_address = ? ,"
					+ 	 " user_hp= ? ,"
					+ 	 " user_email= ? "
					+ 	" WHERE user_id= ? ";
		
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, (dto.getBookNo()));
			pstmt.setString(2, (dto.getBookName()));
			pstmt.setDate(3, (dto.getPublishDate()));
			pstmt.setString(4, (dto.getPublisher()));
			pstmt.setString(5, (dto.getPrintNo()));
			pstmt.setTimestamp(6, (dto.getBook_regdate()));
			
			updateCnt = pstmt.executeUpdate();
			
			System.out.println("updateCnt " + updateCnt);
			System.out.println(pstmt);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return updateCnt;
	}

}
