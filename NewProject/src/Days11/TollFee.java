package Days11;

import java.util.Scanner;
public class TollFee {

	public static void main(String[] args) {
		int carType;
		double fee;
				
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the car type."
				+ "\n1 - Passanger Car"
				+ "\n2 - Bus"
				+ "\n3 - Trunk");
		carType = input.nextInt();
		switch(carType) {
		case 1:
			fee=2.50;
			System.out.println("Passenger car, Fee amount: " + fee);
		break;
		case 2:
			fee=5.00;
			System.out.println("Bus car, Fee amount: " + fee);
		break;
		case 3:
			fee=6.50;
			System.out.println("Trunk car, Fee amount: " + fee);
		break;
		
		default:
			System.out.println("please enter the 1 to 3 only");
		}
	}

}
