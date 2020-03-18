package Day7;

public class IntroductionOfMuliMethods {

	// Objescts can have behaviour.
	// We achieve that behaviour using methods and defining
	// them in a class.
	// methods can be used to process the data within the objects
	// salary objects has amount, hours, off.

	int amount;
	int hours;
	boolean off;

	public void CalculateWeeklySalary() {
		 int weelySalry2 =amount*hours;
		 System.out.println("Weekly salary is " + weelySalry2);
		
	}

//====================================================	

 public static void main(String []args) {
	 
	 IntroductionOfMuliMethods Salry = new IntroductionOfMuliMethods();
	 Salry.amount=65;
	 Salry.hours=55;
	 Salry.off=true;
	 
	 // salary object

	 int weelySalary =Salry.amount * Salry.hours;
	 System.out.println("Weekly salary is " + weelySalary);
	 
//============================================================================================	  
	 
	 IntroductionOfMuliMethods Salary2 = new IntroductionOfMuliMethods();
	 Salary2.amount=70;
	 Salary2.hours=40;
	 Salary2.off=true;
	 
	 int weelySalry2 =Salary2.amount*Salary2.hours;
	 System.out.println("Weekly salary is " + weelySalry2);
 
	 Salary2.CalculateWeeklySalary();
	 
	 
	 
	 
}

}