package Day7;

public class MathHelper {

	int i;
	int j;
	
	public int add() {
		return i+j;
		
	}
	public int substarction(int x, int y) {
		return x-y;
		
	}
		
	public int mult(int w,int e) {
		return w*e;
	}
	
	public double divi(int t,int y) {
		return t/y;
	}

	public static void main(String[] args) {
		

		MathHelper teacher = new MathHelper();
		teacher.i = 10;
		teacher.j = 20;
		
		
		int result = teacher.add();	
		System.out.println(result);
		
		
		int subResult = teacher.substarction(100, 76);
		System.out.println("The rusult of substarction is " + subResult);
		
		
		int mulResult = teacher.mult(200, 35);
		System.out.println("The result of multiplycaion is "+ mulResult);
		
		double diviResult = teacher.divi(55166,101 );
		System.out.println("The result of division is "+ diviResult);
		
		
		
		
		
		
	}
}
