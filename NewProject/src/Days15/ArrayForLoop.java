package Days15;

public class ArrayForLoop {

	public static void main(String[] args) {
		String words[]= {"Bananas","Apples","oranges","Peach","Chary","Peanut"};
		
		for(int i =0; i< words.length;i++) {
			words[i]=words[i].replace("B", "V");
			words[i]=words[i].replace("b", "v");
		}

			for(String word : words) {
				System.out.print(word + ",");
			}
	}

}
