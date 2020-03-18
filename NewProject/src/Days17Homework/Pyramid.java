package Days17Homework;

import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// System.out.println("Enter number that how tall is trangle");
		// int number = input.nextInt();

		for (int i = 0; i < 5; i++) // number of rows
		{
			for (int k = i; k < 5; k++) // this is space creation form left side
			{
				System.out.print(" "); // this is how we print
			}
			for (int z = 0; z < i; z++) { // this is for printing star
				System.out.print("* ");   
			}
			System.out.println(""); // ths line going to next line, so we
									// must use println

		}

	}

}
