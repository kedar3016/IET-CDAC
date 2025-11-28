<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="hello" uri="/mytaglib" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String fnm = "Kedar";
	String lnm = "Mane";
%>


	<h1>Hello,we are designing custom</h1>
<hello:myhellotag fname ="<%=fnm %>" lname="<%=lnm%>" > </hello:myhellotag>
<hello:myhellotag fname="${'Sachin'}" lname="${'Tendulkar'}" />
</body>

</html>