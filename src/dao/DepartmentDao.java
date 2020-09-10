package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Department;


public class DepartmentDao {
 
	
	public static Connection getConnection() {
		 Connection con=null;  
	        try{  
	            Class.forName("oracle.jdbc.driver.OracleDriver");  
	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","BugTracker","bhargaba");  
	        }catch(Exception e){System.out.println(e);}  
	        return con; 	
	}
	
	public String addDepartment(Department department)
	{
		String DepartmentId=department.getDepartmentId();
		String DepartmentName=department.getDepartmentName();
		String Location =department.getLocation();
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con=getConnection();
			String query = "insert into Department(Departmentid,DepartmentName,Location) values (?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1, DepartmentId);
			ps.setString(2, DepartmentName);
			ps.setString(3, Location);
			int i= ps.executeUpdate();
			if (i!=0)  
				return "SUCCESS";
		}catch(Exception e)
		{
			e.printStackTrace();
			}
		return "Oops.. Something went wrong there..!";
		
	}
	public  static List<Department>getDepartment() {
		
		ArrayList<Department> department=new ArrayList<>();
		try
		{
			Connection con = null;
			Statement statement = null;
			ResultSet resultSet = null;
			con=getConnection(); 
			statement = con.createStatement(); 
			ResultSet  rs = statement.executeQuery("select * from Department");
			while(rs.next())
			{
				String DepartmentId=rs.getString("DepartmentId");
				String DepartmentName=rs.getString("DepartmentName");
				String Location=rs.getString("Location");
				Department d=new Department(DepartmentId,DepartmentName,Location);
				department.add(d);		
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return department;	
		
	}
	public static Department getRecordById(String DepartmentId){  
	    Department department=null;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from Department where DepartmentId=?");  
	        ps.setString(1,DepartmentId);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	             department=new Department(DepartmentId, DepartmentId, DepartmentId);  
	            department.setDepartmentId(rs.getString("DepartmentId"));  
	            department.setDepartmentName(rs.getString("DepartmentName"));  
	            department.setLocation(rs.getString("Location"));  
	             
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return department;  
	}  
	public String updateDepartment(Department department)
	{
		
		String DepartmentName=department.getDepartmentName();
		String Location =department.getLocation();
		String DepartmentId=department.getDepartmentId();
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con=getConnection();
			String query = "update Department set DepartmentName=?,Location=? where DepartmentId=?";
			ps = con.prepareStatement(query);
			ps.setString(1, DepartmentName);
			ps.setString(2, Location);
			ps.setString(3, DepartmentId);
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
