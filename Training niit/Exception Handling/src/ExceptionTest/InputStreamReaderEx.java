package ExceptionTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String args[]) {
		
		
		String s = null;
		try {
			InputStreamReader inr = new InputStreamReader(System.in);
			BufferedReader b1 = new BufferedReader(inr);
			FileWriter fw = new FileWriter("temp1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			s=b1.readLine();
			bw.write(s);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
	}
}
