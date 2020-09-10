package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProjectDao;
import model.Project;


public class ProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ProjectId=request.getParameter("ProjectId");
		 String ProjectName=request.getParameter("ProjectName");
		 String ProjectDescription=request.getParameter("ProjectDescription");
		 String Sdate=request.getParameter("Sdate");
		 String Duration=request.getParameter("Duration");
		 String ClientName=request.getParameter("ClientName");
		 String ClientAddress=request.getParameter("ClientAddress");
		 String ClientPhone=request.getParameter("ClientPhone");
		 String ClienteMail=request.getParameter("ClienteMail");
		 String ProjectLead=request.getParameter("ProjectLead");
		 String DeptName=request.getParameter("DeptName");
		 
		 Project project=new Project( ProjectId,ProjectName,ProjectDescription,Sdate,Duration,ClientName,ClientAddress,ClientPhone, ClienteMail,  ProjectLead, DeptName);
		 
		 project.setProjectId(ProjectId);
		 project.setProjectName(ProjectName);
		 project.setProjectDescription(ProjectDescription);
		 project.setSdate(Sdate);
		 project.setDuration(Duration);
		 project.setClientName(ClientName);
		 project.setClientAddress(ClientAddress);
		 project.setClientPhone(ClientPhone);
		 project.setClienteMail(ClienteMail);
		 project.setProjectLead(ProjectLead);
		 project.setDeptName(DeptName);
		
		 ProjectDao projectdao=new ProjectDao();
			String projectadded = ProjectDao.addProject(project);
			if(projectadded.equals("SUCCESS"))   
			{
				response.sendRedirect("./AddProject.jsp?msg=Successfully added");
			}
			else   
			{
			request.setAttribute("errMessage", projectadded);
			request.getRequestDispatcher("/AddProject.jsp").forward(request, response);
			}
			
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
