package Day1;

public class c {

	public static void main(String[] args) {
		int i;
		int j;
		for (i = 0, j = 0; j < 1; ++j, i++) {
			System.out.println(i + " " + j);
		}
		
		System.out.println(i + " " + j);
		String blank  = " ";
		String line = blank + "hello" + blank + blank;
		line.concat("world");
		String newLine = line.trim();
		System.out.println((int) (line.length() + newLine.length()));
	}

}
