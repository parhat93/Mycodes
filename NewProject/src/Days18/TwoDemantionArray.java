package Days18;

import java.util.Arrays;

public class TwoDemantionArray {

	public static void main(String[] args) {
		System.out.println("=======One Demention Array");
		int [] array1 = new int[3];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		
		int [] array11= {1,2,3,4,5};
		for(int i = 0 ; i < array11.length;i++) {
			System.out.print(array11[i] +  " ");	
		}
	System.out.println();
		System.out.println("=======Two Demention Array======");
		
		long [][] array22 = new long[2][3];
		array22[0][0]=1332;
		array22[0][1]=12312;
		array22[0][2]=231;
		array22[0][2]=13123;
		System.out.println(array22[0][0]);
		long [][] array2 = { {1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(array2));
		
		
		
		
		double [][][] array3;
		
		
	
		
		
	}

}
