<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="gold" font-color="red">
<form  name="form" action="RegisterServlet" method="post">
	<table width="100%">
	<tr>
	<td align=""><font face="arial narrow" size="5px" color="sky blue" font-family="Arial"><b>Bug Tracker</b></font></td>
	</tr>
	</table>
	
<center><tr><td><h4>REGISTRATION FORM</h4></td></tr></center>
<center>
<table>
<tr><td><b>UserName*</td><td><input type="text" name="username" value=""></tc></td></tr>
<tr><td><b>Fname*</td><td><input type="text" name="fname" value=""></td></tr>
<tr><td><b>Lname*</td><td><input type="text" name="lname" value=""></td></tr>
<tr>
<td><b>Gender:</td>
<td><select name="gender">
<option value="select">-----select----</option>
<option>Male</option>
<option>FeMale</option></td>
</tr>
<tr>
<td><b>Qualification</td>
<td><input type="text" name="qualification" value=""></td>
</tr>
<tr>
<td><b>Address</td>
<td><input type="text" name="address" value=""></td>
</tr>
<tr>
<td><b>PhoneNo</td>
<td><input type="text" name="phoneno" value=""></td>
</tr>
<tr>
<td><b>EmailID</td>
<td><input type="text" name="mailid" value=""></td>
</tr>
<tr>
<td><b>Designation</td>
<td>
<select name="designation">
<option value="select">-----select----</option>
<option>Developer</option>
<option>Tester</option>
<option>Admin</option></td>
</tr>
<tr>
<td><b>Password</td>
<td><input type="password" name="password" value=""></td>
</tr>
<tr>
           <td class="text1"><div align="right" class="style2"><b>Hint Question</div></td>
           <td><div align="left">
             <select name="HintQuestion" class="borderBlue">
		       <OPTION value="select">[Select One]
               <OPTION value="What is the name of your first school?">What is the name of your first school?
               <OPTION value="What is your favourite hero?">What is your favourite hero?
               <OPTION value="What is your hobby?">What is your hobby ?
               <OPTION value="What is your favourite food?">What is your favourite food?
             </select>
           </div></td>
         </tr>
<tr>
<td><b>HintAnswer</td>
<td><input type="text" name="hintanswer" value=""></td>
</tr>
</table><br><br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<tr><td><b><input type="submit" name="sub" value="Register"S>
<b><input type="Reset" name="reset" value="Reset"></td></tr>
</center>
</form>

</body>
</html>