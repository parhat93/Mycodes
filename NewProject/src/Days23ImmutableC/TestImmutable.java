package Days23ImmutableC;

public class TestImmutable {

	public static void main(String[] args) {
		ImmutableC immutable = new ImmutableC("Square",20,45);
		
		System.out.println(immutable.getShape());
		System.out.println(immutable.getWidth());
		System.out.println(immutable.getLength());
		
		// Immutable class is designed in such a way that
		// a private variables accepts initial value from constructor
		// and those values can not be 
		// changed / updated because we do not privide setter methods.
		
	//	--> Constructor sets values to private variables
	//	--> there aer getters to rea value from private variables
	//	--> there no setters to be able to update values o private
		
		/*Every person HAS_A contact information
		 * HA-A relation between classes
		 * 
		 * Whenever e declare an instance variable of one class inside another
		 * wer aer establishing HAS-A relationship.
		 * 
		 *
		 * 
		 */
	}

}
