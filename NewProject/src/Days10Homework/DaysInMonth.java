package Days10Homework;

// Write a Java program to find the number of days in a month.
// Assume February has 29 days.
// Input:
// Input a month number: 2
// Output :
// February has 29 days
import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month number: ");
		int month = input.nextInt();
		
		if(month == 1)        {
			System.out.println("January has 31 days" );
		}else if (month ==2 ) {			
			System.out.println("February has 28 days, leap year 29 days" );		
		}else if (month ==3 ) {	
			System.out.println("March has 31 days");	
			
		}else if (month ==4)  {
			System.out.println("April has 30 days");
			
		}else if (month ==5)  {
			System.out.println("May has 31 days");
			
		}else if (month ==6)  {
				System.out.println("June has 30 days");
		
		}else if (month ==7)  {
			System.out.println("July has 31 days");
			
		}else if (month ==8)  {
			System.out.println("Auguest has 31 days");
			
		}else if (month ==9)  {
			System.out.println("September has 30 days");
			
		}else if (month ==10)  {
			System.out.println("October has 31 days");
			
		}else if (month ==11)  {
			System.out.println("November has 30 days");
			
		}else  if (month ==12){
			System.out.println("December has 31 days");
		}else {
			System.out.println("It is not a valid month, there are only 1 to 12 month ");
		}
		
	}

}
