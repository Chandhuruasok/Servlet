package com.server.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    System.out.println("get");
	    String name=request.getParameter("username");
	    String name1=request.getParameter("password");
	    PrintWriter out=response.getWriter();
	    out.println(name);
	    out.println(name1);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("post");
		int num1=Integer.parseInt(request.getParameter("number1"));
		int num2=Integer.parseInt(request.getParameter("number2"));
		String name=request.getParameter("username");
		String name1=request.getParameter("email");
		String name2=request.getParameter("password");
		String name3=request.getParameter("confirm-password");
		PrintWriter out=response.getWriter();
		out.println(num1+num2);
		out.println(name);
		out.println(name1);
		out.println(name2);
		out.println(name3);
	}

}
