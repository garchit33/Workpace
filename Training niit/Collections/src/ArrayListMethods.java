import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String args[]) {
		
		List<String> topCompanies = new ArrayList<>();
		System.out.println("Is Top Companies Empty? :"+ topCompanies.isEmpty());
		topCompanies.add("Google");
		topCompanies.add("Amazon");
		topCompanies.add("Alibaba");
		topCompanies.add("Facebook");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		System.out.println("Here are the top"+topCompanies.size()+"Companies in the world"+topCompanies);
		System.out.println("Top 1st Comapny : "+topCompanies.get(0));
		System.out.println("Second Comapny : "+topCompanies.get(1));
		System.out.println("Last Comapny : "+topCompanies.get(topCompanies.size()-1));
		System.out.println("Does List of Top Companies contain \"Whatsapp\"? : "+topCompanies.contains("Whatsapp"));
		System.out.println("Does List of Top Companies contain \"Facebook\"? : "+topCompanies.contains("Facebook"));
		System.out.println("Facebook is at the Index : "+topCompanies.indexOf("Facebook"));
		System.out.println("Last Index of Amazon is : "+topCompanies.lastIndexOf("Amazon"));
		
	}
}
