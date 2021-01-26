package datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class BackwarpCompatability {

	 public static void main(String args[]) {
		 BackwarpCompatability java8tester = new BackwarpCompatability();
	      java8tester.testBackwardCompatability();
	   }
		
	   public void testBackwardCompatability() {
	      //Get the current date
	      Date currentDate = new Date();
	      System.out.println("Current date: " + currentDate);
			
	      //Get the instant of current date in terms of nano
	      Instant now = currentDate.toInstant();
	      System.out.println(now);
	      ZoneId currentZone = ZoneId.systemDefault();
			
	      LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
	      System.out.println("Local date: " + localDateTime);
			
	      ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
	      System.out.println("Zoned date: " + zonedDateTime);
	   }
	}

