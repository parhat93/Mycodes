package Days12Homework;

/*Write your code inside the method.
 Use the values given as method parameters.
 Assign final values.
 Then user should select service quality that will correspond to tip percent.
 Poor = 5%
 Fair = 10%
 Good = 15%
 Great = 20%
 Excellent = 25% 
 The program should display the following information based on the user input: 
 Split or No split
 Number of people entered: &&&&
 Service Quality: 
 Total to pay:
 Total tip:
 Total per person:
 Tip per person:
 https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8
 Input: 
 Split: Yes
 Number of people: 4
 Check amount: 476.00
 Service Quality: Excellent
 Output:
 Split 
 Number of people entered: &&&&
 Total to pay: 595.00
 Total tip: 119.00
 Total per person: 148.75
 Tip per person: 29.75
*/

import java.util.Scanner;

public class TipCalculatorControl {

	public static void main(String[] args) {

		ServiceQulity servise = new ServiceQulity();
		

		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to split or No split: ");
		String SplitNoSplit = input.nextLine();

		while (!SplitNoSplit.equals("split") && !SplitNoSplit.equals("no split")) {
			System.out.println("please choose split or no split: ");
			SplitNoSplit = input.nextLine();
		}
		//
		switch (SplitNoSplit.toLowerCase()) {
		case ("split"):

			System.out.println("Number of people: ");
			servise.people = input.nextInt();

			while (servise.people <= 0) {
				System.out.println("please Enter the valid number");
				servise.people = input.nextInt();
			}

			System.out.println("Check amount: ");
			servise.amount = input.nextInt();

			while (servise.amount <= 0) {
				System.out.println("Please Enter the valid amount");
				servise.amount = input.nextDouble();
			}

			System.out.println("Servise Qulity: ");
			String qulity = input.nextLine().toLowerCase();

			while (!qulity.equals("poor") && !qulity.equals("fair") && !qulity.equals("good") && !qulity.equals("great")
					&& !qulity.equals("excellent")) {

				System.out.println("Please only enter.\nPoor\nFair\nGood\nGreat\nExcellent");
				qulity = input.nextLine();

			}
			switch (qulity.toLowerCase()) {
			case "poor":
				servise.Poor();
				break;
			case "fair":
				servise.Fair();
				break;
			case "good":
				servise.Good();
				break;
			case "great":
				servise.Great();
				break;
			case "excellent":
				servise.Excellent();
				break;
			default:
			}
			break;
				// no split part
				
			case ("no split"):
				
				System.out.println("Number of people: ");
			servise.people = input.nextInt();

			while (servise.people <= 0) {
				System.out.println("please Enter the valid number");
				servise.people = input.nextInt();
			}
			System.out.println("Check amount: ");
			servise.amount = input.nextInt();

			while (servise.amount <= 0) {
				System.out.println("Please Enter the valid amount");
				servise.amount = input.nextDouble();
			}

			System.out.println("Servise Qulity: ");
			String qulity1 = input.nextLine().toLowerCase();

			while (!qulity1.equals("poor") && !qulity1.equals("fair") && !qulity1.equals("good") && !qulity1.equals("great")
					&& !qulity1.equals("excellent")) {

				System.out.println("Please only enter.\nPoor\nFair\nGood\nGreat\nExcellent");
				qulity1 = input.nextLine();
			}
			switch (qulity1.toLowerCase()) {
			case "poor":
				servise.PoorNosplit();
				break;
			case "fair":
				servise.FairNosplit();
				break;
			case "good":
				servise.GoodNosplit();
				break;
			case "great":
				servise.GreatNosplit();
				break;
			case "excellent":
				servise.ExcellentNosplit();
				break;
			}

		}
	}
}
