package Days23hasArelation;

public class Car {
	 private String make;
	 private String color;
	 private Engine engine;
	 
	 
	 public void setEngine(Engine engine) {
		 this.engine =engine;
	 }
	 
	 public Engine getEngine() {
		 return engine;
	 }
	 
	 public Car(String make, String color) {
		 this.make = make;
		 this.color = color;
		 
	 }
	 
	 public Car() {
		 
	 }
 
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	 
	 
}
