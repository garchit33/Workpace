package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletExample")
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest req,HttpServletResponse res) {
    	
    	System.out.println("Get Method Called..");
    }
    
//  protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
//	  
//	  PrintWriter out = res.getWriter();
//	  res.setContentType("text/html");
//	  
//	  String name = req.getParameter("name");
//	  out.println("<html>");
//	  out.println("<head>");
//	  out.println("<title>");
//	  out.println("Welcome Page");
//	  out.println("</title>");
//	  out.println("</head>");
//	  out.println("<body>");
//	  out.println("<h1>Welcome"+" "+name+"</h1>");
//	  out.println("</body>");
//	  out.println("<html>");
//	  
//    	
//
//    }
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	  
	  PrintWriter out = res.getWriter();
	  res.setContentType("text/html");
	  
	  int num1 = Integer.parseInt(req.getParameter("num1"));
	  int num2 = Integer.parseInt(req.getParameter("num2"));
	  int result = num1+num2;
	  out.println("<html>");
	  out.println("<head>");
	  out.println("<title>");
	  out.println("Addition");
	  out.println("</title>");
	  out.println("</head>");
	  out.println("<body>");
	  out.println("<h1>Addition of Two Numbers is :"+" "+result+"</h1>");
	  out.println("</body>");
	  out.println("<html>");
	  
    	

    }
}
