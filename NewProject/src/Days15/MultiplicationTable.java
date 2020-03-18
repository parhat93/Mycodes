package Days15;
	/*
		 * Give a number print multiplication table for that number
		 * ex: 
		 * 2
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * 2 X 4 = 8
		 * 
		 * 
		 */
public class MultiplicationTable {

	public static void main(String[] args) {
		//int number =2;
		// 3 then 4 then 5
		for(int num = 1; num <= 10;num++) {
			if(num !=3 && num !=5 && num !=7) {
				continue;
			}
			// nested for loop
		for(int i = 1; i<=10;i++ ){
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		System.out.println("=================");
		
	}
}
}
