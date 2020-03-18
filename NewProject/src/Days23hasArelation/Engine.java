package Days23hasArelation;

public class Engine {

	private int numberCylinders;
	private int horsePower;
	
	public Engine() {}
	
	public Engine(int numberCylinders, int housePower) {
		
		this.numberCylinders = numberCylinders;
		this.horsePower = housePower;
	}

	public int getNumberCylinders() {
		return numberCylinders;
	}

	public void setNumberCylinders(int numberCylinders) {
		this.numberCylinders = numberCylinders;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
}
