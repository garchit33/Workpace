package PropertiesClassTest;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {

	public static void main(String args[]) {
		
		Properties prop = System.getProperties();
		Enumeration propNames = prop.propertyNames();
		
		while(propNames.hasMoreElements()) {
			
			String propName = (String) propNames.nextElement();
			String property = prop.getProperty(propName);
			System.out.println("property '"+ propName + "' is '"+ property + "'");
		}
		
	}
}
