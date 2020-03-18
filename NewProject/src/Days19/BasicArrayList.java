package Days19;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList class
 * 
 * In programming we always deal with date.
 * and to make it easy for programmer, every language 
 * comes with data structures support.
 * 	
 *  data structures --> way of managing multiple sets of data.
 *  
 * 1) Arrays: 
 * 		--> you can store multiple values in one place
 * 		String [] cards = {"VIsa","MC"};
 * 		
 * ARRAYLIST.
 *  Properties:
 *   --> can be resized anytime/ unfixed 
 *   --> Same data type/ mixed type as well(not recommended)
 *   --> values can be updated
 *   --> allow duplicates
 *   --> keeps the order/ ordered
 *   --> NO
 *   
 *   ArrayList cards = new ArrayList();
 *   Cards.add("Visa"); // we can have multiply objects
 *   Cards.add("Visa");
 *   Cards.add("MC");
 *   Cards.add("Amex");
 *   Cards.add("Discovery");
 */
public class BasicArrayList {

	public static void main(String[] args) {
		ArrayList Cards = new ArrayList();
		   Cards.add("Visa"); // we can have multiply objects
		   Cards.add("Visa");
		   Cards.add("MC");
		   Cards.add("Amex");
		   Cards.add("Discovery");
		   Cards.add(false);
		   Cards.add(1,2345);
		     System.out.println(Cards.size());
		     
		 
		   
		   Cards.add(0,"Java"); // if  I want to JAVA to be in the first place
		   System.out.println(Cards);
		
		   System.out.println(Cards.get(5));
		   System.out.println(Cards.get(1));
		   
		   // our arraylist is mixed there are boolean and String primitive
		   // so, we must use Object to print all the objects
		   // print all values using forEach, as it is a collection
		   for(Object c:Cards) {
			   System.out.print(c + " ");
		   }
		   // for loop from 0 to size  1
		   for(int i = 0; i < Cards.size(); i ++) {
			   System.out.print(Cards.get(i) + " ");
		   }
		   
		}

	}


