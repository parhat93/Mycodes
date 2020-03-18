package A_ArrayAndArraylist;

import java.util.Scanner;

public class advanceCalculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		double num1 = input.nextDouble();
		System.out.println("Enter the operator + - * /:");
		String opera = input.next();
		System.out.println("Enter second Number: ");
		double num2 = input.nextDouble();

		double answer = 0;

		switch (opera) {
			case "+" :
				answer = num1 + num2;
				break;
			case "-" :
				answer = num1 - num2;
				break;
			case "*" :
				answer = num1 * num2;
				break;
			case "/" :
				answer = num1 / num2;
				break;
			default :
				System.out.println("involid operator");
				break;
		}
		System.out.println("The answer is: " + answer);
	}
}
