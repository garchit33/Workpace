import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Formatter;

import javax.swing.text.DateFormatter;

public class DataEx {

	public static void main(String[] args) {
//		LocalDate today=LocalDate.now();
//		System.out.println("Current Date : "+today);
//		LocalTime timeobj = LocalTime.now();
//		System.out.println("Current Time : "+timeobj);
//		LocalDateTime dtime = LocalDateTime.now();
//		System.out.println("Current Date and Time : "+dtime);
		Date date = new Date();
		SimpleDateFormat d = new SimpleDateFormat("dd MMMM yyyy");
		String str = d.format(date);
		System.out.println(str.toString());
	}
}
