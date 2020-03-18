package Days14;
/* UNREAD -10
READ - 25

READ 1 UNREAD MESSAGE
UNREAD -9
READ - 26
--------
Accepts 2 numbers . if unread messages more than 0 then loop from that number until 
you have no more unread messages. every time u print. reading a message 
and decrease unread by one, and increase read by one

ex: Unread - 2
	Read - 5
	
	Reading a message
	Unread : 1
	Read: 6
	
	Reading a message 
	Unread: 0
	Read: 7
	
*/
import java.util.Scanner;

public class ReadUnreadMessages {

	public static void main(String[] args) {		
	// 	read ++ 
	// 	unread--
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many unread message: ");
		int unread = input.nextInt();
		System.out.println("How many read messages:");
		int read = input.nextInt();
		
		
		while(unread > 0) {
			System.out.println("Reading a message");
			unread--;
			read ++;
			System.out.println("total unread: " + unread);
			System.out.println("total read: " + read);
		}
		
		
		
		
		
		
		
	}

}
