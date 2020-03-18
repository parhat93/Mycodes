package Days10;

import java.util.Scanner;
public class LogicalOrOperator {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("please enter the amount");
		
	
		int orderAmount = input.nextInt();
		boolean isAmazonPrime = false;
		
		if (orderAmount >= 35 || isAmazonPrime==true) {
			System.out.println("free shipping");
		}else {
			System.out.println("do you want to sign up?  ");
		}
		
	}

}
