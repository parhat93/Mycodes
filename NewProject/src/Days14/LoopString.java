package Days14;

/* Accept a String and a number
 * print that string that many times attacked
 * 
 * 1) out.print
 * 2) accumulate value to another string variable 
 * 	  then print at end - outside the loop
 */

import java.util.Scanner;

public class LoopString {
	// PrintNtimes
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = input.nextLine();

		System.out.println("How many times: ");
		int count = input.nextInt();
		
		String accumulator ="";
		for (int i = 1; i <= count; i++) {
			//System.out.println(str);
			accumulator +=str;
		}
		System.out.println(accumulator);
	}

}
