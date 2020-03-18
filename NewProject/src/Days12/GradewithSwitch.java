package Days12;
//Create Java program that will display 
// student grade using switch statement.
//Use char for grade;
//If grade is A print "Excellent"
//If grade is B print "Good Job"
//If grade is C print "Good"
///If grade is D print "Poor"; 
//If grade is F print "Fail";
//default → "Invalid grade.ABCDF only"

import java.util.Scanner;
public class GradewithSwitch {

	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your grade: ");
		char grade = input.next().charAt(0);
		
		switch(grade) { // byte, short, int, char, String,enum
		case 'A':
		case 'a':
			System.out.println("Excellet");
			//break;
		case 'B':
		case 'b':
			System.out.println("Good job");
			break;
		case 'C':
		case 'c':
			System.out.println("Good");
			break;
		case 'D':
		case 'd':
			System.out.println("Poor");
			if(grade == 'A') {
			
			}
			break;
		case 'F':
		case 'f':
			System.out.println("Fail");
			break;
		default:
				System.out.println("Invalid grade. ABCDF only");
		}
		
	}

}
