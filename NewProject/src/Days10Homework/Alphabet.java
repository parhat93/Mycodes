package Days10Homework;
// Write a Java program that takes the user to provide 

// a single character from the alphabet. Print Vowel or Consonant,
// depending on the user input. If the user input is not a letter 
// (between a and z or A and Z), or is a string of length > 1, print an error message.
// Input:
// Input an alphabet: b
// Output :
// Input letter is Consonant
// Vowel: A e i o u   , sozuk tatux which is a  speech sound is produced by 
// comparatively open configuration of the vocal tract.
// Consonant: B C D F G H J K L M N P Q R S T V W X Y Z   uzuk tawux
// a basic speech sound in which the breah is at least partly obstrycted
// and which can be combined with a vowel to form a syllable.

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		String character = input.next().toLowerCase();

		if (character.length()>1) {
			System.out.println("Error only alphaber please");
			
		}else if (character.equals("a") | character.equals("e") | character.equals("i")
				| character.equals("o") | character.equals("u")) {
			System.out.println(character + " letter is Vowel.");
		} else {
			System.out.println(character + " letter is Consonent");
		}
			
		
		
		
//		else if (character.length() == 1) {
//			System.out.println("Error only alphaber");
//		} else {
//			System.out.println(character + " letter is Consonent");
//		}

	}
}