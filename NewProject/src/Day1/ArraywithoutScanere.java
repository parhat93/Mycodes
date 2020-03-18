package Day1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArraywithoutScanere {



	    public static void main(String[] args) {

	    	
	    	
	    	int[] nums = { 1, 2, 5, 3, 2, 4, 5, 1,1,100,200,200,453534,453534 };
	        int[] result = new int[nums.length];
	      //  int[] arr2 = new int[arr1.length];
	        int counter = 0, count = 0;
	        for (int i = 0; i < nums.length; i++) {
	            boolean isDistinct = false;
	            for (int j = 0; j < i; j++) {
	                if (nums[i] == nums[j]) {
	                    isDistinct = true;
	                  break;
	                }
	            }
	            if (!isDistinct) {
	                result[counter++] = nums[i];
	            }
	        }
	        for (int i = 0; i < counter; i++) {
	            count = 0;
	            for (int j = 0; j < nums.length; j++) {
	                if (result[i] == nums[j]) {
	                    count++;
	                }
	            }
	            System.out.println(result[i] + " has occurred " + count + "  time!");
	        }
//	        int [] num = {1,2,2,2,4,4,5,6,7,8,6};
//	        	   
//	        int temp = 0;
//	       int count =0;

//	        for(i=0; i < num.length; i++){
//
//	            if(num[i] == 0){
//	                break;
//	            }
//	        }
	       
//	       for (int i = 0; i < x.length; i++) {
//
//	    	    for (int j = i + 1; j < x.length; j++) {
//
//	    	        if (x[i] == x[j]) {
//	    	            y[i] = x[i];
//	    	            times[i]++;
//	    	        }
//
//	    	    }
//
//	    	}
//	       
//	        for(int i = 0; i < num.length; i++){
//	       //     temp = num[i];
//	            //count[temp]++;
//	  
//	            for (int j = i + 1; j < num.length; j++) {
//					
//	            if(num[i] == num[j]){
//	   
//		             temp++;
//		             }
//	        }
//	            System.out.println(num[i] +" occurs"+ temp);
//	        }
//	
//	
}
}