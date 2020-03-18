package Days14;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =input.nextInt();
		boolean prime = true;
		
		if(num <= 1) {
			System.out.println("This number is not prime");
		}else if (num % 2 == 0 && num != 2){
			System.out.println("This number is not prime");
		}else {
			for(int div = 2; div < num; div++) {
				if(num % div ==0) {
					prime = false;
					
					break;
				}
			}
			
			if(prime) {
				System.out.println("prime number");
			}else {
				System.out.println("not a prime number");
			}
	}

}
}