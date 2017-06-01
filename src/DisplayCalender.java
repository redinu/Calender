import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DisplayCalender {

	public static void main(String[] args) {

		 Scanner scn = new Scanner(System.in);
		 
		 System.out.println("Enter the year");
		 int year = scn.nextInt();
		 
		 System.out.println("Enter the month");
		 int month = scn.nextInt();
		
		 System.out.println("Enter the date");
		 int date = scn.nextInt();

		PrintCalender(year, month, date);

	}

	public static void PrintCalender(int year, int month, int date) {

		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct","Nov", "Dec" };
		String daysInWeek[] = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		GregorianCalendar gc = new GregorianCalendar();
		
		gc.set(year, month, date);
	

		System.out.print(months[gc.get(Calendar.MONTH)]);
		System.out.println(" " + gc.get(Calendar.YEAR));

		for (int i = 0; i < daysInWeek.length; i++) {

			System.out.print(daysInWeek[i] + "\t");
		}
		System.out.println();

		int firstDayOfWeek = gc.get(Calendar.DAY_OF_WEEK) - 1;
		int daysInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);

		int dayOfTheWeek = 0;
		int counter = 1;
		boolean firstDayPrinted = false;

		while (counter <= daysInMonth) {
			if (!firstDayPrinted) {
				if (dayOfTheWeek != firstDayOfWeek) {
					System.out.print("\t");
				} else {
					System.out.print(counter++ + "\t");
					firstDayPrinted = true;
				}
			} else {
				System.out.print(counter++ + "\t");
			}

			if (dayOfTheWeek == 6) {
				System.out.println();
				dayOfTheWeek = 0;
			} else {
				dayOfTheWeek++;
			}

		}

	}
}
