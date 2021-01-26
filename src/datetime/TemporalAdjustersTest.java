package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
	public static void main(String args[]) {
	      TemporalAdjustersTest java8tester = new TemporalAdjustersTest();
	      java8tester.testAdjusters();
	   }
		
	   public void testAdjusters() {
	      //Get the current date
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);
			
	      LocalDate date2=date1.plus(1,ChronoUnit.WEEKS);
	      //get the next tuesday
	      LocalDate nextFriday = date1.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
	      System.out.println("Next Friday on : " + nextFriday);
			
	      //get the second saturday of next month
	      LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
	      LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
	         DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
	      System.out.println("Second Saturday on : " + secondSaturday);
	   }
}
