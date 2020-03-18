package Days12;

public class WhileloopAndDowhileLoop {

	public static void main(String[] args) throws InterruptedException {
		int num=10;
		int num1=5;
		
		while(num1 >= 0) {
			System.out.print(num1+" ");
			num1--;
		}
		System.out.println(" ");
		
		do {  // do the action first. Run the code in the bady first
			System.out.print(num+" ");
			Thread.sleep(1000);
			num--;
		}while(num >= 0); // Check the condition at the bottom.
	}

}

