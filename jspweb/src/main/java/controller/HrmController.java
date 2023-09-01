package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.HrmDao;

/**
 * Servlet implementation class HrmController
 */
@WebServlet("/HrmController")
public class HrmController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HrmController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonArray = objectMapper.writeValueAsString(HrmDao.getInstance().loadHrm());
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(jsonArray);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    String uploadpath = request.getServletContext().getRealPath("/hrm/img");
	   
	      MultipartRequest multi = new MultipartRequest(
	              request,         // 1. 요청방식
	              uploadpath,         // 2. 첨부파일을 저장할 폴더 경로
	              1024 * 1024 * 10,    // 3. 첨부파일 용량 허용 범위 [ 바이트단위 ] 10MB
	              "UTF-8",         // 4. 한글 인코딩 타입
	              new DefaultFileRenamePolicy()
	                 // 5. [파일이름중복제거] 만약에 서버내 첨부파일이 동일한 이름이 있을 때 이름 뒤에 숫자를 자동으로 붙이기
	           );
	      String hname = multi.getParameter("hname");
	      String hphone = multi.getParameter("hphone");
	      String himg = multi.getFilesystemName("himg");
	      String hrank = multi.getParameter("hrank");
	      response.setContentType("application/json;charset=UTF-8");
	      
	      response.getWriter().print(HrmDao.getInstance().signup(hname, hphone, himg, hrank));
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
