package Day9;

public class ConditionalStatementIfElseStatment {

	public static void main(String[] args) {
		
		int apples = 17;
		int bananas = 15;
		
		if (bananas > apples) {
			System.out.println("We have more bananas than apples.");
		}
		
		int pp1=5;
		int capacity =5;
		
		// check if number of pp1 is equal or less than capacity
		// if true print welcome all
		// check another if condition number of pp1 is more than capacity 
		// some pasangers need to kindly get out.
		if(pp1 <=capacity) {
			System.out.println("welcome all");
		}
		
		if (pp1 > capacity  ) {
			System.out.println("pasangers need to kindly get out");
		}

		
		String lan ="Java";
		
		// if the land is java then say good job,
		// otherwise say u beeter learn java.
		// lan is String objects
		if(lan.equalsIgnoreCase("java")) {
			System.out.println("good job");
			
		}else {
			System.out.println("you better learn java.");
		}
		
		
		if(lan.equals("java")) {
			System.out.println("good job");
			
		}else {
			System.out.println("you better learn java."); // because the java first letter is not same as what we assign to lan.
		}
		
		if(lan==("java")) {
			System.out.println("good job");
			
		}else {
			System.out.println("you better learn java.");
		}
		
		double todaySales =10000.22;
		double yesterdaySales = 5000.22;
		
		if (todaySales > yesterdaySales) {
			System.out.println("today you make more money.");
		}else {
			System.out.println("you didnot make anything.");
		}
		
		
		int eligibleAge = 18;
		int nonelogibleAge =18;
		
		if(eligibleAge >= nonelogibleAge ) {
			System.out.println("you can vote");
		}else {
			System.out.println("you are still young");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
