package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.dao.AccountbookDao;
import model.dao.VisitDao;
import model.dto.AccountbookDto;

/**
 * Servlet implementation class accountbook
 */
@WebServlet("/Accountbook")
public class Accountbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accountbook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ObjectMapper om = new ObjectMapper();
		String jlist = om.writeValueAsString(AccountbookDao.getInstance().loadList());
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(jlist);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);		
		AccountbookDto abd = new AccountbookDto(request.getParameter("text"),Integer.parseInt(request.getParameter("price")),request.getParameter("inputdate"));
		
		response.getWriter().print(AccountbookDao.getInstance().inputbook(abd));
		
				
		
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		boolean res = AccountbookDao.getInstance().bookupdate( Integer.parseInt( request.getParameter("ano")) , request.getParameter("text"), Integer.parseInt( request.getParameter("price")));
		response.getWriter().print(res);
		
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print(AccountbookDao.getInstance().deleteboook(Integer.parseInt(request.getParameter("ano"))));
	}

}
