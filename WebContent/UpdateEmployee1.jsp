<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body bgcolor="gold" font-color="red">
<form  name="form" action="UpdateEmployee" method="post">
	<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>
	
	
<%@page import="dao.RegisterDao,model.Register,java.util.*"%>


<%  
String username=request.getParameter("username");  
Register register=RegisterDao.getRecordByUsername(username);  
%> 
<center><tr><td><h4>Update Employee</h4></td></tr></center>
<center>
<table>
<input type="hidden" name="username" value="<%=register.getUsername()%>"/>
<tr><td><b>Fname</td><td><input type="text" name="fname" value="<%= register.getFname()%>"></td></tr>
<tr><td><b>Lname</td><td><input type="text" name="lname" value="<%= register.getLname()%>"></td></tr>

<tr>
<td><b>Qualification</td>
<td><input type="text" name="qualification" value="<%= register.getQualification()%>"></td>
</tr>
<tr>
<td><b>Address</td>
<td><input type="text" name="address" value="<%= register.getAddress()%>"></td>
</tr>
<tr>
<td><b>PhoneNo</td>
<td><input type="text" name="phoneno" value="<%= register.getPhoneno()%>"></td>
</tr>
<tr>
<td><b>EmailID</td>
<td><input type="text" name="mailid" value="<%= register.getMailid()%>"></td>
</tr>
</table><br><br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<tr><td><b><input type="submit" name="sub" value="Update">
<b><input type="Reset" name="reset" value="Reset"></td></tr>
</center>
</form>

</body>
</html>