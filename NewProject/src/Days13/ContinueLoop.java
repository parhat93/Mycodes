package Days13;

public class ContinueLoop {

	public static void main(String[] args) {
		
		for(int i= 0; i<11;i++) {
			
			if(i % 2 !=0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("===================");
		// loop from 10 to 1 and print
		// skip the numbers that dividable by 3
		
		
		for(int i = 10; i>0;i--) {
			if(i % 3 == 0) {
				continue;
			}
			
			if(i % 4 == 0) {
				break;
			}
						
			System.out.print(i + " ");
			
		}
		
		
		
		
		
		
		
	}

}
