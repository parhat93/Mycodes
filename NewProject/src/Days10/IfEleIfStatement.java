package Days10;

import java.util.Scanner;

public class IfEleIfStatement {
	public static void main(String[] args) {
	//	int i = 16;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int i = input.nextInt();
		

		if (i < 5) {
			System.out.println("more than 5");
		} else if (i < 10) {
			System.out.println("less than 10");

		} else if (i < 15) {
			System.out.println("less than 15");
		} else {
		}
		System.out.println("not less than 5 or 10");
	}
}
