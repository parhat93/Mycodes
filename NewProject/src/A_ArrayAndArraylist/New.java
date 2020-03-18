package A_ArrayAndArraylist;

import java.util.Scanner;

public class New {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		    System.out.println("Enter X lenght");
			int x = input.nextInt();
			
			System.out.println("Enter Y lenght");
			int y = input.nextInt();
			
			System.out.println("Enter Z lenght");
			int z = input.nextInt();
		
			
			if(x==z && x==y) {
				
					System.out.println("This is equal tranagle");
				
				if(x==y) {
					if(x!=z ) {
						if(y!=x)
							if(x!=y)
						System.out.println("This is two side equal tranagle");
					}
				}
			}
			
	}
	
}
