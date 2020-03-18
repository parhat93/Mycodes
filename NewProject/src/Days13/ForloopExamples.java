package Days13;

public class ForloopExamples {

	public static void main(String[] args) {

		// for(;;) {
		// for(initialization;condition; updates ){
		// initialization is int i = 0
		// condition is boolean condition i > 10 ,
		// increment the number i++
		// do this again and agin
		// }

		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println(i);

		}

		System.out.println();
		System.out.println(i); // this is outside the for loop
								// so, i voulue become 6 because 5+1

		System.out.println("===============================");
		// this loop reverse
		for (int x = 9; x >= 0; x--) {
			System.out.print(x + ",");
		}
		System.out.println("");
		// print the odd number
		for (int j = 0; j < 50; j++) {
			if (j % 2 != 0) {
				System.out.print(j + ",");
			}
		}
		System.out.println("");
		System.out.println("=================");
		// using array is for loop
		
		String[]fruits = new String[3];
		fruits[0]="apples";
		fruits[1]="banana";
		fruits[2]="orange";
		for(int y=0; y < 3; y++) {
			System.out.println(fruits[y]);
		}
		
		
// you have 10 number in an array, how to get sum of all the number
		int total = 0;
		for(int z = 1; z< 10; z++ ) {
			System.out.println("value of i is " + z);
			total = total + z;
			System.out.println("total number is "+total);
			
	}
		System.out.println("sum of all number is " + total);
		
		
		
		
		
		
	}
}
