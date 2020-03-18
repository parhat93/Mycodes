package A_ArrayAndArraylist;

import java.util.ArrayList;

public class ArrayQuestion {

	public static void main(String[] args) {

		String[] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i].equals("C")) {
				continue;
			}
			System.out.println("Work done");
		}
		
		
	
		int [][] twoDArray = {{4,5,5,4},{4,4,5,6},{1,3,2,8}};
		for(int i =0;i<twoDArray.length;i++) {
			for(int j=0;j<twoDArray[i].length;j++) {
			System.out.print(twoDArray[i][j] + " ");
				}
			
		}
			
		
		ArrayList list = new ArrayList<>();
		list.add("ff");
		list.add("ffadsf");
	//	System.out.println(list);
		
		
		
		
		
		
		
	}
}