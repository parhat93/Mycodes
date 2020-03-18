// Write a Java program to convert temperature from Fahrenheit to Celsius degree.
// In your program use scanner to take user input for degree in Fahrenheit.
// Please enter degree in Fahrenheit: 
// .... degrees in Fahrenheit is equivalent to .... degrees in Celsius.
package Day7;
import java.util.Scanner;
public class FahrenheitTtoCelsiusControl {

	public static void main(String[] args) {
		
		FahrenheitTtoCelsius U1 = new FahrenheitTtoCelsius();
			
		Scanner input = new Scanner(System.in);
		System.out.println("Enter degree in Fahrenheit: ");
		U1.Fahrenheit = input.nextInt();
		int sum =U1.result();
		
		System.out.println(U1.Fahrenheit+" degrees in Fahrenheit is equivalent to "+ sum + " degress in Celsius." );
		
	}

}
