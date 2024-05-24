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
		 
		Connection connection=Util.getConnection();
		String query="insert into login(username,useremail,userphoneNo,id)values(?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setString(1,p.getUserName());
		ps.setString(2, p.getEmail());
		ps.setString(3,p.getPhoneNumber());
		ps.setInt(4, p.getId());
		ps.executeUpdate();
	}
public void deleteUser(int id) throws ClassNotFoundException, SQLException {
        
        
        Connection connection = Util.getConnection();
        String delete = "delete from login where id=?";
        PreparedStatement prepareStatement = connection.prepareStatement(delete);
        prepareStatement.setInt(1,id);
        int row = prepareStatement.executeUpdate();
        System.out.println("deleted row :"+row);
           
       
   }
public void updateUser(PojoNew pojo) throws ClassNotFoundException, SQLException
{
	 
	Connection connection=Util.getConnection();
	String query="update login set username=?,useremail=?,userphoneNo=? where id=?";
	PreparedStatement ps=connection.prepareStatement(query);
	ps.setString(1,pojo.getUserName());
	ps.setString(2, pojo.getEmail());
	ps.setString(3,pojo.getPhoneNumber());
	ps.setInt(4, pojo.getId());
	ps.executeUpdate();
}
public void search(int id) throws ClassNotFoundException, SQLException
{
	Connection connection=Util.getConnection();
	String query="select username,useremail,userphoneNo from login where id like=?";
	PreparedStatement ps=connection.prepareStatement(query);
	
	ps.setInt(1, "%"+id+"%");
	ps.executeQuery();
}
	public  ArrayList<PojoNew>  selectAllUsers() throws ClassNotFoundException, SQLException
	{
		ArrayList<PojoNew>viewuser=new ArrayList<PojoNew>();
		Connection connection=Util.getConnection();
		String query="select * from login";
		PreparedStatement ps=connection.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			
			String name=rs.getString("username");
			String email=rs.getString("useremail");
			String phone=rs.getString("userphoneNo");
			int id=rs.getInt("id");
			
			viewuser.add(new PojoNew(name,email,phone,id));
		}
		return viewuser;
		
		
	}
	@Override
	public ArrayList<PojoNew> selectAllusers() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	public ArrayList<PojoNew> selectAllusers() throws ClassNotFoundException, SQLException {
//		// TODO Auto-generated method stub
//		return null;
//	}
	 
}
