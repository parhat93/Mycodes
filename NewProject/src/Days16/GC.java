package Days16;

public class GC {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.salary = 1000;
		Employee e2 = new Employee();	
		e2.salary = 5000;
		
		Employee e3 = new Employee();
		e3.salary = 3333;
		e3=e1; // Employee withh 3333 is ready for GC
		e1=e2; // e1 is poitning to employee with 5000;
		e2=e3; // Employee with 5000 ready for GC
		
		System.out.println("How many objects ready for GC? ");
		
		System.out.println(e1.salary);
		System.out.println(e2.salary);
		System.out.println(e3.salary);
		
	}

}
