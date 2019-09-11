import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the id of the Employee");
		Scanner s=new Scanner(System.in);
		int id = s.nextInt();
		int a[] = new int[id];
		for(int i=0;i<id;i++) {
			
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter the Name of the Employee");
	
		String name = s.nextLine();
		String b[] = new String[name];
		for(int j=0;j< name.length();j++) {
			
			b[j]=s.next();
		}
		
		for(int i=0;i<id;i++) {
			
			System.out.println(a[i]+" "+b[j]);
		}
		
		
		
	}	
}
