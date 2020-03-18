package Days13Homework;

//Write a method that will accept String as a
//  parameter and will return reversed string back.
//Input: 
// Java
// Output:
//Reversed string: avaJ

import java.util.Scanner;

public class ReverseString
{

	public String reverse(String str)
	{
		String result = " ";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			result = result + str.charAt(i);
		}
		System.out.println(result);
		return str;
	}


}