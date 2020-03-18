package Days19;

public class ComparingWrappers {

	public static void main(String[] args) {
		
		Integer n1 = new Integer(10);
		Integer n2 = new Integer(10);
		
		Boolean b = n1==n2;
		// because they are pointing at different value.
		// When you create Wrapper objects using new operator
		// it will create new separate object in the heap.
		
		System.out.println(b); //false
		//b is false because n1 and n2 are referring to 2 
		// different object even though they have same value.
		Integer n3 = new Integer(10);
		Integer n4 = new Integer(10);
		
		Boolean b1 = n3.equals(n4);
		System.out.println(b1);
		
		b = n1==100;
		System.out.println(b);
		System.out.println("======ValueOf====");
		//-127 to 127 is true byte range
		// rest of the are false
		Integer q = Integer.valueOf(55); //true
		Integer q2 = Integer.valueOf(125);
		Integer q3 =125;
		System.out.println(q==q2);
		System.out.println(q2==q3);
		System.out.println("===================");
		
		Integer inValue = 100;
		Short shortValue = 100;
		
		System.out.println(inValue.equals(shortValue));
		// System.out.println(inValue==shortValue); won't compile as it is 
		
		/*
		 * Summary of camparing Wrapper class objects
		 * 
		 * 1) when we create wrapper class onject using new 
		 * keyword then new object is created everytime
		 * and 
		 * == will result in false.
		 * .equals--> true
		 * 
		 * 2) when we create wrapper class onject using .valueOf or autoboxing:
		 * 
		 *    a) if value is in range -128 to 127 then same object
		 *    will  be reused and 
		 *    ==> true
		 *    .equals --> true
		 *    
		 *    b) all other values will:
		 *    == -> false
		 *    .equals --> true
		 *    
		 *    c) Byte, Short, Integer, Long wrapper claasess
		 *    Double does not reuse anything, it is a new object every time:
		 *    
		 */
		Double d = Double.valueOf(100.11);
		Double d2 = Double.valueOf(100.11);
		System.out.println(d==d2);
		System.out.println("======================");
		String str = "100";
		Integer i = Integer.valueOf(str);
		System.out.println(i);
		
	}

}
