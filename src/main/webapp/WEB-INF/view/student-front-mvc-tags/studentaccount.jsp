<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
        <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<style type="text/css">
.error{
color: red;
font-weight: bold;
}

</style>
</head>
<body>

<f:form action="processmvctags" modelAttribute="student">
FirstName <f:input path="fname"/>
<f:errors path="fname" cssClass="error"></f:errors>
<br>
LastName <f:input path="lname"/>
<br>
Age <f:input path="age"/>
<f:errors path="age" cssClass="error"></f:errors>
<br>
Code <f:input path="code"/>
<f:errors path="code" cssClass="error"></f:errors>
<br>
Email <f:input path="email"/>
<f:errors path="email" cssClass="error"></f:errors>
<br>
Country <f:select path="country">       <!--defined into Student file   --> 
<f:options items="${student.countryOptions}"/>

</f:select>
<br>
 

Choose your language :
<f:radiobutton path="language" value="Java"/>Java
<f:radiobutton path="language" value="C++"/>C++
<f:radiobutton path="language" value="C#"/>C#
<f:radiobutton path="language" value="PHP"/>PHP
<br>
Choose Player :
<f:checkbox path="players" value="Messi"/>Messi
<f:checkbox path="players" value="Cr7"/>Cr7
<f:checkbox path="players" value="Salah"/>Salah

<br>
<input type="submit" value="Done">




</f:form>


</body>
</html>