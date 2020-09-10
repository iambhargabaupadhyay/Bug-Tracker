package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 


import model.Login;

 
public class LoginDao {
	public static Connection getConnection() {
		 Connection con=null;  
	        try{  
	            Class.forName("oracle.jdbc.driver.OracleDriver");  
	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","BugTracker","bhargaba");  
	        }catch(Exception e){System.out.println(e);}  
	        return con; 	
	}
 
public String authenticateUser(Login login)
{
String username = login.getUsername();
String password = login.getPassword();
 
Connection con = null;
Statement statement = null;
ResultSet resultSet = null;
 
String userNameDB = "";
String passwordDB = "";
String roleDB = "";
 
try
{
con=getConnection();
statement = con.createStatement();
resultSet = statement.executeQuery("select username,password,designation from employee_details");
 
while(resultSet.next())
{
userNameDB = resultSet.getString("username");
passwordDB = resultSet.getString("password");
roleDB = resultSet.getString("designation");
 
if(username.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Admin"))
return "Admin_Role";
else if(username.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Developer"))
return "Devloper_Role";
else if(username.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Tester"))
return "Tester_Role";
}
}
catch(SQLException e)
{
e.printStackTrace();
}
return "Invalid user credentials";

}
}