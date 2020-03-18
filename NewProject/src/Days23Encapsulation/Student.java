package Days23Encapsulation;

public class Student {
	// is a process of data hiding within the class.
	// We can hide data by making variables private
	// Whenver a variable is private it can be accessed only
	// within the class

	private String ssn; // this ssn is instance varible

	public void setSsn(String ssn) { // this ssn is argument varible
		if (ssn.length() == 9) {
			this.ssn = ssn;
			System.out.println("welcome back to SSN number website");
		}else {
			System.out.println("Invalid SSN");
		}
	}

	public String getSsn() {
		return ssn;
	}
	
	
	
	
	private String grade;
	private String address;
	private String age;
	private String BankAccount;

	// similar to capsule medicine, where medication is
	// hidden

	// when variable is private and we canot acess it from other classes
	// how can we work with it ?
	
	// we can add pbulic getter and setter methods and call them in other classes.
	
	// why private? 
	    // when you make your variables private, you can control the data that is 
	// being assigned to it.
	
	
}
