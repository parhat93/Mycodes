package Days10Homework;
// Write a Java program that will have a method isEqual()
// and isNotEqual() that will accept two numbers and return boolean value.
// Test your methods by taking user input and calling methods 
// isEqual()and isNotEqual()to check if two numbers are equal or not.
// Display method results on a console.
// Input:
// Enter first number:7
// Enter second number:8
// Output:
// Number 7 and number 8 are equal:false
// Number 7 and number 8 are not equal:true

import java.util.Scanner;
public class EqualNotEqualControl {

	public static void main(String[] args) {
		
		EqualNotEqual nu1 = new EqualNotEqual();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num = input.nextInt();
		System.out.println("Enter the second number: ");
		int num1 = input.nextInt();
		
		boolean isEqual = nu1.isEqual(num, num1);
		System.out.println("number " + num + " and number " + num1 + " are equal: " + isEqual);
		
		boolean notEqual = nu1.notEqual(num, num1);
		System.out.println("number " + num + " and number " + num1 + " are not equal: " + notEqual);
	}

}
