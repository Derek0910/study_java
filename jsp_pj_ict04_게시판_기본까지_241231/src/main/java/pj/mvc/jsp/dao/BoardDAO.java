package pj.mvc.jsp.dao;

import java.util.List;
import pj.mvc.jsp.dto.BoardDTO;

public interface BoardDAO {

	// 게시글 목록
	public List<BoardDTO> boardList(int start, int end);
	
	// 게시글 갯수 구하기
	public int boardCnt(); // select *
	
	// 조회수 증가
	public void plusReadCnt(int b_num);
	
	//게시글 상세페이지
	public BoardDTO getBoardDetail(int b_num);
	
	// 게시글 수정 삭제 시 비밀번호 인증
	public int password_chk(int b_num, String password);
	
	// 게시글 수정처리
	public int updateBoard(BoardDTO dto);
	
	// 게시글 삭제처리
	public int deleteBoard(int b_num, String password);
	
	// 게시글 작성처리
	public int insertBoard(BoardDTO dto);
	
}
