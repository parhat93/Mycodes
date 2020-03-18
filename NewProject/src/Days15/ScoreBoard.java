package Days15;

/* 
 * A***** 
 * B**********
 * C****
 * 
 * array for team
 * 
 * 3 variable for each team score
 * int teamA =5;
 * int teamB =50;
 * int teamC = 1;
 * 
 */
public class ScoreBoard {

	
	public static void main(String[] args) {
		// create an array of chars A B C
		// assign scores for teams
		// use for each loop to go over each team
		// check which team it is and find out how many start need to be printed
		// use for loop to print stars
		
		char [] teams = {'A','B','C'};
		int teamA = 3;
		int teamB = 10;
		int teamC = 15;
		
		for(char team : teams) {
			int scores = 0;
			
			if(team == 'A') {
				scores = teamA;
				System.out.print("A ");
			}else if(team =='B') {
				scores =teamB;
				System.out.print("B ");
			}else if(team == 'C') {
				scores =teamC;
				System.out.print("C ");
			}
			
			for(int star = 1; star <=scores; star++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
