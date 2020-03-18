package Days12;

public class DoWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 1;
		do {   // different between do loop and while loop is 
				// if while loop is false it is not going to print anything
			   // but do loop will print the message at leat once.
			System.out.println ("stupid");
			n++;
		}	
		while(n > 4); // This statement is false because n = 1 and is not more then 4
						// so it will only print one meassges
	}

}
