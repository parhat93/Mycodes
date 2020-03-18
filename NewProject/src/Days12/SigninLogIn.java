package Days12;

import java.util.Scanner;

public class SigninLogIn {

	public static void main(String[] args) {

		String validUserName = "CyberTek";
		String validPassword = "parhat007";

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the UserName: ");
		String userName = input.nextLine();

		System.out.println("Enter the password: ");
		String password = input.nextLine();

		if (userName.equalsIgnoreCase(validUserName) && password.equalsIgnoreCase(validPassword)) {

			System.out.println("You logn in successfuly, Cybertek");

		} else {
			if (userName.isEmpty() || password.isEmpty()) {
				if (userName.isEmpty()) {
					System.out.println("Username cannot be blank");
				}
				if (password.isEmpty()) {
					System.out.println("Password cannot be blank");
				}
			} else {
				if (!userName.equalsIgnoreCase(validUserName)) {
					System.out.println("Invalid Username");
				}
				if (!password.equals(validPassword)) {
					System.out.println("Invalid Password");
				}
			}
		}

	}
}
