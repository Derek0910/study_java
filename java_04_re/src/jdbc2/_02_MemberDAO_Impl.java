package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_MemberDAO_Impl implements _02_MemberDAO_part2 {
	
	public _02_MemberDAO_Impl(){};
	
	static _02_MemberDAO_Impl instance = new _02_MemberDAO_Impl();
	
	
	
	public static _02_MemberDAO_Impl getInstance() {
		if(instance == null) {
			instance = new _02_MemberDAO_Impl();
		} return instance;
	}
	
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	String dbID = "scott_04";
	String dbPassword = "tiger";
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
		

	@Override
	public int memberLogin(_02_MemberDTO_part2 dto_p2) {
		System.out.println("로그인 시도 완료");
		int loginCnt = 0;
		
		//입력값
		
		String query = "SELECT * "
					 + "  FROM jdbc_member_tbl "
				     + " WHERE id = ? "
				     + "AND password = ? ";
		
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			psmt = conn.prepareStatement(query);
			psmt.setString(1, dto_p2.getId() );
			psmt.setString(2, dto_p2.getPassword() );
			loginCnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(psmt!=null) psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return loginCnt;
		
		
	}

	@Override
	public int memberInsert(_02_MemberDTO_part2 dto_p2) {
		System.out.println("로그인 시도 완료");
		int insertCnt = 0;
		
		//입력값
		
		String query = "INSERT INTO jdbc_member_tbl(id, password, gender, email, address) "
				     + "VALUES(?, ?, ?, ?, ?)";
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			psmt = conn.prepareStatement(query);
			psmt.setString(1,dto_p2.getId());
			psmt.setString(2,dto_p2.getPassword());
			psmt.setString(3,dto_p2.getGender());
			psmt.setString(4,dto_p2.getEmail());
			psmt.setString(5,dto_p2.getAddress());
			
			insertCnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(psmt!=null) psmt.close();
				if(conn!=null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return insertCnt;
	}

	@Override
	public int memberUpdate(_02_MemberDTO_part2 dto_p2) {
		System.out.println("비밀번호 변경 시도!!");
		int updateCnt = 0;
		
		//입력값
		
		String query = "UPDATE jdbc_member_tbl "
				     + "SET password = ? "
					 + "WHERE id = ? ";
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
//			System.out.println(dto_p2.getPassword());
//			System.out.println(dto_p2.getId());
			psmt = conn.prepareStatement(query);
			psmt.setString(1, dto_p2.getPassword());
			psmt.setString(2, dto_p2.getId());
			
			updateCnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
				e.printStackTrace();
		} finally{
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
	public _02_MemberDTO_part2 memberSelect(String id) {
		
		_02_MemberDTO_part2 dto_p2 = new _02_MemberDTO_part2();
		
		String query = "SELECT * "
			  + "  FROM jdbc_member_tbl "
			  + " WHERE id = ?";
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			psmt = conn.prepareStatement(query);
			psmt.setString(1, id);
			
			rs = psmt.executeQuery();
			System.out.println(dto_p2);
			if(rs.next()){
				dto_p2.setId(rs.getString(1));
				dto_p2.setPassword(rs.getString("password"));
				dto_p2.setName(rs.getString("gender"));
				dto_p2.setEmail(rs.getString("email"));
				dto_p2.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		return dto_p2;
	}

	@Override
	public int memberDelete(String id) {
		int deleteCnt = 0;
		
		String query = "DELETE "
				+ "  FROM jdbc_member_tbl "
				+ " WHERE id = ? ";
				
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			psmt = conn.prepareStatement(query);
			psmt.setString(1, id);
			
			deleteCnt = psmt.executeUpdate();
			
			System.out.println(id + "데이터 삭제 완료!!!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return deleteCnt;
	}

	
	

}
