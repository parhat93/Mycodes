package Days14;

import java.util.Scanner;

public class ForloopNumber
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		if(n1 < n2) {
		for(int miles =n1; miles <= n2;miles++) {
			System.out.print(miles + " ");
		}
		
		}else if(n1 > n2) {
			for(int miles =n1; miles >= n2;miles--) {
				System.out.print(miles + " ");
			}
		}else {
			System.out.println(n1);
		}
		
		
		
		
	}

}
