package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BugAddDao;
import model.BugAdd;

public class UpdateBug extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String BugCode = request.getParameter("BugCode");
		String BugName = request.getParameter("BugName");
		String BugType = request.getParameter("BugType");
		String BugLevel = request.getParameter("BugLevel");
		String Priority= request.getParameter("Priority");
		String ProjectName = request.getParameter("ProjectName");
		String BugDate = request.getParameter("BugDate");
		String TesterName = request.getParameter("TesterName");
		String Status = request.getParameter("Status");
		
	  BugAdd bugadd=new BugAdd(BugCode,BugName,BugType,BugLevel,Priority,ProjectName,BugDate,TesterName,Status);
	  
	  bugadd.setBugCode(BugCode);
	  bugadd.setBugName(BugName);
	  bugadd.setBugType(BugType);
	  bugadd.setBugLevel(BugLevel);
	  bugadd.setPriority(Priority);
	  bugadd.setProjectName(ProjectName);
	  bugadd.setBugDate(BugDate);
	  bugadd.setTesterName(TesterName);
	  bugadd.setStatus(Status);
	  
	  BugAddDao bugadddao =new BugAddDao();
	  
	  String bugupdated = bugadddao.updateBug(bugadd);
		if(bugupdated.equals("SUCCESS"))   
		{
			response.sendRedirect("./UpdateBug.jsp?msg=Successfully updated");
		}
		else   
		{
		request.setAttribute("errMessage", bugupdated);
		request.getRequestDispatcher("/UpdateBug1.jsp").forward(request, response);
		}
	  
		
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
