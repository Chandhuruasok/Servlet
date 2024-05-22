package com.user.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.server.dao.UserDAO;
import com.server.model.PojoNew;

public class JdbcUser implements UserDAO {
	public static void login(PojoNew p) throws ClassNotFoundException, SQLException
	{
		 //System.out.println(p.getUserName());
		Connection connection=Util.getConnection();
		String query="insert into registration(user_name,user_email,user_phoneNo)values(?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,p.getUserName());
		ps.setString(2, p.getEmail());
		ps.setString(3,p.getPhoneNumber());
		ps.executeUpdate();
	}
public void deleteUser(String name) throws ClassNotFoundException, SQLException {
        
        
        Connection connection = Util.getConnection();
        String delete = "delete from registration where name=?";
        PreparedStatement prepareStatement = connection.prepareStatement(delete);
        int row = prepareStatement.executeUpdate();
        System.out.println("deleted row :"+row);
           
       
   }
	public  ArrayList<PojoNew>  selectAllUsers() throws ClassNotFoundException, SQLException
	{
		ArrayList<PojoNew>viewuser=new ArrayList<PojoNew>();
		Connection connection=Util.getConnection();
		String query="select * from registration";
		PreparedStatement ps=connection.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			
			String name=rs.getString("user_name");
			String email=rs.getString("user_email");
			String phone=rs.getString("user_phoneNo");
			viewuser.add(new PojoNew(name,email,phone));
		}
		return viewuser;
		
		
	}
	
	@Override
	public ArrayList<PojoNew> selectAllusers() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
