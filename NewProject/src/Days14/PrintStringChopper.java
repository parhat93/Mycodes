package Days14;

import java.util.Scanner;

public class PrintStringChopper {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String to chop: ");
		String word = input.next();
		
//		System.out.println("How many caracter");
//		int count = input.nextInt();
		
		
		for(int index = 0; index < word.length(); index++) {
			if(index +1 < word.length()) {
				System.out.println(word.charAt(index)+""+word.charAt(index+1));
				index++;
			}else {
				System.out.println(word.charAt(index));
			}
			
			
			
		}

	}

}
