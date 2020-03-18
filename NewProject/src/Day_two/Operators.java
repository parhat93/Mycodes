package Day_two;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter current year:");
		int currentYear = input.nextInt();
		System.out.println("Enter your born year:");
		int bornYear=input.nextInt();
		int yourage = currentYear - bornYear;
		System.out.println("You are " + yourage +" years old!!! your freaking old!" );
		System.out.println("Enter the future year:");
		int futureYear = input.nextInt();
		int futureyourage =futureYear - currentYear + yourage;
		System.out.println("You will be " + futureyourage + " on " + futureYear);
  }					
}