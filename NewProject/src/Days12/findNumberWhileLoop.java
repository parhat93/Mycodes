package Days12;

import java.util.Scanner;

public class findNumberWhileLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = input.nextInt();

		do {
			System.out.println("I said enter 1");
			num1 = input.nextInt();

		} while (num1 != 1);

		System.out.println("Thank you");

	}

}
