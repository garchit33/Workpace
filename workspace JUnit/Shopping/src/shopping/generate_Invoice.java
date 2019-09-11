package shopping;

import java.util.ArrayList;

public class generate_Invoice {
	public static String generateInvoice(ArrayList<ProductPojo> al) {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("%s %s %s<br>", "Produt Name","Quantity","Price"));
		double total = 0;
		for(ProductPojo p:al) {
			double price = p.getPrice();
			int qty = p.getQuantity();
			total = total + qty*price;
			sb.append(String.format("%s %s %s<br>", p.getProductName(),qty,price));
		}
		sb.append(String.format("%s : %s", "Total",total));
		ShoppingServlet.al.clear();
		return String.valueOf(sb);
		
	}
}
