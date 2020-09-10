package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Login;
import dao.LoginDao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Login login = new Login();
		 
		login.setUsername(username);
		login.setPassword(password);
		 
		LoginDao loginDao = new LoginDao();
		try
		{
		String userValidate = loginDao.authenticateUser(login);
		 
		if(userValidate.equals("Admin_Role"))
		{
		System.out.println("Admin's Home");
		 
		HttpSession session = request.getSession(); //Creating a session
		session.setAttribute("Admin", username); //setting session attribute
		request.setAttribute("usname", username);
		 
		request.getRequestDispatcher("Admin.jsp").forward(request, response);
		}
		else if(userValidate.equals("Devloper_Role"))
		{
		System.out.println("Devlopers's Home");
		 
		HttpSession session = request.getSession();
		session.setAttribute("Developer", username);
		request.setAttribute("username", username);
		 
		request.getRequestDispatcher("Devloper.jsp").forward(request, response);
		}
		else if(userValidate.equals("Tester_Role"))
		{
		System.out.println("Tester's Home");
		 
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(10*60);
		session.setAttribute("Tester", username);
		request.setAttribute("username", username);
		 
		request.getRequestDispatcher("Tester.jsp").forward(request, response);
		}
		else
		{
		System.out.println("Error message = "+userValidate);
		request.setAttribute("errMessage", userValidate);
		 
		request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		}
		catch (IOException e1)
		{
		e1.printStackTrace();
		}
		catch (Exception e2)
		{
		e2.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
