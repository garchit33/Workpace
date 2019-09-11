
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] source = {00,33,11,55,6,12};
		int[] destination = new int[6];
		System.out.println("Before Copying");
		for(int i=0;i<=5;i++) {
		
			System.out.print(destination[i]+"\t");
			
		}
		System.arraycopy(source, 0, destination, 0, 6);
		System.out.println("After Copying");
		for(int i=0;i<=5;i++) {
			
			System.out.print(destination[i]+"\t");
			
		}
	}

}
