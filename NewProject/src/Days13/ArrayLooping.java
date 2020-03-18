package Days13;

public class ArrayLooping {

	public static void main(String[] args) {

		String[] shoppingLits = new String[5];

		shoppingLits[0] = "clothes";
		shoppingLits[1] = "laptop";
		shoppingLits[2] = "Tv";
		shoppingLits[3] = "Speaker";
		shoppingLits[4] = "book";
		System.out.println("Ym shopping list are:");

		for (int i = 0; i < shoppingLits.length; i++) {

			System.out.println(shoppingLits[i]);

		}

		System.out.println(" ======================");

		// create an array to hold 7 days as a String
		// Using for loop to print out all the days;

		// This is second ways to use arrays
		// String [] days1 = {"Monday","Thueday","Wednesday","Friday"};
		//
		// for (int i = 0; i < days1.length; i++) {
		// System.out.println ( days1 [i] );
		// }

		//
		// String [] days = new String[7];
		//
		// days[0]="Monday";
		// days[1]="Thueday";
		// days[2]="Wednesday";
		// days[3]="Thuesday";
		// days[4]="Friday";
		// days[5]="Saturday";
		// days[6]="Sunday";
		//
		// System.out.println("One week has 7 days, they are: ");
		// for(int i =0 ; i<days.length;i++) {
		// System.out.println(days[i]);

		// }

		System.out.println("======================");

		String[] days3 = new String[7];

		days3[0] = "Monday";
		days3[1] = "Thueday";
		days3[2] = "Wednesday";
		days3[3] = "Thuesday";
		days3[4] = "Friday";
		days3[5] = "Saturday";
		days3[6] = "Sunday";

		for (int i = 0; i < days3.length; i++) {
			System.out.println(days3[i]);
			if (i == 3) {
				continue;
			}
			if (days3[i].equals("Saturday")) {
				break;
			}
		}

	}

}
