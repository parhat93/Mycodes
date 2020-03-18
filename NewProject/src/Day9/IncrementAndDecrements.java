package Day9;

public class IncrementAndDecrements {

	public static void main(String[] args) {
		int pp1=3;
		pp1 ++; // increments by one;
		// pp1=pp1 + 1
		System.out.println(pp1);
	
	
		++pp1;
		System.out.println(pp1);
			++pp1;
			++pp1;
			System.out.println(pp1);
			--pp1;
			System.out.println(pp1);
			++pp1;
			System.out.println(pp1);
			
			//pp1 -=1; pp--;--pp;
		System.out.println("===============================================");
		
		
		int pp2 =5;
		int totalpp1 =pp2++ ;  //  
		// if ++pp2 then totalpp1 = 6 and pp2 will be 6 as well, because it added 1 to original pp2; 
		//  if pp2++ then totalpp1 =6 and pp2 won't change and it is 5 because this is not incrementing.
		System.out.println(totalpp1);
		System.out.println(pp2);
	System.out.println("==========================");	
		int pp3=5;
		int totalpp3=5;
		// 12     6     +      6     
	//	totalpp3=pp3++  +  ++pp3;12
//		   since  ++pp3 is 6 that mean pp3++ is 6.              ++pp3 always stars first it was 5 we add 1 then  equal 6.
		
		
		System.out.println(totalpp3);
		System.out.println(pp3);
		
	 System.out.println("=============================");	
		
		int i =2;
		int j =3;
		
		
		
		
		
		
		
		
		
		
		
	}

}
