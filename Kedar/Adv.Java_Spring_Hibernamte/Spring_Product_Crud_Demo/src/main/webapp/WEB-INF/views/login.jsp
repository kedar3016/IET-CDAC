<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<style>
    /* Full Background */
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        height: 100vh;
        display: flex;
        flex-direction: column; /* Added to allow message above form */
        align-items: center;
        justify-content: center;
        color: #333;
    }

    /* Styled H2 Message */
    h2 {
        color: #ffe4e6;
        background: rgba(0, 0, 0, 0.2);
        padding: 12px 25px;
        border-radius: 10px;
        font-size: 20px;
        font-weight: 600;
        margin-bottom: 20px;
        text-align: center;
        min-width: 300px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.3);
        animation: fadeInMsg 0.8s ease-out;
    }

    @keyframes fadeInMsg {
        from { opacity: 0; transform: translateY(-20px); }
        to   { opacity: 1; transform: translateY(0); }
    }

    /* Center Card */
    form {
        background: rgba(255, 255, 255, 0.97);
        padding: 40px 50px;
        border-radius: 20px;
        box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
        text-align: left;
        min-width: 360px;
        animation: fadeIn 0.8s ease-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(30px); }
        to   { opacity: 1; transform: translateY(0); }
    }

    /* Title */
    form::before {
        content: "Login Portal";
        display: block;
        text-align: center;
        font-size: 28px;
        font-weight: bold;
        color: #4a5568;
        margin-bottom: 30px;
        text-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    /* Label Style */
    label {
        font-size: 15px;
        font-weight: 600;
        color: #4a5568;
        display: block;
        margin-top: 12px;
        margin-bottom: 6px;
        letter-spacing: 0.3px;
    }

    /* Inputs */
    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 14px 16px;
        border: 2px solid #e2e8f0;
        border-radius: 12px;
        font-size: 16px;
        background: #f8fafc;
        transition: all 0.3s ease;
    }

    input[type="text"]:focus,
    input[type="password"]:focus {
        outline: none;
        border-color: #667eea;
        background: #fff;
        box-shadow: 0 0 0 4px rgba(102, 126, 234, 0.2);
        transform: scale(1.02);
    }

    /* Button */
    button[type="submit"] {
        margin-top: 25px;
        padding: 14px 30px;
        width: 100%;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        color: white;
        border: none;
        border-radius: 12px;
        font-size: 18px;
        font-weight: 600;
        cursor: pointer;
        transition: 0.3s ease;
        text-transform: uppercase;
        letter-spacing: 1px;
    }

    button[type="submit"]:hover {
        transform: translateY(-4px);
        box-shadow: 0 15px 30px rgba(102, 126, 234, 0.4);
    }

    /* Responsive */
    @media (max-width: 480px) {
        form {
            padding: 30px 25px;
            min-width: 300px;
        }
    }
</style>

</head>
<body>

<h2>${msg}</h2>

<form action="/Spring_Product_Crud_Demo/login/validateUser" method="post">

    <label for="uname">User Name :</label>
    <input type="text" id="uname" name="uname" placeholder="Enter username">

    <label for="pass">Password :</label>
    <input type="password" id="pass" name="pass" placeholder="Enter password">

    <button type="submit" id="btn" name="login">Login</button>

</form>

</body>
</html>
