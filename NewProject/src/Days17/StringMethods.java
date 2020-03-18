package Days17;

public class StringMethods {

	public static void main(String[] args) {
		
		//charAt, indexOf
		
		String lan = "java language";
		System.out.println(lan.charAt(0));
		char first = lan.charAt(0);
		
		System.out.println(lan.indexOf("v"));
		System.out.println(lan.indexOf("a"));
		
		System.out.println(lan.indexOf("a",2));
		
		System.out.println(lan.charAt(lan.indexOf("j")));
		
		// print last character by using nesting.length()
		
		System.out.println(lan.charAt(lan.length()-1));
		// this is work like is 
		// charAt give us the position of the letter, and length count 4 and since 
		// char at start from 0 1 2 3, so when it come to length, we must -1 
		// because length give us 1234 so we must take one out. 
		
		System.out.println("=========SubString==========");
		
		/*Substring
		 * 1) substring(index)--> it will cut the string from that index
		   until end
		   2) substring(startIndex,endIndex)--> specify range to cut string
		   3) substring starts from 0...
		   4) for example, hammer set..
		 */
		
		
		String tool = "hammer set";
		System.out.println(tool.substring(3));// mer set
		System.out.println(tool.substring(7));// set
		System.out.println(tool);
		
		//nested: find position of space then cut till end of string
									// set -->    substring(6 + 1)
		System.out.println(tool.substring(tool.indexOf(" ")+1));
		
		System.out.println("======startwith===========");
		/*
		 * startsWith->> check if beginning and return boolean
		 * 
		 */
		
		String pageTitle ="wooden spoon - Google Search";
		if(pageTitle.startsWith("wooden spoon")){
			System.out.println("step 1 passed");
		}else {
			System.out.println("step 1 failed");
		}
		
		
		if(pageTitle.startsWith("wooden spoon") && pageTitle.endsWith("Google Search")) {
			System.out.println("step 2 passed");
		}else {
			System.out.println("step 2 failed");
		}
		
		if(pageTitle.startsWith("wooden spoon") && pageTitle.endsWith("Google Search")
				&& pageTitle.contains(" - ")) {
			System.out.println("step 3 passed");
		}else { 
			System.out.println("step 3 failed");
		}
		
		// get rid of space and merge
		String search = "wooden spoon";
		//1) replace method
		System.out.println(search.replace(" ", ""));
		
		//2) split method
		
		String [] array = search.split(" ");
		System.out.println(array[0]+ array[1]);
		
		
		//3) find the position of space and use 2 substrings
		int posOfSpace = search.indexOf(" ");
		System.out.println(search.substring(0, posOfSpace) + search.substring(posOfSpace+1));
		
		
	
		
	}
}
