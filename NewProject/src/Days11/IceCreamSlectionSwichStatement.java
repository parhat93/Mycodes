package Days11;

import java.util.Scanner;

public class IceCreamSlectionSwichStatement {

	private static Object defult;

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your ice cream selection");
		
		String selection = input.nextLine();
		
		switch(selection.toLowerCase()) {
		case("strawberry"):
			System.out.println("You selected Strawberry");
			break; // we must have a break after   case otherwise
					// it will  print  everything.
		case("sranberry"):
			System.out.println("You selected cranberry");
			break;
		case("banana"):
			System.out.println("You selected banana");
		break;
		default:
			System.out.println("There are no such a  think, stupid fucker.");
			break;
		case("apple"):
			System.out.println("You selected apple");
		break;
		}
	}

}
