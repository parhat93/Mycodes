package Days11;

import java.util.Scanner;

public class CalculatorSwitchStatements {

	public static void main(String[] args) {
		int num1;
		int num2;
		String operator;
		int result=-1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your  first number:  ");
		num1 = input.nextInt();
		
		System.out.println("please  enter  your second number:  ");
		num2 = input.nextInt();
		Scanner input2 =new Scanner(System.in);
		System.out.println("please enter operator: ");
		operator = input2.nextLine();

		switch(operator) {
		case"+":
			System.out.println(num1 + num2);
			break;
		case"-":
		System.out.println(num1 - num2);
		break;
		case"*":
		System.out.println(num1 * num2);
		break;
		case"/":
			if(num2 !=0 ) {
				System.out.println(num1 / num2);
			}
		break;
		
		}
		
		
	
		
	}

}
