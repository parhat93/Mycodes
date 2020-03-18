package Days21;

public class WrapperPrimitiveSelection {

	public static void main(String[] args) {
		
		study(5); 
		study(new Integer(5)); 
	}

	
	public static void study(int num) {
		System.out.println("This is method from int version");
			
	}
	
	
	public static void study(Integer num) {
		System.out.println("This is method from Integer version");
	}
	
}
