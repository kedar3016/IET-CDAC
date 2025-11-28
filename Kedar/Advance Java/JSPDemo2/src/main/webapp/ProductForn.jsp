<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Entry</title>
</head>
<body>
<form action = "getProduct.jsp">
Product Id : <input type = "text" id = "pid" name = "pid"><br>
Product Name : <input type = "text" id = "pname" name = "pname"><br>
Product Qty : <input type = "text" id = "qty" name = "qty"><br>
Product Price : <input type = "text" id = "price" name = "price"><br>

<button type = "submit" name = "btn" id = "btn">Add Product</button>

</form>

</body>
</html>