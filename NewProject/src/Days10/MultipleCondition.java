package Days10;

public class MultipleCondition {

	public static void main(String[] args) {
	
		
		// true and true ---> true
		// true and false ---> false
		// false and false ---> false
		// false and true ---> false
			int i =15; 
		if (i <15 && i>5  ) {
			System.out.println("It is true !!! value of i is 5<i<15 ");
		}else {
			System.out.println("not true");
		}
			
		if (i < 16 && i++>5  ) {
			System.out.println(" value of i is 5<i<15 ");
		}else {
			System.out.println("not true");
		}
			
		System.out.println("value of i is " + i); // 15 ++ 1 =16
		
	}

}
