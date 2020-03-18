package Days15;
/* 
	 * If you have a sentence - how do you find out how many 
	 * words you have in in ?
	 * 
	 * 1) count number of spaces
	 * 2) 
	 */

public class Split {

	public static void main(String[] args) {
		// find out how many spaces in the sentence
		
		String sentence = "find out how many";
		// 1) how many characters in sentence 20
		// 2) replace each space with empty -> " " -> " "
		// 3) how many characters in sentence 7
		// 4) do subtraction 10 - 7 ->3+1
		int before = sentence.length();
		sentence = sentence.replace(" ", "");
		int after = sentence.length();
		int numberOfWords = before - after +1;
		System.out.println("Number of words: " + numberOfWords);
		
		System.out.println(" ");
		
		// Using split method in String class
		sentence ="Find out how many";
		String [] arrWord = sentence.split(" ");
		System.out.println("Number of words: " + arrWord.length);
		//  {"find","out","how","many"};			
		for(String word : arrWord) {
			System.out.print(word);
		}
		
		sentence = "My name is parhat osman I am twenty";
		String [] arr = sentence.split(" ");
		System.out.println("number of world: " + arr.length);
		for(String words : arr) {
			System.out.print(words);
		}
		
	
	}

}
