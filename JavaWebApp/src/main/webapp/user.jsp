<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>
</head>
<body>
<form action="UserDetails" method="post">
<label for="username">Full Name:</label>
                <input type="text" id="username" name="username" placeholder="Enter the user name" required><br>
<label for="email">Email:</label>
                <input type="email" id="email" name="email" placeholder="Enter the email id" required><br>
<label for="phone number">Phone Number:</label>
                <input type="number" id="phonenumber" name="phonenumber" placeholder="Enter the phone number" required><br>              
<button type="submit">Register</button>
</form>
</body>
</html>