package pj.mvc.jsp.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CustomerService {
	// ID 중복확인 처리
	public void idConfirmAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	// 회원가입 처리
	public void signInAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	// 로그인 처리 / 회원정보 인증(수정, 탈퇴)
	public void loginACtion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;

	// 회원정보 인증처리 및 탈퇴처리
	public void deleteCustomerACtion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	
	// 회원정보 인증처리 및 상세페이지
	public void modifyDetailACtion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	// 회원정보 수정처리
	public void modifyCustomerACtion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException ;
	
	// 2단계. 클라이언트 요청 분석
}
