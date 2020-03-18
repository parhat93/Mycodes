package Days12;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberWhile {

	public static void main(String[] args) {
		Random random = new Random();
		int secretNumber = random.nextInt(100);
		
		Scanner input = new Scanner(System.in);
		int myNumber;
		int attempts = 1;
		do{
			System.out.println("Guess the secret number:");
			myNumber=input.nextInt();
			if(myNumber == secretNumber){
				System.out.println("Congratulations!");
			}else if(myNumber > secretNumber){
				System.out.println("Too large");
				attempts++;
			}else if(myNumber < secretNumber){
				System.out.println("Too small");
				attempts++;
			}
			
			System.out.println("Attempt: "+ attempts);
			if(attempts > 5){
				System.out.println("You lost!");
				System.out.println("Secret number is " + secretNumber);
				break;
			}
			
		}while(secretNumber != myNumber);
		
		
	}
}