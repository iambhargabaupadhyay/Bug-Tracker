<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Project</title>
</head>
<body bgcolor="gold">
<%@page import="dao.ProjectDao,model.Project,java.util.*"%>
<%  
List<Project> list=ProjectDao.getProject();  
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
<th>Project Id</th>
<th>Project Name</th>
<th>Project Description</th>
<th>Sdate</th>
<th>Duration</th>
<th>ClientName</th>
<th>ClientAddress</th>
<th>ClientPhone</th>
<th>ClienteMail</th>
<th>ProjectLead</th>
<th>DeptName</th>


</tr>
<c:forEach items="${list}" var="u">  
<tr>
<td>${u.getProjectId()}</td>
<td>${u.getProjectName()}</td>
<td>${u.getProjectDescription()}</td>
<td>${u.getSdate()}</td>
<td>${u.getDuration()}</td>
<td>${u.getClientName()}</td>
<td>${u.getClientAddress()}</td>
<td>${u.getClientPhone()}</td>
<td>${u.getClienteMail()}</td>
<td>${u.getProjectLead()}</td>
<td>${u.getDeptName()}</td>

</tr>
</c:forEach>
</table>
</center>
</body>
</html>