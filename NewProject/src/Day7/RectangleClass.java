package Day7;
// First method will accept length and width as parameters
// and return perimeter of the rectangle.
// Second method will accept length and width as parameters
// and return area of the rectangle.
// Create another class with main method and test your methods.


public class RectangleClass {

	
	int a;
	int b;
	
	
	
	// perimeter = C = x+x+y+y
	// area = A=x*Y

		
	public int perimeter(int a, int b) {
		return a+a+b+b;
	}
	
	public int area(int a, int b) {
		return a*b;
	}
	
}
