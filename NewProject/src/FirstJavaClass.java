
public class FirstJavaClass {

	
	// A main () method is the gateway between the startup of a Java process, 
	public static void main(String[] args) {
		
		System.out.println("Hello world jalaps!!");
		
		/** I am creating object of the Firstclass and initializeg as fistjavaclass**/
		FirstJavaClass firstjavaclass = new FirstJavaClass();
//		firstjavaclass.publicMethod();
//		firstjavaclass.privateMethod();
//		firstjavaclass.protectedMethod();
//		firstjavaclass.defaultMethod();
		
		
		// comment until end of line
		/* Multiple line comment */
		/** 
		 * 
		 * Javadoc multiple-line comment @author parhat 
		 * 
		 * 
		 * **/
		
		//what is the primitive 
		//eight primitive data types
	//	int millon=1000000000;
		int millon=1_000_000_000;
		System.out.println(millon);
		int number;  // Declaring varable 
		number =5;  //  Initializing Variables
		System.out.println(number);
	
		double elyasjalapu= 3.65665;
		System.out.println(elyasjalapu);
		
		byte bt=99;
		System.out.println(bt);
		
		float f = 33333.777f;
		System.out.println(f);
		
		char c = 'd';
		System.out.println(c);
		
		short s =4343;
		System.out.println(s);
		
		long l =3333333333333333389l;
		System.out.println(l);
		
		boolean b = false;
		System.out.println(b);
		
	}
	
	//Access modifier 	
	public String publicMethod() {
		System.out.println("public The method can be called from any class.");	
		String elyas ="elyas jalap";
		System.out.println("public The method can be called from any class. " + elyas);	
		return elyas;
	}
	
	private void privateMethod() {
		System.out.println("private The method can only be called from within the same class.");
	}
	
	protected void protectedMethod() {
		System.out.println("The method can only be called from classes in the same package or subclasses.");
	}
	
	  void defaultMethod() {
		System.out.println("Access The method can only be called from classes in the same package. ");
	}
	
}
