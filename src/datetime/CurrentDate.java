package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class CurrentDate {

	 public static void main(String args[]) {
	      CurrentDate java8tester = new CurrentDate();
	      java8tester.testBackwardCompatability();
	   }
		
	   public void testBackwardCompatability() {
	     LocalDate date=LocalDate.now();
	     System.out.println(date);
	     System.out.println(date.getDayOfMonth());
	     System.out.println(date.getDayOfYear());
	     System.out.println(date.getDayOfWeek());
	     System.out.println(date.getYear());
	     System.out.println(date.getMonth());
	     
	     if (date.isLeapYear())
			System.out.println("This Year is Leap Year");
		else
			System.out.println("This Year is Not Leap Year");
	     
	     LocalTime time=LocalTime.now(); 
	     System.out.println(time);
	     System.out.println(time.getHour());
	     System.out.println(time.getMinute());
	     System.out.println(time.getSecond());
	     System.out.println(time.getNano());
	     
	     LocalDateTime dateTime=LocalDateTime.now();
	     System.out.println(dateTime);
	     
	     
	     
	   }
}
