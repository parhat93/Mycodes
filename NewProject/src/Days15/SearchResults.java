package Days15;

public class SearchResults {
	// extract the count and print separately
	public static void main(String[] args) {
		String googleSearchResult = "About 13,500,000 results (0.57 seconds)";
		
		String result [] = googleSearchResult.split(" ");
		System.out.println("number of word: " + result.length);
		System.out.println(result[1]);
		System.out.println(result[3].replace("(", ""));
		// 0.57
		String []seconds = googleSearchResult.split("results");
		
		
		System.out.println(seconds.length);
		System.out.println(seconds[1]);
		
		
		String tests = "date;year;type;category;";
		String[] arrTests = tests.split(";");
		System.out.println(arrTests.length);
		
		for(String test : arrTests) {
			System.out.println("Performing tests: " + test);
		}
		
	}

}
