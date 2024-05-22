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
	RequestDispatcher dispatcher=request.getRequestDispatcher("viewuser.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
		String userName=request.getParameter("user_name");
		String email=request.getParameter("user_email");
		String phoneNumber=request.getParameter("user_phoneNo");
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
	//request.getRequestDispatcher("user.jsp").forward(request, response);
		
		
RequestDispatcher dispatcher= request.getRequestDispatcher("user.jsp");	
		String action=request.getParameter("action");
		if(action!=null)
		{
		switch (action) {
        case "delete":
            try {
                
                JdbcUser user=new JdbcUser();
                user.deleteUser("deleteid");
            } catch (NumberFormatException | ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                
            }
            try {
            request.setAttribute("viewing", user.selectAllusers());
            }
            catch (NumberFormatException | ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                
            }
            request.getRequestDispatcher("viewuser.jsp").forward(request, response);
            break;
		}
           
    }
}
}	
	



