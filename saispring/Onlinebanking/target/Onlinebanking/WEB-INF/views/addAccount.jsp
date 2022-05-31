<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
 body{
 background-image: url("/Onlinebanking/myStyleFol/images/images/mainwelcome.gif");
 background-size: cover;
 background-repeat: no-repeat;

 }

</style>
</head>
<body>
<section>
<form:form action="saveAccount" modelAttribute="client" method="post">
<table align="center">
<tr>
<td>username</td>
<td><form:input  path="username"/></td>
</tr>
<tr>
<td>Password</td>
<td><form:password path="passsword"/></td>
</tr>
<tr>
<td>FullName</td>
<td><form:input path="fullname"/></td>
</tr>
<tr>
<td>phone</td>
<td><form:input  path="phone"/></td>
</tr>

<tr>
<td>city</td>
<td>
<form:input   path="city" /></td>
</tr>
<tr>
<td>state</td>
<td>
<form:input   path="state" /></td>
</tr>

<tr>
<td>Email</td>
<td><form:input  path="email"/></td>
</tr>
<tr>
<td>accountnumber</td>
<td><form:input  path="accountnumber"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="register"/></td>

</tr>
</table>
</form:form>


</section>
</body>
</html>