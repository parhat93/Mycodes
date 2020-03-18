package Days13;
import java.util.Scanner;
public class LoopRunner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter the ending number: ");
		int num2 = input.nextInt();
		
		Looper L1 = new Looper();
		L1.LoopFromNumToNum(num1, num2);
		
		System.out.println("Enter the first number");
		int num3 = input.nextInt();
		System.out.println("Enter the second number");
		int num4 = input.nextInt();
		int sumOfNumbers = L1.LoopAndSum(num3, num4);
		System.out.println("Sum of the number is " + sumOfNumbers);
	}

}
