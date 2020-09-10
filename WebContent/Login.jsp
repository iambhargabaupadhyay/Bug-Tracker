<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="gold" font-color="red">
<form name="form" action="<%=request.getContextPath()%>
/LoginServlet" method="post">
<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>
 <center><tr><td><h4>LOGIN FORM</h4></td></tr></center>
<table align="center">
 
<tr><td><b>Username</td><td><input type="text" name="username"></tc></td></tr>
<tr><td><b>Password</td><td><input type="password" name="password"></tc></td></tr>

<td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Login"></input>

<input type="reset" value="Reset"></input></td>
<tr>
<td></td>
<td><br/>new user<a href="Register.jsp">Register here</a></td>
</tr>
</table>
</form>
</body>
</html>