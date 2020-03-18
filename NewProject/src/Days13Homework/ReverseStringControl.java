package Days13Homework;

//Write a method that will accept String as a
//parameter and will return reversed string back.
//Input: 
//Java
//Output:
//Reversed string: avaJ
import java.util.Scanner;

public class ReverseStringControl
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input the String, any word");
		String i = input.nextLine();
		ReverseString rev = new ReverseString();
		rev.reverse(i);

	}

}
