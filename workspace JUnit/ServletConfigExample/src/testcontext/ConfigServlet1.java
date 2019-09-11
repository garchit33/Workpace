package testcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/ConfigServlet1")
public class ConfigServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext sc = getServletContext() ;
		Enumeration<String> e=sc.getInitParameterNames();  
//		out.println(scg.getInitParameter("email"));
		String str="";  
		while(e.hasMoreElements()){  
		    str=e.nextElement();  
		    out.print("<br> "+sc.getInitParameter(str));  
		}
		
	}

}
