package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 인터페이스를 구현하는 클래스
// 구현하되, 싱글톤 작성
public class _02_MemberDAOImpl2 implements _02_MemberDAO2{

	// 디폴트 생성자 호출 -> public 
	private _02_MemberDAOImpl2() {
		System.out.println("<<디폴트 생성자>>");
	};
	
	static _02_MemberDAOImpl2 instance = new _02_MemberDAOImpl2();
	
	public static _02_MemberDAOImpl2 getInstance() {
		if(instance == null) {
			instance = new _02_MemberDAOImpl2();
		}
		return instance;
	}
	
	
	// 싱글톤으로 변경 -> private
	
	
	// DB 연결
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe"; // @HOST:PORT:SID
	String dbID = "scott_04";			// 계정
	String dbPassword = "tiger";	
	
	Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
	PreparedStatement pstmt = null; 	// SQL 문장
	ResultSet rs = null;				// SQL 실행결과(SELECT)
	
	// 재정의
	@Override
	public String login(String id, String password) {
		int loginCnt = 0;
		String sql = "SELECT jdbc_member_tbl "
				+ "WHERE id = ? AND password = ? ";

		try {
			conn= DriverManager.getConnection(dbURL, dbID, dbPassword);		// 오라클 연결
			pstmt = conn.prepareStatement(sql);		
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			System.out.println(id + "님이 로그인 시도");
			
			rs = pstmt.executeQuery();	
			
			System.out.println(id + "님이 로그인 성공~!!");
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return id;
	}
	
	@Override
	public int memberInsert(_02_MemberDTO2 mdto2) {
		System.out.println("회원가입");
		int inserCnt = 0;
		String sql = "INSERT INTO jdbc_member_tbl(id, password, gender, email, address) "
				+ "VALUES(?,?,?,?,?)";
		try {
			conn= DriverManager.getConnection(dbURL, dbID, dbPassword);		// 오라클 연결
			pstmt = conn.prepareStatement(sql);			// SQL 문장
			pstmt.setString(1, mdto2.getId());			// 1 : 물음표위치
			pstmt.setString(2, mdto2.getPassword());	// 2 : 물음표위치
			pstmt.setString(3, mdto2.getGender());		// 3 : 물음표위치
			pstmt.setString(4, mdto2.getEmail());		// 4 : 물음표위치
			pstmt.setString(5, mdto2.getAddress());		// 5 : 물음표위치
			inserCnt = pstmt.executeUpdate();											// SQL 실행(CTRL + ENTER)
			// executeUpdate() => 입력(I), 수정(U), 삭제(D) 일 때, 성공 : 1, 실패 : 0
			System.out.println("inserCnt : " + inserCnt);
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return inserCnt;
	}
	
	@Override
	public int memberUpdate(_02_MemberDTO2 mdto2) {
		int updatecnt = 0;
		String query = "UPDATE jdbc_member_tbl"
				   + " SET password = ? "
				   + " , gender = ? " 
				   + " , email = ? "
				   + " , address = ? "
				   + " WHERE id = ? ";
				  
		// 1. DB 연결
	    try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			  // 2.SQL 작성
		    pstmt = conn.prepareStatement(query);
		    pstmt.setString(1, mdto2.getPassword());
		    pstmt.setString(2, mdto2.getGender());
		    pstmt.setString(3, mdto2.getEmail());
		    pstmt.setString(4, mdto2.getAddress());
		    pstmt.setString(5, mdto2.getId());
		    
		    // 3.SQL 실행

		    updatecnt = pstmt.executeUpdate();	
		    
			System.out.println("updatecnt : " + updatecnt);
		} catch (SQLException e) {

				e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return updatecnt;
	}
	
	@Override
	public void memberDelete(String id) {
		System.out.println(id + "회원삭제");
		
	}
	
	@Override
	public _02_MemberDTO2 memberSelect(String id) {
		
		// 1. _02_MemberDTO2를 생성
		
		_02_MemberDTO2 mdto2 = new _02_MemberDTO2();
		
		// 2. SQL 작성
		String query = " SELECT * FROM jdbc_member_tbl "
				+ " WHERE id = ? ";
		
		try {
			// 1. DB 연결
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			

			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
//			
//			pstmt.setString(1, mdto2.getId());
//			pstmt.setString(2, mdto2.getPassword());
//			pstmt.setString(3, mdto2.getGender());
//			pstmt.setString(4, mdto2.getEmail());
//			pstmt.setString(5, mdto2.getAddress());
	
			

			// 3.SQL 실행(ResulteSet에 
			rs = pstmt.executeQuery();
			
			System.out.println("rs : " + rs);
			// 4. ResultSet에 데이터가 존재하면
			if(rs.next()) {
				// ResultSet을 읽어서5
				mdto2.setId(rs.getString(1));
				mdto2.setPassword(rs.getString("password"));
				mdto2.setGender(rs.getString("gender"));
				mdto2.setEmail(rs.getString("email"));
				mdto2.setAddress(rs.getString("address"));
				System.out.println("나오냐");
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//MemberDTO를 리턴한다.
		return mdto2;
	}
}
