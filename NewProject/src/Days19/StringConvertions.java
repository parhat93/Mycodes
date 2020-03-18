package Days19;

public class StringConvertions {

	public static void main(String[] args) {

		String str = "1234";
		// make sure value of str is more than 0
		// convert str to Integer object
		// Both valueOf and parseInt can take a string and 
		// convert to number.
		
		
		Integer count = Integer.valueOf(str);
		//valueOf after converting will return an wrapper class object.
		int count2 = Integer.parseInt(str);
		// parseInt after converting will return a primitive int.
		
		if (count2 > 0) {
			System.out.println("It is more than 0");
		} else {
			System.out.println("Not more than 0");
		}
		
		String searchCount = "1234567";
		
		//1) convert this to Integer wrapper class
		Integer searchIntegerWrapper = Integer.valueOf(searchCount);
		
		// it is UnBoxing Onject > primitive
		int searchIntPremitive = Integer.valueOf(searchCount);
		
		//2) convert to int
		int searchIntpre = Integer.parseInt(searchCount);
		// it is AUTO-Box primitive > Object 
		Integer searchIntpr2 =Integer.parseInt(searchCount);
		
		/*Summary:
		 * each primitive has a wrapper class
		 * and provides useful methodds when working with primitives
		 * wrapper classes are create objects
		 * different ways to create a wrapper class object
		 * 1) new 
		 * 2) valueOf
		 * 3) =
		 * we can campare wrapper classes using .equals or ,compareTo
		 * AutoBoxing --> primitive > wrapper class object
		 *   double d1 = 123.323;
		 *   Double d = d1;
		 *   
		 * Unboxing --> wrapper class object > primitive
		 * 	Double d = new Double(123.45);
		 *  double d1 = d;
		 *  
		 * String > wrapper object
		 * 	 String s1 = "32.33"; 
		 *   Double d1 = Double.valueOf(s1);
		 *   Double d1 = new Double(s1);
		 *   
		 *  String > primitive
		 *	 String s1 = "32.33"; 
		 *   Double d1 = Double.parseDouble(s1);
		 *   
		 * 
		 */
		
	
	
		
		
		
		
		
		
		
		
		
		
	}

}
