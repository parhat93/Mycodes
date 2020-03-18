package Static;

import java.util.List;
import java.util.ArrayList;



public class Shopping {
	
	static List <String> itemsToBuy; // empty array list
	
	static {  // this static called static bloks.
		itemsToBuy = new ArrayList<>();
		itemsToBuy.add("coffee");
		itemsToBuy.add("shirt");
		itemsToBuy.add("shoes");
		itemsToBuy.add("laptop");
		System.out.println("IN STATIC BLOCK");
	//	System.out.println("Welcome to our mall");
		//buy("coffe");
	}
	
	public static void showShoppingList() {
		System.out.println(itemsToBuy);
	}
	
	public Shopping() {
		System.out.println("In shopping Constructor");
	}
	
	public static void buy(String itam) {
		itemsToBuy.remove(itam);
		System.out.println("Buying : " + itam);
		
	}
	
	public void returnIteam(String item) {
		System.out.println("Returning : " + item);
	}
	// if we have second static block 
	// it will be show on top to botton
	static {
		System.out.println("IN STATIC BLOCK 2");
		
	}
	
}
