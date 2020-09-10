<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Bug</title>
</head>
<body bgcolor="gold">
<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>

<%@page import="dao.BugAddDao,model.BugAdd,java.util.*"%>

<%  
List<BugAdd> list=BugAddDao.getBug();  
request.setAttribute("list",list);
%> 

<center>
<table border="1">
<tr>
<th>BugCode</th>
<th>BugName</th>
<th>BugType</th>

<th>BugLevel</th>
<th>Priority</th>
<th>ProjectName</th>

<th>BugDate</th>
<th>TesterName</th>
<th>Status</th>



</tr>
<c:forEach items="${list}" var="u">  
<tr>
<td>${u.getBugCode()}</td>
<td>${u.getBugName()}</td>
<td>${u.getBugType()}</td>

<td>${u.getBugLevel()}</td>
<td>${u.getPriority()}</td>
<td>${u.getProjectName()}</td>

<td>${u.getBugDate()}</td>
<td>${u.getTesterName()}</td>
<td>${u.getStatus()}</td>




</tr>
</c:forEach>
</table>
</center>

</body>
</html>