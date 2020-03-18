package Days14;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String mode;
		System.out.println("Enter 2 number");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		System.out.println("Even or odd mode: ");
		mode = input.next();

		// num % 2 == 0 this is even fourmula
		// num % 2 > = 0 // a % 2 != 0 this is odd number

		if (n1 < n2) {
			for (int miles = n1; miles <= n2; miles++) {
				if (mode.equalsIgnoreCase("even") && miles % 2 == 0) {
					System.out.print(miles + " ");
				} else if (mode.equalsIgnoreCase("odd") && (miles % 2 != 0)) {
					System.out.print(miles + " ");
				}
			}

		} else if (n1 > n2) {
			for (int miles = n1; miles >= n2; miles--) {
				if (mode.equalsIgnoreCase("even") && miles % 2 == 0) {
					System.out.print(miles + " ");
				} else if (mode.equalsIgnoreCase("odd") && (miles % 2 != 0)) {
					System.out.print(miles + " ");
				}

			}
		} else {

			System.out.println(n1);
		}

	}

}
