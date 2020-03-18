package Days12;

public class StaircaseWhileloop {

	public static void main(String[] args) {	
		
		int n = 1;
		String strStars="";
		while(n <=10) {
			strStars = strStars + "*";
			System.out.println(strStars);
			n++;
			
		}
		System.out.println("");
		int n2 = 1;
		String stars="";
		while(n2 <=10) {
			stars = "*" + strStars;
			System.out.println(stars);
			n2++;
		}
	}

}
