package Days18;

import java.util.Arrays;

public class UsingNestedLoopInArray {

	public static void main(String[] args) {
		System.out.println("=====One demention Array Loop");
		int [] array11= {1,2,3,4,5};
		for(int i = 0 ; i < array11.length;i++) {
			
			System.out.print(array11[i] +  " ");
		}
			System.out.println();
			
		for( int eachDuck : array11) {
			System.out.print(eachDuck + " ");
		}
		
		System.out.println();
		System.out.println("=====Two demention Array Loop");
		
		int [][] Ponds = { {1,2,3,4}, {3,2,1,0}, {2,2,4,5} };
		
		for(int i = 0 ; i < Ponds.length;i++) {
			
		for(int j = 0 ;j < Ponds[i].length;j++) {
				System.out.print(Ponds[i][j] + " ");	
		}	
		System.out.println();
		}
		
		//	int [] eachPond = Ponds[i];
		//	System.out.println(Arrays.toString( Ponds[i]) );
		//	System.out.println(Arrays.toString(eachPond));
		//  add 20 to the #1 duck number
		//	eachPond[0] = eachPond[0] + 20;
		//  System.out.println(Arrays.deepToString(Ponds));

	}

}
