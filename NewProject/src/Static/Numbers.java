package Static;
/*What is static keyword ?
 * We can hava static:
 * Variables, methods, blocks, Inner classes
 *  
 *  Static memebers belong to class directly and can be called 
 *  or used without creating an objects
 *  
 *  code in static block runs only once when you refer/use the class.
 *  
 *  static variables are shared variables and there in only
 *  one copy of it all the time.
 *  
 *  Initialization block is expressed using { } and code in 
 *  Initialization block runs everytime you create on object
 *  and before constructor and after static block.
 */

public class Numbers {

	static int count = 10;
	
	static {
		count*=2; // 20
	}
	
	{
		count--; // 19  // 28 
	}
	
	public Numbers() {
		count = count + 10;//29  // 38
	}
	
	public static void main(String[] args) {
		Numbers n = new Numbers();
		System.out.println(n.count); // 29
		
		n= new Numbers();
		System.out.println(n.count);  //38
	}
}
