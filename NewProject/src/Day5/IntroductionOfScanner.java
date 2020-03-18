package Day5;

import java.util.Scanner;
// java.util is where is your Scanner class is stored 
public class IntroductionOfScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Scanner--> is date type, 
		// input --> name of variable 
		// System.in --> get input from out put
		System.out.println("What is your name? ");
		String firstName;
		
		
		 firstName = input.nextLine();// nextLine is it allow us to write space.	
		// input --> get the input from 
	//	next()--> next line will print out 
		System.out.println("Nice to meet you, " + firstName);
		System.out.println("What do you do, " + firstName + "?");
		String job = input.next();
		System.out.println("So you are a "+ job);
		System.out.println("How much is your hourly salary");
		int salary=input.nextInt();
		int weekly = salary*40;
		int monthly = weekly*4;
		int annual = monthly*12;
		
		System.out.println("Wow you make weekly $" + weekly);
		System.out.println("Wow you make monthly $" + monthly);
		System.out.println("Wow you make yearly $" + annual);
		input.nextLine();
		String reply = input.nextLine();
		System.out.println(reply);
	}

}
