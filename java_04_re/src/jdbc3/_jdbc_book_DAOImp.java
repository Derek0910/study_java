package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc2._02_MemberDTO_part2;

public class _jdbc_book_DAOImp implements _jdbc_book_DAO{
	
	//default 생성자
	private _jdbc_book_DAOImp() {};
	
	//instance 변수선언
	static _jdbc_book_DAOImp instance = new _jdbc_book_DAOImp();
	
	//instance 메서드 생성
	public static _jdbc_book_DAOImp getInstance() {
		if(instance==null) {
			instance = new _jdbc_book_DAOImp();
		} 
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbId = "scott_04";
	String dbPassword = "tiger";
	
	Connection conn=null;
	PreparedStatement psmt = null;
	ResultSet rs= null;

	@Override
	public int bookRent(int bookno) {
		_jdbc_book_DTO jbdto = new _jdbc_book_DTO();
		String query = "SELECT * "
					+ " FROM jdbc_book_tbl "
					+ " WHERE bookno = ? ";
		try {
			conn = DriverManager.getConnection(dbURL, dbId, dbPassword);
			psmt = conn.prepareStatement(query);
			System.out.println("bookno" + bookno);
			psmt.setInt(1, bookno);
			rs = psmt.executeQuery();
			if(rs.next()) {
				jbdto.setBookno(rs.getInt("bookno"));
				jbdto.setBookname(rs.getString("bookname"));
				jbdto.setBookrent(rs.getInt("bookrent"));
				jbdto.setBookauthor(rs.getString("bookauthor"));
				jbdto.getBookrent();
				System.out.println("jbdto.getBookrent() : " + jbdto.getBookrent());
			}
			System.out.println(rs.getInt("bookrent"));
			System.out.println("psmt.getBookrent()" + jbdto.getBookrent());

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				 if(rs!=null) rs.close();
				 if(psmt!=null) psmt.close();
				 if(conn!=null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return jbdto.getBookrent();
	}
	
	@Override
	public int bookReg(_jdbc_book_DTO jdto) {
		int regCnt = 0;
		String query = "INSERT INTO jdbc_book_tbl(bookno, bookname, bookrent, bookauthor) "
				+ "VALUES(?, ?, ? , ? )";
		try {
			conn = DriverManager.getConnection(dbURL, dbId, dbPassword);
			psmt = conn.prepareStatement(query);
			psmt.setInt(1, jdto.getBookno());
			psmt.setString(2, jdto.getBookname());
			psmt.setInt(3, jdto.getBookrent());
			psmt.setString(4, jdto.getBookauthor());
			regCnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(psmt!=null) psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("여기까지");
		return regCnt;
	}
	
	@Override
	public int bookUpdate(_jdbc_book_DTO jdto) {
		int updateCnt = 0;
		String query = "UPDATE jdbc_book_tbl jbtbl "
				+ "   SET bookname = ? "
				+ " WHERE jbtbl.bookno = ? ";
		try {
			conn = DriverManager.getConnection(dbURL, dbId, dbPassword);
			psmt = conn.prepareStatement(query);
			psmt.setInt(2, jdto.getBookno());
//			System.out.println(jdto.getBookno());
			psmt.setString(1, jdto.getBookname());
//			System.out.println(jdto.getBookname());
			
			updateCnt = psmt.executeUpdate();
			System.out.println(updateCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(psmt!=null) psmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return updateCnt;
	}

	@Override
	public _jdbc_book_DTO bookSelect(_jdbc_book_DTO jbdto) {
//		System.out.println(jbdto.getBookname());
		String query = "SELECT * "
				+ "  FROM jdbc_book_tbl jbtbl"
				+ " WHERE jbtbl.bookname = ? ";
		try {
			conn = DriverManager.getConnection(dbURL, dbId, dbPassword);
			psmt = conn.prepareStatement(query);
			psmt.setString(1,jbdto.getBookname());
			rs = psmt.executeQuery();
			if(rs.next()) {
				jbdto.setBookno(rs.getInt("bookno"));
				jbdto.setBookname(jbdto.getBookname());
				jbdto.setBookrent(rs.getInt("bookrent"));
				jbdto.setBookauthor(rs.getString("bookauthor"));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(psmt!=null) rs.close();
				if(conn!=null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return jbdto;
	}
	
	@Override
	public int bookDelete(_jdbc_book_DTO jdto) {
		int deleteCnt = 0;
		String query = "DELETE ? "
				+ "  FROM jdbc_book_tbl "
				+ " WHERE bookno = ? ";
		try {
			conn = DriverManager.getConnection(dbURL, dbId, dbPassword);
			psmt = conn.prepareStatement(query);
			psmt.setLong(1, jdto.getBookno());
			System.out.println(jdto.getBookno());
			deleteCnt = psmt.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(psmt!=null) psmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return deleteCnt;
	}
}
