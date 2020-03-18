package Days16Homeworks;
/*You are given an array String[]colors={�Red�,�Blue�,�Black�,�Green�,�Orange�,�Brown"};
Write a method that will take String as an 
input parameter and will return index of that element.
Your method will use loop to find element in that array.
If element is found,you will return index of that element.
If element is not found,you will return-1
Make sure your method will find the element even
if the input string will be lowercase or uppercase.
Input:
green
Output:
3
Input:
white
Output:
-1
*/
import java.util.Scanner;
public class FindElement {

	public int indexColar(String color) {
		// 0 1 2 3 4
		String[] colors = {"Red", "Blue", "Black", "Green", "Orange"};
		for (int i = 0; i < color.length() - 1; i++)
			//if (color.equals(colors[i])) {
				if(color.equalsIgnoreCase(colors[i])) {
				return i;
			}
		return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the color: ");
		String str = input.next();
		FindElement col = new FindElement();
		System.out.println(col.indexColar(str));

	}
}