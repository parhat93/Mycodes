package Days10Homework;

// Write Java program to allow the user to input his/her age.
// Then the program will show if the person is eligible to vote.
// A person who is eligible to vote must be older than or equal to 18 years old.
// Enter your age: 18
// You are eligible to vote.
import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int eligibleAge = input.nextInt();

		if (eligibleAge >= 18) {
			System.out.println("You are eligible to vote. ");
		} else{ 
		System.out.println("you can't vote maybe next year...");			
		}
	}

}
//	else if (eligibleAge == 18) {
//			System.out.println("Now you are 18 go ahead and vote.");
//		}