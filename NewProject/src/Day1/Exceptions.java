package Day1;

import java.util.Scanner;

public class Exceptions {
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x=1;

		do {
		try {
		System.out.println("Enter first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter second num: ");
		int num2 = input.nextInt();
		int sum = num1/num2;
		System.out.println(sum); 
		
		}finally {
			System.out.println("Final black catch ");
		
		}
		}while(x==1);
		/* what if someone try to divide some number to 0 
		 * that you will have exception
		 * there for we must try to fix this problem 
		 * In order to fix this proble we must use try statement
		 * try block we put our code catch we put the exception 
		 */
	}
	
	
		
	
	
}
