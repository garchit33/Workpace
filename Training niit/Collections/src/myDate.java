public class myDate{
	
	private int day;
	private int month;
	private int year;
	
	public myDate(int d,int y, int m) {
		
		this.day=d;
		this.month=m;
		this.year=y;
	}
	
	public boolean equals(Object o) {
		
		boolean result = false;
		if((o!=null)&&(o instanceof myDate))
		{
			myDate d= (myDate)o;
			if((day==d.day)&&(month==d.month)&&(year==d.year)) {
				
				result = true;
			}
		}
		return result;
	}
	
	public int hashCode() {
		
		return (day ^ month ^ year);
	}
	
}
