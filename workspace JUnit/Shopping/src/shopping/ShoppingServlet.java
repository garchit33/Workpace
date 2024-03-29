package shopping;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShoppingServlet")
public class ShoppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static ArrayList<ProductPojo> al = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String invoice = request.getParameter("gen_invoice");
		if(invoice!=null) {
			out.println(generate_Invoice.generateInvoice(al));
			return;
		}
		String prod_name = request.getParameter("prod_name").toLowerCase();

		RequestDispatcher rd = request.getRequestDispatcher("productdisp.html");
		int price = 0;
		switch(prod_name) {
		case "soap":
			price = 50;
			break;
		case "shampoo":
			price = 120;
			break;
		case "toothbrush":
			price = 50;
			break;
		case "hair oil":
			price = 65;
			break;
		default:
			out.println("Product is not available<br><br><br><br>");
			rd.include(request, response);
			return;
		}
		ProductPojo pj = new ProductPojo(prod_name, price);
		if(al.contains(pj)) {
			int index = al.indexOf(pj);
			pj = al.get(index);
			pj.setQuantity(pj.getQuantity()+1);
			rd.forward(request, response);
		}
		else
			al.add(pj);
		out.println("<marquee direction='left'><b><i>"+prod_name+" added to cart</marquee></b><i>");
		rd.include(request, response);
	}

}
