package Days17Homework;

import java.util.Scanner;

// Create Java program that will display
// student grade using switch statement.
// Use char for grade;
// If grade is A print "Excellent"
// If grade is B print "Good Job"
// If grade is C print "Good"
// If grade is D print "Poor"; 
// If grade is F print "Fail";
// default → "Invalid grade.ABCDF only"
public class GradeWithSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the grade: ");
		char grade = input.next().charAt(0);
		
		switch (grade){
			case 'A':
				System.out.println("Excelletnt");
				break;
			case 'B':
				System.out.println("Good job");
				break;
			case 'C':
				System.out.println("Good");
				break;
			case 'D':
				System.out.println("Poor");
				break;
			case 'F':
				System.out.println("Fail");
				break;
				default:
					System.out.println("Invalid grade.ABCDF only");
					break;
				
		}

	}

}
