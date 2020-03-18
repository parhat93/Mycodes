package Days11;

import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		
		int number=4;
		
		if(number>0) {
			System.out.println("positive");
		}else {
			System.out.println("negative");
		}
		
		// (boolean expression) ? stmt1 : stmt2
		System.out.println((number>6) ? "positive":"negative");// number>6 is false so it will go to the negative sides
		
		String drink = "hot";
		
		if(drink.equals("cold")) {
			System.out.println("you selected th cold drink");
		}else {
			System.out.println("you selected the hot drink");
		}
		
		String drinkSelection=((drink.equals("cold"))? "you selecte cold drink" : "You selected hot drink");
		System.out.println(drinkSelection);
		
		System.out.println((number > 1)  ?  "3 is bigger then 1": "3 is not bigger then 1");
	

	}

	
}
