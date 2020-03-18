package Days21;

public class MathApplication {

	public int addNumbers(int num1,int num2) {
		System.out.println("calling 2 int version");
		int sum = num1 + num2;
		return num1;
	}
	
	public double addNumbers(double num1,double num2 ) {
			double sum = num1 + num2;
			System.out.println("calling 2 double version");
			return sum;
	}
	// this is static overload method
	public static double addNumbers(double num1) {
		System.out.println("calling static method overload version");	
		return num1;
	}
	
	public int addNumbers(double num1,int num2) {
		System.out.println("calling mixed version");
		int sum = (int) num1 + num2;
		return sum;
	}
	
	
	// create another add number with arbitart number of argument.
	
	public int addNumbers(int...numbers) {
		
		System.out.println("from var arg version");
		System.out.println("Pass NUmber count " + numbers.length);
		return 0;
		
	}
	
	
	public static void Multply_Numbers(long num1) {
		System.out.println("Taking primitive long");
	}
	
	public static void Multply_Numbers(Long num1) {
		System.out.println("Taking Wrapper Long");
	}
	
	public static void Multply_Numbers(long num1,Long num2) {
		System.out.println("Taking 2 different long");
	}
	
	public static void minus5(int i) {
		System.out.println("from int version");
	}
	
	public static void minus5(long i) {
		System.out.println("From long version");
	}
	
	
}
