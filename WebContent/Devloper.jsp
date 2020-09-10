<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Devloper Page</title>
</head>
<% 
if((request.getSession(false).getAttribute("Developer")== null) )
{
%>
<jsp:forward page="Login.jsp"></jsp:forward>
<%} %>
<body bgcolor="gold">
<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>
<center><h2>Developer's Home</h2></center>
Welcome <%=request.getAttribute("username") %>
<div style="text-align: right"><a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a></div>
 <jsp:include page="./DeveloperHeader.jsp" />
 
</body>
</html>