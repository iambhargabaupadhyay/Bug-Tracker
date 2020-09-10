package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.BugAdd;
import model.Department;

public class BugAddDao {

	public static Connection getConnection() {
		 Connection con=null;  
	        try{  
	            Class.forName("oracle.jdbc.driver.OracleDriver");  
	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","BugTracker","bhargaba");  
	        }catch(Exception e){System.out.println(e);}  
	        return con; 	
	}
	public String addBug(BugAdd bugadd)
	{
		String BugCode=bugadd.getBugCode();
		String BugName=bugadd.getBugName();
		String BugType=bugadd.getBugType();
		String BugLevel=bugadd.getBugLevel();
		String Priority=bugadd.getPriority();
		String ProjectName=bugadd.getProjectName();
		String BugDate=bugadd.getBugDate();
		String TesterName=bugadd.getTesterName();
		String Status=bugadd.getStatus();
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con=getConnection();
			String query = "insert into bug_report(BugCode,BugName,BugType,BugLevel,Priority,ProjectName,BugDate,TesterName,Status) values (?,?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1, BugCode);
			ps.setString(2, BugName);
			ps.setString(3, BugType);
			ps.setString(4, BugLevel);
			ps.setString(5, Priority);
			ps.setString(6, ProjectName);
			ps.setString(7,BugDate);
			ps.setString(8, TesterName);
			ps.setString(9, Status);
			
			int i= ps.executeUpdate();
			if (i!=0)  
				return "SUCCESS";
		}catch(Exception e)
		{
			e.printStackTrace();
			}
		return "Oops.. Something went wrong there..!";
		
	}
public  static List<BugAdd>getBug() {
		
		ArrayList<BugAdd> bugadd=new ArrayList<>();
		try
		{
			Connection con = null;
			Statement statement = null;
			ResultSet resultSet = null;
			con=getConnection();; 
			statement = con.createStatement(); 
			ResultSet  rs = statement.executeQuery("select * from bug_report");
			while(rs.next())
			{
				String BugCode=rs.getString("BugCode");
				String BugName=rs.getString("BugName");
				String BugType=rs.getString("BugType");

				String BugLevel=rs.getString("BugLevel");
				String Priority=rs.getString("Priority");
				String ProjectName=rs.getString("ProjectName");

				String BugDate=rs.getString("BugDate");
				String TesterName=rs.getString("TesterName");
				String Status=rs.getString("Status");



				BugAdd b=new BugAdd(BugCode,BugName,BugType,BugLevel,Priority,ProjectName,BugDate,TesterName,Status);
				bugadd.add(b);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return bugadd;	
		
	}

public static BugAdd getRecordById(String BugCode){  
    BugAdd bugadd=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from bug_report where BugCode=?");  
        ps.setString(1,BugCode);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
        	
        	bugadd =new BugAdd(BugCode, BugCode, BugCode, BugCode, BugCode, BugCode, BugCode, BugCode, BugCode);
        	bugadd.setBugCode(rs.getString("BugCode"));  
        	bugadd.setBugName(rs.getString("BugName"));  
        	bugadd.setBugType(rs.getString("BugType"));
        	
        	
        	bugadd.setBugLevel(rs.getString("BugLevel"));  
        	bugadd.setPriority(rs.getString("Priority"));  
        	bugadd.setProjectName(rs.getString("ProjectName"));
        	bugadd.setBugDate(rs.getString("BugDate"));
        	bugadd.setTesterName(rs.getString("TesterName"));  
        	bugadd.setStatus(rs.getString("Status"));  
        	
        	
             
        }  
    }catch(Exception e){System.out.println(e);}  
    return bugadd ;  
}  

public String updateBug(BugAdd bugadd)
{
	
	String BugCode=bugadd.getBugCode();
	String BugName =bugadd.getBugName();
	String Status=bugadd.getStatus();
	Connection con = null;
	PreparedStatement ps = null;
	try {
		con=getConnection();
		String query = "update bug_report set Status=? where BugCode=?";
		ps = con.prepareStatement(query);
		ps.setString(1, Status);
		ps.setString(2,BugCode);
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
