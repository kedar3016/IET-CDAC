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
        align-items: center;
        justify-content: center;
        color: #333;
    }

    /* Center Card */
    form {
        background: rgba(255, 255, 255, 0.97);
        padding: 40px 50px;
        border-radius: 20px;
        box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
        text-align: center;
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
        font-size: 28px;
        font-weight: bold;
        color: #4a5568;
        margin-bottom: 30px;
        text-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    /* Labels (generated automatically) */
    form > input[type="text"]::placeholder {
        color: #a0aec0;
    }
    
    label {
    display: block;
    margin-bottom: 8px;
    font-weight: 600;
    font-size: 16px;
    color: #2d3748;                    /* Dark gray - professional */
    letter-spacing: 0.5px;
    text-align: left;
    transition: all 0.3s ease;
}

	input{
	
		border: 2px solid #4361ee;
	}

    /* Inputs */
    input[type="text"] {
        width: 100%;
        padding: 14px 16px;
        margin: 12px 0;
        border: 2px solid #e2e8f0;
        border-radius: 12px;
        font-size: 16px;
        background: #f8fafc;
        transition: all 0.3s ease;
    }

    input[type="text"]:focus {
        outline: none;
        border-color: #667eea;
        background: white;
        box-shadow: 0 0 0 4px rgba(102, 126, 234, 0.2);
        transform: scale(1.02);
    }

    /* Button */
    button[type="submit"] {
        margin-top: 20px;
        padding: 14px 30px;
        width: 100%;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        color: white;
        border: none;
        border-radius: 12px;
        font-size: 18px;
        font-weight: 600;
        cursor: pointer;
        transition: all 0.3s ease;
        text-transform: uppercase;
        letter-spacing: 1px;
    }

    button[type="submit"]:hover {
        transform: translateY(-4px);
        box-shadow: 0 15px 30px rgba(102, 126, 234, 0.4);
    }

    button[type="submit"]:active {
        transform: translateY(-1px);
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

<h3>${message}</h3>

<form action="/Spring_Product_Crud_MVC/login/validate" method = "post">
<label>User Name :</label> <input type = "text" name = "uname">
<label>Password :</label>  <input type = "text" name = "pass">
<button type = "submit" name = "btn"> Login</button>

</form>

</body>
</html>