package Days16;

public class MultiplyRefferences {

	public static void main(String[] args) {
		// create new Employee in HEAP and let emp1 point to it
		Employee emp1 = new Employee(); 
		// set salary value of employee object to 2000
		emp1.salary = 2000;
		// Create Employee empt2 reference variable, in Stack and 
		// point to same object that emp1 is pointing to.
		Employee emp2 =emp1;
		//because both references are looking at same exact object
		// value of salary will be same too
		System.out.println("Emp1 salary: " + emp1.salary);
		System.out.println("Emp2 salary: " + emp2.salary);
		System.out.println("=============================");
		
		
		emp2.salary = 5000;
		System.out.println("Emp1 salary: " + emp1.salary);
		System.out.println("Emp2 salary: " + emp2.salary);
		
		Employee emp3 = emp2;
		System.out.println("Emp3 salary: " + emp3.salary);
	}

}
