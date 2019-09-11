
public class ArrayPassFunction {

	static int MinNumber(int []no) {
		
		int min=no[0];
		for(int i=1;i<no.length;i++) {
			if(min>no[i]) {
				min = no[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		int x[]= {3,5,88,1,67,8};
		int ans=MinNumber(x);
		System.out.println(ans);
	}
}
