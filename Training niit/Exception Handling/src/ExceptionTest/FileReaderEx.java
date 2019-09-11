package ExceptionTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	
	public static void main(String[] args) {
		
		try {
			FileReader fread = new FileReader("put.txt");
			int i;
			try {
				while((i=fread.read())!=-1){
					System.out.println((char)(i));
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
