package Day8;

public class arrays {

	public static void main(String[] args) {
		// array is objects THAT HOLDS multiply varibles
		// array named number that can hold 3 ints
		
		int [] numbers=new int[4];
		numbers [0]=100;
		numbers [1]=200;
		numbers [2]=300;
		numbers [3]=123;
	//	numbers [4]=20; this will not work
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
	//	System.out.println(numbers[4]); this will not work because we only can store four numbers
		
		int sum = numbers[0]+numbers[1]+numbers[2];
		System.out.println(sum);
		
		
		String[] Creditcards=new String[3];
		Creditcards[0]="Visa";
		Creditcards[1]="Amex";
		Creditcards[2]="MasterCard";
		
		System.out.println(Creditcards[0]);
		System.out.println(Creditcards[1]);
		System.out.println(Creditcards[2]);		
		System.out.println("I have " + Creditcards[0]+", "+Creditcards[1]+", "+Creditcards[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
