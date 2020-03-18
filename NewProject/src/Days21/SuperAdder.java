package Days21;

public class SuperAdder {
	static int numberofSpaece;
	public static void main(String[] args) {
		
		int a = 12 , b = 20;
		double d = 4.14;
		
		MathApplication math = new MathApplication();
		
		math.addNumbers(a, b);
		math.addNumbers(d, 3.14d);
		math.addNumbers(d, b);
		System.out.println("======================");
		// How do i call the vararg version of the method
		math.addNumbers(1,23,412,4,5,4,3,3,53);//9
		math.addNumbers(1,23,412);//3
		
		math.addNumbers(1.5,23);
		MathApplication.addNumbers(3.14);
		System.out.println("=======================");
		
		MathApplication math2 = new MathApplication();
		math2.Multply_Numbers(1000L);
		//new Long(120)
		MathApplication.Multply_Numbers(new Long(120));
		MathApplication.Multply_Numbers(120L, new Long(125));
		MathApplication.Multply_Numbers(120L, 120L);
		System.out.println("====================");
		MathApplication.minus5(5);
		MathApplication.minus5((int)3L);
		
	}

}
