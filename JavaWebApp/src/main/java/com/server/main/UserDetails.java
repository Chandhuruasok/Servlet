package com.server.main;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.server.model.PojoNew;
import com.user.util.JdbcUser;

/**
 * Servlet implementation class UserDetails
 */
@WebServlet("/UserDetails")
public class UserDetails extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	PojoNew pojo=new PojoNew();
	JdbcUser user=new JdbcUser();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher=request.getRequestDispatcher("user.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PojoNew pojo=new PojoNew();
		String userName=request.getParameter("username");
		String email=request.getParameter("email");
		String phoneNumber=request.getParameter("phonenumber");
		pojo.setUserName(userName);
		pojo.setEmail(email);
		pojo.setPhoneNumber(phoneNumber);
		try
		{
			try
			{
			   user.login(pojo);
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}catch(SQLException s)
			{
				s.printStackTrace();
			}
		
		
		
RequestDispatcher dispatcher= request.getRequestDispatcher("user.jsp");	

	}
	}	
	



