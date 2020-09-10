package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DepartmentDao;
import dao.RegisterDao;
import model.Register;

public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String qualification = request.getParameter("qualification");
		String address= request.getParameter("address");
		String phoneno = request.getParameter("phoneno");
		String mailid = request.getParameter("mailid");
		String username = request.getParameter("username");
		

		Register register = new Register( fname,  lname,  qualification,  address,  phoneno, mailid,  username, username, username, username, username, username);
		
		register.setFname(fname);
		register.setLname(lname);
		register.setQualification(qualification);
		register.setAddress(address);
		register.setPhoneno(phoneno);
		register.setMailid(mailid);
		register.setUsername(username);
		
		RegisterDao registerdao=new RegisterDao();
		String employeeudated = registerdao.updateEmpoyee(register);
		if(employeeudated.equals("SUCCESS"))  
		{
			response.sendRedirect("./UpdateEmployee.jsp?msg=Successfully updated");
		}
		else   
		{
		request.setAttribute("errMessage", employeeudated);
		request.getRequestDispatcher("/UpdateEmployee.jsp").forward(request, response);
		}
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
