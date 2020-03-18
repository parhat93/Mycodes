package Day3;

// print the conversation between a customer and barista in the following manner.
// Replace underlined values with above variables.

//-Hi, What can I get for you?

//-Can I have 2 White Mochas, please?

//-Sure what size?

//-Grande please

//-Ok, your total is  $11.98

// javac + file name and . java to compile ,java + file name to run
// 
public class AtStarBucks {

	public static void main(String[] args) {
		
		String coffee = "White Mocha";
		String size = "Grande";
		boolean withMilke = true;
		double price = 4.99;
		int quantity =5;
		double sum = price * quantity;
		String dollar ="$";
		float taxRate = 6000.25f;
		
		System.out.println("-Hi, what can I get for you? ");
		System.out.println("-Can I hava " + quantity + " " + coffee + "s, please? ");
		System.out.println("-Sure what size? ");
		System.out.println("-"+size + " please");
		System.out.println("-Would you like with mike? ");
		System.out.println("-"+withMilke);
		System.out.println("-Ok, your total is " + dollar + sum );
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
