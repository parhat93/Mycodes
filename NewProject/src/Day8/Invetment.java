package Day8;

public class Invetment {

	
	public double calculateInvestmentValue(int amount,double rate,int year) {

		rate = rate/100;
		double interstAmount = amount*rate*year;
		double totalValue = interstAmount+amount;
	
		return totalValue;
		//	
		//rate 
		//originalAmount
		//year
		//totalValue
		
	
		
		//double totalValue = originalAmount*(rate/100)*years+originalAmount;
		//System.out.println(totalValue);
	}
	
}
	
	
	

