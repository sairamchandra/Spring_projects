<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is jsp page</h1>
<%-- <jsp:include page="Sample.jsp" flush="false" >

<jsp:param  name="name" value="sai"/>
<jsp:param  name="age" value="22"/>
<jsp:param  name="place" value="AP"/>
</jsp:include> --%>
<jsp:useBean id="student" class="Demo" />
<jsp:setProperty property="*" name="student" />
<h1>
name :<jsp:getProperty property="name" name="student"/>
Emp no: <jsp:getProperty property="empno" name="student"/>
</h1>


</body>
</html>