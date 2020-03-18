package Days11Homework;

//Write Java program that will display day of the week based on the input. 
//Use switch case for week day selection. 
//Based on a selection display day and whether it is a work day or a weekend.
//Input: 
//2
//Output:
//Day of the week is Monday.
//It is a work day.
import java.util.Scanner;
public class DaysOfWeek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Plese Enter the day 1-7: ");
		int days = input.nextInt();
		
		switch(days) {
		case 1:
			System.out.println("Day of the week is Monday.\nIt is a work day.");
			break;
		case 2:
			System.out.println("Day of the week is Tuesday.\nIt is a work day.");
			break;
		case 3:
			System.out.println("Day of the week is Wednesday.\nIt is a work day.");
			break;
		case 4:
			System.out.println("Day of the week is Thursday.\nIt is a work day.");
			break;
		case 5:
			System.out.println("Day of the week is Friday.\nIt is a work day.");
			break;
		case 6:
			System.out.println("Day of the week is Saturday.\nIt is a Weekend.");
			break;
		case 7:
			System.out.println("Day of the week is Sunday.\nIt is a Weekend.");
			break;
		default:
			System.out.println("1-7 only, there are only 7 days week");
		}
	}

}
