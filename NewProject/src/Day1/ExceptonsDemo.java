package Day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptonsDemo {
	public static void main(String[] args) {
		int x =1;
		
		do {
		try {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the first Number:");
		int num1 = input.nextInt();
		System.out.println("Enter the second number:");
		int num2 = input.nextInt();
		int sum=num1/num2;
		System.out.println(sum);
		x=2;
		}catch(ArithmeticException e) {
			System.out.println("You Can't do that");
		//	System.exit(0);
		}catch(Exception e) {
			System.out.println("Input mismatch");
	//		System.exit(0);
		}finally {
			System.out.println("NO Error");
		}
		}while(x==1);	
	
		
		System.out.println("you got it");
	}
}
