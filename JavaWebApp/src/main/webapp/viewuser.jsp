<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.user.util.JdbcUser" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="com.server.model.PojoNew" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
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
<h3>Registration Page</h3>
<form >
<table border="1">
<tr>
<td>User Name</td>
<td>Email</td>
<td>Phone Number</td>
<td>Action</td>
</tr>
    
     <tbody>
        <% 
        JdbcUser user=new JdbcUser();
        ArrayList<PojoNew> array = user.selectAllUsers();
      
           for (PojoNew pojo : array) {
        %>
        <tr>
            
            <td><%=pojo.getUserName() %></td>
            <td><%=pojo.getEmail() %></td>
            <td><%= pojo.getPhoneNumber() %></td>
            <td><form action="UserDetails" method="post">
                    <input type="hidden" name="action" value="delete"> 
                        <input type="hidden" name="deleteid" value="<%= pojo.getUserName() %>">
                    <!-- Pass user ID -->
                    <button type="submit" class="delete-btn">Delete</button>
                </form></td>

            
        </tr>
        <% 
            }
        
        %>
        
    </tbody>
</table>
</form>
</body>
</html>