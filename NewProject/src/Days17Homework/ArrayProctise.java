package Days17Homework;

import java.util.Scanner;
public class ArrayProctise {

	public static void main(String[] args) {
		String names[] = {"Erick", "Lisa", "Hose", "Roger", "Nina", "Ekaterina",
				"Peter", "Sara"};
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Name");
		String number = input.next();

		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(number)) {
				System.out.print(i);
			}
			
		}
		System.out.println();
		String names1[] = {"Erick", "Lisa", "Hose", "Roger", "Nina", "Ekaterina",
				"Peter", "Sara"};
		System.out.println("Enter number now:");
		int num = input.nextInt();
		
		for(int i = 0; i < num;i++) {
				if(names1.equals(num)) {
					System.out.println();
				}
		}
	}

}
