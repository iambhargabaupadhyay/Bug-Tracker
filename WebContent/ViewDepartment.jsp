<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view Department</title>
</head>
<body bgcolor="gold">
<%@page import="dao.DepartmentDao,model.Department,java.util.*"%>
<%  
List<Department> list=DepartmentDao.getDepartment();  
request.setAttribute("list",list);
%> 
<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>
<center>
<table border="1">
<tr>
<th>DepartmentId</th>
<th>DepartmentName</th>
<th>Location</th>

</tr>
<c:forEach items="${list}" var="u">  
<tr>
<td>${u.getDepartmentId()}</td>
<td>${u.getDepartmentName()}</td>
<td>${u.getLocation()}</td>

</tr>
</c:forEach>
</table>
</center>
</body>
</html>