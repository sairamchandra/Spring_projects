<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.client.ClientDao"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="c" class="com.client.client"></jsp:useBean>  
<jsp:setProperty property="*" name="c"/>  
  
<%  
int i=ClientDao.saveAccount(c);  
if(i>0){  
response.sendRedirect("success.jsp");  
}else{  
response.sendRedirect("error.jsp");  
}  
%>  
</body>
</html>