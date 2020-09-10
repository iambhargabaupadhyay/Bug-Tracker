<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Project</title>
</head>
<body>
<body bgcolor="gold" font-color="red">
<form  name="form" action="ProjectServlet" method="post">
<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>
 <center><tr><td><h3>Add Project</h3></td></tr></center>
<table align="center">
 
<tr><td><b>  Project Id</td><td><input type="text" name="ProjectId"></tc></td></tr>
<tr><td><b>Project Name</td><td><input type="text" name="ProjectName"></tc></td></tr>
<tr><td><b>Project Description</td><td><input type="text" name="ProjectDescription"></tc></td></tr>
<tr><td><b> Submission Date</td><td><input type="text" name="Sdate"></tc></td></tr>
<tr><td><b>Duration</td><td><input type="text" name="Duration"></tc></td></tr>
<tr><td><b>Client Name</td><td><input type="text" name="ClientName"></tc></td></tr>
<tr><td><b>  Client Address</td><td><input type="text" name="ClientAddress"></tc></td></tr>
<tr><td><b>  Client Phone No</td><td><input type="text" name="ClientPhone"></tc></td></tr>
<tr><td><b>Client Email Id</td><td><input type="text" name="ClienteMail "></tc></td></tr>
<tr><td><b>Project Lead</td><td><input type="text" name="ProjectLead"></tc></td></tr>
<tr><td><b>Department Name</td><td><input type="text" name="DeptName"></tc></td></tr>
<td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Add"></input>

<input type="reset" value="Reset"></input></td>
<tr>
<td></td>
</tr>
</table>
</form>
</body>
</html>