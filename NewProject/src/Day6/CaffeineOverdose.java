package Day6;

// Scientists estimate that roughly 10 grams 
// of caffeine consumed at one time is a lithely overdose.
// Write a program with a variable that holds the number of milligrams
//  of caffeine in a drink that will be taken as an input from the 
// user and outputs how many drinks it takes to kill a person.
// 
//  A 12-ounce can of cola has approximately 34 mg of caffeine,
//  while a 16-ounce cup of coffee has approximately 160 mg of caffeine.
//  Example Output:
//  Enter number of milligrams in drink: 500

//  It would take about 20 drinks for a lithely overdose. 


import java.util.Scanner;
public class CaffeineOverdose {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter of milligrams in drink: ");
        int milligrams = input.nextInt();
		int drink =10000/milligrams; 
        
		
		
		System.out.println("If you drink " + milligrams +" milligrams of caffeine It would take about " + drink + " drinks for a lithely overdose.");
		
		

	
		
		
		
		
		
		
		
		
		
	}

}
