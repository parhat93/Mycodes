package Day5;

// Write a program that takes user input in seconds and outputs the 
// number of hours, minutes, and seconds that
// corresponds to the input. The output should be x hours, x minutes,
//and x seconds.
// Enter seconds: 20394↵
// 5 hours, 39 minutes, and 54 seconds.

import java.util.Scanner;
public class SecondstoSandardTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the seconds: ");		
		int second =input.nextInt();	 
		
		int hours = second/3600;
		int minutes = (second %3600)/60;
		int second1 = (second%3600)%60;
		System.out.println(second + " second is "+ hours + " hours, " + minutes + " minutes, and " + second1 + " seconds.");

	}

}
