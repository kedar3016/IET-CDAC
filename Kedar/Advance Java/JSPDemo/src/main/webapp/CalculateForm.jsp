<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>

<%@include file = "MyHeader.html" %>
<form action="getresult.jsp">
num1 : <input type = "text" name = "num1"><br>
num2 : <input type = "text" name = "num2"><br>

<button type = "submit" name = "btn" value = "add">Addition</button>
<button type = "submit" name = "btn" value = "fact">Factorial</button>


</form>
<%@include file = "MyFooter.html" %>
</body>
</html>