package Day6;

import java.util.Scanner;
public class DogFoodCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of dog: ");
		int dogs = input.nextInt();
		System.out.println("Enter the number of days: ");
		int days = input.nextInt();
		
		String weight = "oz";
		int wetFoodPerDay = 2;
		int dryFoodPerDay = 1;
		int veggiesPerDay = 2;
		
		int totalWetFood = (wetFoodPerDay*dogs*days);
		int totaldryFood = (dryFoodPerDay*dogs*days);
		int totalVeggiesFood = (veggiesPerDay*dogs*days);
		
		System.out.println(dogs + " dogs eat "+ totalWetFood +" "+ weight + " wet Food in "+days + " days.");
		System.out.println(dogs + " dogs eat "+ totaldryFood +" "+ weight + " dry Food in "+days + " days.");
		System.out.println(dogs + " dogs eat "+ totalVeggiesFood +" "+ weight + " wet Food in "+days + " days.");
		
		
		
	}

}
