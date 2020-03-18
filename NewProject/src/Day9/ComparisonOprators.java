package Day9;

public class ComparisonOprators {

	public static void main(String[] args) {
			int pp1 =5;
			int pp2 =6;
			System.out.println(pp1 >  pp2);  // false 
			boolean comp = pp1 < pp2;
			System.out.println(comp);
			
			
			int apples = 10;
			int orange =  10;
			System.out.println(apples ==  orange);
			System.out.println(apples>=orange);
			
			char letter1='a';
			char letter2='b';
			comp = letter1 < letter2; // true
			System.out.println(comp);
			letter1++;
			letter1++;
			System.out.println(letter1);// a + 1 + 1 = c
			
			
			apples = 10; 
			orange = 10;
			System.out.println(apples != orange); // false because they are equal.
			
			
			comp = apples++ <= orange--;
			System.out.println(comp);
			
			apples = 10; 
			orange = 11;
			System.out.println(apples != orange);// true  because  they are not equal.

			
		
			
			
			
			
			
			
			
	}

}
