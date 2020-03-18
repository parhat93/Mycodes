package Days14;

import java.util.Scanner;

/*
* Bank Acoount -1000
* Make a purchase
*  1 - 150
*  2 - 20
*  3 - 500
*  4 - 100
*  5 - 50
*  6 - 180
*  
*  you are out money
*  you made 6 transactions
*  
*/
public class AccountBalance {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter you Bank Acount balance: ");

		int counter = 0;
		double balance = input.nextDouble();

		do {
			System.out.println("Please make purchase:");
			double purchase = input.nextDouble();
			if(purchase > balance) {
				System.out.println("Transaction declined: ");
				break;
			}
			balance -= purchase;
			counter++;
		} while (balance > 0);

		System.out.println("you are out of money");
		System.out.println("Your balance is " + balance);
		System.out.println("you made " + counter + " transactions.");
	}

}
