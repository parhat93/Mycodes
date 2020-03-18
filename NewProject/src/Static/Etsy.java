package Static;

public class Etsy {
	// we must change to static to String
	static String item;
	
	public void selectIteam() {
		
		System.out.println("Select " + item);
	}

	public static void navigate(String url) {
		System.out.println("Navigating to " + url);
	}
	
	public static void login(String userName,String password) {
		System.out.println("Loggin to Etsy username:" + userName + " - pwd:"+ password);
	}
	
	public static void search(String item) {
		System.out.println("Searching for " + item);
	}

}
