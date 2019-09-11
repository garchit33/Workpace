package ExceptionTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileClass {

	public static void appendStrToFile(String fileName, String str) {
		try {

			// Open given file in append mode. 
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
			out.write(str);
			out.close();
		} catch (IOException e) {
			System.out.println("exception occoured" + e);
		}
	}

	public static void main(String args[]) {

		String filename = "temp.txt";
//		try {
//			FileWriter fileWriter = new FileWriter(filename);
//			BufferedWriter br = new BufferedWriter(fileWriter);
//
//			br.write("Hello,");
//			br.write("Have a Great Day!!");
//			br.newLine();
//			br.write("Welcome,");
//			br.write("to my World!!");
//			br.append("Appending");
//
//			br.close();
//		} catch (IOException e) {
//			System.out.println(e);
//		}

		String str = "Appending some String...";
		appendStrToFile(filename, str);
		try {
			BufferedReader br1 = new BufferedReader(new FileReader("temp.txt"));

			String myString;
			while ((myString = br1.readLine()) != null) {
				System.out.println(myString);
			}
		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}
