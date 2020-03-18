package Days20;

public class Person {

	// insitince fild, and insitence variable
	// The purpose of using the Constructor is
	// ****giving initial state for the object
	
	// All instance variable value can be set 
	// along with object creation using new keyword
	// by calling corresponding constructor
	
	String name;
	int age;
	String job;
	
	
	public Person() {
		System.out.println("Calling a no argument Constractor");
	}
	public Person(String pName) {

		System.out.println("I am passing one arg " + pName);
	}

	public Person(double dd) {
		System.out.println("I am passing one double arg " + dd);
	}
	public Person(byte dd) {
		System.out.println("I am passing one byte arg " + dd);
	}
	public Person(String name, int age) {
		System.out.println(" 2 arguments");
	}

	public Person(int age) {
		System.out.println("I am passing one int arg " + age);
	}
	
	public Person(String name,int age,String job) {
		// this keyword is used to reference current instance of 
		// and object . for example: this.name which is the instance 
		// variable we initialed before.
		// *** this keyborad can only be used in constructor****
		this.name = name;
		this.job = job;
		this.age = age;
		System.out.println("3 arg constroctor:" + "My name is " + name+
							"My job is: " + job + "My age is " + age);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
