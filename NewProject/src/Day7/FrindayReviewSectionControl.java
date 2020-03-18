package Day7;

public class FrindayReviewSectionControl {

	public static void main(String[] args) {
	// Salary is Variable that holding the FridayReviewSection Object.
		FridayReviewSection Salary = new FridayReviewSection();
		
		Salary.amount=55;
		Salary.hours=40;
		Salary.CalculateWeeklySalary();
		Salary.CalculateWeelySalryWithBonus(500,"Altunbek");
		Salary.amount=60;
		System.out.println("================================");
		Salary.CalculateWeeklySalary();
		Salary.CalculateWeelySalryWithBonus(100,"Altunbek");
	System.out.println("====================================");
		// Salary is getting a bonus.
	// We need to calculate the bonus;
		FridayReviewSection DilmuratSalary = new FridayReviewSection();
				DilmuratSalary.amount=50;
				DilmuratSalary.hours=60;
				DilmuratSalary.CalculateWeeklySalary();
				DilmuratSalary.CalculateWeelySalryWithBonus(200,"dilmurat");
	
	// method that accepts overtime hours number return total weekly salary
			int totalWeeklySalary=DilmuratSalary.CalculateWeelyWithOvertime(10);
				
				System.out.println("The dilmurat over time salary is " + totalWeeklySalary);
				
			// create a method called calculateWeeklySalaryWithoutTax(int taxAmount)
			// methods needs to calculate weekly salary and deduct tax then return the result
			
				int result=	DilmuratSalary.calculateWeeklySalaryWithoutTax(500);
				// we stored the DilmuratSalary.calculateWeeklySalaryWithoutTax(500); inside the result.
				System.out.println("Dilmurat's salary withoutTax is "+ result);
				
				
				// Create a method getSalaryInformation-that reports back hours and amount as a string
				// Rate:<valueOfRate> Hours:<ValueOfHours>
				
				String information =DilmuratSalary.getSalaryInformation();
				System.out.println("The dilmurate salary information is " + information.toUpperCase());
				
				// contains is, inside the information is amount is in it or not?
				boolean containsNum = information.contains("Amount");
				System.out.println(containsNum);
				
				
				
	}	
	
	     

}
