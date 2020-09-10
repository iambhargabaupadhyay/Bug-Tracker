<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Department</title>
</head>
<body>
<%@page import="dao.DepartmentDao,model.Department,java.util.*"%>
<%  
String DepartmentId=request.getParameter("DepartmentId");  
Department department=DepartmentDao.getRecordById(DepartmentId);  
%> 
<body bgcolor="gold" font-color="red">
<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>
	<center><tr><td><h4>Update Department</h4></td></tr></center>
<form  name="form" action="UpdateDepartment1" method="post">
<input type="hidden" name="DepartmentId" value="<%=department.getDepartmentId()%>"/> 
 
<table align="center">

<tr><td><b>DepartmentName</td><td><input type="text" name="DepartmentName" value="<%= department.getDepartmentName()%>" ></tc></td></tr>
<tr><td><b>Location</td><td><input type="text" name="Location"  value="<%= department.getLocation()%>"></tc></td></tr>

<td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Update"></input>
<input type="reset" value="Reset"></input></td>
</table>
</form>
</body>
</html>