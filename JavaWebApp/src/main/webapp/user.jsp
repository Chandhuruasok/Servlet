<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 100%;
        max-width: 400px;
        margin: 100px auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h2 {
        text-align: center;
    }
    .input-group {
        margin-bottom: 20px;
    }
    .input-group input {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }
    .input-group label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }
    .btn {
        width: 100%;
        padding: 10px;
        background-color: #007bff;
        border: none;
        border-radius: 4px;
        color: #fff;
        cursor: pointer;
    }
    .btn:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<h2>Registration Form</h2>
<div class="container" >
<form action="UserDetails" method="post">
<div class="input-group">
				<label for="username">User Name:</label>
                <input type="text" id="username" name="username" placeholder="Enter the user name" required><br>
        </div>
        <div class="input-group">
        	<label for="email">Email:</label>
         	<input type="email" id="email" name="useremail" placeholder="Enter the email id" required><br>
         </div>
         <div class="input-group">
<label for="phone number">Phone Number:</label>
                <input type="number" id="phonenumber" name="userphoneNo" placeholder="Enter the phone number" required><br>              
<label for="id">Id:</label>
                <input type="number" id="id" name="id" placeholder="Enter the Id" required><br>
</div>
<button type="submit">Register</button>
</form>
</body>
</html>