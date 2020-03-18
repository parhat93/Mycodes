package Days11;

import java.util.Scanner;
public class DrinkInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month: ");
		int month = input.nextInt();
		
		if(month ==12 || month<=2){
			System.out.println("Reason is Winter \nRecommended drink is hot chacolate ");
			
		}else if (month <=5) {
			System.out.println("Reason is Spring \nRecommended drink is ice tea");
		}else if (month <=8) {
			System.out.println("Reason is Summeer \nRecommended drink is lemonate");
		}else {
			System.out.println("Reason is fall \nRecommended drink is coffee");
		}
		
	}

}
