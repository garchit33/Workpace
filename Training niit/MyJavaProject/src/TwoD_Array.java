import java.util.Scanner;

public class TwoD_Array {
	
	public static void main(String[] args) {
		
	
		System.out.println("Enter the number of rows and coloumns");
		Scanner sc=new Scanner(System.in);
		int r =sc.nextInt();
		int c = sc.nextInt();
		String city[][] = new String[3][3];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				city[i][j]=sc.next();
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				System.out.print(city[i][j]+"\t\t\t\t");
			}
			System.out.println();
		}
		
	}

}
