package Days15;

/* 
 * Given 2 arrays ensure that all items in first array
 * are present in second one
 * 
 * {"apples","Banana","carrots"}
 * {"bananas",strawberries","apples","kiws"}
 */
public class ArrayCompares {

	public static void main(String[] args) {
		String []box1={"apples","Banana","carrots"};
		String []box2={"Banana","strawberries","apples","kiws"};
		char   []box3 = {'A','B','C','D'};
		int []box4 = {1,2,3,4,5};
		
		
		
		
		for(String fruit1 : box1) {
			boolean found = false;
			
			for(String fruit2 : box2) {
				if(fruit1.equals(fruit2)) {
					found = true;
				}
			}
			if(found) {
				System.out.println(fruit1 + " is in box2");
			}else {
				System.out.println(fruit1 + " in not in box2");
			}
		}

	}

}
