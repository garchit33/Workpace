package ExceptionTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDefinedWrite {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		try {
			FileWriter fr = new FileWriter("userex.txt");
			BufferedWriter br = new BufferedWriter(fr);
			br.write(s);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
