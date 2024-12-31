package pj.mvc.jsp.service;

import java.io.IOException;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BoardService {
	
	// 게시글 목록
	public void boardListAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	// 게시글 상세페이지
	public void boardDetailAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	// 게시글 수정 삭제시 비밀번호 인증
	public void password_chkAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	// 게시글 수정처리
	public void boardUpdateAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	// 게시글 삭제처리
	public void boardDeleteAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	// 게시글 작성 처리
	public void boardInsertAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	/*
	 * // 댓글작성 처리 public void commentAddAction(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException ;
	 * 
	 * // 댓글목록 처리 public void commentListAction(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException ;
	 */
	
}
