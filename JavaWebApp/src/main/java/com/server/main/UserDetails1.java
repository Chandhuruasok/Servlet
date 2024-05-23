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
 * Servlet implementation class UserDetails1
 */
@WebServlet("/UserDetails1")
public class UserDetails1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PojoNew pojo=new PojoNew();
	JdbcUser user=new JdbcUser();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetails1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String action=request.getParameter("action");
		String userName=request.getParameter("username");
		System.out.println(userName);
		String email=request.getParameter("useremail");
		String phoneNumber=request.getParameter("userphoneNo");
		System.out.println(request.getParameter("id"));
		int id=Integer.parseInt(request.getParameter("id"));
		pojo.setUserName(userName);
		pojo.setEmail(email);
		pojo.setPhoneNumber(phoneNumber);
		pojo.setId(id);
		
		System.out.println(action);
		if(action!=null)
		{
		switch (action) {
        
		
        case "update":
        	
        		JdbcUser user=new JdbcUser();
        		int id1 = Integer.parseInt(request.getParameter("updateid"));
        		pojo.setId(id1);
        		pojo.setUserName(userName);
                pojo.setEmail(email);
                pojo.setPhoneNumber(phoneNumber);
                
                
                
                try {
                
                user.updateUser(pojo);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                
            } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	RequestDispatcher dispatcher1=request.getRequestDispatcher("viewuser.jsp");
    		dispatcher1.forward(request, response);
    		
		
	}
		
		}
	}

}
