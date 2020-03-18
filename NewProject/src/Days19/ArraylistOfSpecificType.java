package Days19;

import java.util.*;

public class ArraylistOfSpecificType {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<Integer> listOfInts = new ArrayList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("C#");
		
		list.add("JavaScript");
		//list.add(1234); will not compile as it is not a string
		list.add(3,"C++");
		
		System.out.println(list);
		
		//add all kind of numbers then print only odd numbers
		//listOfInts
		listOfInts.add(23);
		listOfInts.add(21);
		listOfInts.add(33);
		listOfInts.add(22);
		listOfInts.add(2);
		listOfInts.add(232);
		listOfInts.add(1230);
		
		for(Integer num : listOfInts) {
			if (num % 2 != 0 ) {
				System.out.println(num + ",");
			}
		}
		
		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("milk");
		shoppingList.add("Orange juice");
		shoppingList.add("eggs"); // replace with cheese
		shoppingList.add("Pasta");
		shoppingList.add("Chocholate");
		shoppingList.add(0,"Guacomole");
		shoppingList.add("Tomatos");
		System.out.println(shoppingList);
		
		shoppingList.set(6, "Salsa");
		System.out.println(shoppingList);
		//find the position of eggs
		int index = shoppingList.indexOf("eggs");
		System.out.println(index);
		//replace eggs with cheese
		shoppingList.set(index, "cheese");
		
		System.out.println(shoppingList);
		
		System.out.println("TOTAL ITEMS in My Shopping list: " + shoppingList.size());
		
		//check if the milk is in our list
		if(shoppingList.contains("milk")) {
			System.out.println("We added milk");
		}else{
			System.out.println("Forgot to add milk!");
		}
		System.out.println("=====================");
		System.out.println("IN THE SHOP----");
		System.out.println("Bought milk");
		
		shoppingList.remove("milk");
		System.out.println(shoppingList);
		
		System.out.println("bought Guacomole");
		shoppingList.remove(0);
		
		System.out.println(shoppingList);
		
		System.out.println("Bought Orange Juice");
		shoppingList.remove("Orange juice");
		
		System.out.println("Bought cheese");
		shoppingList.remove("cheese");
		
		System.out.println(shoppingList);
		
		if(shoppingList.isEmpty()) {
			System.out.println("Done with shopping");
		}else{
			System.out.println("More shopping .. :(");
		}
		
		shoppingList.clear();
		
		if(shoppingList.isEmpty()) {
			System.out.println("Done with shopping!");
		}else{
			System.out.println("More shopping .. :(");
		}
		
		//----EQUALS--- COMPARE ARRAYLIST----
		
		
	}
}