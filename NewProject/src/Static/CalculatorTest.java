package Static;

import java.util.Scanner;
public class CalculatorTest {

	public static void main(String[] args) {
		
		int result = Calculator.calculate(10, 50, "-");
		System.out.println(result);
		
		int reuslt1 = Calculator.add(15, 20);
		System.out.println(reuslt1);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = input.nextInt();
		System.out.println("Enter the second number");
		int num2 = input.nextInt();
		System.out.println("Enter the operator");
		String operator = input.next();
		System.out.println(Calculator.calculate(num1, num2, operator));

	}

}
