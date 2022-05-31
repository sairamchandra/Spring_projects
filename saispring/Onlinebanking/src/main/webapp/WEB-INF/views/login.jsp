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
<h1>Virtusa bank Login form</h1>
<br>

            <form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
                <table align="center">
                <br>
                    <tr>
                        <td>
                            <form:label path="username">Username: </form:label>
                        </td>
                        <td>
                            <form:input path="username" name="username" id="username" />
                        </td>
                    </tr><br>
                    <tr>
                        <td>
                            <form:label path="password">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password"  />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="login" name="login">Login</form:button>
                        </td>
                    </tr>

                  
                   
                </table>
            </form:form>
           

        </body>
</body>
</html>

