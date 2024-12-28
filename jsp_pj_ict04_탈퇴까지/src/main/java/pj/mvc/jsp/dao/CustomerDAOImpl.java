package pj.mvc.jsp.dao;

import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import pj.mvc.jsp.dto.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO {
	
	//커넥션 풀 객체를 보관
	DataSource dataSource = null;
	
	static CustomerDAOImpl instance = new CustomerDAOImpl();
	
	public static CustomerDAOImpl getInstance() {
		
		if(instance==null) {
			instance = new CustomerDAOImpl();
		}
		return instance;
	}
	
	// 디폴트 생성자
	// 커넥션풀(DBCP : DataBase connection Pool 방식) - context.xml에 설정
	private CustomerDAOImpl() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jsp_pj_ict04");
		} catch(NamingException e) {
			e.printStackTrace();
		}
		
	};
	
	

	@Override
	public int useridCheck(String user_id) {
		
		System.out.println(" DAOImp - useridCheck ");
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		ResultSet rs = null;				// SQL 실행결과(SELECT)
		
		int selectCnt = 0;
		
		try {
			// 1.DB 연결 => 데이터베이스 커넥션 생성
			conn = dataSource.getConnection();
						
			// 2.SQL 작성 => prepareStatement 작성
			String sql = "SELECT * FROM mvc_customer_tbl WHERE user_id = ? ";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, user_id);
		
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
	public int insertCustomer(CustomerDTO dto) {
		
		System.out.println(" DAOImp - insertCustomer ");
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		ResultSet rs = null;				// SQL 실행결과(SELECT)
	 
		
		int insertCnt = 0;
		
		try {
			// 1.DB 연결 => 데이터베이스 커넥션 생성
			conn = dataSource.getConnection();
			
			// 2.SQL 작성 => prepareStatement 작성
			String sql = "INSERT INTO mvc_customer_tbl( user_id,"
					+ " user_password, "
					+ " user_name,"
					+ " user_birthday,"
					+ " user_address,"
					+ " user_hp,"
					+ " user_email,"
					+ " user_regdate)"
					+ " VALUES(?, ?, ?, ?, ?, ?, ?, ? ) ";
			
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, (dto.getUser_id()));
			pstmt.setString(2, (dto.getUser_password()));
			pstmt.setString(3, (dto.getUser_name()));
			pstmt.setDate(4, (dto.getUser_birthday()));
			pstmt.setString(5, (dto.getUser_address()));
			pstmt.setString(6, (dto.getUser_hp()));
			pstmt.setString(7, (dto.getUser_email()));
			pstmt.setTimestamp(8, (dto.getUser_regdate()));
			
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
	public int idPasswordChk(String user_id, String user_password) {
		
		System.out.println(" DAOImp - idPasswordChk ");
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		ResultSet rs = null;				// SQL 실행결과(SELECT)
	 
		
		int selectCnt = 0;
		
		try {
			// 1.DB 연결 => 데이터베이스 커넥션 생성
			conn = dataSource.getConnection();
			
			String sql = "SELECT * FROM mvc_customer_tbl WHERE user_id= ? AND user_password= ? ";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_password);
			
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
	public int deleteCustomer(String user_id) {
		int deleteCnt = 0 ;
		
		System.out.println(" DAOImp - deleteCustomer ");
		
		CustomerDTO dto = new CustomerDTO();
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		
		try {
				// 1.DB 연결 => 데이터베이스 커넥션 생성
				conn = dataSource.getConnection();
				
				String sql = "DELETE FROM mvc_customer_tbl WHERE user_id= ?";
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, user_id);
				
				deleteCnt = pstmt.executeUpdate();
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
	public CustomerDTO getCustomerDetail(String user_id) {

		System.out.println(" DAOImp - getCustomerDetail ");
		
		CustomerDTO dto = new CustomerDTO();
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		ResultSet rs = null;				// SQL 실행결과(SELECT)
		
		try {
			// 1.DB 연결 => 데이터베이스 커넥션 생성
			conn = dataSource.getConnection();
			
			String sql = "SELECT * FROM mvc_customer_tbl WHERE user_id= ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setUser_id(user_id);
				dto.setUser_password(rs.getString("user_password"));
				dto.setUser_name(rs.getString("user_name"));
				dto.setUser_birthday(rs.getDate("user_birthday"));
				dto.setUser_address(rs.getString("user_address"));
				dto.setUser_hp(rs.getString("user_hp"));
				dto.setUser_email(rs.getString("user_email"));
				dto.setUser_regdate(rs.getTimestamp("user_regdate"));
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
	public int updateCustomer(CustomerDTO dto) {
		
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
			
			pstmt.setString(1, (dto.getUser_password()));
			pstmt.setString(2, (dto.getUser_name()));
			pstmt.setDate(3, (dto.getUser_birthday()));
			pstmt.setString(4, (dto.getUser_address()));
			pstmt.setString(5, (dto.getUser_hp()));
			pstmt.setString(6, (dto.getUser_email()));
			pstmt.setString(7, (dto.getUser_id()));
			
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
