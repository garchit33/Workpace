
public class Array_Mul {
	
	public static void main(String[] args)
	{
		int arr[][] = {{2,3},{4,5}};
		int arr1[][] = {{3,5},{6,7}};
		int c[][]= new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<2;j++)
			{
				c[i][j]=0;
				for(int k =0;k<2;k++) {
					
					c[i][j] += arr[i][k]*arr1[k][j];
					
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
	
	}
}
	