<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Status</title>
</head>

<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>
<body bgcolor="gold" font-color="red">
<%@page import="dao.BugAddDao, model.BugAdd,java.util.*"%>
<%  
String BugCode=request.getParameter("BugCode");  
BugAdd bugadd= BugAddDao.getRecordById(BugCode);  
%> 
<form  name="form" action="UpdateBug" method="post">
<center><tr><td><h4>Update Bug Status</h4></td></tr></center>
<center>
<table>
<input type="hidden" name="BugCode" value="<%=bugadd.getBugCode()%>">
<tr><td><b>BugName</td><td><input type="text" name="BugName" value="<%=bugadd.getBugName()%>"></td></tr>

<tr>
<td><b>Status</td>
<td>
<select name="Status">
<option value="select">-----select----</option>
<option>open</option>
<option>resolve</option></td>
</tr>
</table><br><br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<tr>
<td></td>
<td><input type="submit" value="upadate"></input>

<input type="reset" value="Reset"></input></td>
<tr>
<td></td>
</tr>
</center>
</form>
</body>
</html>