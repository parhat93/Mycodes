package Days12Homework;
//Create a program that will keep asking user for input 
//until one of the following letters will be entered:
//“Y” or  “y” or  “N” or  “n"
//For this program you will need to use DO WHILE loop
import java.util.Scanner;
public class LoopUserInput {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter the guess letters");
	String letter ;
	
	letter =input.next();
	
	do {
		
		System.out.println("Please try again, it not the guess letters");
		letter = input.next();
		
	}while(!letter.equals("Y") & !letter.equals("y") & ! letter.equals("N")& ! letter.equals("n"));
		
	
	System.out.println("You get guess letters.");
		// it give us the answer at he second time 
		// because this is Do while statement
	}

}
