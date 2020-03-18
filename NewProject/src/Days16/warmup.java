package Days16;

public class warmup {

	public static void main(String[] args) {
		String str = "";
		String str2 = "abc";
		
		str += str2.charAt(2);
		System.out.println(str);
		
	    str += str2.charAt(1);
		System.out.println(str);
		
		str += str2.charAt(0);
		System.out.println(str);
		
		System.out.println("===================");
		str = ""+123; // if we have double quote we can apple to assign number 
		System.out.println(str);
	}

}
