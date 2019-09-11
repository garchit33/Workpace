package servletconfig;

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


//@WebServlet("/ConfigServlet")
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig scg = getServletConfig() ;
		ServletContext sc1 = getServletContext();
		Enumeration<String> e=scg.getInitParameterNames();  
//		out.println(scg.getInitParameter("email"));
		String str="";  
		while(e.hasMoreElements()){  
		    str=e.nextElement();  
		    out.print("<br> "+scg.getInitParameter(str));  
		}
		out.println("<br>");
		out.println(sc1.getInitParameter("contact"));
//		Enumeration<String> e1=sc1.getInitParameterNames();  
////		out.println(scg.getInitParameter("email"));
//		String str1="";  
//		while(e1.hasMoreElements()){  
//		    str=e1.nextElement();  
//		    out.print("<br> "+sc1.getInitParameter(str1));  
//		}
		
	}

}
