package Day4;

public class StringObjects 
{

 // Methods are defined in class and using objects we use them.
	// Methods are action that can be performed.
	// methods in programming are 2 types:
	//   1) Methods that return a value
	//   2) Methods that do not return anything,it just does something for you
	public static void main(String[] args) {

		String fruit ="Orange";
		String flower = new String("White Roses");		
		
		
		System.out.println(fruit.toUpperCase());// if we want to change to Upper case letter, we must put .toUpperCase() after the letter.
		System.out.println(flower.toUpperCase());
		System.out.println("what is the your age".toUpperCase());
		System.out.println(fruit.toLowerCase());// if we want to change to lower case latter, we must put . toLowerCase() after the letter.
		System.out.println(flower.toLowerCase());
		System.out.println("WHAT IS YOUR NAME".toLowerCase());
		
		
	    System.out.println(fruit.length());  // The length tell you how many character you typed.
		System.out.println(flower.length());
		System.out.println("What is your best dish? ".length());
		
		
		System.out.println(fruit.charAt(0));// chartAt() give us which letter is the first letter of text we volume it in fruit.
		System.out.println(flower.charAt(0));
		
		int num=1000;
		String str="1000000000000";
		System.out.println(str.length());
		
		
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		// System.out.println(num.length); we can't ask primitives types to ask action, or behivior.
	
		
		// Important stuff:
		// String class DATA: Characters in double quotes.
		// ToUpperCase(), ToLowerCase(), Length(), CharAt(Num);
		
		// 1) one way to create String object
		String Name = new String("Mark"); //  The mark is become a Date is double quotes. Also, Name is objects name.
	    System.out.println(Name.length()); // This will count the all the character so there are 4 character, output of this will be 4.
	    System.out.println(Name.toUpperCase());
	    System.out.println(Name.toLowerCase());	 	
	    System.out.println(Name.charAt(0));
	 	// this won't work  because Name doesn't have more than 4 character, and ChatAt starts count from 0.
	    // ChatAt(Num); 0 is M ,1 is A, 2 is R, 3 is K.
	
	    System.out.println("  ");
		// 2) another way to create String object
		String Fruit1 ="Apples";
		System.out.println(Fruit1.length()); // This will count the all the character so there are 4 character, output of this will be 4.
	    System.out.println(Fruit1.toUpperCase());
	    System.out.println(Fruit1.toLowerCase());	 	
	    System.out.println(Fruit1.charAt(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
