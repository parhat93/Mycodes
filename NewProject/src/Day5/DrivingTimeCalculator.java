package Day5;

import java.util.Scanner;
public class DrivingTimeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance for distenation: ");
		float miles =input.nextFloat();  //t=d/r , time=distance/rate
		
		System.out.println("Enter the your driving Speed: ");
		float speed = input.nextFloat();
		
		float time = miles / speed;
		float minutes = miles/speed*60;
		System.out.println("Total time to reach your destination is: " + time + " hours.");
		System.out.println("Total time to reach your destination is: " + minutes + " minutes.");
		

		//int hours = second/3600;
		//int minutes = (second %3600)/60;
		//int second1 = (second%3600)%60;
		
		
		
	}

}
