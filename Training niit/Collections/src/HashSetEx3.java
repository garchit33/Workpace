
public class HashSetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myDate date1=new myDate(2, 3, 2011);
		myDate date2=new myDate(2, 3, 2011);
		//date2=date1;
		if(date1==date2) {
			System.out.println("Date 1 is Identical to Date 2");
		}
		else {
			System.out.println("Date is not Identical");
		}
		if(date1.equals(date2)) {
			System.out.println("Date is Same");
		}
		else {
			System.out.println("Date is not Same");
		}
	}

}
