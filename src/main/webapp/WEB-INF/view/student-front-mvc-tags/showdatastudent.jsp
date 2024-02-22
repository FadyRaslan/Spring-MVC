<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   <!-- allow to use c: to use for each loop  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>

 <p>FirstName : ${student.fname }</p>
 <p>LastName : ${student.lname }</p>
 <p>Age : ${student.age }</p>
 <p>Email : ${student.email }</p>
 <p>Country : ${student.country }</p>
 <p>Language : ${student.language }</p>
 
 
  <p>Players :
  
  <c:forEach var="pl" items="${student.players}">
		${pl}
	</c:forEach>
   
   
   </p>
 
</body>
</html>