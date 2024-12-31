package pj.mvc.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import pj.mvc.jsp.dto.BoardDTO;

public class BoardDAOImpl implements BoardDAO {
	//커넥션 풀 객체를 보관
	
	
	// 싱글톤 객체 생성
	static BoardDAOImpl instance = new BoardDAOImpl();
	
	public static BoardDAOImpl getInstance() {
		
		if(instance==null) {
			instance = new BoardDAOImpl();
		}
		return instance;
	}
	
	// 커넥션풀
	DataSource dataSource = null;
	private BoardDAOImpl() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jsp_pj_ict04");
		} catch(NamingException e) {
			e.printStackTrace();
		}
		
	};
	// 게시글 목록
	@Override
	public List<BoardDTO> boardList(int start, int end) {
		
		System.out.println(" BoardDAOImp - boardList ");
		
		
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		ResultSet rs = null;				// SQL 실행결과(SELECT)
	 

		// 1. list 생성
		List<BoardDTO> list = null; 
		
		list = new ArrayList<>(); 
		
		try {
			conn = dataSource.getConnection();
			
			String sql = "SELECT * "
					+ "  FROM"
					+ "  (SELECT A.*,"
					+ "    ROWNUM AS rn"
					+ "    FROM"
					+ "        (SELECT * FROM mvc_board_tbl"
					+ "        ORDER BY b_num DESC ) A"
					+ "    )"
					+ " WHERE rn BETWEEN ? AND ? ";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,start);
			pstmt.setInt(2,end);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// 2. dto 생성
				BoardDTO dtolist = new BoardDTO();
				
				// 3. dto에 1건의 rs 게시글 정보를 담는다.
				dtolist.setB_num(rs.getInt("b_num"));
				dtolist.setB_title(rs.getString("b_title"));
				dtolist.setB_content(rs.getString("b_content"));
				dtolist.setB_writer(rs.getString("b_writer"));
				dtolist.setB_password(rs.getString("b_password"));
				dtolist.setB_readCnt(rs.getInt("b_readCnt"));
				dtolist.setB_regDate(rs.getDate("b_regDate"));
				dtolist.setB_comment_count(rs.getInt("b_comment_count"));
				
				// 4. list에 dto를 추가한다.
				list.add(dtolist);
			}
			System.out.println(list);
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
		
		return list;
	}
	
	// 게시글 갯수 구하기
	@Override
	public int boardCnt() {
		System.out.println(" BoardDAOImp - boardCnt ");
		
		int total = 0;
		Connection conn = null; 			// 오라클과 연결 => import 해야된다, 
		PreparedStatement pstmt = null; 	// SQL 문장
		ResultSet rs = null;				// SQL 실행결과(SELECT)
		
		try {
			conn = dataSource.getConnection();
			
			String sql = "SELECT COUNT(*) AS cnt "
					+ "FROM mvc_board_tbl";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs !=null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return total;
	}

	// 조회수 증가
	@Override
	public void plusReadCnt(int b_num) {
		
	}

	// 게시글 상세페이지
	@Override
	public BoardDTO getBoardDetail(int b_num) {
		return null;
	}
	
	// 게시글 수정 삭제시 비밀번호 인증
	@Override
	public int password_chk(int b_num, String password) {
		return 0;
	}

	// 게시글 수정처리
	@Override
	public int updateBoard(BoardDTO dto) {
		return 0;
	}
	
	// 게시글 삭제처리
	@Override
	public int deleteBoard(int b_num, String password) {
		return 0;
	}
	
	// 게시글 작성 처리
	@Override
	public int insertBoard(BoardDTO dto) {
		return 0;
	}

}
