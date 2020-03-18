package Day7;

public class People {

	public static void main(String[] args) {
	
		Person p1 = new Person();
		// because name comes from person class\
		// objects are created from the class; Therefore we can't change them.
		// the object we are talking about is nama, age,gender,job,
		p1.name = "Bob";
		p1.age = 25;
		p1.gender='M';
		p1.job="SDET";
		p1.tell=2403867631L;
		p1.salary = 84000;
		
		System.out.println(p1.name + " is a "+ p1.job);	
		System.out.println("My name is " + p1.name+".");
		System.out.println("I am " + p1.age + " years old.");
		System.out.println("My gender is "+ p1.gender);
		System.out.println("My job is "+ p1.job);
	

		Person p2 = new Person();
		p2.name = "peter";
		p2.age = 20;
		p2.gender ='M';
		p2.job = "computer science";

		System.out.println("");
		System.out.println("My name is " + p2.name+", and my job is "+p1.job+".");
		System.out.println("I am " + p2.age + " years old.");
		System.out.println("My gender is "+ p2.gender);
		System.out.println("My job is "+ p2.job);
	
		Person p3 = new Person();
		p3.major= "Computer Enginner";
		p3.hope="soccer";
		p3.salary=50000;
		System.out.println(p2.name+" major is "+ p3.major+" and his hope is "+ p3.hope);
		
		System.out.println("");
        p2.name = "omar";
		System.out.println(p2.name);
	
		p2.job = p1.job;
		System.out.println(p2.name + " is a "+ p2.job);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
