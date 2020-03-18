package Days16;

public class Stringpool {

	public static void main(String[] args) {
		// There value are same but 
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1==str2); // it is true because both are looking at 
										// same object in String pool "abc"
		
		String str3 = new String ("abc");
		String str4 = "abc";
		
		System.out.println(str3==str4);// false, one is in poolm str3 is
										// pointing to object outside pool
		
		
		String str5 = new String ("abc");
		String str6 = new String ("abc");
		System.out.println(str5==str6);
		
		System.out.println();
		
		
		Employee emp1 = new Employee();
		emp1.salary = 2345;
		
		Employee emp2 = new Employee();
		emp2.salary = 2345;
		
		System.out.println("-->" + (emp1.salary==emp2.salary));
		
		System.out.println(emp1==emp2);
		
		emp1 = emp2;
		System.out.println(emp1 ==emp2); // this will ne true because they have same value
		
		int salary = 2345;
		System.out.println(salary == emp1.salary); // this is true as well 
		
	}

}
