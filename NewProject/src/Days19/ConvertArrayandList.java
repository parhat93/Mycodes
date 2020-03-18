package Days19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayandList {
	public static void main(String[] args) {
		//How to convert an Array to ArrayList?

		String[] words = {"hello" ,"java" , "today", "tomorrow"};

		List<String> wordsList = Arrays.asList(words);
		System.out.println(wordsList);
		
		
		//How to convert ArrayList to Array?
		List<String> days = new ArrayList<>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		
		//String[] arrr = new String[3];
		String[] daysArr = days.toArray(new String[0]);
		
		System.out.println(Arrays.toString(daysArr));
		
		///////////////////////
		
		List<Integer> nums = Arrays.asList(12,343,45,56,564,23,434);
		System.out.println(nums);		
	}
	
	public void acceptList(int[] nums) {
		
	}
	
	public void acceptList2(ArrayList<Integer> nums) {
		
	}
	
    public List<String> getAllDays() {
		List<String> days = new ArrayList<>();
		days.add("Mon");
		days.add("Tue");
		days.add("Wed");
		days.add("Thurs");
		
    		return days;
	}
    
    public int countAnagrams(List<String> words) {
		
		return 0;
    }

    
}