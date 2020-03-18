package Static;

public class Mall {

	public static void main(String[] args) {
		//Shopping sh1 = new Shopping();
		//Shopping sh2 = new Shopping();
		//sh1.buy("T-Shirt");
		
	//	Shopping.buy("Gameing Laptop");
	//	Shopping.buy("iphone X");
		Shopping.showShoppingList();
		Shopping.buy("coffee");
		Shopping.showShoppingList();
		
		isOpen();
	
	
	}
	
	public static boolean isOpen() {
		System.out.println("Mall is open");
		return true;
	}
}
