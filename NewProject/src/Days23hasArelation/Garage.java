package Days23hasArelation;

public class Garage {
	
	public static void main(String[] args) {
		
	
	Car car = new Car();
	car.setMake("Tesla");
	
	String color = new String ("Gray");
	car.setColor(color);
	
	Engine myCarEngine = new Engine(6, 500);
	car.setEngine(myCarEngine);
	
	System.out.println(car.getEngine().getHorsePower());
	System.out.println(car.getEngine().getNumberCylinders());
	System.out.println(car.getColor().toUpperCase());
	//=================================================
	System.out.println("+++++++++++++++++++");
	
	Car myCar = new Car("Honda","black");
	Engine myCarEngine1 = new Engine(4,300);
	
	myCar.setEngine(myCarEngine1);
	
	int cylinders  = myCar.getEngine().getNumberCylinders(); // assigning 
	int houserPower = myCar.getEngine().getHorsePower();
	String color1 = myCar.getColor();
	String make1 = myCar.getMake();
	
	
	System.out.println(cylinders);
	System.out.println(houserPower);
	System.out.println(color1);
	System.out.println(make1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
