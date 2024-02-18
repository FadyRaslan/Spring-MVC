<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
        <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>

<f:form action="processmvctags" modelAttribute="student">
FirstName <f:input path="fname"/>
LastName <f:input path="lname"/>
Age <f:input path="age"/>
Country <f:select path="country">       <!--defined into Student file   --> 
<f:options items="${student.countryOptions}"/>
</f:select>
<input type="submit" value="Done"> 
</f:form>


</body>
</html>