<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Product</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #9d50bb 0%, #6e48aa 100%);
        height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
    }

    .edit-container {
        background: rgba(255, 255, 255, 0.98);
        padding: 40px 50px;
        border-radius: 22px;
        box-shadow: 0 18px 35px rgba(0, 0, 0, 0.25);
        width: 420px;
        animation: fadeIn 0.8s ease-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(40px); }
        to   { opacity: 1; transform: translateY(0); }
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        font-size: 28px;
        color: #4a4a4a;
        text-shadow: 0px 2px 4px rgba(0,0,0,0.1);
    }

    label {
        margin-top: 12px;
        display: block;
        font-size: 15px;
        font-weight: 600;
        color: #444;
        margin-bottom: 5px;
    }

    input[type="text"], input[type="date"] {
        width: 100%;
        padding: 14px;
        font-size: 16px;
        border-radius: 12px;
        border: 2px solid #e2e8f0;
        background: #f8fafc;
        transition: 0.3s ease;
    }

    input[type="text"]:focus,
    input[type="date"]:focus {
        outline: none;
        border-color: #7f5af0;
        background: white;
        box-shadow: 0 0 0 4px rgba(127, 90, 240, 0.3);
        transform: scale(1.02);
    }

    button {
        margin-top: 25px;
        width: 100%;
        padding: 14px 30px;
        border: none;
        border-radius: 12px;
        background: linear-gradient(135deg, #7f5af0 0%, #6246ea 100%);
        color: white;
        font-size: 18px;
        font-weight: 600;
        cursor: pointer;
        transition: 0.3s ease;
        text-transform: uppercase;
        letter-spacing: 1px;
    }

    button:hover {
        transform: translateY(-4px);
        box-shadow: 0 15px 30px rgba(127, 90, 240, 0.4);
    }
</style>

</head>
<body>

<div class="edit-container">
    <h2>Edit Product</h2>

    <form action="/Spring_Product_Crud_Demo/product/updateproduct" method="post">

        <label>Product Id:</label>
        <input type="text" name="pid" id="pid" value="${prod.pid}" readonly>

        <label>Product Name:</label>
        <input type="text" name="pname" id="pname" value="${prod.pname}">

        <label>Product Qty:</label>
        <input type="text" name="qty" id="qty" value="${prod.qty}">

        <label>Product Price:</label>
        <input type="text" name="price" id="price" value="${prod.price}">

        <label>Product MFG Date:</label>
        <input type="date" name="mfgdate" id="mfgdate" value="${prod.mfgdate}">

        <label>Product CID:</label>
        <input type="text" name="cid" id="cid" value="${prod.cid}">

        <button type="submit" id="update" name="btn" value="update">
            Update Product
        </button>

    </form>
</div>

</body>
</html>
