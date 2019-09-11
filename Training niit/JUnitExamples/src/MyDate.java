
public class MyDate {
	
	private int month;
	private int day;
	private int year;
	
	public MyDate(int day, int month , int year) {
		
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate()
	{
		
	}
	public void nextDay()
	{
		addDays(1);
	
	}
	public boolean isLeapYear(int year)
	{
		boolean leap = false;
		if(year%4 == 0)
		{
			if(year%100 == 0)
			{
				if(year%400 == 0)
				{
					leap = true;
				}
				else
					leap = false;
			}
			else
				leap = true;
		}
		else
			leap = false;
		return leap;
	}
	public void addDays(int days)
	{
		int m = getMonth();
		int d= getDay();
		int y = getYear();
		
		//d= d+7;
		
		d+=days;
		while(d>daysInMonth())
		{
			
			d-=daysInMonth();
			if(m<12)
			{
				m+=1;
			}
			else if(m==12)
			{
				m=1;
				y+=1;
			}
		}
		this.day = d;
		this.month = m;
		this.year = y;
		System.out.println(d+"/"+m+"/"+y);
		System.out.println(this);
	}
	public int daysInMonth()
	{
		int m = getMonth();
		int d= getDay();
		int y = getYear();
		
		if(m == 1||m == 3||m == 5||m == 7||m == 8||m == 10||m ==12) {
			 
			day = 31;
		}
		else if(m == 2)
		{
			if(isLeapYear(y))
			{
				day =29;
			}
			else
			{
				day = 28;
			}
		}
		else if(m == 2||m == 4||m == 6||m == 9)
		{
			day = 30;
		}
		return day;
		
	}
//	public String dayofWeek()
//	{
//		
//	}
	
	@Override
	public String toString() {
		return "MyDate [month=" + month + ", day=" + day + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	public static void main(String... args)
	{
		MyDate md = new MyDate(12,3,2016);
		System.out.println(md.isLeapYear(2016));
		
		md.addDays(365);
		md.nextDay();
	}
	
}
