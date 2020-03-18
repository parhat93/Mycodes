package Days11;

import java.util.Scanner;

public class AdvanceCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double num1 = input.nextDouble();
		System.out.println("Enter the first operator:");
		String operator1 = input.next();
		System.out.println("Enter the second number:");
		double num2 = input.nextDouble();
		
		
		double result;

		if (operator1.contains("+")) {
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + "=" + result);

		} else if (operator1.contains("-")) {
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + "=" + result);
		} else if (operator1.contains("*")) {
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + "=" + result);
		} else {
			switch (operator1) {
			case "/":
				result = num1 / num2;
				System.out.println(num1 + " / " + num2 + "=" + result);
				break;
			}
		}

	}

}
