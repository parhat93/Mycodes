package Days15;

public class StarNestetForLoop {

	public static void main(String[] args) {
		// outer loop
		for (int outer = 1; outer <= 9; outer++) {
			// inner loop		1			1
			for (int inner = 1; inner <= outer; inner++) {
				System.out.print(inner);
			}
			System.out.println();
		}

	}
}
