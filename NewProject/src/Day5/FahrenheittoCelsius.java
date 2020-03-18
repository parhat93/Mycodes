package Day5;

// Write a Java program to convert temperature 
// from Fahrenheit to Celsius degree.
// Input:
// degree in Fahrenheit: 213
// Output: 213 degrees in Fahrenheit is equivalent to ... degrees in Celsius.
// 212 F =100C,  32F = 0C, 98.6F=37C.




import java.util.Scanner;
public class FahrenheittoCelsius {

	public static void main(String[] args) {
		int Celsius;
		int Fahrenheit;
		
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit: ");
        Fahrenheit = input.nextInt();                     
        Celsius = (Fahrenheit - 32)*5/9; // Fahrenheit= celsius *9/5+32
        System.out.println(Fahrenheit + " degrees in Fahrenheit is equivalent to " + Celsius + " degrees in Celsius");
  
	}

}
