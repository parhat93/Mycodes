package Days12Homework;

public class ServiceQulity {


	int people;
	double amount;
	String service;
   //	 Poor = 5%
   //	 Fair = 10%
   //	 Good = 15%
   //	 Great = 20%
   //	 Excellent = 25% 
	public void Poor() {
		double poor = amount / people * 0.05;
		double tip = amount *0.05;
		double perpersontip = tip /people;
		double eachperson = amount /people;
		double TotalPerPersonWithTip = eachperson + perpersontip;
		double TotalPerPerson = eachperson +tip;
		System.out.println("Number of people entered: " + people 
				+ "\nTotal to pay: " + amount
				+ "\nTotal tip: " + tip
				+ "\nTotal per person: " +TotalPerPersonWithTip
				+ "\nTip per person: " + perpersontip);	
	}
	
	public void Fair() {
		double fair = amount / people * 0.10;
		double tip = amount *0.10;
		double perpersontip = tip /people;
		double eachperson = amount /people;
		double TotalPerPersonWithTip = eachperson + perpersontip;
		double TotalPerPerson = eachperson +tip;
		System.out.println("Number of people entered: " + people 
				+ "\nTotal to pay: " + amount
				+ "\nTotal tip: " + tip
				+ "\nTotal per person: " +TotalPerPersonWithTip
				+ "\nTip per person: " + perpersontip);	
	}
	public void Good() {
		double good = amount / people * 0.15;
		double tip = amount *0.15;
		double perpersontip = tip /people;
		double eachperson = amount /people;
		double TotalPerPersonWithTip = eachperson + perpersontip;
		double TotalPerPerson = eachperson +tip;
		System.out.println("Number of people entered: " + people 
				+ "\nTotal to pay: " + amount
				+ "\nTotal tip: " + tip
				+ "\nTotal per person: " +TotalPerPersonWithTip
				+ "\nTip per person: " + perpersontip);	
	}
	public void Great() {
		double great = amount / people * 0.20;
		double tip = amount *0.20;
		double perpersontip = tip /people;
		double eachperson = amount /people;
		double TotalPerPersonWithTip = eachperson + perpersontip;
		double TotalPerPerson = eachperson +tip;
		System.out.println("Number of people entered: " + people 
				+ "\nTotal to pay: " + amount
				+ "\nTotal tip: " + tip
				+ "\nTotal per person: " +TotalPerPersonWithTip
				+ "\nTip per person: " + perpersontip);	
	}
	public void Excellent() {
		double excellet = amount / people * 0.05;
		double tip = amount *0.05;
		double perpersontip = tip /people;
		double eachperson = amount /people;
		double TotalPerPersonWithTip = eachperson + perpersontip;
		double TotalPerPerson = eachperson +tip;
		System.out.println("Number of people entered: " + people 
				+ "\nTotal to pay: " + amount
				+ "\nTotal tip: " + tip
				+ "\nTotal per person: " +TotalPerPersonWithTip
				+ "\nTip per person: " + perpersontip);	
	}
	

	public void PoorNosplit() {
		
		double tip = amount *0.05;
		double totalpayment = tip+amount;
		
		System.out.println("Number of people entered: " + people 
				+ "\nTotal to pay: " + amount
				+ "\nTotal tip: " + tip
				+ "\nTotal amount: " +totalpayment);
				
	}
	  //	 Poor = 5%
	   //	 Fair = 10%
	   //	 Good = 15%
	   //	 Great = 20%
	   //	 Excellent = 25% 
public void FairNosplit() {
		
		double tip = amount *0.10;
		double totalpayment = tip+amount;
		
		System.out.println("Number of people entered: " + people 
				+ "\nTotal to pay: " + amount
				+ "\nTotal tip: " + tip
				+ "\nTotal amount: " +totalpayment);
				
	}
	
public void GoodNosplit() {
	
	double tip = amount *0.15;
	double totalpayment = tip+amount;
	
	System.out.println("Number of people entered: " + people 
			+ "\nTotal to pay: " + amount
			+ "\nTotal tip: " + tip
			+ "\nTotal amount: " +totalpayment);
			
}
	
public void GreatNosplit() {
	
	double tip = amount *0.20;
	double totalpayment = tip+amount;
	
	System.out.println("Number of people entered: " + people 
			+ "\nTotal to pay: " + amount
			+ "\nTotal tip: " + tip
			+ "\nTotal amount: " +totalpayment);
			
}
	
public void ExcellentNosplit() {
	
	double tip = amount *0.20;
	double totalpayment = tip+amount;
	
	System.out.println("Number of people entered: " + people 
			+ "\nTotal to pay: " + amount
			+ "\nTotal tip: " + tip
			+ "\nTotal amount: " +totalpayment);
			
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
