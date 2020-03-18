package Day4;

public class StringMethods {

	public static void main(String[] args) {
		
		String laptop = new String("MSi");
		System.out.println(laptop);
		
		laptop =laptop.toUpperCase();
		System.out.println(laptop);
	
		
		laptop =laptop.toLowerCase();
		System.out.println(laptop.toLowerCase());
		System.out.println(laptop); // this line is upperCase because on line10 we said laptop is to UpperCase
		
		int laptoplength=laptop.length();
		System.out.println("laptop length is " + laptoplength);
		
	    System.out.println( "Laptop word starts with S, which is " + laptop.startsWith("S")); // .startsWith(); this method give us boolean volume true of false.
		
	    boolean firstLetterM=laptop.startsWith("m");
	    System.out.println(firstLetterM);
	

		
	    System.out.println(laptop.endsWith("s"));		
		
		String country ="Belize";
		country.charAt(0);
		
	    
	    
		String student = new String();
		String firstName = "parhat";
		String lastName = "Osman";
		String highOfparhat;
		double highOfparhat1 =1.80;
		
		
		
		
		
		
		
		
		
		
	}
}
