<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
text-align: center;}
</style>
</head>
<body>


<h1 >all bank users</h1>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>username</th><th>fullname</th><th>phone</th><th>city</th><th>state</th><th>email</th><th>accountnumber</th><th>amount</th><th>edit</th><th>delete</th></tr>  
   <c:forEach var="emp" items="${clients}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.username}</td>  
      <td>${emp.fullname}</td>  
         <td>${emp.phone}</td>  
            <td>${emp.city}</td>  
               <td>${emp.state}</td>   
   <td>${emp.email}</td>  
    <td>${emp.accountnumber}</td>
    <td>${emp.amount}</td>
   <td><a href="editemp/${emp.id}">Edit</a></td>  
   <td><a href="deleteemp/${emp.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  

</body>
</html>