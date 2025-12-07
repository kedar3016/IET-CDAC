<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>

<style>
    body {
        font-family: "Segoe UI", Arial, sans-serif;
        background: #f4f6f9;
        padding: 40px;
        margin: 0;
    }

    h2 {
        text-align: center;
        color: #333;
        margin-bottom: 25px;
        font-size: 28px;
    }

    table {
        width: 90%;
        margin: auto;
        border-collapse: collapse;
        background: white;
        border-radius: 12px;
        overflow: hidden;
        box-shadow: 0 4px 15px rgba(0,0,0,0.1);
    }

    th {
        background: #667eea;
        color: white;
        padding: 14px;
        text-transform: uppercase;
        font-size: 14px;
        letter-spacing: 0.5px;
    }

    td {
        padding: 12px;
        text-align: center;
        color: #333;
        font-size: 15px;
        border-bottom: 1px solid #eee;
    }

    tr:nth-child(even) {
        background: #f7f9fc;
    }

    tr:hover {
        background: #e1e9ff;
        transition: 0.3s ease;
    }
    a.edit-btn {
    background: #1d4ed8;
    color: white;
    padding: 8px 14px;
    border-radius: 6px;
    text-decoration: none;
    font-weight: 600;
    }

    a.edit-btn:hover {
    background: #1e40af;
   }

    /* Delete Button */
    a.delete-btn {
        background: #e63946;
        color: white;
        padding: 8px 14px;
        border-radius: 6px;
        text-decoration: none;
        font-weight: 600;
    }

    a.delete-btn:hover {
        background: #c81d25;
    }

    /* Add Button */
    .add-btn {
        display: block;
        width: fit-content;
        margin: 25px auto;
        padding: 12px 20px;
        background: #06d6a0;
        color: white;
        font-size: 16px;
        border-radius: 8px;
        text-decoration: none;
        font-weight: bold;
        box-shadow: 0 3px 10px rgba(0,0,0,0.1);
    }

    .add-btn:hover {
        background: #04b487;
    }
</style>

</head>
<body>

<h2>Product List</h2>

<table>
    <tr>
        <th>Product Id</th>
        <th>Product Name</th>
        <th>Quantity</th>
        <th>Price</th>
        <th>Mfg Date</th>
        <th>CID</th>
        <th>Action</th>
    </tr>

    <c:forEach var="prod" items="${plist}">
        <tr>
            <td>${prod.pid}</td>
            <td>${prod.pname}</td>
            <td>${prod.qty}</td>
            <td>${prod.price}</td>
            <td>${prod.mfgdate}</td>
            <td>${prod.cid}</td>
            <td>
                <a href="deleteproduct/${prod.pid}" class="delete-btn">Delete</a>/<a href="editproduct/${prod.pid}" class="edit-btn">edit</a>
            </td>
        </tr>
    </c:forEach>

</table>

<a href="addproduct" class="add-btn">➕ Add New Product</a>

</body>
</html>
