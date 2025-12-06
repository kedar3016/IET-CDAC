<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<style>
    /* Full-screen gradient background */
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        height: 100vh;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        color: white;
        text-align: center;
        overflow: hidden;
    }

    /* Big beautiful title (added via CSS only) */
    body::before {
        content: "Welcome to Product CRUD System";
        display: block;
        font-size: 42px;
        font-weight: bold;
        margin-bottom: 50px;
        text-shadow: 0 4px 15px rgba(0,0,0,0.4);
        letter-spacing: 1.5px;
        animation: fadeInDown 1s ease-out;
    }

    /* Style the two links as big beautiful buttons */
    a {
        display: inline-block;
        margin: 20px;
        padding: 20px 45px;
        background: rgba(255, 255, 255, 0.2);
        color: white;
        font-size: 22px;
        font-weight: 600;
        text-decoration: none;
        border-radius: 50px;
        border: 3px solid rgba(255, 255, 255, 0.4);
        backdrop-filter: blur(10px);
        box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
        transition: all 0.4s ease;
        min-width: 280px;
    }

    /* Hover effect - modern glassmorphism style */
    a:hover {
        background: rgba(255, 255, 255, 0.35);
        transform: translateY(-10px) scale(1.05);
        box-shadow: 0 20px 40px rgba(0, 0, 0, 0.4);
        border-color: white;
    }

    a:active {
        transform: translateY(-5px);
    }

    /* First link (Register) - slight color variation */
    a[href="register"] {
        background: rgba(74, 211, 155, 0.3);
        border-color: rgba(74, 211, 155, 0.6);
    }
    a[href="register"]:hover {
        background: rgba(74, 211, 155, 0.5);
    }

    /* Second link (Login) - slight color variation */
    a[href="login/loginuser"] {
        background: rgba(255, 159, 67, 0.3);
        border-color: rgba(255, 159, 67, 0.6);
    }
    a[href="login/loginuser"]:hover {
        background: rgba(255, 159, 67, 0.5);
    }

    /* Subtle animations */
    @keyframes fadeInDown {
        from { opacity: 0; transform: translateY(-40px); }
        to   { opacity: 1; transform: translateY(0); }
    }

    /* Responsive for mobile */
    @media (max-width: 600px) {
        body::before { font-size: 32px; margin-bottom: 40px; }
        a { 
            padding: 18px 30px; 
            font-size: 20px; 
            min-width: 250px; 
            display: block;
            margin: 15px auto;
        }
    }
</style>

</head>
<body>

<a href="register">Register</a>
<a href="login/loginuser">Login to the system</a>

</body>
</html>