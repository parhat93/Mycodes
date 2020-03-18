package Day7;

public class Person {

// this doesn't have any main method because this is our custom class;
	
	String name;
	int age;
	char gender;
	String job;
	
	
	String major;
	String hope;
	long tell;
	int salary;
	
	
	public void run(int miles){
	// public everyone can access it
    // void- mean nothing is returned from this method 
	// this method only performs some steps but does not give anything back
	// run is name that we give this method
	// Int miles is declared within parenthesis after method name. 
	// so it is an argument variable anything 
	System.out.println(name + " is runing " + miles +" miles");				
	}
	
	public void swim(int laps) {
		System.out.println(name + " is Swimming " + laps + " laps");
	}
	public void bike(int kilometer) {
		System.out.println(name + " is biking " + kilometer +" kilometer.");
	}
	
	public void play(String dance) {
		//System.out.println(name + " is playing " + dance + ".");
	}

	public void say(String speech) {
		System.out.println(speech);
	}

}
