package Day1;

import java.util.Arrays;

public class Arraycountwithsorting {

	public static void main(String[] args) {
		
		int[] arr1 = {3,4,3,4,4,3,2,2,5,3};
		int[] arr2 = new int[arr1.length];
		Arrays.sort(arr1);

		for (int i = 0; i < arr1.length; i++) {
		    arr2[i]++;
		    if (i+1 < arr1.length) 
		    {
		        if (arr1[i] == arr1[i + 1]) {
		            arr2[i]++;
		            i++;
		        }
		    }
		}

		for (int i = 0; i < arr1.length; i++) {
		    if(arr2[i]>0)
		    System.out.println(arr1[i] + ":" + arr2[i]);
		}
		
		
	}
	
	
}
