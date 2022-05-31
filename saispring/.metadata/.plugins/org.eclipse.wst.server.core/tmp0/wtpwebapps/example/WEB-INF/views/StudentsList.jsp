<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
text-align: center;
color:purple;
text-decoration: underline;
}
table,tr,td,th{
border: 1px black solid;
text-align: center;
}
section{
width:80%;
margin:0 auto;
}

 body{
                background-image: url("/example/myStyleFol/images/images/backlist.jpg");
                background-repeat: no-repeat;
                background-size: cover;
                background-attachment: fixed;
            }</style>
</head>
<body><h1>List of students in my school </h1>
<section>
<table>
<thead>
<tr>
<th>student id</th>
<th>student firstname</th>
<th>student lastname</th>
<th>student age</th>
<th>student city</th>
<th>update details</th>
<th>delete student</th>
</tr>
</thead>

<c:forEach var="student" items="${students}">
<tr>
 <td>${student.id}</td>
<td>${student.fname}</td>
<td>${student.lname}</td>
<td>${student.age}</td>
<td>${student.city}</td>
<td><a href="updatestud?userId=${student.id}">update</a></td>
<td><a href="#">delete</a></td>

</tr>
</c:forEach>

</table>
</section>
</body>
</html>