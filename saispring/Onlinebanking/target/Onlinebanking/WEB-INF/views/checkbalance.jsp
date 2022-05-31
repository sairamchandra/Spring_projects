<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
body{
 background-image: url("/Onlinebanking/myStyleFol/images/images/welcomegif");
 background-size: cover;
 background-repeat: no-repeat;

}
h1{
text-align:center;
color: red;
text-decoration: underline;
}

</style>
<title>Insert title here</title>
</head>
<body>
<h1>Virtusa bank check balance</h1>
<br>

            <form:form modelAttribute="checkbal" action="showbal" method="get">
                <table align="center">
                <br>
                 <tr>
                        <td>
                            <form:label path="id">id:</form:label>
                        </td>
                        <td>
                            <form:input path="id"  />
                        </td>
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button >check</form:button>
                        </td>
                    </tr>

                  
                   
                </table>
            </form:form>
           

        </body>
</body>
</html>

