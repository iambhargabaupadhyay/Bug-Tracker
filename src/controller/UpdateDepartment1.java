package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DepartmentDao;
import model.Department;

public class UpdateDepartment1 extends HttpServlet {
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
		String departmentupdated = departmentdao.updateDepartment(department);
		if(departmentupdated.equals("SUCCESS"))  
		{
			response.sendRedirect("./UpdateDepartment1.jsp?msg=Successfully updated");
		}
		else   
		{
		request.setAttribute("errMessage", departmentupdated);
		request.getRequestDispatcher("/UpdateDepartment1.jsp").forward(request, response);
		}
		
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
