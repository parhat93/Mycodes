package Day5;

// Description:
// Write a Java program that reads a number in inches
// converts it to meters.Note: One inch is 0.0254 meter.
// one foot is 0.3048 meter
//
 import java.util.Scanner;  // Scanner is class that we borrow from JAVA.
 public class ConversionProgram {

 public static void main(String[] args) 
 {
	 	     
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the value for inch: ");
     double inch = input.nextDouble();    
     double meter = inch * 0.0254;  
     System.out.println(inch + " inch is " + meter + " meters");
     
	}

}
