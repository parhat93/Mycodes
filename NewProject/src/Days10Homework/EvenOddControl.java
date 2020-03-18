package Days10Homework;

// Write a Java program that will have a method isEven()
// that will check if number is even and isOdd()  
// that will check if number is odd.
// isEven() will accept one number as a parameter 
// and will return boolean value.
// isOdd() will accept one number as a parameter
// and will return boolean value.
// Try your method by accepting user 
// input using Scanner and calling the isEven() 
// and isOdd() methods and then display result on a console.
// Input:
// Enter your number: 9
// Output
// The number is even: false
// The number is odd: true
import java.util.Scanner;

public class EvenOddControl {
	// num % 2 == 0 this is even fourmula
	// num % 2 > = 0 // a % 2 != 0 this is odd number

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num1 = input.nextInt();
		
		EvenOdd u1 = new EvenOdd();
		
		
		boolean Even = u1.isEven(num1);
		System.out.println("This number is Even: " + Even);
		
		boolean Odd = u1.isOdd(num1);
		System.out.println("This number is odd: " + Odd);
	}
}