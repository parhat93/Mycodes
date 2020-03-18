package Day8;

public class Car {
	// data
	String model;
	int speed;
	String color;
	
	// method1, does not accept any arguments and does not return anything = void
	public void carInformation() {
		System.out.println(color+" "+model + " is driving " + speed +" MPH.");
	}
	// method2, accepts argument but void.
	public void accellerate(int SecondSpeed) {
		int newSpeed=speed+SecondSpeed;
		System.out.println(color+" "+model + "'s new speed is " + newSpeed +" MPH.");
	}
	// mehod3, does not accepts argument, returns value
 public int getCurrentSpend() {
		
		return speed;
	}
	
	
	
	
	
	
	
}
