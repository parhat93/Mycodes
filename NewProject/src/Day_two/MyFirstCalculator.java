package Day_two;

import java.util.Scanner;
import javax.swing.text.NumberFormatter;

public class MyFirstCalculator {
	private static final String NumberFormatter = null;

	String ff ;
	
	public static void main(String[] args) {
		
		MyFirstCalculator calculatorsMethod = new MyFirstCalculator();
		//calling the title
		//calculatorsMethod.title();
		// creating an scanner 
		Scanner input = new Scanner(System.in);
		//calling calculator method
	//	calculatorsMethod.calculator(input);
		//calculatorsMethod.ifelseStementCalculator(input);
		
		calculatorsMethod.title();
		stt();
		String ss =calculatorsMethod.ff;
		ss ="jsls"; 
		System.out.println(ss);
		
	}
	
	public static void stt() {
	//	title();
	}
	
	public void title() {
		System.out.println("====Welcome to the 3 Amigo Calculator!!!====");
		stt();
		String f = "jalap";
	}
	
	public void calculator(Scanner input) {
	    int i =0;
		while(i<4) {
		System.out.println("Enter your first number");
		int num1 = input.nextInt();
		System.out.println("Enter the operator:");
		String operator = input.next();
		System.out.println("Enter the second number:");
		int num2 = input.nextInt();
		int result;
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case "/":
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		case "%":
			result = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + result);
			break;
		}
	  }
		
	}
	
	public void ifelseStementCalculator(Scanner input) {
		double i =0;
		while(i < 4) {
		System.out.println("Enter your first number");
		double num1 = input.nextInt();
		System.out.println("Enter the operator:");
		String operator = input.next();
		while(operator !=NumberFormatter) {
			
		}
		System.out.println("Enter the second number:");
		double num2 = input.nextInt();
		double result;
		
		if(operator.equals("+")) {
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		}else if(operator.equals("-")) {
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
		}else if(operator.equals("*")) {
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
		}else if(operator.equals("/")) {
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
	    } else if(operator.equals("%")){
		 result = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + result);
	 }
		
		}
	}
}
