package Days13;

public class Looper {

	public void LoopFromNumToNum(int start, int end) {

		for (int i = start; i <= end; i++) {
			System.out.println(i + " ");
		}
		
	}
	
	// you have 10 number in an array, how to get sum of all the number
//	int total = 0;
//	for(int z = 1; z< 10; z++ ) {
//		System.out.printlu("value of i is " + z);
//		total = total + z;
//		System.out.println("total number is "+total)
		
//	}
//	System.out.println("sum of all number is " + total)
		
	
	public int LoopAndSum(int start, int end) {
		int total =0;
		for(int i=start; i <=end; i++) {
			
			total= total +i;
			
		}	
		  return total;
		
		

		
		
	}

}
