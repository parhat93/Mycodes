package Days19;
 /*
  *  wholeNumbers: 
  *  			wropper claess
  *  -> byte --> Byte
  *  -> short--> Short
  *  -> int -->  Integer
  *  -> long --> Long
  *  
  *   Numbers with Decemals:
  *   --> float--> Float
  *   --> double ->Double
  *   
  *   Chraccters: 
  *   --> char -> Character
  *   
  *   Boolean:
  *   -> boolean --> Boolean
  *   
  *   
  */
public class CreateWrapperObjects {

	public static void main(String[] args) {
	// Wropper classes are provided functionality
	// created new object of integer
	// Integer is Wropper class
	Integer i = new Integer(100);
	System.out.println(i);
	
	Integer n = 123; // automatically convert to integer object from int
					// Process is called Auto-boxing
	System.out.println(n);
	
	Double d = new Double(23.55);
	Double d2 = 45.55; // 2 steps: take 45.55 value and crate ab object of 
						// Double wrapper class and assign to d2
	System.out.println(d + d2);
	
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	
	System.out.println(Double.MIN_VALUE);
	System.out.println(Double.MAX_VALUE);
	
	/* CompareTo:
	 * a   b
	 * a is larger than b and you get --> 1
	 * b is larger than a and you get --> -1
	 * a and b are equal you get --> 0
	 */
		
	System.out.println(d==d2); // false
	System.out.println(d.equals(d2)); // false
	System.out.println(d.compareTo(d2));// -1
	System.out.println(d2.compareTo(d));//  1
	
	Character ch = new Character('A');
	System.out.println(ch.equals('A')); // true
	System.out.println("=============================================");
	
	//1) Using new keyword : 
	Boolean b1 = new Boolean(true);
	Boolean b2 = new Boolean("true");
	Integer num = new Integer("123");
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(num);
	
	// 2) Direct assignment
	// there are object not premitives
	Double dVal = 800.12;
	Boolean b3 = false;
	
	// 3) ValueOf
	Integer count = Integer.valueOf(4000);
	Integer results = Integer.valueOf("12321312");
	Character ch1 = Character.valueOf('P');
	
	System.out.println(count);
	System.out.println(results);
	System.out.println(ch1);
	System.out.println("===============================");
	
	
	// Convert from Wrapper to primitive
	/*
	 * Wrapper class object and you want to covert to 
	 * primitive of same type
	 * 
	 * 
	 */
	
	Integer num1 = new Integer(100); // Wrapper object
	int num2 = num1; // unboxing from Integer object to int primitive
	
	System.out.println(num2);
	
	int k = 356;
	Integer k1 =k; // autoBoxing from int --> Integer
	
// AutoBoxing --> primitive --> Wrapper Class
// Unboxing  --> wrapper class object --> primitive


	// Comparing wrapper class objects
	
	
	
	
	}

}
