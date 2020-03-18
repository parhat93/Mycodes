package Static;

public class Parking {

	static int numberOfSpacesAvaliable = 20;

	public void parkACar(String model) {

		System.out.println("Parking :" + model);

		numberOfSpacesAvaliable--;
	}

	public boolean parkingAvalible() {
		if (numberOfSpacesAvaliable > 0) {
			return true;
		}
		return false;

	}
}