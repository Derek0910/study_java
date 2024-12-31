package pj.mvc.jsp.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pj.mvc.jsp.dao.BoardDAO;
import pj.mvc.jsp.dao.BoardDAOImpl;
import pj.mvc.jsp.dto.BoardDTO;
import pj.mvc.jsp.page.Paging;

public class BoardServiceImpl implements BoardService{

	// 게시글 목록
	@Override
	public void boardListAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("<<< BoardService.Impl - servicsImpl >>>");
		
		// 3단계. 화면에서 입력받은 값을 가져오기
		String pageNum=request.getParameter("pageNum");
		System.out.println(pageNum);
		// 4단계. 싱글톤 방식으로 DAO 객체 생성, 다형성 적용
		BoardDAO dao= BoardDAOImpl.getInstance();
		
		// 5-1단계. 전체 게시글 갯수 카운트
		Paging paging = new Paging(pageNum);
		int total = dao.boardCnt();
		System.out.println("total => " + total);
		
		paging.setTotalCount(total);
				
		// 5-2단계. 게시글 목록 조회
		int start=paging.getStartRow();
		int end=paging.getEndRow();
		List<BoardDTO> list = dao.boardList(start, end);
		System.out.println("list => " + list);
		
		
		// 6단계. jsp로 처리결과 전달
		request.setAttribute("list", list);
		request.setAttribute("paging", paging);
		
	}

	// 게시글 상세페이지
	@Override
	public void boardDetailAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("<<< BoardService.Impl - boardDetailAction >>>");
	}

	// 게시글 수정 삭제시 비밀번호 인증
	@Override
	public void password_chkAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	// 게시글 수정처리
	@Override
	public void boardUpdateAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	// 게시글 삭제처리
	@Override
	public void boardDeleteAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	// 게시글 작성 처리
	@Override
	public void boardInsertAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/*
	 * // 댓글작성 처리
	 * 
	 * @Override public void commentAddAction(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException {
	 * 
	 * }
	 * 
	 * // 댓글목록 처리
	 * 
	 * @Override public void commentListAction(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException {
	 * 
	 * }
	 */
}
