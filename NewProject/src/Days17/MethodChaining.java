package Days17;

public class MethodChaining {

	public static void main(String[] args) {
		String lan = " Java ";
		//					"Java"-->  "java"-->    "va"    -->    "Va";
		System.out.println(lan.trim().toLowerCase().substring(2).replace("v", "V"));
		System.out.println(lan);
		
		String month = "December";// 1 2 3 4 5 6 7 8
		//	           "DECEMBER"--->  "DeCeMBeR"------->"DeCeeR"-->     6
		int i = month.toUpperCase().replace("E", "e").replace("MB","").length();
		System.gc();
		System.out.println(i);
		System.out.println(month);
		
		String state = "Alabama";
		
		boolean b = state.trim().toLowerCase().contains("a");
		
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
		
	
		
		
		
	}

}
