package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException{
		super.init();
		System.out.println("inside init Method");
	}
   
    public LifeCycleServlet() {
        System.out.println("Creating object of lifeCycle Servlet..");
        // TODO Auto-generated constructor stub
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("LifeCycle Servlet get called....");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<b>LifeCycle Servlet get called here...");
		out.println("Refresh Page to check the LifeCycle Method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
	
	public void destroy() {
		super.destroy();
		System.out.println("Destroying....");
	}

}
