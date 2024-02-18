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
<f:input path="fname"/>
<f:input path="lname"/>
<f:input path="age"/>
<input type="submit" value="Done"> 
</f:form>


</body>
</html>