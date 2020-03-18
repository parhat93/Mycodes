package Days10Homework;
// Write Java program with the method that will accept three numbers 

// and return the greatest number.
// Test your method by taking user input using Scanner and calling the 
// method getGreatest() to find the greatest number.
// Display method results on a console.
// Input:
// Enter first number: 4
// Enter second number: 8
// Enter third number: 1
// Output:
// The greatest number is: 8


import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter the second numner;");
		int num2 = input.nextInt();
		System.out.println("Enter the third numner: ");
		int num3 = input.nextInt();

		if (num1 >= num2 && num1 >= num3) {

			System.out.println("The lagest number is " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("The lagest number is " + num2);
		} else {
			System.out.println("The lagest number is " + num3);
		}
	}

}
