package Days11;

import java.util.Scanner;

public class CalculatorIfelsestatement {

	public static void main(String[] args) {

		int num1;
		int num2;
		String operator;
		int result;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your  first number:  ");
		num1 = input.nextInt();
		
		System.out.println("please  enter  your second number:  ");
		num2 = input.nextInt();
		Scanner input2 =new Scanner(System.in);
		System.out.println("please enter operator: ");
		operator = input2.nextLine();
		// System.out.println(num1 +""+operator+""+num2+"="+result);

		 // if we don't assign something to result, it won't run

		if (operator.equals("+")) {
			result = num1 + num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		} else if (operator.equals("-")) {
			result = num1 - num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		} else if (operator.equals("*")) {
			result = num1 * num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		} else if (operator.equals("/")) {
			if (num2 != 0) {

				result = num1 / num2;
				System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
			}else {
				System.out.println("can't divide by 0!");
			}
				
			}else
				System.out.println("Please enter operator!");
	}
		
}

