package pj.mvc.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pj.mvc.jsp.service.BoardServiceImpl;

@WebServlet("*.bc")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	      action(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void action(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
	      String contextPath = request.getContextPath();

	      System.out.println("URI: " + uri);
	      String url = uri.substring(contextPath.length());
	      String viewPage = "";
		
		  if (url.equals("/board_list.bc")) { // index.jsp가 있기에
			System.out.println("<<< url ==> /board_list.bc  - controller >>>");
			
			BoardServiceImpl service = new BoardServiceImpl();
			service.boardListAction(request, response);
			
			viewPage = "admin/csCenter/board_list.jsp";
		  } else if (url.equals("/board_detailAction.bc")) {
			  System.out.println("<<< url ==> /board_detailAction.bc  - controller >>>");
			  BoardServiceImpl service = new BoardServiceImpl();
			  service.boardDeleteAction(request, response);
			  
			  viewPage = "admin/csCenter/board_detailAction.jsp";
		  } 
		
	      RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
	      dispatcher.forward(request, response);
		
	}
	
}
