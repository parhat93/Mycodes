package Days17;
/*String are immutable. it means cannot be changed once created.
	Whenever you do any munipulation, it will keep creating new string 
object in the memory.
-> in order to tackle this problem 
--> String pool for string object reusability
--> to make strings mutable -> stringBuilder class
--------------------------------------------------
StringBuilder object is mutable.
StringBiuldder st = new StringBuilder("Hello");
st.append("World");
Still only one StringBuilder object as 
StringBuilder is mutable.

String str = new String("hello");
str = str + " World " ; // hello world
3 object will be created because string are immutable - object cann't be changed
once created

*/

public class StBuilder {

	public static void main(String[] args) {
		//1	
		StringBuilder sb = new StringBuilder(); // Create empty StringBuilder
		sb.append("Hello");
		System.out.println("sb = " + sb);
		
		sb.append(" parhat"); // Hello parhat
		System.out.println("sb = " + sb);
		
		//2
		StringBuilder sentence = new StringBuilder("StringBuilder is mutable");
		System.out.println(sentence);
		// add one more sentence
		sentence.append(" and it is fun to use");
		System.out.println(sentence);
		System.out.println("======================");
		StringBuilder email = new StringBuilder();
		email.append("Dear friend,\n\n");
		email.append("     It is been while since we see each othe\n"
				+ "I really miss you you know I belive we will meet\n"
				+ "next day or next week or never.\n");
		email.append("\n\nSincerely,\n");
		email.append("You best Frind parhat");
		System.out.println(email);
		System.out.println("============================");
		//insert
		
		StringBuilder stb = new StringBuilder("Programming");
		stb.insert(0, "Java ");
		System.out.println(stb);
		
//		String str = "Programming";
//		str = "Java " +str;
		stb.insert(5, "- ");
		System.out.println(stb);
		
	stb.delete(0,5);
	System.out.println(stb);
	
	
	System.out.println(stb.length());
	// charAt, indexOf, substring
	System.out.println(stb.charAt(0));
	System.out.println(stb.charAt(5));
	
	System.out.println(stb.substring(0,5));
		
		// Reverse
	
	
	
	}

}
