package Day1;

import java.util.Arrays;

public class Arraywithposition {


public static void main(String[] args) {
	
	int[] nums =  new int[] {1, 1, 2, 3, 3, 3};
	Arrays.sort(nums);
	for (int i = 0; i < nums.length-1; i++) {

	   if (nums[i] == nums[i+1]) {
	       System.out.println("duplicate item "+nums[i+1]+" at Location"+(i+1) );
	   }

	}
	
	
	
}
	
	
}
