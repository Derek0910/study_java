package pj.mvc.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pj.mvc.jsp.service.CustomerService;
import pj.mvc.jsp.service.CustomerServiceImpl;

/*
 * 1) 고객요청분석 -> 2) Service 
 * 1. 화면값을 전달받는다. => request.getParameter()
 * 2. DAO 호출
 * 3) -> DAO(DB처리)
 *    CRUD
 * 4) -> Service :
 *    3. DAO 결과를 돌려받는다.
 *    4. JSP로 결과 전달 => request.setAttribute("key", value) -> DAO(DB처리:CRUD)
 * -> Service -> JSP(화면) => 자료형 value = request.getAttribute("key");
 */
@WebServlet("*.do")
public class CustomerController/* 고객요청분석 */ extends HttpServlet {
   private static final long serialVersionUID = 1L;

    public CustomerController() {
       super();
    }

    // 1단계. 웹브라우저가 전송한 HTTP 전송을 받음
    @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      action(request, response);
   }

    @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

    /*
     * <<< [path] = url(/jsp_pj_ict04/"".do) or page("".do) >>>
     * window.location = [path];
     * onclick="window.location=[path]"
     * <a href=[path]>HOME</a>
     */
   public void action(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // 2단계. 클라이언트 요청 분석

      // 한글 안깨지게 처리
      request.setCharacterEncoding("UTF-8");

      // uri: http://localhost/jsp_pj_ict04/*.do
      String uri = request.getRequestURI(); // uri : ==> /jsp_pj_ict03/*.do

      String contextPath = request.getContextPath();

      System.out.println("URI: " + uri);
      String url = uri.substring(contextPath.length()); /* uri.substring(시작위치, 끝) */
      String viewPage = "";
      CustomerService service = new CustomerServiceImpl();

	  System.out.println("url => " + url);
	  // 첫페이지
	  if (url.equals("/main.do")/* || url.equals("/*.do") */) { // index.jsp가 있기에
		  viewPage = "common/main.jsp";
	  }
	  else if (url.equals("/join.do")) {
		  viewPage = "customer/join/join.jsp";
	  }
	  else if (url.equals("/idConfirmAction.do")) {
		  service.idConfirmAction(request, response);
		  viewPage = "customer/join/idConfirmAction.jsp";
	  }
	  else if (url.equals("/joinAction.do")) {
		  service.signInAction(request, response);
		  viewPage = "customer/join/joinAction.jsp";
	  }
	  else if (url.equals("/login.do")) {
		  viewPage = "customer/login/login.jsp";
	  }
	  else if (url.equals("/loginAction.do")) {
		  service.loginACtion(request, response);
		  viewPage = "customer/login/loginAction.jsp";
	  }
	  else if (url.equals("/logout.do")) {
		  request.getSession().invalidate();
		  viewPage = "common/main.jsp";
	  }
	  else if (url.equals("/modifyCustomer.do")) {
		  viewPage = "customer/mypage/customerInfo/modifyCustomer.jsp";
	  }
	  else if (url.equals("/modifyDetailAction.do")) {
		  service.modifyDetailACtion(request, response);
		  viewPage = "customer/mypage/customerInfo/modifyDetailAction.jsp";
	  }
	  else if (url.equals("/modifyCustomerAction.do")) {
		  service.modifyCustomerACtion(request, response);
		  viewPage = "customer/mypage/customerInfo/modifyCustomerAction.jsp";
	  }
	  else if (url.equals("/deleteCustomer.do")) {
		viewPage = "customer/delete/deleteCustomer.jsp";
	  }
  	  else if (url.equals("/deleteCustomerAction.do")) {
		service.deleteCustomerACtion(request, response);
		viewPage = "customer/delete/deleteCustomerAction.jsp";
	  }

      System.out.println("<<< " + viewPage + " >>>");

      // RequestDispatcher : 서블릿 또는 JSP 요청을 받은 후,
      // 다른 컴포넌트로 요청을 위임하는 클래스이다.
      RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
      dispatcher.forward(request, response);
   }
}
