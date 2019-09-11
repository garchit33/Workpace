package TestSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialize {

	public static void main(String[] args) throws ClassNotFoundException   {
		// TODO Auto-generated method stub
		
		Book book = new Book(9876, "The ALCHEMIST", "PAULO COELHO", 350);
		
		try {
			FileOutputStream fo = new FileOutputStream("Book1.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			oos.writeObject(book);
			System.out.println("Book is successfully serialized...");
			//de serialization.
			FileInputStream fi = new FileInputStream("Book1.ser");
			ObjectInputStream ois = new ObjectInputStream(fi);
			Book myBook = (Book)ois.readObject();
			System.out.println("Book is successfully retrieved from serialized object....");
			System.out.println("After Serialization...\n"+myBook);
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
