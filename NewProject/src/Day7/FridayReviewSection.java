package Day7;

public class FridayReviewSection {

	
	int amount;
	int hours;
	

	public void CalculateWeeklySalary() {
		 int weelySalry2 =amount*hours;
		 System.out.println("Weekly salary is " + weelySalry2);
	}
	// We call this method with argument.ff
	
	public void CalculateWeelySalryWithBonus(int bonus,String name) {
		int weeklySalary =amount*hours+bonus;
		System.out.println(name+" Weely Salary with bonus is " + weeklySalary);
		
	}
	
	public int CalculateWeelyWithOvertime(int overTimeHours) {
		int weeklySalary=amount*(hours +overTimeHours);
		return weeklySalary;
	}

	public int calculateWeeklySalaryWithoutTax (int taxAmount) {
		int result = amount*hours-taxAmount;
		return result;
	}
	
	public String getSalaryInformation() {
	// amount:<valueOfRate> Hours:<ValueOfHours>
		String report = "Amount:" + amount + " Hours:" + hours;
		return report;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
