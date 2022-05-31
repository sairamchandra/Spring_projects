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


<h1 >Your balance and details</h1>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>username</th><th>fullname</th><th>phone</th><th>city</th><th>state</th><th>email</th><th>accountnumber</th><th>amount</th></tr>  
  
     
   <tr>  
   <td>${check.id}</td>  
   <td>${check.username}</td>  
      <td>${check.fullname}</td>
        
         <td>${check.phone}</td>  
            <td>${check.city}</td>  
               <td>${check.state}</td>   
   <td>${check.email}</td>  
    <td>${check.accountnumber}</td>
    <td>${check.amount}</td>
   
   </tr>  
    
   </table>  
   <a href="welcometobankmain">home</a>

</body>
</html>