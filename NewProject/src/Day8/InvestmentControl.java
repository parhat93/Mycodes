package Day8;
//   Write a Java method to compute the future
//  investment value at a given interest rate for a specified number of years.
//  Input the investment amount: 1000
//  Input the rate of interest: 12% 
//  Input number of years: 2
//  interest amount = (investment amount*rate)*years
// investment value = (interest amount +investment amount)

import java.util.Scanner;



public class InvestmentControl {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the investment amount: ");
		int amount =input.nextInt();
		
		System.out.println("Enter the rate of interest: ");
		double interestRate =input.nextDouble();
		
		System.out.println("Enter the number of years: ");
		int numberyear =input.nextInt();
		
	//  interest amount = (investment amount*rate)*years
	// investment value = (interest amount +investment amount)
	/*	Code version =1.0
		interestRate = interestRate/100;
		System.out.println("Interest rate: " + interestRate);
		// Business: 12000
		// year : 10% profit which is 1200$ dollar	
		// total amount : 13200                      
		double interestAmount =amount * interestRate*numberyear;
		double totalValue =  interestAmount+amount;
		*/
		
		
		// Code Version 2.0
		// We  are  using  object of investment  class  and  a method  to get total
		
		Invetment in1=new Invetment();
		double totalInvestmentValue=in1.calculateInvestmentValue(amount, interestRate, numberyear );
		System.out.println("Investment voule after "+ numberyear + " years: " + totalInvestmentValue);
		
		
	}
	

}
