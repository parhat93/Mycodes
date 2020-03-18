package Days16;

public class Company {

	public static void main(String[] args) {
		int salary = 5000; // all in STACK
		Employee person1 = new Employee(); // person1 is reffernce .
		// Employee person1 --> Story in STACK
		// new Employee() --> story in HEAP
		
		person1.salary = 3500; 
		// because salary is part of the employee subjects, thats why
		// 3500 value will goto heap as a part of OBJECT
		
		person1.salary = salary; // this will be 5000.
		//System.out.println(person1.salary);
		
		Employee person2 = new Employee();
		person2.salary = 4000;
		
		

	}

}
