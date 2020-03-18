package Day7;

public class AirConditionerControl {

	public static void main(String[] args) {
		
		AirConditioner ac1 = new AirConditioner();
		ac1.model ="Sumsung";
		ac1.isOn = true;
		ac1.temperature = 88;
		
		System.out.println(ac1.model);
		System.out.println(ac1.isOn);
	System.out.println("--------------");
	
		ac1.turnOn();
		System.out.println(ac1.isOn);
		
		System.out.println("-------------");
		ac1.turnOff();
		System.out.println(ac1.isOn);
		
		ac1.setTemperature(70);
		System.out.println(ac1.temperature);
		
		ac1.turnUptemperature(10);
		System.out.println(ac1.temperature);

	}

}
