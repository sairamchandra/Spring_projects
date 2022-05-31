<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<section>
<form:form action="save" modelAttribute="student" method="post">
<table align="center">
<tr>
<td>firstname</td>
<td><form:input  path="fname"/></td>
</tr>
<tr>
<td>lastname</td>
<td><form:input path="lname"/></td>
</tr>
<tr>
<td>age</td>
<td><form:input path="age"/></td>
</tr>

<tr>
<td>city</td>
<td>
<form:input   path="city" /></td>
</tr>



<tr>

<td><input type="submit" value="register"/></td>

</tr>
</table>
</form:form>
</section>
</body>
</html>