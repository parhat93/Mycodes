package Days18;

import java.util.Arrays;

public class PizzaNestedArrayLoop {

	public static void main(String[] args) {

		String[][] pizza = {{"Mushroom", "Black Olive", "Green Pepper"},
							{"Spinich", "Green Pepper", "Mushroom"},
							{"Black Olive", "Black Olive", "Spinach"},
							{"Mushroom", "Mashroom", "Red Pepper"},
							{"Banana Pepper", "Spinach", "red Pepper"}};

		for (int i = 0; i < pizza.length; i++) {
			//System.out.println(Arrays.toString(pizza[i]));
			
			System.out.print(" slice " + (i + 1) + "--> ");
			String [] eachSlice = pizza[i];
			
			for(int j = 0; j < eachSlice.length; j++) {
				System.out.print(eachSlice[j] + " ");
				
			}
			System.out.println();
		}
		System.out.println("===========");
		for (int i = 0; i < pizza.length; i++) {
			//System.out.println(Arrays.toString(pizza[i]));
			
			System.out.print(" slice " + (i + 1) + "--> ");
			String [] eachSlice = pizza[i];
			
			for(int j = 0; j < eachSlice.length; j++) {
				if(eachSlice[j].equals("Black Olive")){
					continue;
				}
				System.out.print(eachSlice[j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("===========");
		SliceLoop:
		for (int i = 0; i < pizza.length; i++) {
			//System.out.println(Arrays.toString(pizza[i]));
			
			System.out.print(" slice " + (i + 1) + "--> ");
			String [] eachSlice = pizza[i];
			
			for(int j = 0; j < eachSlice.length; j++) {
				
				if(eachSlice[j].equals("Banana Pepper")){
					break SliceLoop;
				}
				System.out.print(eachSlice[j] + " ");
			}
			System.out.println();
		}
		

	}
}
