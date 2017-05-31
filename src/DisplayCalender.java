import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayCalender {

	public static void main(String[] args) {

//		System.out.println("Enter the month");
//		System.out.println("Enter the year");
		
		PrintCalender();
		
	}
	
	public static void PrintCalender(){
		
		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Dec"};
		String daysInWeek[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		int date[] = new int[31];
		GregorianCalendar gc = new GregorianCalendar(2017,0,30);
		
		
		System.out.print(months[gc.get(Calendar.MONTH)]);
		System.out.println(" " + gc.get(Calendar.YEAR));
		
		for(int i=0; i< daysInWeek.length; i++){
			
			System.out.print(daysInWeek[i]+ "\t");
		}
		
		for(int j=1; j< date.length; j++){
			
			date[j] = j;
		}
		
		

		int dayOfWeek = gc.get(Calendar.DAY_OF_WEEK)-1;
		
		System.out.println();
		int	counter = 1;
		while(counter!=dayOfWeek){
			System.out.print("\t");
			counter++;
		}
		
		
		for(int i = 1; i < date.length; i++){
			
			
			switch(counter){
			
			case 1: System.out.print(date[i]+ "\t");
					break;
			case 2: System.out.print(date[i]+ "\t");
					break;
			case 3: System.out.print(date[i]+ "\t");
					break;
			case 4: System.out.print(date[i]+ "\t");
					break;
			case 5: System.out.print(date[i]+ "\t");
					break;
			case 6: System.out.print(date[i]+ "\t");
					break;
			case 7: System.out.println(date[i]);
					break;
			}
		
			if (counter == 7){
				counter=1;
			} else {
				counter++;
			}
			
		}
	
	}
}
