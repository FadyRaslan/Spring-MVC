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
Country <f:select path="country" >
<f:option value="Egypt" label="EG"></f:option>
<f:option value="Brazel"label="BR"></f:option>
<f:option value="Germany" label="GE"></f:option>

</f:select>
<input type="submit" value="Done"> 
</f:form>


</body>
</html>