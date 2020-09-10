package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Project;
 

public class ProjectDao {

	public static Connection getConnection() {
		 Connection con=null;  
	        try{  
	            Class.forName("oracle.jdbc.driver.OracleDriver");  
	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","BugTracker","bhargaba");  
	        }catch(Exception e){System.out.println(e);}  
	        return con; 	
	}
	public static String addProject(Project project)
	{
		String ProjectId=project.getProjectId();
		String ProjectName=project.getProjectName();
		String ProjectDescription=project.getProjectDescription();
		String Sdate=project.getSdate();
		String Duration=project.getDuration();
		String ClientName=project.getClientName();
		String ClientAddress=project.getClientAddress();
		String ClientPhone=project.getClientPhone();
		String ClienteMail=project.getClienteMail();
		String ProjectLead=project.getProjectLead();
		String DeptName=project.getDeptName();
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con=getConnection();
			String query = "insert into project_details(ProjectId,ProjectName,ProjectDescription,Sdate,Duration,ClientName,ClientAddress,ClientPhone,ClienteMail,ProjectLead,DeptName) values (?,?,?,?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1, ProjectId);
			ps.setString(2, ProjectName);
			ps.setString(3, ProjectDescription);
			ps.setString(4, Sdate);
			ps.setString(5,  Duration);
			ps.setString(6, ClientName);
			ps.setString(7, ClientAddress);
			ps.setString(8, ClientPhone);
			ps.setString(9, ClienteMail);
			ps.setString(10, ProjectLead);
			ps.setString(11, DeptName);
			int i= ps.executeUpdate();
			if (i!=0)  
				return "SUCCESS";
		}catch(Exception e)
		{
			e.printStackTrace();
			}
		return "Oops.. Something went wrong there..!";
		
	}
	
public  static List<Project>getProject() {
		
		ArrayList<Project> project=new ArrayList<>();
		try
		{
			Connection con = null;
			Statement statement = null;
			ResultSet resultSet = null;
			con=getConnection();; 
			statement = con.createStatement(); 
			ResultSet  rs = statement.executeQuery("select * from project_details");
			while(rs.next())
			{
				String ProjectId=rs.getString("ProjectId");
				String ProjectName=rs.getString("ProjectName");
				String ProjectDescription=rs.getString("ProjectDescription");
				String Sdate=rs.getString("Sdate");
				String Duration=rs.getString("Duration");
				String ClientName=rs.getString("ClientName");
				String ClientAddress=rs.getString("ClientAddress");
				String ClientPhone=rs.getString("ClientPhone");
				String ClienteMail=rs.getString("ClienteMail");
				String ProjectLead=rs.getString("ProjectLead");
				String DeptName=rs.getString("DeptName");
				
				Project p=new Project( ProjectId, ProjectName, ProjectDescription, Sdate,  Duration, ClientName, ClientAddress, ClientPhone, ClienteMail,  ProjectLead, DeptName);
				project.add(p);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return project;	
		
	}

public static Project getRecordById(String ProjectId) {
	Project project=null;
	try {
		Connection con=getConnection(); 
		PreparedStatement ps=con.prepareStatement("select * from project_details where ProjectId=?");
		ps.setString(1,ProjectId);  
        ResultSet rs=ps.executeQuery(); 
        while(rs.next()){
        	project=new Project(ProjectId, ProjectId, ProjectId, ProjectId, ProjectId, ProjectId, ProjectId, ProjectId, ProjectId, ProjectId, ProjectId);
        	project.setProjectId(rs.getString("ProjectId"));
        	project.setProjectName(rs.getString("ProjectName"));
        	project.setProjectDescription(rs.getString("ProjectDescription"));
        	project.setSdate(rs.getString("Sdate"));
        	project.setDuration(rs.getString("Duration"));
        	project.setClientName(rs.getString("ClientName"));
        	project.setClientAddress(rs.getString("ClientAddress"));
        	project.setClientPhone(rs.getString("ClientPhone"));
        	project.setClienteMail(rs.getString("ClienteMail"));
        	project.setProjectLead(rs.getString("ProjectLead"));
        	project.setDeptName(rs.getString("DeptName"));
        	
        	}
        
	}catch(Exception e){System.out.println(e);} 
	return project;
}

public  static String updateProject(Project project) {
	
	String ProjectId=project.getProjectId();
	String ProjectName=project.getProjectName();
	String ProjectDescription=project.getProjectDescription();
	String Sdate=project.getSdate();
	String Duration=project.getDuration();
	String ClientName=project.getClientName();
	String ClientAddress=project.getClientAddress();
	String ClientPhone=project.getClientPhone();
	String ClienteMail=project.getClienteMail();
	String ProjectLead=project.getProjectLead();
	String DeptName=project.getDeptName();
	Connection con = null;
	PreparedStatement ps = null;
	try {
		con=getConnection();
		String query = "update project_details  set ProjectName=?,ProjectDescription=?,Sdate=?,Duration=?,ClientName=?,ClientAddress=?,ClientPhone=?,ClienteMail=?,ProjectLead=?,DeptName=? where ProjectId=?";
		ps = con.prepareStatement(query);
		
		ps.setString(1, ProjectName);
		ps.setString(2, ProjectDescription);
		ps.setString(3, Sdate);
		ps.setString(4,  Duration);
		ps.setString(5, ClientName);
		ps.setString(6, ClientAddress);
		ps.setString(7, ClientPhone);
		ps.setString(8, ClienteMail);
		ps.setString(9, ProjectLead);
		ps.setString(10, DeptName);
		ps.setString(11, ProjectId);
		int i= ps.executeUpdate();
		if (i!=0)  
			return "SUCCESS";
	}catch(Exception e)
	{
		e.printStackTrace();
		}
	return "Oops.. Something went wrong there..!";
}
}


