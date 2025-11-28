<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Product</title>
</head>
<body>
<%
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		int qty = Integer.parseInt(request.getParameter("qty"));
		double price = Double.parseDouble(request.getParameter("price"));
		
		

%>
<jsp:useBean id="p" class="com.demo.beans.Product"></jsp:useBean>
<jsp:setProperty property="*" name="p"/>

<%--
<jsp:setProperty name="p" property="pid" value='<%=request.getParameter("pid") %>'> </jsp:setProperty>
<jsp:setProperty name="p" property="pname" value='<%=request.getParameter("pname") %>'> </jsp:setProperty>
<jsp:setProperty name="p" property="qty" value="<%=request.getParameter("qty") %>"> </jsp:setProperty>
<jsp:setProperty name="p" property="price" value="<%=request.getParameter("price") %>"> </jsp:setProperty>
 --%>
<h2>Product Data</h2>
Product Id : <jsp:getProperty property="pid" name="p"/><br>
Product Name : <jsp:getProperty property="pname" name="p"/><br>
Product Qty : <jsp:getProperty property="qty" name="p"/><br>
Product Price : <jsp:getProperty property="price" name="p"/>

</body>
</html>