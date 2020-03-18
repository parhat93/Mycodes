package Days12Homework;
// Write a program that will print numbers from 50 - 100 
// that can be divided by 3 and 5 without a remainder.

// Expected output: 
// Number that can be divided by 3 and 5 without remainder: 60
// Number that can be divided by 3 and 5 without remainder: 75
// Number that can be divided by 3 and 5 without remainder: 90

public class DivideBy3and5 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		
		for(int i =num1; i <=num2;i++) {
			if(i % 3 ==0 && i % 5 ==0) {
				System.out.println("Number that can be divided by 3 and 5 without remainder: " + i);
			}
		}

	}

}
