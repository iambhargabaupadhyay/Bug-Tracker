<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Bug</title>
</head>
<body bgcolor="gold" font-color="red">
<form  name="form" action="BugAddServlet" method="post">
	<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>
	
<center><tr><td><h4>Add Bug</h4></td></tr></center>
<center>
<table>
<tr><td><b>BugCode</td><td><input type="text" name="BugCode" ></tc></td></tr>
<tr><td><b>BugName</td><td><input type="text" name="BugName" ></td></tr>
<tr><td><b>BugType</td><td><input type="text" name="BugType" ></td></tr>
<tr>
<td><b>BugLevel</td>
<td><input type="text" name="BugLevel" ></td>
</tr>
<tr>
<td><b>Priority</td>
<td><input type="text" name="Priority" ></td>
</tr>
<tr>
<td><b>ProjectName</td>
<td><input type="text" name="ProjectName" value=""></td>
</tr>
<tr>
<td><b>BugDate</td>
<td><input type="text" name="BugDate" value=""></td>
</tr>
<tr>
<td><b>TesterName</td>
<td><input type="text" name="TesterName"></td>
</tr>
<tr>
<td><b>Status</td>
<td>
<select name="Status">
<option value="select">-----select----</option>
<option>open</option>
<option>close</option>
<option>completed</option>
<option>resolve</option></td>
</tr>
</table><br><br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<tr>
<td></td>
<td><input type="submit" value="Add"></input>

<input type="reset" value="Reset"></input></td>
<tr>
<td></td>
</tr>
</center>
</form>
</body>
</html>