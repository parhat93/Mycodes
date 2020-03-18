package Day3;

import java.util.Scanner;

public class ConversionProgram2 {
	
	public static void main(String[] args) {
		double side1;
		double side2;
		double degree;
	    double sin = 0.01745240644;
	    //double Area;
		//Area =1/2*c*b*sin(degree);
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter the first side of triangle: ");
		side1 = input.nextDouble();
		
		System.out.println("Enter the second side of triangle");
		side2 =input.nextDouble();
		
		System.out.println("Enter the degree of triangle");
		degree = input.nextDouble();
		
	    double Area = 0.5 * side1*side2*sin*degree;
		System.out.println("The Area of triangle is: " + Area);
		
		
	}

}
