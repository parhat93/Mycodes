package A_ArrayAndArraylist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicateiteamLocation {
	public static void main(String[] args) {
		
	//	 Set<Integer> set = new HashSet<Integer>();

//	        int[] array = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 8 };
//
//	        for (int i = 0; i < array.length; i++) {
//	            for (int j = 1; j < array.length; j++) {
//	                if (array[i] == array[j] && i != j) {
//	                    set.add(array[i]);
//	                }
//	            }
//	        }
//
//	        System.out.println(set);
		

//	        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
//	        int[] array = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 8 };
//	        for (int i = 0; i < array.length; i++) {
//	            for (int j = 0; j < array.length; j++) {
//	                if (array[i] == array[j] && i != j) {
//	                    result.put(i, array[i]);
//	                }
//	            }
//	        }
//	        System.out.println(result);
	
		
		int[] nums =  new int[] {1, 2, 5, 3, 2, 4, 5, 1};
		
		for(int i=0; i<nums.length;i++){
		    for(int j=i+1; j<nums.length;j++){
		        if(nums[i] == nums[j]){
		            System.out.println("duplicate item: "+nums[i]+" at Location "+i);
		        }
		    }
		}
		
//		int[] nums =  new int[] {1, 1, 2, 3, 3, 3};
//		Arrays.sort(nums);
//		
//		for (int i = 0; i < nums.length-1; i++) {
//
//		   if (nums[i] == nums[i+1]) {
//		       System.out.println("duplicate item "+nums[i+1]+" at Location"+(i+1) );
//		   }
//
//		}

		
		
	}
	
	
	
	public void u() {
		
	
	    

	int[] nums =  new int[] {1, 1, 2, 3, 3, 3};
	Arrays.sort(nums);
	
	for (int i = 0; i < nums.length-1; i++) {

	   if (nums[i] == nums[i+1]) {
	       System.out.println("duplicate item "+nums[i+1]+" at Location"+(i+1) );
	   }

	}
	
	
	
	
	}
	
}
