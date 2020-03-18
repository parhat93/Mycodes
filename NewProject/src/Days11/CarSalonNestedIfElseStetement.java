package Days11;

import java.util.Scanner;

public class CarSalonNestedIfElseStetement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What country car do you want? \n We have German, American, Japanese");
		String country = input.nextLine();
		// countries : German, American, Japanese

		// German -5000.00;
		// American - 3000.00;
		// Japanese - 7000.00;
		System.out.println("Enter the your amount you can speed:");
		double amount = input.nextDouble();

		if (country.equalsIgnoreCase("german")) {
			System.out.println("You slected German car.");
			
			if (amount >=5000) {
				System.out.println("We have car for you.");
			} else {
				System.out.println("Your budget is too low, we don't have car avalible for you.\nSorry.");
			}
		}

		else if (country.equalsIgnoreCase("american")) {
			System.out.println("You  elected American car.");
			if(amount >=3000) {
				System.out.println("We have car for you");
			}else {
				System.out.println("You budget is too low, we don't have car avalible for you.\n"
						+ "Sorry. get more money from ATM.");
			}
		} 
		
		else if (country.equalsIgnoreCase("japanese")) {
			System.out.println("You selected Japanese car.");
		if(amount >=7000) {
			System.out.println("We have car for you");
		}else {
			System.out.println("You budget is too low, we don't have car avalible for you.\n"
					+ "Sorry. get more money from ATM.");
		}
		}

	}

}
