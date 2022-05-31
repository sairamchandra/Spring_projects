


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

            <form:form id="loginForm" modelAttribute="depo" action="editsave" method="post">
                <table align="center">
                <br>
                    <tr>
                        <td>
                            <form:label path="accountnumber">account number: </form:label>
                              <form:input path="accountnumber" />
                        </td>
                        <td>
                            <form:label path="amount">ammount: </form:label>
                            <form:input path="amount" />
                        </td>
                    </tr><br>
                  
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="login" name="login">deposit</form:button>
                        </td>
                    </tr>

                  
                   
                </table>
            </form:form>
           

        </body>
</body>
</html>