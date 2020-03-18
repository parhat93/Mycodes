package Days17Homework;
//....1 

//...2 

//..3 

//.4 

//5 

public class LoopPattern {

	public static void main(String[] args) {
		
		for (int line = 1; line <= 5; line++) {
			// line * -1 + 5 is the fumula
			for (int dots = 1; dots <= line * -1 + 5; dots++) {
				System.out.print(".");
			}
			System.out.println(line);

		}
		
		for(int line2 = 5;line2 >=1;line2 --) {
			for(int dots =1;dots <= line2 *-1+5;dots++) {
				System.out.print(".");
			}
			System.out.println(line2);
		}
		
		
		
	}
}