package Days10;
// get user input as number age
// check if this age is older than 18
// if yes print out adult
// else print out not an adult.

import java.util.Scanner;
public class AgeTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = input.nextInt();
		
		if (age >= 18) {
			System.out.println("You are an adult.");
		}else {
			System.out.println("you are not adult, still young baby..");
		}
		// double equal == is checking for equality
		if (age ==18) {
			System.out.println("your age is 18");
		}
			
		
		System.out.println("What is your gender: ");
		String gender = input.next();
		
	}

}
