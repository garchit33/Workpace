package com.includeTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ForwardController")
public class ForwardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<b>Welcome to Forward Controller Second Servlet</b>");
		out.println("<b>User Name is : "+user+"</b>");
		out.println("<br>");
		out.println("<br>");
		out.println("<br>");
		
		RequestDispatcher dis = request.getRequestDispatcher("/TestController");
		dis.forward(request, response);
	}

}
