/**
 * 
 */
package Day09_App01_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author : Edward Lam
 * @date   : 2023-01-19
 * 
 * Date and Time API in Java8
 * 
 * A program to print current date and time, and print date in dd,mm,yyyy
 * 
 */

public class App01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// return current date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		// return current time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		// get variables of day, month, year
		int dd = localDate.getDayOfMonth();
		int mm = localDate.getMonthValue();
		int yyyy = localDate.getYear();
		System.out.printf("%d-%d-%d\n", dd, mm, yyyy);
		
		// get variables of hour, minute, second, nanosecond
		int h = localTime.getHour();
		int m = localTime.getMinute();
		int s = localTime.getSecond();
		int n = localTime.getNano();
		System.out.printf("%d:%d:%d:%d\n", h, m, s, n);
		
		// using LocalDateTime to get all time info
		LocalDateTime dt = LocalDateTime.now();
		int dd1 = dt.getDayOfMonth();
		int mm1 = dt.getMonthValue();
		int yy1 = dt.getYear();
		System.out.printf("%d-%d-%d\n", dd1, mm1, yy1);
		int h1 = dt.getHour();
		int m1 = dt.getMinute();
		int s1 = dt.getSecond();
		int n1 = dt.getNano();
		System.out.printf("%d:%d:%d:%d\n", h1, m1, s1, n1);
		
		
		
	}

}
