package Days17;
public class StBulder2 {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("banana");
		builder.reverse();
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);
		
		// Check if palindrome
		// refer, level, bob, radar.
		 // this is new builder 
		// all the thing on the top wil 
		// be in the GC
		builder = new StringBuilder("levelll");
		// == , equals--> both of them checks if same object is being pointed
		
		//         "levelll".equals -> "lllevel" -----> 
		if(builder.toString().equals(builder.reverse().toString())) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("it is not palindrome");
		}
		
		StringBuilder st1 = new StringBuilder("hello");
		StringBuilder st2 = new StringBuilder("hello");
		
		System.out.println(st1 == st2);// they are poiting different object. false
		System.out.println(st1.equals(st2));//false
		
		System.out.println(st1.toString().equals(st2.toString()));
		// Whenever you want to campare 2 stringBuilder values.
		// you need to convert it to string first toString()->method
		// then use .equls method to compare
		
		st1.append(" friends");
		System.out.println(st1);
	
	//	st1==st2--> false
	//  st1.equals(st2)--> false
	//    st1.toString();
	//	  st2.toString();
		
		StringBuilder st4 = new StringBuilder("abc");
		StringBuilder st5 = st4;
				
		System.out.println(st4 == st5);
		System.out.println(st4.equals(st5));
		
		st5.append(" - def");
		System.out.println(st4);
		System.out.println(st5);

		// String --> StringBuilder
		String str = "abcd";
		StringBuilder stb6 = new StringBuilder(str);
		System.out.println(stb6);
		
		// this is array
		StringBuilder[]stArrays = new StringBuilder[5];
		
	}
}
