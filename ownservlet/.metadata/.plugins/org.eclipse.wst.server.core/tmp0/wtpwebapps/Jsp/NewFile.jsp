<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css" >
</head>
<body>

<video autoplay loop poster="polina.jpg" id="vid">
<source src="http://clips.vorwaerts-gmbh.de/big_buck_bunny.webm" type="video/webm">
<source src="http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4" type="video/mp4">
</video>


<h1>this is for jsp file</h1>
 <%! String jspname="hiiiiiii friends your in jsp page and this is for jsp declreation tag"; %>
 <br>
  <%
  try{
	 int k=10/0; 
	 out.println(k);
  }catch(Exception e){
	e.getMessage();  
  }
  String uname=request.getParameter("name");
		out.println("<h1>"+"hello "+uname+ " your in jsp file"+"</h1>");
		
  %>
  
  <h2>this result is for jsp file variables :</h2>
  <%= jspname +"    bye friends" %>
  <jsp:include page="Action.jsp" flush="false" />
  <iframe width="560" height="315" src="https://www.youtube.com/embed/u_2ariWW8K0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
  
</body>
</html>