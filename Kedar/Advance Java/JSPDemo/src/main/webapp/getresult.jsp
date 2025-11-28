<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--This is a Jsp Page --%>

<%!
	public int factorial(int n){
	int fact = 1;
	
	for(int i = 1;i<=n;i++){
		fact*=i;
		
	}
	return fact;
		
}
	%>

<%
	String btn = request.getParameter("btn");
	int n1 = Integer.parseInt(request.getParameter("num1"));
	
	switch(btn){
			case "add" : {
						int n2 = Integer.parseInt(request.getParameter("num2"));
						int ans = n1+n2;
						%><h2>Addition : <%=ans%></h2>
						<% 
						break;
			}
			
			case "fact" :{
				int fact = factorial(n1);%>
					<h2>Factorial : <%= fact %></h2><%
					break;
			}
			

		} %>

</body>
</html>