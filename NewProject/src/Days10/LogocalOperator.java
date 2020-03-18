package Days10;

import java.util.Scanner;
public class LogocalOperator {

	public static void main(String[] args) {
		String name1="ABC";
		boolean startWith_A = name1.startsWith("A");
		boolean endWithn_C = name1.endsWith("C");
		
		if (startWith_A && endWithn_C) {
			System.out.println("Bingo");
		}else {
			System.out.println("try one more time");
		}
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name ?");
		String name = input.nextLine();
		
		char firstLetter = name.charAt(0);
		char lastLetter = name.charAt(name.length()-1); // this will tell us the last letter of the letter.

		
		if (firstLetter != 'A' && lastLetter != 'C') {
			System.out.println("it not start with A anf C");
		}else {
			System.out.println(" wow you got it");
		}
		
		
		
//		if(name.startsWith("A")&& name.endsWith("C")) {
//			System.out.println("you get it your name is start with A and C");
//		}else {
//			System.out.println("no");
//		}
		
		

	}

}
