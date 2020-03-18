package Day7;


import java.util.Scanner;
public class RectangleClassControl {

	public static void main(String[] args) {
		RectangleClass user1 = new RectangleClass();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		user1.a = input.nextInt();
		System.out.println("Enter the width of rectangle: ");
		user1.b= input.nextInt();
		
		
		
		int result = user1.perimeter (user1.a, user1.b);
		System.out.println("The perimeter of the rectangle is " + result + ".");		
		
	
		int result2 =user1.area(user1.a, user1.b);
		System.out.println("The area of the rectangle is " + result2 + "." );
		
		
		
		
		

	}

}
