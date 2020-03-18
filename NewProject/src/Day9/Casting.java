package Day9;

public class Casting {

	public static void main(String[] args) {
		// implicit casting
		//--> it happens automatically
	   //	byte > short > int > long > float > double
		
		int intNum = 100;
		double d = intNum;
		System.out.println("double "+ d);
		byte b=5;
		short sh=b;
		
		d=100.3331312321;
		int i =(int) d;
		System.out.println(i);
		
		i=12345;
		b=(byte)i;
		System.out.println(i);
		
		int x=10;
		int t=3;
		double result=(double)x/(double)t;
		System.out.println(result);
		
			int z=(int) (4/2.0);
		System.out.println(z);
		
		byte b1= 100;
		byte b2 =100;
		byte b3=(byte) (b1*b2);
		System.out.println(b3);
		
		double y=(double)7/(double)2;
		System.out.println(y);
		
		//rate 
		//originalAmount
		//year
		//totalValue
		
		int originalAmount = 1000;
		double rate = 12;
		int years=2;
		
		double totalValue = originalAmount*(rate/100)*years+originalAmount;
		System.out.println(totalValue);
		
		
		
		
		
	}

}
