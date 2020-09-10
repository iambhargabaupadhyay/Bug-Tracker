<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Department</title>
</head>
<body>
<body bgcolor="gold" font-color="red">
<table width="100%">
<tr>
<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
</tr>
</table>
<center><h4>Add Department</h4></center>
<form  name="form" action="DepartmentServlet" method="post">
<table align="center">
<tr><td><b>DepartmentId</td><td><input type="text" name="DepartmentId"></tc></td></tr>
<tr><td><b>DepartmentName</td><td><input type="text" name="DepartmentName"></tc></td></tr>
<tr><td><b>Location</td><td><input type="text" name="Location"></tc></td></tr>
<td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Add"></input>
<input type="reset" value="Reset"></input>
</table>
</form>
</body>
</html>