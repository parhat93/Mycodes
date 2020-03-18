package Day1;

import java.util.Scanner;

public class GuessNumberGame{

	public static void main(String[] args) {
		GuessNumberGame game = new GuessNumberGame();
	}
	
	Scanner input = new Scanner(System.in);	

	/*
	 * Constructor - declares local variables and calls necessary methods to get
	 * this game working. After the game is completed, user has a choice to play
	 * this game again.
	 */
	public GuessNumberGame() {
		// Declare local variables
		String secretDigits;
		String guessNumber;

		gameIntro(); // call gameIntro() to display message

		// do-while loop to repeat the game
		do {
			secretDigits = getRandomDigits(); // call getRandomDigits() and assign value to secretDigits

			guessNumber = validInput(); // call validInput() and assign valid number to guessNumber

			getAttempNumber(secretDigits, guessNumber); // call getattempNumber(secretDigits, guessNumber)
		} while (repeatGame());

		// End of the game message
		System.out.println("Bye for now. Come back soon.");
		System.out.println("***********************************");
	}

	// gameIntro() displays the introduction to the game message.
	public void gameIntro() {
		System.out.println("    Welcome to the Guessing Game");
		System.out.println();
		System.out.println("To play this game, you need to guess a five-digit secret number");
		System.out.println("After each attempt, if incorrect, there will be two tips given to assist you:");
		System.out.println("  1. the number of correct digits that are in the proper position, and");
		System.out.println("  2. the sum of the correct digits. If you like the game, you can");
		System.out.println("Use these tips to help you guess again, until you guessed the secret number correctly.");
		System.out.println("repeat the game again to you heart's content.");
		System.out.println();
		System.out.println("Let's get started.");

	}

	/*
	 * validInput(): Check whether user's input consists of 5 digits numbers only.
	 * Re-asks to input valid digits if invalid input was entered.
	 */
	public String validInput() {
		String guess;

		do {
			System.out.print("\nEnter your best guess (a five-digit number): ");
			guess =input.next();

			if (guess.length() != 5 || !guess.matches("[0-9]+")) {
				System.out.println("\n!!!!! Invalid guess. Enter a 5-digit number only. !!!!!");
			}

		} while (guess.length() != 5 || !guess.matches("[0-9]+"));

		return guess;
	}

	/*
	 * getTips(int count, int sum) - takes two arguments. displays two tips from the
	 * user's five-digit guess.
	 */
	public void getTips(int count, int sum) {
		System.out.println("|:-( Your guess is incorrect. Use the following tips to help you try again:");
		System.out.println("  Tip #1 - " + count + " digit in your number match that in the secret number");
		System.out.println("  Tip #2 - The sum of these correct digits is: " + sum);
	}

	/*
	 * getAttempNumber(String secret, String guess) - takes two arguments. takes in
	 * secret number and user guess number, displays helpful tips, and prints number
	 * of attempts it took to get correct answer
	 */
	public void getAttempNumber(String secret, String guess) {
		int attemps = 1;

		do {
			// ----------------------
			int count = 0;
			int sum = 0;

			if (!secret.equals(guess)) {
				for (int i = 0; i < 5; i++) {
					if (secret.charAt(i) == guess.charAt(i)) {
						sum += Character.getNumericValue(guess.charAt(i));
						count++;
					}
				}
				attemps++;
				getTips(count, sum);
				guess = validInput();
			}
		} while (!secret.equals(guess));

		System.out.println("\n|:-)You got it!! It took you " + attemps + " attempts to guess the secret number");
	}

	// getFiveRandomDigits() - returns five random generated numbers.
	public String getRandomDigits() {
		String digits = "";

		for (int i = 0; i < 5; i++) {
			digits += (int) (Math.random() * 10);
		}

		return digits;
	}

	// Check whether user entered Yes or No, re-asks question if invalid input
	public boolean repeatGame() {
		String repeat = "Yes";
		do {
			System.out.print("\nDo you like to play this game again? YES or NO: ");
			repeat =input.next();
		} while (!repeat.equalsIgnoreCase("Yes") && !repeat.equalsIgnoreCase("No"));
		return repeat.equalsIgnoreCase("Yes");
	}
}

