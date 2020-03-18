package Days15;

public class Coin {

	public static void main(String[] args) {
		int[] CoinsJar = {10,10,25,25,5,5,5,25,10};
		
		int quarters, dimes,nickels;
		quarters = dimes = nickels =0;
		
		for(int coin : CoinsJar) {
			switch(coin) {
				case 25:
					quarters++;
					break;
				case 10:
					dimes++;
					break;
				case 5:
					nickels++;
					break;
				default:
					System.out.println("Not a quarter or dime or nickel");
					break;
					
			}
		}
		
		System.out.println("You have " + quarters + " quarters -> "+ (quarters*25)+ "cents");
		System.out.println("You have " + dimes + " dimes -> "+ (dimes*10)+ "cents");
		System.out.println("You have " + nickels + " nickels -> "+ (nickels*5)+ "cents");
	}

}
