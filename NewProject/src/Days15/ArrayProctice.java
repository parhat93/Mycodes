package Days15;

public class ArrayProctice {

	public static void main(String[] args) {
		String []box1={"apples","Banana","carrots"};
		String box5[]= new String[3];
		box5[0]= "apple";
		box5[1]= "banana";
		box5[2]= "carrots";
		String []box2={"Banana","strawberries","apples","kiws"};
		char   []box3 = {'A','B','C','D'};
		int []box4 = {1,2,3,4,5};
		
		
		for(int i = 0; i < box3.length;i++) {
			
			System.out.println(box3[i]);
		}
		System.out.println("===============");
		for(char ch : box3 ) {
			System.out.println(ch);
		}
		System.out.println();
		for(String str : box2) {
			System.out.println(str);
		}
		System.out.println();
		for(int i = 2; i >= 0;i--) {
			System.out.println(box1[i]);
		}
	}

}
