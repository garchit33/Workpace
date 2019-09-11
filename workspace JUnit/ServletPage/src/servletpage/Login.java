package servletpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if(uname.equals("Archit"))
		{
			if(pwd.equals("login")) 
			{
				//out.println("Success");
				RequestDispatcher rd = request.getRequestDispatcher("/TestContext");
				rd.forward(request, response);
			}
			else
			{
				out.println("Please Enter Correct Password!!");
			}
		}
		else {
			out.println("<b>Sorry! Please Enter correct User Name and Password..</b>");
			out.println("<br>");
			out.println("<br>");
//			response.sendRedirect("http://www.google.com");
			RequestDispatcher rd = request.getRequestDispatcher("/form2.html");
			rd.include(request, response);
		
		}
		
		
	}

}

