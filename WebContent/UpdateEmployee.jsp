<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view Employee</title>
</head>
<body bgcolor="gold">
<%@page import="dao.RegisterDao,model.Register,java.util.*"%>
<%  
List<Register> list=RegisterDao.getEmployee();  
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
<th>fname</th>
<th>lname</th>
<th>gender</th>
<th>qualification</th>
<th>address</th>
<th>phoneno</th>
<th>mailid</th>
<th>username</th>
<th>designation</th>
<th>Update</th>

</tr>
<c:forEach items="${list}" var="u">  
<tr>
<td>${u.getFname()}</td>
<td>${u.getLname()}</td>
<td>${u.getGender()}</td>

<td>${u.getQualification()}</td>
<td>${u.getAddress()}</td>
<td>${u.getPhoneno()}</td>

<td>${u.getMailid()}</td>
<td>${u.getUsername()}</td>
<td>${u.getDesignation()}</td>
<td><a href="UpdateEmployee1.jsp?username=${u.getUsername()}">update</a></td>  

</tr>
</c:forEach>
</table>
</center>
</body>
</html>