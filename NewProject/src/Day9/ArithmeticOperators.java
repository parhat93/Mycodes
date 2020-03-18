package Day9;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// Addition 
		int n =10;
		int k =3;
		
		int add = n+k;	//13
		int minus = n-k; //7
		int multiply = n*k;//30
		int divide = n / k;//3.   we are lossing decimal, to fix this we must fix the integer on the top
		int remainder = n % k;//1
		
		System.out.println("addition: " + add);
		System.out.println("minus: " + minus);
		System.out.println("multiiply: " + multiply);
		System.out.println("divide: " + divide);
		System.out.println("remainder: " + remainder);
		
		int rem=20 % 5;
		System.out.println("remainder: " + rem);
		
		rem = 43 % 2;  // it returns remainder between 2 numbers after dividing them.  
		System.out.println("remainder: " + rem);
		
		int result = 10 + 2 *3; //16
		System.out.println("result is "+result);
		// operator precedence 
		// they are *,/,%
		// and +,-
		
		System.out.println("#############");
		result = 10%2;
		boolean b= result ==0;
		System.out.println("Is it even? " + b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
