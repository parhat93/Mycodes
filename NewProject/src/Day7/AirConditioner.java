package Day7;

public class AirConditioner {

	String model;
	int temperature;
	boolean isOn;
	
	public  void turnOn() {
		System.out.println("turning on " + model);
		isOn = true;
		
	}
	public void turnOff() {
		System.out.println("turning off  "+ model);
		isOn  =false;
	}
	
	public void setTemperature(int  temp) {
		temperature =temp;
		
		// temp = temperature; we can't do this because temperature always comes first.
		
	}
	
	public void turnUptemperature(int addedValue) {
		
		temperature = temperature +addedValue;
		
	}
	
}
