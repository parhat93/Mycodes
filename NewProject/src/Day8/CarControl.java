package Day8;

import java.util.Scanner;

// Create a Class called Road with main method
// Create a Scanner object and ask user to enter model, 
// currentSpeed, and color for the car object. 
// Use those value and assign to Car object
// Print the car information

public class CarControl {

	public static void main(String[] args) {
		// Create objects, which is car1 is variable and holds the Car object

		Car car1=new Car();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the car model: ");
		car1.model = input.nextLine();
		
		System.out.println("Enter the color of the car: ");
		car1.color = input.nextLine();
		
		System.out.println("Enter the speed of currentSpeed of the car: ");
		car1.speed= input.nextInt();
		
		car1.carInformation();
		car1.accellerate(20);
		
		int currerntSpeed = car1.getCurrentSpend();
		System.out.println(car1.color+" "+ car1.model+" "+"'s current speed was "+ car1.getCurrentSpend() + " MPH.");
	}

}
