<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
h2{
color:red;
text-decoration: underline;}
section{
border:1px solid black;
border-radius: 10px;
padding: 8px;
width:25%;
margin: 0 auto;
}
body{
                background-image: url("/example/myStyleFol/images/images/register.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                background-attachment: fixed;
            }
.errorblock{color:red}  
</style>
<h2>students register your details here</h2>
<br>
	<section>
	<h1>Regitser form</h1>
		<form:form action="save" modelAttribute="student" method="post">
			<table >
				<tr>
					<td>firstname</td>
					<td><form:input path="fname" /></td>
				</tr>
				<tr>
					<td>lastname</td>
					<td><form:input path="lname" /></td>
				</tr>
				<tr>
					<td>age</td>
					<td><form:input path="age" /></td>
				</tr>

				<tr>
					<td>city</td>
					<td><form:input path="city" /></td>
				</tr>


 <form:errors path = "*" cssClass = "errorblock" element = "div" />

				<tr>

					<td><input type="submit" value="register" /></td>

				</tr>
			</table>
		</form:form>
	</section>
</body>
</html>