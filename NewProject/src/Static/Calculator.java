package Static;

public class Calculator {

	public static int add(int num1, int num2) {

		return num1 + num2;
	}

	public static int multiply(int num1, int num2) {

		return num1 * num2;
	}

	public static int substract(int num1, int num2) {
		return num1 - num2;
	}

	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

	public static int reminder(int num1, int num2) {
		return num1 % num2;
	}
	
	public static int calculate(int n1, int n2, String operator) {
		switch (operator) {
			case "+":
				return add(n1,n2);
			case "-":
				return substract(n1,n2);
			case "*":
				return multiply(n1,n2);
			case "/":
				return divide(n1,n2);
			case "%":
				return reminder(n1,n2);
				default:
					System.out.println("Invalid operator: <" + operator + ">" );
					return -1;
				
		}
	}
	
	
	

}
