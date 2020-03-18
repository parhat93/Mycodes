package Day7;


public class PeopleV2 {

	public static void main(String[] args) {
	
		PersonV2 p1 =new PersonV2();
		p1.name = "Bob";
		p1.age = 25;
		p1.age2 = 10;
		
		int age1 = p1.getAge(25,25);
		System.out.println("total of age is  " + age1);
		
		
	
		
		int a = p1.get10();		
		System.out.println("the result from get10 is " +a);
		
		
		String simpleName=p1.getPersonName();
		System.out.println(simpleName);
		
		
		String hisName = p1.getName();
		System.out.println("Person1 actual name is "+ hisName);
		
	
		
	}


	}
	


