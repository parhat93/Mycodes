
package Day_two;

public class methodAndCall {
	
	public static void main(String[] args) {
		
		
		// create an method that has print stetement and
		// call that method and run 
		// also, create all(8) the primitive methods and print what is that method about
		// those methods should be in different class and call those methods
		// it shouldn't be static 
		// I give you guys 10 minute 
		methodAndCall m = new methodAndCall();
		AllPrimitiveMethods ap = new AllPrimitiveMethods();
		m.method();
		
		System.out.println(ap.booleanMethod());
		System.out.println(ap.doubMethod());
		System.out.println(ap.intMthod());
		
	}
	
	public void method() {
		System.out.println("This is a method, which from breakbad.!!");
	}
	
	
	
	
}
