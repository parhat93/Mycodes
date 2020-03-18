package Days16;

public class UnusedObjects {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.salary = 3456;	
		Employee emp2 = new Employee();
		emp2.salary = 6000;
		
		System.out.println("Emp1 salary: " + emp1.salary);
		System.out.println("Emp2 salary: " + emp2.salary);
		
		System.out.println("++++++++++++++++++++");
		emp1 = emp2;
		System.out.println("Emp1 salary: " + emp1.salary);
		System.out.println("Emp2 salary: " + emp2.salary);
		System.out.println("++++++++++++++++++++++++");
		
		// emp1 is null now, therefore, emp1 is not refer to any
		// object in HEAP
		emp1 = null;		
		System.out.println("Emp1 salary" + emp1.salary);
		
		
	}

}
