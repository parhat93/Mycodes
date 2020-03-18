package Days11;

import java.util.Scanner;
public class IfelsesNestedDrinkorder {

	public static void main(String[] args) {
//	Scanner input  =  new Scanner(System.in);
//	System.out.println( "enter the drink:");
//	String name  = input.nextLine();
	//  create condition to check if person want cold or hot drink
//       if (cold){
	//   if cold -> water or juice?
	//	 if(water){
	//    water
	//}
	// }else if (hot){
	  // if tea{
//     tea{
		

	
	// if cold -> water or juice?
	// if hot  -> tea  or coffee?
	boolean hot =false;
	boolean cold = true;
	
	if(hot) {
		System.out.println("do you want tea or coffee?");
		boolean tea = true;
		boolean coffee = false;
		if(tea) {
			System.out.println("You selected tea");
		}else if (coffee) {
			System.out.println("You selected coffee");
		}else {
			System.out.println("customer change his mind, no hot");
		}
	}
	
	
	else if(cold){
		System.out.println("do you want water ot juice?");	
		boolean water = false;
		boolean juice = false;
		if(water) {
			System.out.println("You selected water");
		}else if (juice) {
			System.out.println("you slected juices");
		}else {
			System.out.println("Customer changed his mind, no cold");
		}
	}
	
	else {
		System.out.println("No drinks selected");
	}
		
		
		
	}

}
