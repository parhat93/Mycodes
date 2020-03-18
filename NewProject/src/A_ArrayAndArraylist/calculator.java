package A_ArrayAndArraylist;

import java.util.Scanner;

public class calculator {
	static double answer = 0;
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		double num1 = input.nextDouble();
		System.out.println("Enter the operator + - * /:");
		String opera = input.next();
		System.out.println("Enter second Number: ");
		double num2 = input.nextDouble();
		
		
		System.out.println("Enter the second operator + - * /:");
		String opera2 = input.next();
		System.out.println("Enter the third Number:");
		double num3 =input.nextDouble();
		
		
	//	static double answer = 0;

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
				switch (opera2) {
					case "+" :
						answer = answer + num3;
						break;
					case "-" :
						answer = answer -num3;
						break;
					case "*" :
						answer = answer * num3;
						break;
					case "/" :
						answer = answer / num3;
						break;
					default :
						System.out.println("involid operator");
						break;	
		
		}
		System.out.println("The answer is: " + num1 + " " + opera +  " " + num2 + " " + opera2 + " " +  num3 + " = " + answer);
		//
}
}