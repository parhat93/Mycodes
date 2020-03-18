package Days21;

public class job {
	String title;
	double salary;
	String location;
	static boolean isRemote;

	public job () { // This is contruction 
		System.out.println("geting a job");
	}
	
	public job (String title, double salary) {
		this.title = title;
		this.salary=salary;
	}
	
	public job (String title, double salary, String location) {
		this(title,salary);
		this.location=location;
	}
	
	public void printJobDetail () {
		System.out.println("The job title is:" + title + "\nsalary is:"
	     + salary + "\nlocation is:" + location+"\nThe remote is:"+isRemote);
	}
	
		
	
	
}
