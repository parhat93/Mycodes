package Day_two;

import java.time.LocalDate;
import java.util.Arrays;

public class CoreJava {
	public static void main(String[] args) {
		
		//String name ="Omar";
		
		String name = new String("elyas");
	//	Integer ii = Integer.parseInt(name);
	//	Double ddd =Double.parseDouble(name);
	////	ii.toString();
	//	System.out.println(ii);
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		System.out.println(name.indexOf('y'));
		
		String Str = "Animals";
		System.out.println(Str.substring(3));
		System.out.println(Str.substring(3,5));
		System.out.println(Str.toUpperCase());
		System.out.println();
		
		StringBuilder stb = new StringBuilder();
		stb.append(true);
		stb.append("elyass");
		stb.append("ass");
		stb.reverse();
		System.out.println(stb);
		
		System.out.println(name);
		
		String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);

		
		int [] number1 = new int[3];
		number1[1] = 1;
		number1[2] = 4;
		System.out.println(number1[1]);
		
		int [] number2 = new int[] {1,3,5,3};
		System.out.println(number2[2]);
		for(int i : number2) {
			System.out.println(i);
		}
		int [] number3 = {78,53,4,54,53,1,4,432};
			Arrays.sort(number3);
		//	System.out.println(number3);
		for(int i =0;i<number3.length;i++) {
			System.out.println(number3[i]);
		}
		
		LocalDate lo =LocalDate.now();
		System.out.println(lo);
	}
	
}
