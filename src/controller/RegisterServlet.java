package controller;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDao;

import model.Register;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Copying all the input parameters in to local variables
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String qualification = request.getParameter("qualification");
		String address= request.getParameter("address");
		String phoneno = request.getParameter("phoneno");
		String mailid = request.getParameter("mailid");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String hintquestion = request.getParameter("hintquestion");
		String hintanswer = request.getParameter("hintanswer");
		String designation = request.getParameter("designation");
		
		Register register = new Register( fname,  lname,  gender,  qualification,  address,  phoneno, mailid,  username,  password,  hintquestion,  hintanswer, designation);
		//Using Java Beans - An easiest way to play with group of related data
		register.setFname(fname);
		register.setLname(lname);
		register.setGender(gender);
		register.setQualification(qualification);
		register.setAddress(address);
		register.setPhoneno(phoneno);
		register.setMailid(mailid);
		register.setUsername(username);
		register.setPassword(password);
		register.setHintquestion(hintquestion);
		register.setHintanswer(hintanswer);
		register.setDesignation(designation);
		RegisterDao registerDao = new RegisterDao();
		String userRegistered = registerDao.registerUser(register);
		
		if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
		{
			response.sendRedirect("./Register.jsp?msg=Successfully saved");
		}
		else   //On Failure, display a meaningful message to the User.
		{
		request.setAttribute("errMessage", userRegistered);
		request.getRequestDispatcher("/Register.jsp").forward(request, response);
		}
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
