package Days10;

public class StringComparision {

	public static void main(String[] args) {
		
		String str1 = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABCD");
		
		
		System.out.println(str1 == str2);// answer is true because == give us boolean value
		
		System.out.println(str1.equals(str3));
		
		if(str1.equals(str3)) 
			     System.out.println(" yes it is equl");
			     System.out.println("it is not equl");
		System.out.println("");
	   if(str1.equals(str3)) 
				     System.out.println(" yes it is equl");
				     System.out.println("it is not equl");
			

}
}