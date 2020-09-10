<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="menustyle.css">
</head>
<body>
<center>
<font size="3px">
  <ul id="nav">
  <li><a href="#">Department</a>
  <ul id="nav">
       <li><a href="./AddDepartment.jsp">Add&nbsp;Department&nbsp;</a></li>
       <li><a href="./ViewDepartment.jsp">View&nbsp;Departments</a></li>
       <li><a href="./UpdateDepartment1.jsp">Update&nbsp;Departments</a></li> 
    </ul>
  </li>
  <li><a href="#">Employee </a>
    <ul>
	   <li><a href="./ViewEmployee.jsp">View&nbsp;Employee&nbsp;</a></li>
       <li><a href="./UpdateEmployee.jsp">Update&nbsp;Employee</a></li>
    </ul>    
  </li>
  <li><a href="#">Project </a>
    <ul>
      <li><a href="./AddProject.jsp">Add Project</a></li>
      <li><a href="./ViewProject.jsp">View Project</a></li>
      <li><a href="./UpdateProject.jsp">Update&nbsp;Project</a></li>
   </ul> 
   </li> 
   
   <li><a href="#">Bugs </a>
    <ul>
      <li><a href="./ViewBug.jsp">View Bug</a></li>
   </ul> 
   </li> 
  </ul>
  </font>
</body>
</html>