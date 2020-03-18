package Days10;

import java.util.Scanner;
public class OCA {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your test Score: ");
		int grade = input.nextInt();
		
		char grade1 ='A';
		char grade2 ='B';
		char grade3 ='C';
		char grade4 ='D';
		char grade5 ='F';
		
		if(grade >= 90) {
			System.out.println("You get " + grade1 +" grade.");
		}else if (grade >=80) {
			System.out.println("You get " + grade2 +" grade.");
		}else if (grade >=70) {
			System.out.println("You get " + grade3 +" grade.");
		}else if (grade >=65) {
			System.out.println("You get " + grade4 +" grade.");
		}else {
			System.out.println("You get " + grade5 +" grade, therefore you fail, try again.");
		}
	}
}
