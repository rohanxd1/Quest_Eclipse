package Study;
import java.time.*;
import java.time.format.*;
import java.util.*;
public class DateTime 
{ public static void main(String args[])
	{
	 LocalDateTime ob1=LocalDateTime.now();
	 System.out.println("Date and time:"+ob1);
	 DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
	 String FormattedDate=ob1.format(formatter);
	 System.out.println("Formatted Date:"+FormattedDate);
	 Date d1= new Date();
	 System.out.println("Date:"+d1);
	}

}
