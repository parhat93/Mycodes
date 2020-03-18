package Days18;

import java.util.Arrays;

public class MultyDementionArray {

	public static void main(String[] args) {
		
		int     [] oneD;      //   = {1,2,3,4,5}; we must declare everynumber here.
		long   [][] twoD;
		double[][][] threeD;
		
	
		
		
		oneD = new int       [5];
		twoD = new long     [5][2];
		threeD = new double[3][2][2];
		
		System.out.println("====== One Demention Array=====");
		// it is not requred to declare all of them.
		//	oneD = new int       [5];
		//	oneD = new int[] {1,2,3,4,5};
		oneD[0] = 12;
		oneD[2] = 27;
		System.out.println(Arrays.toString(oneD));// 12 0 27 0 0 
		
		System.out.println("====== Two Demention Array=====");
		
		twoD[2][0] = 100;     // cell at 3rd Row 1st Column
		twoD[4][1] = 200;	  // cell at 5th Row 2ed Column
		
		twoD[3] = new long[] {300,400};
		twoD[1] = new long[] {123,123,123,12312,12312,123123,12323,1231};
		System.out.println(Arrays.deepToString(twoD));
			
		System.out.println("====== three Demention Array=====");
		// 3nd sheet 2rd row 1st dolum
		threeD[1][1][0] = 131232.312;
		System.out.println(Arrays.deepToString(threeD));
		  
		// way to create array in one line with all it's value
		// oneD = {12,32,42,23};
		// two demention array in one line;
		int [][] twoDD = {
				             {12,32,42,23},	
				             {14,12,31,23}	
		                 };
		int [][] twoDD2 = {
							{12,32,42,231212},	
							{14,12121,31,2312}	
            };
		
		int [][][] threeDD = {twoDD,twoDD2};
		int [][][] threeDD2= { {   {12,26,56}, {12,3123}   }   ,  {   {123,3123}, {0}   }   } ;
		
							
						
							
	                       
		
	}

}
