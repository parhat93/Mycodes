package Day6;

import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter three number: ");
    int nu1 = input.nextInt();
    int nu2 = input.nextInt();
    int nu3 = input.nextInt();
    
    int sum = nu1+nu2+nu3;
    
    System.out.println("Guess the sum number: ");
    int inputName = input.nextInt();
    
    boolean result = inputName==sum;
    System.out.println(result +"! The correct number is " + sum);
    
	}

}
