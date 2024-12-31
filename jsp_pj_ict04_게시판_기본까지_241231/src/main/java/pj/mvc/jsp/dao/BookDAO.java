package pj.mvc.jsp.dao;

import pj.mvc.jsp.dto.BookDTO;

public interface BookDAO {
	// ID 중복확인 처리
	public int bookCheck(int bookNo);
	
	// 회원가입 처리
	public int insertBook(BookDTO dto);
	
	// 로그인 처리 / 회원정보 인증(수정, 탈퇴)
	public int bookChk(int bookNo, String bookName);
	
	// 회원정보 인증처리 및 탈퇴처리
	public int deleteBook(int bookNo);
	
	// 회원정보 인증처리 및 상세페이지
	public BookDTO getBookDetail(int bookNo);
	
	// 회원정보 수정처리
	public int updateBook(BookDTO dto);
}
