package Days17Homework;

public class NestedLoops {

	public static void main(String[] args) {
		System.out.println("======Nested For loop======");
		// nested for loop
		for (int i = 0; i < 4; i++) {
			System.out.println();

			for (int x = 0; x < 3; x++) {
				System.out.print(" | Row" + i+"-Colums" + x);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("======Nested For each loop======");
		
	// for each loop
		int[]cols = {1,2,3};
		int[]rows= {1,2,3,4,};
		
		for(int row : rows) {
			System.out.println();
			
			for(int colums : cols) {
				System.out.print(" |Row "+row+"-colum "+ colums);
			}	
			
		}
		System.out.println();
		System.out.println();
		System.out.println("===========while nested loop=========");
		
		int row =0;
		while(row<5) {
			row++;
			System.out.println();
		int col = 0;
		while(col<5) {
			col++;
			System.out.print(" |Row " + row +  "-Column " + col);
			}
		}
		
		
	}
	

}
