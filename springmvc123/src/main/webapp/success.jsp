<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Form</title>
</head>
<body>
<table border="2">
<tr>
<th>RollNo</th>
<th>UserName</th>
<th>Password</th>
<th>Name</th>
<th>MobileNo</th>
<th>EmailId</th>
</tr>

<c:forEach items="${data}" var="stu">
<tr>
<td>${stu.rollno}</td>
<td>${stu.uname}</td>
<td>${stu.pass}</td>
<td>${stu.name}</td>
<td>${stu.mobile}</td>
<td>${stu.emailid}</td>
</tr>


</c:forEach>

</table>
</body>
</html>