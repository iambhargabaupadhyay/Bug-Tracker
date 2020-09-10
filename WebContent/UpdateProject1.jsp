<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update Project</title>
</head>
<body>

<%@page import="dao.ProjectDao,model.Project,java.util.*"%>

<%  
String ProjectId=request.getParameter("ProjectId");  
Project project=ProjectDao.getRecordById(ProjectId);  
%> 
<body bgcolor="gold" font-color="red">
<form  name="form" action="UpdateProject" method="post">
<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>
 <center><tr><td><h3>Update Project</h3></td></tr></center>
<table align="center">
 
<input type="hidden" name="ProjectId" value="<%=project.getProjectId()%>">
<tr><td><b>Project Name</td><td><input type="text" name="ProjectName" value="<%=project.getProjectName()%>"></tc></td></tr>
<tr><td><b>Project Description</td><td><input type="text" name="ProjectDescription"value="<%=project.getProjectDescription()%>" ></tc></td></tr>
<tr><td><b> Submission Date</td><td><input type="text" name="Sdate" value="<%=project.getSdate()%>"></tc></td></tr>
<tr><td><b>Duration</td><td><input type="text" name="Duration" value="<%=project.getDuration()%>"></tc></td></tr>
<tr><td><b>Client Name</td><td><input type="text" name="ClientName" value="<%=project.getClientName()%>"></tc></td></tr>
<tr><td><b>  Client Address</td><td><input type="text" name="ClientAddress" value="<%=project.getClientAddress()%>"></tc></td></tr>
<tr><td><b>  Client Phone No</td><td><input type="text" name="ClientPhone" value="<%=project.getClientPhone()%>"></tc></td></tr>
<tr><td><b>Client Email Id</td><td><input type="text" name="ClienteMail " value="<%=project.getClienteMail()%>"></tc></td></tr>
<tr><td><b>Project Lead</td><td><input type="text" name="ProjectLead" value="<%=project.getProjectLead()%>"></tc></td></tr>
<tr><td><b>Department Name</td><td><input type="text" name="DeptName" value="<%=project.getDeptName()%>"></tc></td></tr>
<td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="update"></input>

<input type="reset" value="Reset"></input></td>
<tr>
<td></td>
</tr>
</table>
</form>
</body>
</html>