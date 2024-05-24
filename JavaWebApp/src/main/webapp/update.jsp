<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.server.main.UserDetails" %>
    <%@ page import="com.server.main.UserDetails1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
<style>
table {
    border-collapse: collapse;
    width: 100%;
    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
    transition: 0.3s;
}

table th, table td {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

table th {
    background-color: #f2f2f2;
}

table tr:nth-child(even) {
    background-color: #f2f2f2;
}

table tr:hover {
    background-color: #ddd;
}

/* Update button */
.update-btn {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 8px 12px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 14px;
    margin: 2px 2px;
    transition-duration: 0.4s;
    cursor: pointer;
    border-radius: 4px;
}

.update-btn:hover {
    background-color: #45a049;
}

/* Delete button */
.delete-btn {
    background-color: #f44336; /* Red */
    border: none;
    color: white;
    padding: 8px 12px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 14px;
    margin: 2px 2px;
    transition-duration: 0.4s;
    cursor: pointer;
    border-radius: 4px;
}

.delete-btn:hover {
    background-color: #d32f2f;
}

/* Text box hover effect */
input[type=text]:hover, input[type=password]:hover {
    border: 1px solid #4CAF50; /* Green */
}

/* Text box focus effect */
input[type=text]:focus, input[type=password]:focus {
    border: 1px solid #4CAF50; /* Green */
    outline: none;
}
</style>
</head>
<body>
<h2>Registration Form</h2>
<form action="UserDetails1" method="post">
<div class="container" >
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
</div>
<input type="hidden" name="action" value="update">
        <input type="hidden" name="updateid" value="<%= request.getParameter("updateid") %>">
        <button type="submit">Update</button>
        

</form>


</body>
</html>