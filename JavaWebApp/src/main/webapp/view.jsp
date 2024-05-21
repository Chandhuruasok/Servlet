<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.server.model.PojoClass" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Title</title>
</head>
<body>
<form >
<table border="1">
<tr>
<td>FirstName</td>
<td>Email</td>
<td>Password</td>
<td>Confirm Password</td>
<td>DateOfBirth</td>
<td>PhoneNumber</td>
<td>Gender</td>
<td>Food</td>
</tr>
    
     <tbody>
        <% 
        ArrayList<PojoClass> array = (ArrayList<PojoClass>) request.getAttribute("array");
        if (array != null) {
            for (PojoClass pojo : array) {
        %>
        <tr>
            
            <td><%=pojo.getUserName() %></td>
            <td><%=pojo.getEmail() %></td>
            <td><%= pojo.getPassword() %></td>
            <td><%= pojo.getConfirmPassword() %></td>
            <td><%= pojo.getDob() %></td>
            <td><%= pojo.getPhoneNumber() %></td>
            <td><%= pojo.getGender() %></td>
            <td><%= pojo.getFood() %></td>
        </tr>
        <% 
            }
        } else {
        %>
        <tr>
            <td colspan="5">No</td>
        </tr>
        <% } %>
    </tbody>
</table>
</form>
</body>
</html>