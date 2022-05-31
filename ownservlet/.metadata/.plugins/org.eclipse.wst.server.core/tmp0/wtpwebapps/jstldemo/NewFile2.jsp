<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/xml"  prefix="x" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Students:</h2>  
<c:import var="stdInfo" url="Demo.xml"/>  
  
<x:parse xml="${stdInfo}" var="output"/>  
<p>First std : <x:out select="$output/Students/bio[1]/name" /></p>  
<p>First age : <x:out select="$output/Students/bio[1]/age" /></p>  
<p>Second std : <x:out select="$output/Students/bio[2]/name" /></p>  
<p>Second age : <x:out select="$output/Students/bio[2]/age" /></p>  
  
</body>
</html>