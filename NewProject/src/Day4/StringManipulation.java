package Day4;

public class StringManipulation {

	public static void main(String[] args) {
		// String is a class name
		// firstName is object 
		String firstName = new String("Parhat");
		String lastName = "Osman";
		String fullName = firstName + " " + lastName;
			
		
			System.out.println("My name is " + firstName + ".");		
			System.out.println("My full name is "+ fullName.toUpperCase() + ".");

			System.out.println("My first name has " + firstName.length()+ " Characters."); // the meaning of length is count the characters.
		    System.out.println("My last name has " + lastName.length()+ " Characters.");
		    System.out.println("");
		    
		    
		    int firstNameLength = firstName.length();
		    int lastNamelength = lastName.length();
		    System.out.println("My first name length: " + firstNameLength);
		    System.out.println("My last name length: " + lastNamelength);
		
		    // Using string method print your initials.Chart At
		//   String myInitials ="First" 
		String initial = ("My initial is "+ firstName.charAt(0)+ lastName.charAt(0)); 
		System.out.println(initial);   
		System.out.print("My initial is "+ firstName.charAt(0));		
		System.out.println(lastName.charAt(0));
		System.out.println("");
		// Find the position of a particular letter or worn in the stri
		// Parhat - I want to find out he position of letter h
		//indexOf is starts with 0
		
		System.out.println(firstName.indexOf("a"));
		System.out.println(firstName.indexOf(""));
		

		System.out.println("");
		char ch1 ='A'; // 65
		char ch2 ='B'; // 66
		System.out.println(ch1 + ch2); //131
		System.out.println(ch1 + ""+ ch2);// " " this sign makes this to String it will print AB
System.out.println("");
		
		// check if lastname equals to smith.equals
		
		boolean bool = lastName.equals("Smith");
		System.out.println("is lastname Smith? " +bool);
		
		System.out.println("is last name Osman? " + lastName.equals("Osman"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
