package controller;
import model.Department;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DepartmentDao;

/**
 * Servlet implementation class DepartmentServlet
 */

public class DepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String DepartmentId=request.getParameter("DepartmentId");
		String DepartmentName=request.getParameter("DepartmentName");
		String Location=request.getParameter("Location");
		Department department=new Department(DepartmentId, DepartmentId, Location);
		department.setDepartmentId(DepartmentId);
		department.setDepartmentName(DepartmentName);
		department.setLocation(Location);
		
		DepartmentDao departmentdao=new DepartmentDao();
		String departmentadded = departmentdao.addDepartment(department);
		if(departmentadded.equals("SUCCESS"))   
		{
			response.sendRedirect("./AddDepartment.jsp?msg=Successfully added");
		}
		else   
		{
		request.setAttribute("errMessage", departmentadded);
		request.getRequestDispatcher("/AddDepartment.jsp").forward(request, response);
		}
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
