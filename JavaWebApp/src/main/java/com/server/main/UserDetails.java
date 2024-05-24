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
		String action=request.getParameter("action");
		System.out.println(action);
		if(action!=null)
		{
		switch (action) {
        case "delete":
        	int deleteNo=Integer.parseInt(request.getParameter("deleteid"));
            try {
                
                JdbcUser user=new JdbcUser();
                
                user.deleteUser(deleteNo);
            } catch (NumberFormatException | ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                
            }
	RequestDispatcher dispatcher=request.getRequestDispatcher("viewuser.jsp");
		dispatcher.forward(request, response);
		break;
        case "search":
        	int searchNo=Integer.parseInt(request.getParameter("searchid"));
        	System.out.println(searchNo);
        	try {
                
                
                
                user.search(searchNo);
            } catch (NumberFormatException | ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        	RequestDispatcher dispatcher3=request.getRequestDispatcher("viewuser.jsp");
    		dispatcher3.forward(request, response);
//        case "update":
//        	
//        		JdbcUser user=new JdbcUser();
//        		int id = Integer.parseInt(request.getParameter("updateid"));
//        		pojo.setId(id);
//        		pojo.setUserName(request.getParameter("username"));
//                pojo.setEmail(request.getParameter("useremail"));
//                pojo.setPhoneNumber(request.getParameter("userphoneNo"));
//                
//                
//                
//                try {
//                
//                user.updateUser(pojo);
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//                
//            } catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        	RequestDispatcher dispatcher1=request.getRequestDispatcher("viewuser.jsp");
//    		dispatcher1.forward(request, response);
//    		
//		
	}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request,response);
		String userName=request.getParameter("username");

		String email=request.getParameter("useremail");
		String phoneNumber=request.getParameter("userphoneNo");
		int id=Integer.parseInt(request.getParameter("id"));
		pojo.setUserName(userName);
		pojo.setEmail(email);
		pojo.setPhoneNumber(phoneNumber);
		pojo.setId(id);
		
			try
			{
			   user.login(pojo);
			   //RequestDispatcher dispatcher= request.getRequestDispatcher("user.jsp");
			}
			catch(ClassNotFoundException | SQLException e)
			{
				e.printStackTrace();
			}
	
            request.getRequestDispatcher("viewuser.jsp").forward(request, response);
            
		}
           
  
}
	
	



