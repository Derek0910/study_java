package pj.mvc.jsp.service;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

//import org.apache.jasper.tagplugins.jstl.core.Out;

import pj.mvc.jsp.dao.CustomerDAO;
import pj.mvc.jsp.dao.CustomerDAOImpl;
import pj.mvc.jsp.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {

	public CustomerServiceImpl() {
	};

	static CustomerServiceImpl cinstance = new CustomerServiceImpl();

	public static CustomerServiceImpl getInstance() {
		if (cinstance == null) {
			cinstance = new CustomerServiceImpl();
		}
		return cinstance;
	}

	// ID 중복확인 처리
	@Override
	public void idConfirmAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(" 서비스 - idConfirmACtion() ");

		// ID 중복확인 - 3. 스크립트에서 get방식으로 넘김 값을 가져온다.
		String user_id = request.getParameter("user_id");

		// 4단계. 싱글톤 방식으로 DAO 객체 생성, 다형성 적용
		CustomerDAO dao = CustomerDAOImpl.getInstance();

		// 5단계. 회원가입 처리 DAO 호출
		int selectCnt = dao.useridCheck(user_id);
		System.out.println(selectCnt);

		// 6단계. jsp로 처리결과 전달
		request.setAttribute("selectCnt", selectCnt);
		request.setAttribute("user_id", user_id);

	}

	// 회원가입 처리
	@Override
	public void signInAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(" 서비스 - signInActioin() ");

		// 3단계. 화면에서 입력받은 값을 가져와서 DTO의 setter를 통해 값 전달
		CustomerDTO cdto = new CustomerDTO();

		cdto.setUser_id(request.getParameter("user_id"));
		cdto.setUser_password(request.getParameter("user_password"));
		cdto.setUser_name(request.getParameter("user_name"));
		cdto.setUser_birthday(Date.valueOf(request.getParameter("user_birthday")));
		// import java.sql.Date; 해야만 valuOf의 값을 string으로 받는다.
		cdto.setUser_address(request.getParameter("user_address"));

		// hp는 피수가 아니므로 null 값이 들어올 수 있으므로 값이 존재할때만 받는다.
		String hp1 = request.getParameter("user_hp1");
		String hp2 = request.getParameter("user_hp2");
		String hp3 = request.getParameter("user_hp3");

		String hp = "";

		if (!hp1.equals("") && !hp2.equals("") && !hp3.equals("")) {
			hp = hp1 + "-" + hp2 + "-" + hp3;
		}

		cdto.setUser_hp(hp);

		String email1 = request.getParameter("user_email1");
		String email2 = request.getParameter("user_email2");

		String email = email1 + "@" + email2;

		cdto.setUser_email(email);

		cdto.setUser_regdate(new Timestamp(System.currentTimeMillis()));

		// 4단계. 싱글톤 방식으로 DAO 객체 생성, 다형성 적용
		CustomerDAO dao = CustomerDAOImpl.getInstance();

		// 5단계. 회원가입 처리 DAO 호출
		int insertCnt = dao.insertCustomer(cdto);

		// 6단계. jsp로 처리결과 전달
		request.setAttribute("insertCnt", insertCnt);
		System.out.println(insertCnt);

	}

	// 로그인 처리 / 회원정보 인증(수정, 탈퇴)
	@Override
	public void loginACtion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(" 서비스 - loginACtion() ");
		String user_id = request.getParameter("user_id");
		String user_password = request.getParameter("user_password");

		// 4단계 싱글톤으로 DAO 객체 생성, 다형성 적용
		CustomerDAO dao = CustomerDAOImpl.getInstance();

		// 5단계 로그인 처리
		int selectCnt = dao.idPasswordChk(user_id, user_password);

		// 로그인 성공 시 세션ID를 설정(중요)
		if (selectCnt == 1) {
//			HttpSession session = request.getSession();
//			session.setAttribute("sessionID",user_id);
			request.getSession().setAttribute("sessionID", user_id);
		}

		// 6단계, jsp로 처리결과 전달

		request.setAttribute("selectCnt", selectCnt);
		request.setAttribute("user_id", user_id); // 필요한지 확인해 볼 것
		request.setAttribute("user_password", user_password);
		System.out.println(request.getAttribute("selectCnt"));

	}

	// 회원정보 인증처리 및 탈퇴처리
	@Override
	public void deleteCustomerACtion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(" 서비스 - deleteCustomerACtion() ");

		String user_id = (String) request.getSession().getAttribute("sessionID");
		String user_password = request.getParameter("user_password");

		// 4단계 싱글톤으로 DAO 객체 생성, 다형성 적용
		CustomerDAO dao = CustomerDAOImpl.getInstance();

		// 5-1단계. 회원정보 인증처리
		int selectCnt = dao.idPasswordChk(user_id, user_password);
		int deleteCnt = 0;

		if (selectCnt == 1) {
			// 5-2단계. 상세페이지
			deleteCnt = dao.deleteCustomer(user_id);
		}
		request.setAttribute("deleteCnt", deleteCnt);
//		System.out.println("deleteCnt : " + deleteCnt);
	}

	// 회원정보 인증처리 및 상세페이지
	@Override
	public void modifyDetailACtion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(" 서비스 - modifyDetailACtion() ");

		String user_id = (String) request.getSession().getAttribute("sessionID");
		String user_password = request.getParameter("user_password");

		// 4단계 싱글톤으로 DAO 객체 생성, 다형성 적용
		CustomerDAO dao = CustomerDAOImpl.getInstance();

		// 5-1단계. 회원정보 인증처리
		int selectCnt = dao.idPasswordChk(user_id, user_password);

		System.out.println("selectCnt " + selectCnt);

		CustomerDTO dto = null;

		if (selectCnt == 1) {
			// 5-2단계. 상세페이지
			dto = dao.getCustomerDetail(user_id);
		}

		// 6단계. jsp로 처리결과 전달
		request.setAttribute("selectCnt", selectCnt);
		request.setAttribute("dto", dto);

		System.out.println(request.getAttribute("selectCnt"));
		System.out.println((String) request.getSession().getAttribute("sessionID"));

	}

	// 회원정보 수정처리
	@Override
	public void modifyCustomerACtion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(" 회원정보 수정처리 - modifyCustomerACtion() ");

		// 3단계. 화면에서 입력받은 값을 가져와서 DTO의 setter를 통해 값 전달
		CustomerDTO cdto = new CustomerDTO();

		cdto.setUser_id(request.getParameter("user_id"));
		cdto.setUser_password(request.getParameter("user_password"));
		cdto.setUser_name(request.getParameter("user_name"));
		cdto.setUser_birthday(Date.valueOf(request.getParameter("user_birthday")));
		// import java.sql.Date; 해야만 valuOf의 값을 string으로 받는다.
		cdto.setUser_address(request.getParameter("user_address"));

		// hp는 피수가 아니므로 null 값이 들어올 수 있으므로 값이 존재할때만 받는다.
		String hp1 = request.getParameter("user_hp1");
		String hp2 = request.getParameter("user_hp2");
		String hp3 = request.getParameter("user_hp3");

		String hp = "";

		if (!hp1.equals("") && !hp2.equals("") && !hp3.equals("")) {
			hp = hp1 + "-" + hp2 + "-" + hp3;
		}

		cdto.setUser_hp(hp);

		String email1 = request.getParameter("user_email1");
		String email2 = request.getParameter("user_email2");

		String email = email1 + "@" + email2;

		cdto.setUser_email(email);

		cdto.setUser_regdate(new Timestamp(System.currentTimeMillis()));

		// 4단계. 싱글톤 방식으로 DAO 객체 생성, 다형성 적용
		CustomerDAO dao = CustomerDAOImpl.getInstance();

		// 5단계. 회원가입 처리 DAO 호출

		System.out.println(cdto.getUser_id());
		int updateCnt = dao.updateCustomer(cdto);

		// 6단계. jsp로 처리결과 전달

		request.setAttribute("updateCnt", updateCnt);
		request.setAttribute("dto", cdto);
		System.out.println(updateCnt);

	}

}
