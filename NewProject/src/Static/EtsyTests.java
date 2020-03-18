package Static;

public class EtsyTests {

	public static void main(String[] args) {
	//	Etsy etsy = new Etsy();
		Etsy.navigate(TestDate.url);
		
		Etsy.login(TestDate.userId, TestDate.password);
		
		Etsy.search(TestDate.searchItem);
		
		Etsy etsy = new Etsy();
		etsy.search("leather jacket");
		
		//Static way access is className.MethodName
	}

}
