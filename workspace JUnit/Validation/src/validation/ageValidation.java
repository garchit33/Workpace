package validation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ageValidation")
public class ageValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		int a = Integer.parseInt(request.getParameter("age"));
		PrintWriter out = response.getWriter();
		if(a>=18) {
			
			RequestDispatcher rd = request.getRequestDispatcher("/validate");
			rd.forward(request, response);
		}
		else
		{
			
			out.println("You are not Eligible");
			out.println("<br>");
			out.println("Please Enter Valid age..");
			RequestDispatcher rd = request.getRequestDispatcher("age.html");
			rd.include(request, response);
		}
	}

}
