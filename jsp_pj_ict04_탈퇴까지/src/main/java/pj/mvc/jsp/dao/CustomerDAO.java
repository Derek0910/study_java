package pj.mvc.jsp.dao;

import pj.mvc.jsp.dto.CustomerDTO;

public interface CustomerDAO {
	// ID 중복확인 처리
	public int useridCheck(String user_id);
	
	// 회원가입 처리
	public int insertCustomer(CustomerDTO dto);
	
	// 로그인 처리 / 회원정보 인증(수정, 탈퇴)
	public int idPasswordChk(String user_id, String user_password);
	
	// 회원정보 인증처리 및 탈퇴처리
	public int deleteCustomer(String user_id);
	
	// 회원정보 인증처리 및 상세페이지
	public CustomerDTO getCustomerDetail(String user_id);
	
	// 회원정보 수정처리
	public int updateCustomer(CustomerDTO dto);
}
