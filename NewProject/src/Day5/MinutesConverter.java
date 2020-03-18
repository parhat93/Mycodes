package Day5;

// Write a Java program to convert minutes into a number of years and days.
// Input: Input the number of minutes: 3456789
// Output: 3456789 minutes is approximately 6 years and 210 days



import java.util.Scanner;
public class MinutesConverter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int minute = input.nextInt();
		int days = minute / 1440;
		int year = minute /525600;
		System.out.println(minute + " minutes is approximately "+ year + " years " + "and " + days +" days. ");
		

	}

}
