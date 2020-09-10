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
import model.Register;

public class RegisterDao {

	public static Connection getConnection() {
		 Connection con=null;  
	        try{  
	            Class.forName("oracle.jdbc.driver.OracleDriver");  
	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","BugTracker","bhargaba");  
	        }catch(Exception e){System.out.println(e);}  
	        return con; 	
	}
	public String registerUser(Register register)
	{
		String fname = register.getFname();
	    String lname =register.getLname();
	    String gender =register.getGender();
	    String qualification =register.getQualification();
	    String address =register.getAddress();
	    String phoneno =register.getPhoneno();
	    String mailid =register.getMailid();
	    String username =register.getUsername();
	    String password=register.getPassword();
	    String hintquestion =register.getHintquestion();
	    String hintanswer =register.getHintanswer();
	    String designation =register.getDesignation();
	    
	    Connection con = null;
	    PreparedStatement preparedStatement = null;
	    try
	    {
	    	con=getConnection();
	    	String query = "insert into employee_details(fname,lname,gender,qualification,address,phoneno,mailid,username,password,hintquestion,hintanswer,designation) values(?,?,?,?,?,?,?,?,?,?,?,?)";
	    	preparedStatement = con.prepareStatement(query);
	    	preparedStatement.setString(1,fname);
	    	preparedStatement.setString(2,lname);	
	    	preparedStatement.setString(3,gender);
	    	preparedStatement.setString(4,qualification);
	    	preparedStatement.setString(5,address);
	    	preparedStatement.setString(6,phoneno);
	    	preparedStatement.setString(7,mailid);
	    	preparedStatement.setString(8,username);
	    	preparedStatement.setString(9,password);
	    	preparedStatement.setString(10,hintquestion);
	    	preparedStatement.setString(11,hintanswer);
	    	preparedStatement.setString(12,designation);
	    	int i= preparedStatement.executeUpdate();
	    	if (i!=0)  //Just to ensure data has been inserted into the database
	    	return "SUCCESS";
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }	
		return "Oops.. Something went wrong there..!";
		
	}
public  static List<Register>getEmployee() {
		
		ArrayList<Register> register=new ArrayList<>();
		try
		{
			Connection con = null;
			Statement statement = null;
			ResultSet resultSet = null;
			con=getConnection();; 
			statement = con.createStatement(); 
			ResultSet  rs = statement.executeQuery("select * from employee_details");
			while(rs.next())
			{
				String fname=rs.getString("fname");
				String lname=rs.getString("lname");
				String gender=rs.getString("gender");
				String qualification=rs.getString("qualification");
				String address=rs.getString("address");
				String phoneno=rs.getString("phoneno");
				String mailid=rs.getString("mailid");
				String username=rs.getString("username");
				String password=rs.getString("password");
				String hintquestion=rs.getString("hintquestion");
                String hintanswer=rs.getString("hintanswer");
                String designation=rs.getString("designation");


				Register r = new Register( fname, lname, gender, qualification, address, phoneno, mailid, username, password,hintquestion,  hintanswer, designation);
				register.add(r);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return register;	
		
	}
public static Register getRecordByUsername(String username) {
	Register register=null;
	try {
		Connection con=getConnection(); 
		PreparedStatement ps=con.prepareStatement("select * from employee_details where username=?");
		ps.setString(1,username);  
        ResultSet rs=ps.executeQuery(); 
        while(rs.next()){
        	register=new Register(username, username, username, username, username, username, username, username, username, username, username, username);
        	register.setUsername(rs.getString("username"));
        	register.setFname(rs.getString("fname"));
        	register.setLname(rs.getString("lname"));
        	register.setQualification(rs.getString("qualification"));
        	register.setAddress(rs.getString("address"));
        	register.setMailid(rs.getString("mailid"));
        	register.setPhoneno(rs.getString("phoneno"));
        }
	}
        catch(Exception e){System.out.println(e);}  
	    return register;  
	}  
        
	public String updateEmpoyee(Register register)
	
	{
		
		String fname = register.getFname();
	    String lname =register.getLname();
	    String qualification =register.getQualification();
	    String address =register.getAddress();
	    String phoneno =register.getPhoneno();
	    String mailid =register.getMailid();
	    String username =register.getUsername();
	    Connection con = null;
	    PreparedStatement preparedStatement = null;
	    try
	    {
	    	con=getConnection();
	    	String query = "update employee_details set fname=?,lname=?,qualification=?,address=?,phoneno=?,mailid=? where username=?";
	    	preparedStatement = con.prepareStatement(query);
	    	
	    	preparedStatement.setString(1,fname);
	    	preparedStatement.setString(2,lname);	
	    	preparedStatement.setString(3,qualification);
	    	preparedStatement.setString(4,address);
	    	preparedStatement.setString(5,phoneno);
	    	preparedStatement.setString(6,mailid);
	    	preparedStatement.setString(7,username);
	    	int i= preparedStatement.executeUpdate();
	    	if (i!=0)  
	    	return "SUCCESS";
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }	
	    
		return "Oops.. Something went wrong there..!";
	
}

}	

