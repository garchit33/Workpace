package servletpage;

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


//@WebServlet("/TestContext")
public class TestContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<b>Details of the User :</b><br>");
		ServletContext scn = getServletContext() ;
		out.println("<br>");
		Enumeration<String> e=scn.getInitParameterNames();
		out.println("<b>Name : </b>"+scn.getInitParameter("username")+"<br>");
		out.println("<b>Email ID : </b>"+scn.getInitParameter("email")+"<br>");
		out.println("<b>Contact Number : </b>"+scn.getInitParameter("contact"));
//		String str="";  
//		while(e.hasMoreElements()){  
//		    str=e.nextElement();   
//		    out.print("<br> "+scn.getInitParameter(str));  
//		}
		
	

}
}
