<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="Com.jspcrud.UserDao"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image: url(./images/main5.jpg);
background-repeat: no-repeat;
background-size: cover;
}</style>
</head>
<body>


<jsp:useBean id="u" class="Com.jspcrud.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=UserDao.save(u);  
if(i>0){  
response.sendRedirect("adduser-success.jsp");  
}else{  
response.sendRedirect("adduser-error.jsp");  
}  
%>  
</body>
</html>
