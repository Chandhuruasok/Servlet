package com.user.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
public static Connection getConnection() throws ClassNotFoundException, SQLException{
        
	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","Aspcfamily@1");
        
        return connection;
    }

}
