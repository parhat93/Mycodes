package Days17Homework;
/*Write a Java program that allows the user to choose the correct answer of a question.

See the example below:
What is the correct way to declare a 
variable to store an integer value in Java?
a. int 1x=10;
b. int x=10;
c. float x=10.0f;
d. string x="10";

Enter your choice: c
*/
import java.util.Scanner;

public class MultipleChoiceProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is the correct way to declare a variable\n"
				+ "to store an integer value in Java?\n\n" + "a. int 1x=10;\n"
				+ "b. int x=10;\n" + "c. float x=10.0f;\n"
				+ "d. string x=10;\n");
		System.out.print("Enter your choice:");

		String ans1 = input.next();
		while (ans1.equalsIgnoreCase(ans1)){
		switch (ans1) {
			case ("a") :
				System.out.println("Invalid choice");
				break;
			case ("b") :
				System.out.println("Invalid choice");
				break;
			case ("c") :
				System.out.println("Congratulation!");
				break;
			case ("d") :
				System.out.println("Invalid choice");
				break;
			default :
				System.out.println("a to d only");
				break;
		}
		}
	}
}
