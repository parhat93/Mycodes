package Days16;
/*
 * 
 */
import java.util.Scanner;

public class forloopproctice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter word: ");
		String wordToTest = input.nextLine();
		String reversed = ""; 
		// String 
		
		//reverse the wordTotest and assign to reversed
		
		for(int i = wordToTest.length()-1; i >= 0 ; i--) {
		//	System.out.println(wordToTest.charAt(i));			
		reversed += wordToTest.charAt(i);
			System.out.println(reversed);
		}	
		
		if(reversed.equalsIgnoreCase(wordToTest)) {
			System.out.println("Is palindrome");
		}else {
			
			
			System.out.println("Is not Palindrome");
		}
	}

}
