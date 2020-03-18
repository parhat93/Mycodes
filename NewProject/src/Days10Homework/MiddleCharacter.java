 package Days10Homework;

// Write a Java method to display the middle character of a string. Go to the editor
// a) If the length of the string is odd there will be two middle characters.
// b) If the length of the string is even there will be one middle character.
// Input:
// Input a string: elephant 
// Output:
// The middle character in the string: ph

import java.util.Scanner;
public class MiddleCharacter {

//	public static void main(String[] args) {
//		
//	        Scanner in = new Scanner(System.in);
//	        System.out.print("Input a string: ");
//	        String str = in.nextLine();
//	        System.out.print("The middle character in the string: " + middle(str)+"\n");
//	    
	String vages;
	
		public static String middle(String str)
	    {
	        int position;
	        int length;
	        if (str.length() % 2 == 0)
	        {
	            position = str.length() / 2 - 1;
	            length = 2;
	        }
	        else
	        {
	            position = str.length() / 2;
	            length = 1;
	        }
	        return str.substring(position, position + length);
	    }
		public static void main(String[] args) {
			
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input a string: ");
	        String str = in.nextLine();
	        System.out.print("The middle character in the string: " + middle(str)+"\n");
	}
}
