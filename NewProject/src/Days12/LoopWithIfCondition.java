package Days12;

public class LoopWithIfCondition {

	public static void main(String[] args) {
		// a program that prints even numbers
		// between 0 and 100
		int num =0;
		while(num<=50) {
			if(num % 2 == 0) {
				System.out.print(num+" ");
			}
				num++;
		}
		System.out.println("");
		num = 0;
		while(num <=50) {
			if(num % 2 != 0) {
				System.out.print(num+" ");
				
			}
			num++;
		}

		
	}

}
