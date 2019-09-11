import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class DateEx2 {

	public static void main(String args[]) {
		
		LocalDateTime dat1 = LocalDateTime.now();
		System.out.println("Before Formatting : "+dat1);
		
		DateTimeFormatter fmtdate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String fmtdate1 = dat1.format(fmtdate);
		System.out.println(fmtdate1);
		
		
	}
}
