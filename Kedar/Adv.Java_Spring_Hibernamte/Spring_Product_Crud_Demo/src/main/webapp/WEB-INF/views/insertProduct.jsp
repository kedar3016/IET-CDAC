<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
        color: #333;
    }

    .form-container {
        background: rgba(255, 255, 255, 0.97);
        padding: 40px 50px;
        border-radius: 20px;
        box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
        min-width: 420px;
        animation: fadeIn 0.8s ease-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(30px); }
        to   { opacity: 1; transform: translateY(0); }
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #4a5568;
        font-size: 28px;
        text-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    label {
        font-size: 15px;
        font-weight: 600;
        display: block;
        margin-top: 12px;
        color: #4a5568;
    }

    input[type="text"], input[type="date"] {
        width: 100%;
        padding: 14px 16px;
        margin-top: 6px;
        border: 2px solid #e2e8f0;
        border-radius: 12px;
        font-size: 16px;
        background: #f8fafc;
        transition: 0.3s ease;
    }

    input:focus {
        outline: none;
        border-color: #667eea;
        background: #fff;
        box-shadow: 0 0 0 4px rgba(102, 126, 234, 0.2);
        transform: scale(1.02);
    }

    button {
        margin-top: 25px;
        width: 100%;
        padding: 14px;
        border: none;
        border-radius: 12px;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
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
        box-shadow: 0 15px 30px rgba(102,126,234,0.4);
    }
</style>

</head>
<body>

<div class="form-container">
    <h2>Add New Product</h2>

    <form action="insertProduct" method="post">

        <label for="pid">Product Id:</label>
        <input type="text" name="pid" id="pid">

        <label for="pname">Product Name:</label>
        <input type="text" name="pname" id="pname">

        <label for="qty">Product Qty:</label>
        <input type="text" name="qty" id="qty">

        <label for="price">Product Price:</label>
        <input type="text" name="price" id="price">

        <label for="mfgdate">Product MFG Date:</label>
        <input type="date" name="mfgdate" id="mfgdate">

        <label for="cid">Product Category ID (cid):</label>
        <input type="text" name="cid" id="cid">

        <button type="submit" id="insert">Add Product</button>

    </form>
</div>

</body>
</html>
