package Days10;
import java.util.Scanner;
public class NameChecker {





	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name = input.nextLine();	
	char firstLetter = name.charAt(0);
	
	
	if (firstLetter !='A') {
		System.out.println("Name is not starts with A");
	}else {
		System.out.println("The name starts with A");
	}
	}

}
