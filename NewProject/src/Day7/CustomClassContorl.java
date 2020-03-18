package Day7;


// Create another class with main method and inside create two objects of your custom class.
public class CustomClassContorl {

	public static void main(String[] args) {
		
		CustomClass W1=new CustomClass();
		W1.name = "parhat";
		W1.country ="East Turkistan";
		W1.language = "Uyghur";
		W1.age = 21;
		W1.salary=50000;
		
		
		System.out.println("My name is " + W1.name + ".");
		System.out.println("I am from " + W1.country + ".");
		System.out.println("I Speak " + W1.language +".");
		System.out.println("I am " + W1.age + " years old." );
		System.out.println("My annual salary is $" + W1.salary + " dollor.");
		
		System.out.println("=================================================");
		
	// The is the volume from getCountry method. 
		String dolat = W1.getCountry();
		System.out.println(W1.name + " originally from " + dolat);
		
		W1.hisSalary(30000);
		
		
		System.out.println("The multiplaycation is " + W1.prince(666, 51651));
	}
}
