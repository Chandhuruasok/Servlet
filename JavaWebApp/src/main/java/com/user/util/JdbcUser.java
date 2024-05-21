package com.user.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.server.model.PojoNew;

public class JdbcUser {
	public static void login(PojoNew p) throws ClassNotFoundException, SQLException
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=Util.getConnection();
		String query="insert into registration(user_name,user_email,user_phoneNo)values(?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,p.getUserName());
		ps.setString(2, p.getEmail());
		ps.setString(3,p.getPhoneNumber());
		ps.executeUpdate();
	}
}
